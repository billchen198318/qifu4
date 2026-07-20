# Qifu4 Java Backend to Python Migration Plan

## 目標

將目前 `backend/base`、`backend/core`、`backend/app` 的 Java Spring Boot / MyBatis 專案，轉換成 Python 後端。轉換目標不是逐行翻譯，而是保留現有行為與資料模型，改用 Python 生態中等價且穩定的框架實作：

- REST API
- Interceptor / Filter / Middleware
- AOP-like service decorators
- IOC / dependency injection
- Security
- SQL Mapper / ORM
- HttpOnly JWT cookie
- CORS
- CSRF
- scheduled jobs
- configuration properties
- event log / user context / permission check

Excluded scope: MQTT and JasperReport/PDF report generation will not be rewritten in the Python backend.

### 文件事實標記規則

本文後續內容必須區分以下三類，不得把建議寫成 Java 現況：

- **Java verified**：已直接由目前 repository 的 Java／SQL／resource／frontend source 確認。
- **Python target**：遷移後的設計選擇；可以不同於 Java，但必須列出 compatibility impact。
- **Open decision**：尚未由使用情境或 owner 決定，不得直接實作成既定需求。

若 Java source 與本文衝突，以 source 與 parity test 為準，並回頭修本文。`java-*-resource.md` 只作索引，不作行為的最終證據。

## 現有 Java 專案摘要

來源分析檔：

- `java-analysis-index.md`
- `java-base-code-resource.md`
- `java-core-code-resource.md`
- `java-app-code-resource.md`
- `java-doc-sql-resource.md`
- `java-root-docs-resource.md`

模組分工：

| Java module | 檔案量 | 現有責任 | Python 對應 |
| --- | ---: | --- | --- |
| `base` | 81 Java, 9 properties, 9 JSON | 共用模型、例外、base service、base mapper、token builder、user local、工具類、properties class | `app/common`, `app/shared`, `app/config`, `app/security` |
| `core` | 184 Java, 12 properties, 3 JSON | entity、mapper、service、logic service、AOP aspect、interceptor、scheduled job、domain util | `app/domain`, `app/repositories`, `app/services`, `app/aspects`, `app/jobs` |
| `app` | 38 Java, 17 properties, 8 JSON | Spring Boot entrypoint、REST/MVC controller、security config、filter、web config、CORS、MyBatis config | `app/main.py`, `app/api`, `app/middleware`, `app/security`, `app/db` |
| `doc` | 1 JSON, 1 SQL | `qifu4.sql` schema/seed data | `alembic` migration + seed scripts |

主要 Java 行為：

- `AuthController` 提供 `/api/auth/validLogined`、`/signin`、`/refreshNewToken`、`/logout`。
- `WebSecurityConfig` 設定 JWT decoder、Bearer token resolver、CSRF token repository、security filter chain。
- `JwtUserContextFilter` 從 JWT 建立 user context、role、permission map。
- `CsrfCookieFilter` 讓 CSRF token 可以透過 cookie/header 使用。
- `WebConfig` 設定 static resources、interceptors、CORS。
- `ControllerAuthorityCheckInterceptor` 做 controller method authority check 與 event log。
- `ServiceAuthorityCheckAspect` 做 service method authority check。
- `ServiceScriptExpressionProcessAspect` 做 service method 前後的 script expression processing。
- `core/mapper` 有大量 MyBatis mapper 與 XML SQL。
- `qifu4.sql` 有 27 個 table，包含 account、role、permission、system、menu、program、template、token、upload、session、event log 等核心資料。

## 建議技術選型

### 首選組合

