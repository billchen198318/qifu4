package org.qifu.core.config;

import io.moquette.broker.Server;
import io.moquette.broker.config.IConfig;
import io.moquette.broker.config.MemoryConfig;
import jakarta.annotation.PreDestroy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.qifu.util.LoadResources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@Configuration
public class MqttBrokerConfig {

    private static final Logger log = LogManager.getLogger(MqttBrokerConfig.class);
    private Server mqttServer;
    private File tempPasswordFile;

    @Bean
    public Server mqttServer() throws IOException {
        log.info("====================================================================");
        log.info(" [MQTT] 正在初始化內嵌式 Moquette MQTT Broker (RocksDB 檔案持久化模式)...");
        log.info("====================================================================");

        String storePath = "/var/mqtt-data/rocksdb_store";
        File storeDir = new File(storePath);
        if (!storeDir.exists()) {
            storeDir.mkdirs();
        }

        // 1. 【核心策略】動態生成 Moquette 標準密碼檔案 (格式為 username:password)
        try {
            tempPasswordFile = new File("/var/mqtt-data/password.properties");
            try (FileWriter writer = new FileWriter(tempPasswordFile)) {
                // 寫入你想卡控的帳號與密碼
            	List<String> lines = LoadResources.readLine("mqtt_password.properties", MqttBrokerConfig.class);
            	for (String pwd : lines) {
            		writer.write(pwd);
            	}                
            }
            log.info(" [MQTT] 安全憑證檔案已成功在本地生成。");
        } catch (IOException e) {
            log.error(" [MQTT] 無法生成憑證檔案: ", e);
        }

        // 2. 標準配置設定
        Properties props = new Properties();
        props.setProperty("port", "1883");                  
        props.setProperty("host", "0.0.0.0");               
        
        // 核心安全卡控三路徑：
        props.setProperty("allow_anonymous", "false"); // 1. 拒絕匿名連線
        if (tempPasswordFile != null && tempPasswordFile.exists()) {
            // 2. 指向我們剛剛動態生成的密碼檔案路徑 (絕對路徑)
            props.setProperty("password_file", tempPasswordFile.getAbsolutePath()); 
        }

        props.setProperty("telemetry_enabled", "false"); 
        props.setProperty("persistent_store_engine", "rocksdb"); 
        props.setProperty("persistent_store_path", storePath);   
        props.setProperty("rocksdb.wal_sync", "true");           

        IConfig config = new MemoryConfig(props);

        // 3. 呼叫最純粹的單參數啟動，徹底告別 Java 泛型與反射地獄
        mqttServer = new Server();
        mqttServer.startServer(config);

        log.info("====================================================================");
        log.info(" [MQTT] Broker 啟動成功！已透過標準安全檔啟用帳密卡控 (Port: 1883)。");
        log.info("====================================================================");
        
        return mqttServer;
    }

    @PreDestroy
    public void stopMqttServer() {
        // 安全釋放資源與關閉服務
        if (mqttServer != null) {
            log.info(" [MQTT] 偵測到 Spring 容器關閉，正在安全儲存佇列數據並關閉 MQTT Broker...");
            mqttServer.stopServer();
            log.info(" [MQTT] MQTT Broker 已安全關閉。");
        }
        
        // 順手把生命週期結束的暫存密碼檔砍掉，確保安全性
        if (tempPasswordFile != null && tempPasswordFile.exists()) {
            tempPasswordFile.delete();
        }
    }
}