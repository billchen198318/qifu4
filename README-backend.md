# qífū-4 Backend 開發手冊 (Java/Spring Boot)

本文件詳述 qífū-4 後端系統的架構、技術棧及開發規範，旨在引導開發者理解系統運作並協助 AI Agent 進行後續開發。

## 1. 系統架構與模組說明

後端採用 Maven 多模組架構，主要分為以下三個核心部分：

*   **core-app (org.qifu.core-app)**: 主程式入口與 Web 服務層。
    *   包含 Spring Boot 啟動類 (`Application.java`)。
    *   負責 API 控制器 (`Controller`)、安全性配置 (`Spring Security`) 及 Web 相關組態。
    *   包含所有資源檔案 (`application.properties`, MyBatis XML)。
*   **core-std (org.qifu.core-std)**: 標準業務邏輯層。
    *   實作具體的 Service 邏輯與 MyBatis Mapper 介面。
    *   處理核心業務流程。
*   **core-base (org.qifu.core-base)**: 底層基礎模組。
    *   定義基礎 Entity、Value Object (`VO`)、Constants 及 Context。
    *   提供通用 Service 模板 (`IBaseService`, `BaseService`)。
    *   包含共用工具類與異常處理。

## 2. 技術棧 (Tech Stack)

*   **Framework**: Spring Boot 3.5.14
*   **Language**: Java 17
*   **Web Server**: Undertow (高效能替代 Tomcat)
*   **ORM**: MyBatis 3.5.19 (搭配 MyBatis-Spring 3.0.5)
*   **Database**: MariaDB (使用 `mariadb-java-client`)
*   **Security**: Spring Security 6 (JWT 無狀態驗證 + CSRF 保護)
*   **Cache**: Redis (Spring Boot Starter Data Redis)
*   **Web Service**: Apache CXF 4.1.6 (支援 JAX-WS, JAX-RS)
*   **Reporting**: JasperReports 6.21.3
*   **Documentation**: Springdoc OpenAPI (Swagger 3)
*   **Logging**: Log4j2

## 3. 核心配置指引

### 3.1 數據庫配置
主要位於 `core-app/src/main/resources/db1-config.properties`：
*   `db1.datasource.jdbcUrl`: JDBC 連接字串。
*   `db1.datasource.username`: 帳號。
*   `db1.datasource.password`: 密碼。

### 3.2 系統屬性
位於 `core-app/src/main/resources/application.properties`：
*   `server.port`: 服務埠號 (預設 8088)。
*   `spring.redis.*`: Redis 連接資訊。
*   `spring.mail.*`: SMTP 郵件伺服器配置。

## 4. 安全性機制 (Security)

### 4.1 身份驗證 (Authentication)
系統採用 **JWT (JSON Web Token)** 進行無狀態驗證。
*   登入 API: `/api/auth/signin`
*   權限檢查: 透過 `ControllerAuthorityCheckInterceptor` 進行方法級別的權限檢核。
*   Token 續期: `/api/auth/refreshNewToken`

### 4.2 CSRF 保護
啟用了基於 Cookie 的 CSRF 保護：
*   使用 `CookieCsrfTokenRepository`。
*   前端需在請求頭中攜帶 `X-XSRF-TOKEN`。
*   特定 API (如 `/api/auth/**`) 已配置排除檢查。

### 4.3 攔截器 (Interceptors)
*   `UserBuilderInterceptor`: 初始化請求上下文中的用戶資訊。
*   `MDC4UserBuildInterceptor`: 設置 Log4j2 MDC，方便日誌追蹤。
*   `ControllerAuthorityCheckInterceptor`: 執行 API 權限驗證。

## 5. 開發範式與規範

### 5.1 泛型 Service 模式
所有 Service 建議繼承自 `BaseService` 並實作 `IBaseService`。
*   提供標準 CRUD：`selectByPrimaryKey`, `insert`, `update`, `delete`, `count`。
*   支援分頁查詢：`findPage`。

### 5.2 數據訪問 (Persistence)
*   Mapper 介面位於 `org.qifu.core.mapper`。
*   XML 檔案位於 `core-app/src/main/resources/org/qifu/core/mapper/`。
*   實體類應繼承 `BaseValueObj` 或實作相關實體介面（如 `CreateField`, `UpdateField`）以自動處理審計欄位。

## 6. API 測試與文件
*   **Swagger UI**: 啟動後訪問 `http://localhost:8088/swagger-ui/index.html` 查看與測試 API。