| Java/Spring 能力 | Python 建議 | 理由 |
| --- | --- | --- |
| Spring Boot REST Controller | FastAPI | 原生 OpenAPI、自動 request/response validation、APIRouter 適合拆 module。 |
| Spring DI / IOC | FastAPI `Depends` + `dependency-injector` 或輕量 composition root | request-scoped dependency 用 FastAPI；跨服務生命週期與設定可用 container 管理。 |
| Spring Filter / Interceptor | Starlette/FastAPI middleware + route dependencies | HTTP request/response filter 用 middleware；權限檢查用 dependency/decorator。 |
| Spring AOP Aspect | Python decorator + wrapper service base class | Python 沒有 Spring AOP 等價內建，最穩定做法是明確 decorator，例如 `@service_authority(...)`。 |
| Spring Security | FastAPI security dependencies + custom middleware | JWT、cookie、header、permission 可清楚拆在 `security` module。 |
| OAuth2 resource server JWT | `python-jose` 或 `PyJWT` | 驗簽、claims 解析、exp/iat 驗證。若要 JWK/JWT 完整性較強，優先 `python-jose`。 |
| HttpOnly JWT Cookie | FastAPI `Response.set_cookie` | 對應現有 cookie token 行為；access/refresh token 分開管理。 |
| CSRF Cookie/Header | `starlette-csrf` 或自建 double-submit token | 因 HttpOnly JWT cookie 會自動帶 cookie，建議保留 CSRF 防護。 |
| CORS | `fastapi.middleware.cors.CORSMiddleware` | 官方支援，且 credentials=true 時要明確 origins。 |
| MyBatis Mapper / XML SQL | SQLAlchemy 2.0 Core + text SQL repository | 若要保留 SQL 精準行為，先用 SQLAlchemy Core/text；穩定後再逐步 ORM 化。 |
| Java Entity | SQLAlchemy ORM model + Pydantic schema | entity 用 ORM model，API DTO 用 Pydantic model，避免資料庫模型直接外露。 |
| DB migration | Alembic | SQLAlchemy 官方常用 migration tool，可把 `qifu4.sql` 轉 baseline migration。 |
| HikariCP | SQLAlchemy engine pool | `pool_size`, `max_overflow`, `pool_recycle`, `pool_pre_ping` 對應連線池需求。 |
| Scheduled jobs | APScheduler | 對應 `@Scheduled` jobs，如 clear log、mail helper、expression job。 |
| Log4j/MDC | structlog 或 logging + contextvars | 用 request id、user id 放入 contextvars，middleware 清理。 |
| Properties | Pydantic Settings | 將 `application.properties`、`appConfig.properties`、`db1-config.properties` 改成 `.env` / YAML / TOML。 |
| Freemarker MVC pages | Jinja2Templates | 若仍需要 server-side HTML page，FastAPI 可掛 Jinja2。 |
| JasperReport/PDF | Excluded from Python backend | Keep the existing Java/report service or external report service if reports are still required. |
| CXF SOAP/WebService | Open decision：保留 Java 邊界服務或另建 adapter | Java verified 有 `ITestService`/`TestServiceImpl` 與 `endpoint-publish.json` 動態發布；使用者與外部依賴尚未盤點，不預先指定 phase。 |
| MQTT broker | Excluded | Java verified 包含 conditional embedded Moquette broker、帳密檔生成、monitoring interceptor 與 MQTT dashboard；Python 本輪全部不遷移。 |

### 為什麼選 FastAPI

FastAPI 官方文件列出 OpenAPI、自動文件、Pydantic validation、security/authentication、dependency injection 等能力；並且 FastAPI 建在 Starlette 上，能使用 CORS、GZip、StaticFiles、Streaming response、cookie/session 等 Starlette features。這些特性剛好對應目前 Spring Boot app 的 REST API、DI、Security、CORS、static resource 與 filter/interceptor。

官方文件也明確說明 FastAPI middleware 會在每個 request 進入 path operation 前與 response 回傳前執行，因此可對應 Spring Filter/Interceptor 的大部分 request lifecycle 行為。

### 為什麼 SQL Mapper 建議先用 SQLAlchemy Core

目前 Java 專案有大量 MyBatis mapper 與 XML SQL。若直接 ORM 化，容易改變 SQL 行為、join、dynamic where、pagination、count query、permission query。SQLAlchemy 官方文件將 SQLAlchemy 分成 Core 與 ORM：Core 是 SQL expression/database integration，ORM 建在 Core 上。此專案應先用 SQLAlchemy Core/text SQL 保留 mapper 行為，再逐步把穩定 entity 轉 ORM。

## Python 目標架構

建議目錄：

