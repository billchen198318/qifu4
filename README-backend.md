# qífū-4 後端開發手冊 (Backend Development Guide)

本文件詳述 qífū-4 後端系統的架構設計、核心技術、安全性機制及開發指南。

## 1. 架構概述 (Architecture Overview)

qífū-4 後端基於 **Spring Boot 4.0.6** 構建，採用多模組 (Multi-module) Maven 結構，專注於提供高效能、高安全性的 RESTful API。採用 **Java 21** 虛擬執行緒 (Virtual Threads) 技術以獲得極致的併發能力。

### 核心模組
*   **core-app (`backend/app`)**: 主應用程式，包含 Controller、Config、API 定義及主要業務邏輯。
*   **core-base (`backend/base`)**: 基礎架構模組，定義 Constants、Exception、Message、以及通用的 Service/DAO 基礎介面。包含支援 JWT 與資料庫 Token 驗證的 `TokenStore` 體系。
*   **core-std (`backend/core`)**: 標準核心模組，包含與權限管理 (ACL)、系統代碼 (SysCode) 相關的實體類 (Entity) 與服務。

## 2. 技術棧 (Technology Stack)

*   **Runtime**: Java 21。
*   **Web Server**: Undertow (替代預設的 Tomcat，提供更佳的效能與記憶體管理)。
*   **Persistence**: MyBatis (半自動 ORM，靈活控制 SQL)。
*   **Database**: MariaDB (支援 MySQL 協定)。
*   **Security**: Spring Security 6+。
*   **API Documentation**: SpringDoc OpenAPI (Swagger UI)。
*   **Web Services**: Apache CXF 4.1.x (支援 JAX-WS 與 JAX-RS)。
*   **Reporting**: JasperReports (PDF/Excel 報表生成)。
*   **Cache**: Spring Cache + Redis。

## 3. 安全性機制 (Security Mechanisms)

系統採用無狀態 (Stateless) 的安全性架構，結合 JWT 與 HttpOnly Cookie。

### 身份驗證 (Authentication)
1.  **JWT 與 Cookie**: 登入成功後，後端生成 Access Token 與 Refresh Token。
2.  **HttpOnly Cookie**: Token **不返回**給前端 JS，而是透過 `Set-Cookie` 存入瀏覽器的 HttpOnly Cookie (`QIFU4VNX__uat` 與 `QIFU4VNX__urt`)。這能有效防止 XSS 攻擊竊取 Token。
3.  **前端旗標**: `AuthController` 返回 `accessToken: "Y"` 給前端，僅作為登入狀態旗標。

### 刷新機制 (Token Refresh) - 2026/06/05 優化
*   **自動化身分識別**: 當 Access Token Cookie 因逾時消失或失效時，前端會發起 `/refreshNewToken` 請求。
*   **自主識別**: 後端不再強制要求同時帶入 Access Token 與 Refresh Token。只要 `QIFU4VNX__urt` (Refresh Token) 在有效期內且存在於資料庫中，後端會自動根據 Token 反查 `USER_ID` 並核發新的 JWT。
*   **安全性**: 採用 Refresh Token Rotation (輪轉) 機制，每次刷新都會產生新的 `urt` 並使舊的失效。

### 授權與攔截器 (Authorization & Interceptors)
*   **ControllerAuthorityCheckInterceptor**: 攔截 `/api/**` 請求，根據使用者的 Role 與 Permission 檢查是否有權存取特定功能 (PROG ID)。
*   **UserBuilderInterceptor**: 初始化當前請求的使用者上下文 (ThreadLocal)，方便在 Service 層獲取使用者資訊。
*   **MDC4UserBuildInterceptor**: 將使用者 ID 注入 Log4j2 MDC，使日誌輸出包含操作者資訊。

### CSRF 防護
*   **SPA 支援**: 使用 `CookieCsrfTokenRepository` 並配合 `SpaCsrfTokenRequestHandler`。
*   **CSRF Token**: 前端需從 Cookie 中讀取 `XSRF-TOKEN` 並在請求標頭中帶上 `X-XSRF-TOKEN`。

## 4. 核心配置 (Key Configuration)

*   **資料庫配置**: 位於 `backend/app/src/main/resources/db1-config.properties`。
*   **MyBatis 配置**: `MyBatisConfig.java` 自動掃描 `org.qifu.core.mapper`。
*   **CORS 配置**: 在 `WebConfig.java` 中定義，允許跨域請求並暴露 `X-CSRF-TOKEN`。

## 5. API 開發範例

控制器位於 `org.qifu.core.api`。開發新功能時請遵循以下命名規範：
*   **命名**: `PROG[編號]Controller.java` (例如 `PROG001D0001Controller.java`)。
*   **路徑**: 統一掛載在 `/api/` 下。

### Auth API
*   `POST /api/auth/signin`: 使用者登入。
*   `POST /api/auth/validLogined`: 驗證登入狀態 (檢查 Cookie 內的 Token)。
*   `POST /api/auth/refreshNewToken`: 刷新 Access Token。
*   `POST /api/auth/logout`: 登出並清除 Cookie。

---
*更多細節請參考原始碼中的 `README.md` 或諮詢系統架構師。*
