# qífū-4
一個簡單的 springboot 後端, 與 Svelte / SvelteKit / Vue 前端的範例. A simple Admin WEB, based on Java with springboot backend, Svelte (SvelteKit) and Vue frontend example.

<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0001.png">
<br>
<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0002.png">

## 📚 系統文件 (Documentation)

本專案已根據功能與層次拆分為多份詳細手冊，請點擊連結查看詳細內容：

*   [**後端開發手冊 (Backend Guide)**](./README-backend.md): 包含 Spring Boot 架構、MyBatis 配置、安全性機制及 API 規範。
*   [**前端開發手冊 (Frontend Guide)**](./README-frontend.md): 包含 Nuxt 3 專案結構、Pinia 狀態管理、權限控制及前端建置指引。
*   [**K3s 部署手冊 (K3s Deployment)**](./README-k3s.md): 包含 K3s HA 集群建立、VIP 配置、Ingress 路由及私有倉庫設定。

---

## 🛠️ 安裝與初始化 (Installation)

### 1. 數據庫匯入 (MariaDB Import)

<br>mariadb import
```bash
mysql> create database qifu4;

cd backend\doc
mysql qifu4 -u root -p < qifu4.sql
```

<br>database connection config file modify , `/app/resources/db1-config.properties`
```text
db1.datasource.jdbcUrl=jdbc:mariadb://localhost/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
db1.datasource.username=mariadb-account
db1.datasource.password=mariadb-password
```

### 2. 後端開發環境
請使用 Eclipse 匯入 `backend/app`、`backend/base` 與 `backend/core` (core-std) 模組。詳情請參閱 [後端開發手冊](./README-backend.md)。

### 3. 前端開發環境
```bash
cd frontend-v-nx
npm install
npm run dev
```
詳情請參閱 [前端開發手冊](./README-frontend.md)。

---

## 🚀 生產環境部署
生產環境採用 K3s 高可用架構，部署於 VIP `192.168.10.200`。詳情請參閱 [K3s 部署手冊](./README-k3s.md)。