```text
backend-py/
  pyproject.toml
  .env.example
  alembic.ini
  app/
    main.py
    config/
      settings.py
      logging.py
    db/
      engine.py
      session.py
      migrations/
    common/
      constants.py
      exceptions.py
      result.py
      pagination.py
      context.py
    security/
      jwt.py
      password.py
      cookies.py
      csrf.py
      permissions.py
      dependencies.py
    middleware/
      request_context.py
      jwt_user_context.py
      controller_authority.py
      mdc.py
      cors.py
    aspects/
      service_authority.py
      service_script_expression.py
      event_log.py
    domain/
      account/
        models.py
        schemas.py
        repository.py
        service.py
      role/
      sys/
      menu/
      program/
      template/
      upload/
    api/
      auth.py
      prog001d0001.py
      prog001d0002.py
      prog001d0003.py
      prog001d0004.py
      prog001d0005.py
      prog002d0001.py
      prog002d0002.py
      prog002d0003.py
      prog004d0001.py
      prog004d0002.py
      prog005d0001.py
      base_helper.py
      dashboard_demo.py
      hello.py
    resources/
      endpoint-publish.json
      excludePathPatterns.json
      mqtt-user.json
    jobs/
      clear_system_log.py
      clear_temp_upload.py
      send_mail_helper.py
      sys_expression.py
    tests/
```

## Java 到 Python 對照設計

### REST API

Java:

- `@RestController`
- `@RequestMapping`
- `@PostMapping`
- `ResponseEntity`

Python:

- `APIRouter`
- `@router.get/post/put/delete`
- Pydantic request/response schema
- `JSONResponse` 或直接回傳 Pydantic model/dict

建議：

- `AuthController` 先轉，因為 security/user context 依賴它。
- PROG controller 依 route 分批轉。
- 每個 controller 對應一個 `app/api/*.py`。
- 回傳格式保留 `DefaultResult`、`DefaultControllerJsonResultObj`、`QueryControllerJsonResultObj` 等語意，先轉成 Pydantic response model。

**Java verified response contract：**

- `DefaultResult` JSON 欄位為 `isAuth`, `success`, `message`；`value` 在 Java 宣告為 `transient`，必須先以實際 Jackson response test 確認是否輸出，不能只看 getter 推定。
- `DefaultControllerJsonResultObj` 欄位為 `value`, `success`, `message`, `login`, `isAuth`, `checkFields`。
- `QueryControllerJsonResultObj` 再增加 `pageOfShowRow`, `pageOfSelect`, `pageOfCountSize`, `pageOfSize`。
- 成功／失敗旗標使用 `Y`／`N`。現有 frontend 以 `VITE_SUCCESS_FLAG='Y'` 判斷，不是 `SUCCESS`／`FAIL`，也不是 `successFlag`。
- Python response model 必須逐 endpoint 做 snapshot/contract test；不能用單一新 envelope 取代後仍宣稱相容。

### IOC / Dependency Injection

Java:

- `@Autowired`
- `@Resource`
- constructor injection
- `AppContext.getBean`

Python:

- request scope：FastAPI `Depends`
- app singleton：startup 時建立 services/repositories
- 複雜 container：`dependency-injector` 可選

建議：

- repository/session 用 `Depends(get_db_session)`。
- current user 用 `Depends(get_current_user)`。
- service 用 factory dependency，例如 `get_account_service(db=Depends(get_db_session))`。
- 不建議複製 `AppContext.getBean` service locator；Python 版應改成明確 dependency。

### Filter / Interceptor / Middleware

Java:

- `CsrfCookieFilter extends OncePerRequestFilter`
- `JwtUserContextFilter extends OncePerRequestFilter`
- `ControllerAuthorityCheckInterceptor implements HandlerInterceptor`
- `MDCInterceptor`
- `MDC4UserBuildInterceptor`
- `MqttMonitoringInterceptor`

Python:

- `@app.middleware("http")`
- Starlette `BaseHTTPMiddleware`
- route-level dependency

建議分工：

| Java class | Python implementation |
| --- | --- |
| `JwtUserContextFilter` | `middleware/jwt_user_context.py`：解析 JWT、建立 `request.state.user` 與 `contextvars` user context。 |
| `CsrfCookieFilter` | `security/csrf.py` + middleware：產生/驗證 CSRF token，寫入 non-HttpOnly CSRF cookie，request header 比對。 |
| `ControllerAuthorityCheckInterceptor` | route dependency `require_controller_authority(program_id, action)`，或 custom `APIRoute`。 |
| `MDCInterceptor` / `MDC4UserBuildInterceptor` | `middleware/mdc.py`：request id/user id 放入 logging context，response 後清除。 |
| `UserBuilderInterceptor` | 併入 `jwt_user_context`，不要保留 deprecated legacy token flow，除非需要相容舊前端。 |

