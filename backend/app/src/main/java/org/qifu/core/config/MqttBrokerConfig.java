package org.qifu.core.config;

import io.moquette.broker.Server;
import io.moquette.broker.config.IConfig;
import io.moquette.broker.config.MemoryConfig;
import jakarta.annotation.PreDestroy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.qifu.base.properties.MqttConfigProperties;
import org.qifu.util.LoadResources;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

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
	public Server mqttServer() throws IOException {
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
				List<String> lines = LoadResources.readLine("mqtt_password.properties", MqttBrokerConfig.class);
				for (String pwd : lines) {
					writer.println(pwd);
				}
			}
			log.info(" [MQTT] 安全憑證檔案已成功在本地生成。");
		} catch (IOException e) {
			log.error(" [MQTT] 無法生成憑證檔案: ", e);
		}

		// 2. 標準配置設定 (注意：setProperty 接收 String，Port 要轉字串)
		Properties props = new Properties();
		props.setProperty("port", String.valueOf(mqttConfigProperties.getPort()));
		props.setProperty("host", mqttConfigProperties.getHost());
		props.setProperty("allow_anonymous", String.valueOf(mqttConfigProperties.isAllowAnonymous()));

		if (tempPasswordFile != null && tempPasswordFile.exists()) {
			props.setProperty("password_file", tempPasswordFile.getAbsolutePath());
		}

		props.setProperty("telemetry_enabled", String.valueOf(mqttConfigProperties.isTelemetryEnabled()));
		props.setProperty("persistent_store_engine", "rocksdb");
		props.setProperty("persistent_store_path", mqttConfigProperties.getStorePath());
		props.setProperty("rocksdb.wal_sync", "true");

		IConfig config = new MemoryConfig(props);

		// 3. 啟動服務
		mqttServer = new Server();
		mqttServer.startServer(config);

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
			tempPasswordFile.delete();
			log.info(" [MQTT] 暫存憑證檔案已成功刪除。");
		}
	}
}