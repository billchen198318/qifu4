# MQTT Broker 整合說明 (MQTT Broker Integration)

本系統整合了內嵌式的 Moquette MQTT Broker，提供輕量級且高效的訊息傳遞功能。

## 🛠️ 技術架構 (Technical Architecture)

- **MQTT Broker**: [Moquette Broker](https://github.com/moquette-io/moquette) (v0.17)
- **Persistence**: [RocksDB](https://rocksdb.org/) (用於訊息與對話狀態持久化)
- **Client Library**: [Eclipse Paho](https://www.eclipse.org/paho/) (v1.2.5)

## ⚙️ 核心配置 (Core Configuration)

MQTT 的相關設定位於 `backend/app/src/main/resources/appConfig.properties`：

```properties
# 是否啟用 MQTT Broker
mqttbroker.enable=true

# 監聽位址與埠號
mqttbroker.host=127.0.0.1
mqttbroker.port=1883

# 持久化設定 (RocksDB)
mqttbroker.enablePersistence=true
mqttbroker.storePath=/var/mqtt-data/rocksdb_store

# 安全性設定
mqttbroker.allowAnonymous=false
mqttbroker.tempPasswordFile=/var/mqtt-data/password.properties
```

## 🔐 帳戶管理 (User Accounts)

系統會在啟動時讀取 `backend/app/src/main/resources/mqtt-user.json` 並自動產生 Moquette 格式的加密密碼檔。

**預設帳戶資料：**

| 帳號 (Account) | 密碼 (Password) |
| :--- | :--- |
| `admin` | `password123` |
| `brokerusr` | `P@ssw0rd` |

> ⚠️ **注意**：生產環境部署前，請務必修改 `mqtt-user.json` 中的預設密碼。

## 🚀 啟動與關閉 (Startup & Shutdown)

- **啟動**：當 Spring Boot 應用程式啟動且 `mqttbroker.enable=true` 時，`MqttBrokerConfig` 會自動初始化並啟動 Broker。
- **關閉**：當 Spring 容器關閉時，系統會觸發 `@PreDestroy` 鉤子，安全地停止 Broker 並刪除暫存的加密密碼檔。