### AOP

Java:

- `ServiceAuthorityCheckAspect`
- `ServiceScriptExpressionProcessAspect`
- `@Around`
- `@ServiceAuthority`
- `@ServiceMethodAuthority`

Python:

- decorator
- context manager
- service base class hook

建議：

```python
@service_authority(service_id="roleService", method_type="QUERY")
def find_roles(...):
    ...

@service_script_expression(before=True, after=True)
def update_template(...):
    ...
```

設計重點：

- 不要試圖做隱式全域 monkey patch AOP。
- 服務方法需要權限檢查的地方明確標 decorator。
- decorator 內讀取 `contextvars` 中的 current user、system id、role permission map。
- event log 由 decorator 統一寫入。

### Security / HttpOnly JWT

#### Java 實際請求鏈（已由原始碼確認）

不可把 `excludePathPatterns.json` 中的 `/api**`、`/api/**` 直接解讀為 API 最終「免登入」。Java 專案採用兩層檢查：

1. `WebSecurityConfig` 對清單中的 pattern 呼叫 Spring Security `permitAll()`，因此 `/api/**` 不受 `anyRequest().authenticated()` 阻擋。
2. `WebConfig` 同時把 `ControllerAuthorityCheckInterceptor` 套用到 `/api/*`、`/api/**`。
3. 該 interceptor 在沒有目前使用者時回傳 401／導向登入頁；有使用者時再檢查 admin、method annotation 或 `CONTROLLER` permission。
4. `CoreAppConstants.AUTH_PATH` 與 event-log path 才從 controller interceptor 排除。
5. `JwtUserContextFilter` 位於 bearer token authentication filter 之後，並在 response 後清除 context。

```text
Spring Security（/api/** permitAll）
  -> JWT token 解析與可選驗證
  -> JwtUserContextFilter 建立 context（若有已驗證 JWT）
  -> ControllerAuthorityCheckInterceptor 執行登入／權限檢查
  -> Controller
```

Python 遷移必須保存此最終行為。不能只複製 `permitAll`，也不能擅自刪除 `/api/**` bypass 後宣稱與 Java 相同；若合併成 middleware/dependency，必須用相容測試證明結果一致。

Java 現況：

- `AuthController.signin`
- `AuthController.refreshNewToken`
- `AuthController.logout`
- `WebSecurityConfig.jwtDecoder`
- `WebSecurityConfig.bearerTokenResolver`
- `JwtUserContextFilter`
- `CookieUtils`
- `TokenStoreBuilder` / `TokenStoreValidateBuilder`

**Java verified auth details：**

- access/refresh cookie names are `QIFU4VNX__uat` and `QIFU4VNX__urt`; both are `HttpOnly`, `Secure`, `Path=/`, `SameSite=Lax`.
- access expiry is 25 minutes and refresh expiry is 40 minutes.
- bearer header is preferred; access cookie is considered only for `/api/` requests. All `/api/auth/` requests deliberately return no bearer token from `BearerTokenResolver`.
- JWT validation checks timestamp, issuer `QIFU4Application`, and active access-token state in `tb_sys_token`.
- signin and validLogined return a `User`; on success both token fields are masked to `Y`. Raw tokens are delivered through HttpOnly cookies.
- refreshNewToken returns `LoginRequest`; on success its token fields are `Y`, username is populated, and both cookies rotate.
- logout returns plain string `OK` and only expires both cookies in the current Java code. It does not revoke the persisted token. Token revocation is a **Python security enhancement/open compatibility decision**, not existing Java behavior.
- account lock threshold is 3 failed logs within the previous 5 minutes.

Python 建議：

- access token：短效，HttpOnly cookie。
- refresh token：長效，HttpOnly cookie，DB/Redis 保存 token id 或 token hash。
- JWT claims：`sub`, `user_id`, `roles`, `permissions_version`, `iat`, `exp`, `jti`。
- cookie attributes：`httponly=True`, `secure=True` in production, `samesite="lax"` 或前後端跨站時 `samesite="none"` + HTTPS。
- logout parity：刪 cookies；persisted-token revoke 屬 open security enhancement，不得默認為 Java 行為。
- refresh：驗 refresh token、旋轉 refresh token、重發 access token。

必要 API：

