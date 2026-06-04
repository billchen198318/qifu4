package org.qifu.core.config;

import io.moquette.broker.Server;
import io.moquette.broker.config.FluentConfig;
import jakarta.annotation.PreDestroy;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.core.interceptor.MqttMonitoringInterceptor;
import org.qifu.util.LoadResources;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Configuration
@ConditionalOnProperty(prefix = "mqttbroker", name = "enable", havingValue = "true", matchIfMissing = false)
public class MqttBrokerConfig {
	private static final Logger log = LogManager.getLogger(MqttBrokerConfig.class);
	private final MqttConfigProperties mqttConfigProperties;
	private Server mqttServer;
	private File tempPasswordFile;

	public MqttBrokerConfig(MqttConfigProperties mqttConfigProperties) {
		this.mqttConfigProperties = mqttConfigProperties;
	}
	
	@Bean
	public MqttMonitoringInterceptor mqttMonitoringInterceptor() {
		return new MqttMonitoringInterceptor();
	}

	@Bean
	public Server mqttServer(MqttMonitoringInterceptor interceptor) throws IOException {
		log.info("====================================================================");
		log.info(" [MQTT] 正在初始化內嵌式 Moquette MQTT Broker (RocksDB 檔案持久化模式)...");
		log.info("====================================================================");

		File storeDir = new File(mqttConfigProperties.getStorePath());
		if (!storeDir.exists()) {
			storeDir.mkdirs();
		}

		// 1. 動態生成 Moquette 標準密碼檔案
		try {
			tempPasswordFile = new File(mqttConfigProperties.getTempPasswordFile());
			try (PrintWriter writer = new PrintWriter(tempPasswordFile)) {
				@SuppressWarnings("unchecked")
				Map<String, Object> dataMap = LoadResources.objectMapperReadValue("mqtt-user.json", Map.class, MqttBrokerConfig.class);
				@SuppressWarnings("unchecked")
				List<Map<String, String>> accountList = (List<Map<String, String>>) dataMap.get("accountList");
				for (Map<String, String> account : accountList) {
					writer.println(account.get("account") + ":" + DigestUtils.sha256Hex(account.get("password")));
				}
			}
			log.info(" [MQTT] 安全憑證檔案已成功在本地生成。");
		} catch (IOException e) {
			log.error(" [MQTT] 無法生成憑證檔案: ", e);
		}
		
		FluentConfig fConfig = new FluentConfig()
		        .host(mqttConfigProperties.getHost())
		        .port(NumberUtils.toInt(mqttConfigProperties.getPort(),1883))
		        .passwordFile(tempPasswordFile.getAbsolutePath());
		
		if (mqttConfigProperties.isEnablePersistence()) {
			fConfig.enablePersistence().dataPath(mqttConfigProperties.getStorePath());	
		}
		
		if (mqttConfigProperties.isAllowAnonymous()) {
			fConfig.allowAnonymous();
		} else {
			fConfig.disallowAnonymous();
		}
		if (mqttConfigProperties.isTelemetryEnabled()) {
			fConfig.enableTelemetry();
		} else {
			fConfig.disableTelemetry();
		}
		
		// 3. 啟動服務
		mqttServer = new Server();
		mqttServer.startServer(fConfig.build(), Collections.singletonList(interceptor));
		
		log.info("====================================================================");
		log.info(" [MQTT] Broker 啟動成功！已透過標準安全檔啟用帳密卡控 (Port: {})。", mqttConfigProperties.getPort());
		log.info("====================================================================");

		return mqttServer;
	}

	@PreDestroy
	public void stopMqttServer() {
		if (mqttServer != null) {
			log.info(" [MQTT] 偵測到 Spring 容器關閉，正在安全儲存佇列數據並關閉 MQTT Broker...");
			mqttServer.stopServer();
			log.info(" [MQTT] MQTT Broker 已安全關閉。");
		}
		if (tempPasswordFile != null && tempPasswordFile.exists()) {
			try {
				FileUtils.delete(tempPasswordFile);
			} catch (IOException e) {
				log.error(e.getMessage());
			}
			log.info(" [MQTT] 暫存憑證檔案已成功刪除。");
		}
	}
	
}