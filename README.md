# qífū-4
一個簡單的 springboot 後端, 與 Nuxt 3 (Vue) 前端的範例. A simple Admin WEB, based on Java with springboot backend, and Nuxt 3 frontend example.

<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0001.png">
<br>
<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0002.png">

## 📚 系統文件 (Documentation)

本專案已根據功能與層次拆分為多份詳細手冊，請點擊連結查看詳細內容：

*   [**後端開發手冊 (Backend Guide)**](./README-backend.md): 包含 Spring Boot 3.5 架構、MyBatis 配置、JWT/Cookie 安全性機制及 API 規範。
*   [**前端開發手冊 (Frontend Guide)**](./README-frontend.md): 包含 Nuxt 3 專案結構、Pinia 狀態管理、Axios 自動續期攔截器及權限控制。
*   [**K3s 部署手冊 (K3s Deployment)**](./README-k3s.md): 包含 K3s HA 集群建立、Keepalived VIP 配置、Traefik Ingress 路由及私有倉庫設定。

---

## 🛠️ 安裝與初始化 (Installation)

### 1. 數據庫匯入 (MariaDB Import)

<br>mariadb import
```bash
mysql> create database qifu4;

cd backend/doc
mysql qifu4 -u root -p < qifu4.sql
```

<br>database connection config file modify , `backend/app/src/main/resources/db1-config.properties`
```text
db1.datasource.jdbcUrl=jdbc:mariadb://localhost/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
db1.datasource.username=mariadb-account
db1.datasource.password=mariadb-password
```

### 2. 後端開發環境
請使用 Eclipse 或 IntelliJ IDEA 匯入 `backend/app`、`backend/base` 與 `backend/core` 模組。
*   **JDK 版本**: 17+
*   **核心配置**: 詳見 [後端開發手冊](./README-backend.md)。

### 3. 前端開發環境
```bash
cd frontend-v-nx
npm install
npm run dev
```
*   **Node.js 版本**: 18+
*   **詳細說明**: 詳見 [前端開發手冊](./README-frontend.md)。
*   **登入測試帳號密碼**: admin / admin99。

---

## 🚀 生產環境部署
生產環境採用 K3s 高可用架構，部署於 VIP `192.168.10.200`。透過 Traefik Ingress 實現前後端路徑分流與 SSL 終止。
詳情請參閱 [K3s 部署手冊](./README-k3s.md)。