| Java endpoint | Python endpoint |
| --- | --- |
| `POST /api/auth/signin` | `POST /api/auth/signin` |
| `POST /api/auth/validLogined` | `POST /api/auth/valid-logined`，可另保留舊 path alias |
| `POST /api/auth/refreshNewToken` | `POST /api/auth/refresh-new-token`，可另保留舊 path alias |
| `POST /api/auth/logout` | `POST /api/auth/logout` |

相容策略：

- 第一階段保留 Java 原 path 命名，避免前端一次大改。
- 第二階段再提供 Pythonic path，舊 path deprecated。

### CORS

現有：

- `WebConfig.addCorsMappings`
- `page.allowedOrigin`

Python：

- `CORSMiddleware`
- `allow_credentials=True`
- `allow_origins` 必須明確列出，不能用 `*` 搭配 cookie credentials。

**Java verified CSRF detail：** signin、logout、validLogined 忽略 CSRF；refreshNewToken 刻意沒有列入 ignore list，因此 refresh 必須帶有效 CSRF token。`CsrfCookieFilter` 每次確保 token 同時存在於 request attribute、response header `X-CSRF-TOKEN` 與 non-HttpOnly cookie；cookie secure flag 跟隨 `request.isSecure()`。

設定建議：

```python
app.add_middleware(
    CORSMiddleware,
    allow_origins=settings.allowed_origins,
    allow_credentials=True,
    allow_methods=["GET", "POST", "PUT", "DELETE", "OPTIONS"],
    allow_headers=["Authorization", "Content-Type", "X-CSRF-Token", "X-Requested-With"],
)
```

### SQL Mapper / Repository

Java:

- `IBaseMapper`
- `BaseService`
- `core/mapper/*Mapper.java`
- `core/mapper/*Mapper.xml`
- `DB1Config`

Python：

- SQLAlchemy engine/session
- repository classes
- SQL text files for complex MyBatis XML SQL
- Pydantic/SQLAlchemy model 分離

建議：

- `core/entity/Tb*.java` 轉 `domain/*/models.py` SQLAlchemy ORM model。
- `mapper/*.xml` 先轉成 `repositories/sql/*.sql` 或 repository function 中的 `text("""...""")`。
- `BaseService` 轉成 generic CRUD service，但不要過度抽象。
- `QueryParamBuilder`, `SearchBody`, `SearchValue`, `PageOf` 轉成通用 query/pagination schema。
- dynamic SQL 以 Python 條件組 SQLAlchemy Core expression，不建議字串拼接。

資料庫：

- 現有 MariaDB。
- Python driver 建議 `pymysql` 或 `mariadb`。
- 若選 async stack，可用 `asyncmy`，但初期建議同步 SQLAlchemy，降低轉換風險。

### Database migration

`qifu4.sql` 應轉成 Alembic baseline：

1. 建立 SQLAlchemy model 對應 27 個 table。
2. 建立 `alembic revision -m "baseline qifu4 schema"`。
3. 將 schema DDL 放入 migration。
4. seed data 拆成 `scripts/seed_qifu4.py` 或 migration data step。
5. 將 Java MyBatis XML 的欄位/PK/UK/index 與 SQL schema 交叉驗證。

注意：目前分析檔的 SQL table summary 對欄位數解析不完整，正式轉換前要直接解析 `backend/doc/qifu4.sql`，不要只依 md summary。

**Java verified schema count：** `backend/doc/qifu4.sql` 目前含 27 個 `CREATE TABLE`。數量已確認，但每個 model 仍須逐欄核對 column name、type、nullability、default、PK、UK、index 與 MySQL-specific index length。

### Configuration

Java properties：

- `application.properties`
- `appConfig.properties`
- `db1-config.properties`
- `endpoint-publish.json`
- `excludePathPatterns.json`
- `mqtt-user.json`

Python 建議：

- `.env` 放部署機密與環境差異。
- `settings.py` 使用 `pydantic-settings`。
- JSON resource 保留在 `app/resources`，用 typed loader 讀取。

配置對照：

| Java key prefix | Python setting |
| --- | --- |
| `server.*` | uvicorn/gunicorn/container config |
| `db1.datasource.*` | `DATABASE_URL`, pool settings |
| `base.*` | `BaseSettings` section |
| `page.allowedOrigin` | `allowed_origins` |
| `ldap.*` | LDAP auth adapter |
| `mqttbroker.*` | excluded；只有在另行批准 MQTT scope 時才建立設定 |
| `spring.mail.*` | mail settings |
| `jasperreport.*` | excluded from Python backend settings |

### Exception / Result model

Java:

- `BaseSysException`
- `AuthorityException`
- `ControllerException`
- `ServiceException`
- `DefaultResult`
- `DefaultControllerJsonResultObj`
- `QueryControllerJsonResultObj`

Python：

- custom exceptions in `common/exceptions.py`
- FastAPI exception handlers
- Pydantic response envelopes

建議：

- 權限不足：HTTP 403。
- 未登入/Token invalid：HTTP 401。
- validation error：HTTP 422，但 response body 可包成既有前端期待格式。
- service exception：HTTP 400 或 500，依現有語意 mapping。

此處的 HTTP status mapping 是 **Python target/open decision**，不是由 `BaseSysException` 類別本身可直接推出的 Java contract。Java controller 常在 method 內 catch exception 並填 response envelope；Spring Security 的 401/403 又由獨立 handler/interceptor 產生不同 JSON。必須按 endpoint/handler 建立 contract matrix 後再統一 mapping。

### User context

Java:

- `UserUtils`
- `UserLocalUtils`
- `SecurityContextHolder`
- `JwtUserContextFilter`

Python：

- request scope：`request.state.user`
- non-request service decorator：`contextvars.ContextVar`

建議：

- `current_user_var = ContextVar("current_user", default=None)`
- middleware 解析 JWT 後同時設定 `request.state.user` 與 contextvar。
- response 完成後 reset token，避免 worker reused 時污染。

**Java verified role semantics：** admin bypass 由 role id `admin` 或 `*` 觸發；一般 permission 必須同時精確匹配 permission string 與 type (`VIEW`, `CONTROLLER`, `SERVICE`)。不得只做 permission string set 而遺失 type 或 admin bypass。

### 權限模型

現有資料表與類別顯示有：

- `tb_account`
- `tb_role`
- `tb_role_permission`
- `tb_user_role`
- `tb_sys_menu`
- `tb_sys_prog`
- `PermissionType`
- `RolePermissionAttr`
- controller/service method authority annotations

Python 建議：

- `permissions.py` 統一查詢 user role permission map。
- API 層：`require_permission(program_id, permission_type)`。
- service 層：`@service_authority(service_id, method_type)`。
- event log：權限允許/拒絕都可依 setting 決定是否寫入。

### Scheduled jobs

Java:

- `ClearTempUploadJob`: cron `1 0 1 * * *`.
- `ClearSystemLogJob`: cron `1 0 4 * * *`.
- `SysExpressionJob`: initial delay 10 seconds, fixed delay 60 seconds.
- `SendMailHelperJob`: initial delay 5 seconds, fixed delay 180 seconds.

- `ClearSystemLogJob`
- `ClearTempUploadJob`
- `SendMailHelperJob`
- `SysExpressionJob`

Python：

- APScheduler
- 若部署多 worker，job 要避免重複執行：使用 DB lock、Redis lock 或獨立 worker process。

建議：

- web API process 不直接跑 scheduled jobs，除非只有單 instance。
- 建立 `python -m app.jobs.worker` 作為獨立 container。

## 建議 migration phases

### Phase 0：建立 Python skeleton

產出：

- FastAPI app
- settings
- logging context
- DB engine/session
- health check
- Dockerfile
- pytest baseline

成功條件：

- `/health` 可回應。
- 可連 MariaDB。
- Alembic 可連線並讀 metadata。

### Phase 1：資料模型與 repository baseline

產出：

- 27 個核心 table 的 SQLAlchemy model。
- Alembic baseline migration。
- repository base pattern。
- account/role/permission repository。

成功條件：

- 可用 Python 查 `tb_account`, `tb_role`, `tb_user_role`, `tb_role_permission`。
- 與 Java 查詢結果一致。

### Phase 2：Security 與 AuthController

產出：

- password verify
- signin
- validLogined
- refresh token
- logout
- HttpOnly JWT cookie
- CSRF token
- CORS with credentials
- JWT user context middleware

成功條件：

- 前端可登入。
- cookie/token/CSRF 行為可跑通。
- user context 中能取得 roles/permissions。

### Phase 3：Controller authority + service authority

產出：

- controller permission dependency。
- service authority decorator。
- event log support。
- service script expression decorator skeleton。

成功條件：

- 有權限 API 放行。
- 無權限 API 回 403。
- event log 與 Java 邏輯一致。

### Phase 4：PROG API migration

順序建議：

1. `BaseHelperApiController`
2. `HelloApiController`
3. `DashboardDemoController`
4. `PROG001D0001` 到 `PROG001D0005`
5. `PROG002D0001` 到 `PROG002D0003`
6. `PROG004D0001` 到 `PROG004D0002`
7. `PROG005D0001` 不遷移（Java verified：純 MQTT dashboard；列為明確 compatibility gap）

每支 API 要有：

- route
- request schema
- response schema
- repository/service
- permission decorator/dependency
- pytest integration test

### Phase 5：報表、SOAP、MQTT、排程

風險較高，建議最後做：

- JasperReport: do not implement a Python version; use the existing Java/report service or an external report service if needed.
- SOAP/CXF endpoint：確認前端/外部是否仍使用。
- MQTT broker／monitoring：目前均 excluded；若日後外部化 broker 或恢復監控，須另立 scope decision，不屬於本遷移既定交付。

Endpoint boundary（Java verified）：`PROG005D0001Controller` 完全依賴 MQTT broker/monitoring，因此從 API migration 排除。`PROG001D0005Controller` 同時含 Jasper metadata CRUD 與 compile/deploy 行為；前者可遷移，後者必須排除或呼叫既有 report service。`CommonJasperReportController` 的 PDF rendering 全部排除。
- Scheduled jobs：獨立 worker。

## 風險與決策

### 不建議直接全 ORM 化

原因：

- MyBatis XML 可能有大量手寫 SQL 與 dynamic SQL。
- 權限、menu、program 查詢可能依賴特定 join/result map。
- 全 ORM 化會增加行為差異。

建議：

- 先 repository + SQLAlchemy Core/text 保行為。
- 穩定後局部 ORM 化。

### 不建議複製 Spring AOP 隱式模型

原因：

- Python 沒有 Spring proxy AOP 同等基礎設施。
- 隱式 patch/decorator registry 會降低可讀性。

建議：

- service 方法明確掛 decorator。
- 對重要權限與 event log 寫測試。

### HttpOnly JWT 必須搭配 CSRF

原因：

- JWT 放 HttpOnly cookie 可避免 JS 讀取 token。
- 但 cookie 會被瀏覽器自動帶上，跨站請求風險需要 CSRF token 或 SameSite 策略補強。

建議：

- access/refresh 都 HttpOnly。
- CSRF token 使用 non-HttpOnly cookie + `X-CSRF-Token` header double-submit。
- CORS `allow_credentials=True` 時 origins 明確列出。

## 推薦依賴清單

```toml
[project]
dependencies = [
  "fastapi",
  "uvicorn[standard]",
  "pydantic-settings",
  "sqlalchemy>=2",
  "alembic",
  "pymysql",
  "python-jose[cryptography]",
  "passlib[bcrypt]",
  "python-multipart",
  "apscheduler",
  "structlog",
  "httpx",
  "pytest",
  "pytest-asyncio",
]
```

可選：

```toml
dependencies = [
  "dependency-injector",
  "redis",
  "ldap3",
  "jinja2",
]
```

## 來源與依據

- FastAPI 官方 features：OpenAPI、自動文件、Pydantic validation、security、dependency injection、Starlette features。
- FastAPI middleware 官方文件：middleware 在 path operation 前後處理 request/response，可對應 Filter/Interceptor。
- FastAPI CORS 官方文件：`CORSMiddleware` 支援 origins、credentials、methods、headers；credentials=true 時不可用 wildcard。
- SQLAlchemy 2.0 官方 overview：SQLAlchemy 分 Core 與 ORM；Core 適合 SQL expression/database integration，ORM 建在 Core 上。
- Alembic 官方文件：Alembic 是 SQLAlchemy Database Toolkit 的 lightweight database migration tool。

Reference URLs:

- https://fastapi.tiangolo.com/features/
- https://fastapi.tiangolo.com/tutorial/middleware/
- https://fastapi.tiangolo.com/tutorial/cors/
- https://docs.sqlalchemy.org/en/20/intro.html
- https://alembic.sqlalchemy.org/en/latest/
