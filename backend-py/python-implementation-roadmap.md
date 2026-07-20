# Qifu4 Python Implementation Roadmap

## Scope

Convert the qifu4 Java backend foundation to Python, excluding MQTT and excluding a Python rewrite of JasperReport / PDF report generation.

Truth rule:

- **Java verified** comes from current Java/SQL/resource/frontend source.
- **Python target** is a design choice and may intentionally differ.
- **Open decision** must not silently become an implementation requirement.
- Generated `java-*-resource.md` files are indexes, not final behavioral evidence.

保留目標：

- REST API path 與前端相容性
- base/core/app 三層責任
- permission / role / user context
- HttpOnly JWT cookie
- refresh token
- CSRF
- CORS
- controller authority check
- service authority check
- event log
- MyBatis mapper SQL 行為
- qifu4 database schema / seed data
- scheduled jobs，排除 MQTT monitoring job

排除：

- MQTT broker 啟動與帳號檔產生
- `MqttBrokerConfig`
- `MqttMonitoringInterceptor`
- `MqttIntegrationTest`
- `mqtt-user.json`
- `mqttbroker.*` settings
- JasperReport / PDF report generation
- `CommonJasperReportController`
- `JReportUtils`
- `PdfConvertUtils`
- `PdfCopyPageBuilder`
- `jasperreport.*` settings

## Target Stack

| Area | Framework / Library |
| --- | --- |
| Web framework | FastAPI |
| ASGI server | Uvicorn |
| Request/response schema | Pydantic |
| Settings | pydantic-settings |
| DB access | SQLAlchemy 2.0 Core first, ORM where stable |
| DB migration | Alembic |
| MariaDB driver | PyMySQL first |
| JWT | python-jose or PyJWT |
| Password hashing | passlib bcrypt |
| CSRF | custom double-submit token |
| CORS | FastAPI / Starlette CORSMiddleware |
| Scheduling | APScheduler |
| Logging context | logging + contextvars, optionally structlog |
| Testing | pytest + httpx TestClient |

## Target Directory

```text
C:\home\qifu4\backend-py\
  pyproject.toml
  .env.example
  alembic.ini
  README-python.md
  app\
    main.py
    config\
      settings.py
      logging.py
    db\
      engine.py
      session.py
      base.py
    common\
      constants.py
      exceptions.py
      result.py
      pagination.py
      search.py
      context.py
      resources.py
    security\
      jwt.py
      password.py
      cookies.py
      csrf.py
      permissions.py
      dependencies.py
    middleware\
      request_context.py
      jwt_user_context.py
      mdc.py
    aspects\
      service_authority.py
      service_script_expression.py
      event_log.py
    domain\
      account\
        models.py
        schemas.py
        repository.py
        service.py
      role\
      permission\
      system\
      menu\
      program\
      template\
      upload\
    api\
      auth.py
      base_helper.py
      dashboard_demo.py
      hello.py
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
    resources\
      endpoint-publish.json
      excludePathPatterns.json
    jobs\
      clear_system_log.py
      clear_temp_upload.py
      send_mail_helper.py
      sys_expression.py
  alembic\
    env.py
    versions\
  tests\
```

## Java to Python File Mapping

### Base Layer

| Java source | Python target | Priority |
| --- | --- | --- |
| `org.qifu.base.Constants` | `app/common/constants.py` | P0 |
| `org.qifu.base.CoreAppConstants` | `app/common/constants.py` | P0 |
| `BaseSysException`, `AuthorityException`, `ControllerException`, `ServiceException` | `app/common/exceptions.py` | P0 |
| `DefaultResult`, `DefaultControllerJsonResultObj`, `QueryControllerJsonResultObj`, `QueryResult` | `app/common/result.py` | P0 |
| `PageOf`, `SearchBody`, `SearchValue`, `SortType`, `QueryParamBuilder` | `app/common/pagination.py`, `app/common/search.py` | P0 |
| `BaseUserInfo`, `UserRoleAndPermission`, `RolePermissionAttr` | `app/security/permissions.py`, `app/common/context.py` | P0 |
| `TokenBuilderUtils`, `TokenStore*` | `app/security/jwt.py`, `app/security/cookies.py` | P0 |
| `UserLocalUtils`, `UserUtils` | `app/common/context.py`, `app/security/dependencies.py` | P0 |
| `BaseService`, `IBaseService`, `BaseLogicService` | `app/domain/*/service.py` shared patterns | P1 |
| `IBaseMapper` | `app/domain/*/repository.py` shared repository base | P1 |
| `BaseSystemMessage` | `app/common/messages.py` | P1 |
| file/pdf/ftp utility classes | specific adapters only when used | P3 |

### Core Layer

| Java source | Python target | Priority |
| --- | --- | --- |
| `core/entity/Tb*.java` | `app/domain/*/models.py` | P0 |
| `core/mapper/*Mapper.java` + XML | `app/domain/*/repository.py` | P0/P1 |
| `IAccountService`, `AccountServiceImpl` | `app/domain/account/service.py` | P0 |
| role/user role/permission services | `app/domain/role`, `app/domain/permission` | P0 |
| `ServiceAuthorityCheckAspect` | `app/aspects/service_authority.py` | P0 |
| `ServiceScriptExpressionProcessAspect` | `app/aspects/service_script_expression.py` | P1 |
| `ControllerAuthorityCheckInterceptor` | `app/security/dependencies.py` or `app/middleware` | P0 |
| `MDC4UserBuildInterceptor`, `MDCInterceptor` | `app/middleware/mdc.py` | P1 |
| `UserBuilderInterceptor` | merged into `jwt_user_context.py`; legacy path optional | P1 |
| `MqttMonitoringInterceptor` | excluded | N/A |
| scheduled jobs except MQTT | `app/jobs/*.py` | P2 |
| `CoreApiSupport`, `CookieUtils`, `LocaleMessageSourceUtils` | `app/security`, `app/common` utilities | P1 |
| report utilities | excluded | N/A |

### App Layer

| Java source | Python target | Priority |
| --- | --- | --- |
| `Application.java` | `app/main.py` | P0 |
| `WebSecurityConfig` | `app/security/*`, `app/main.py` middleware setup | P0 |
| `WebConfig` | `app/main.py`, `app/middleware`, static/template setup | P0 |
| `MyBatisConfig` | `app/db/engine.py`, `app/db/session.py` | P0 |
| `AuthController` | `app/api/auth.py` | P0 |
| `JwtUserContextFilter` | `app/middleware/jwt_user_context.py` | P0 |
| `CsrfCookieFilter` | `app/security/csrf.py` + middleware | P0 |
| `CustomAccessDeniedHandler`, `JwtAuthEntryPoint` | FastAPI exception handlers | P0 |
| `BaseHelperApiController` | `app/api/base_helper.py` | P1 |
| `HelloApiController`, `DashboardDemoController` | `app/api/hello.py`, `dashboard_demo.py` | P1 |
| non-MQTT `PROG*Controller` | `app/api/prog*.py` | P2 |
| `CommonJasperReportController` | excluded | N/A |
| `MqttBrokerConfig` | excluded | N/A |
| `PROG005D0001Controller` (MQTT dashboard) | excluded with MQTT | N/A |
| `PROG001D0005Controller` | metadata CRUD only; compile/deploy/render excluded or delegated | P2 |

### Resource Mapping

| Java resource | Python target | Note |
| --- | --- | --- |
| `application.properties` | `.env.example`, `app/config/settings.py` | server config moves to uvicorn/deployment |
| `appConfig.properties` | `.env.example`, `settings.py` | exclude `mqttbroker.*` and `jasperreport.*` |
| `db1-config.properties` | `DATABASE_URL`, pool settings | use MariaDB URL |
| `endpoint-publish.json` | `app/resources/endpoint-publish.json` | SOAP/rest endpoint support later |
| `excludePathPatterns.json` | `app/resources/excludePathPatterns.json` | convert to auth bypass rules |
| `qifu4.sql` | Alembic baseline + seed script | direct parse from SQL source |
| `mqtt-user.json` | excluded | N/A |

## Implementation Phases

### Phase 0 - Project Skeleton

Goal:

Create a runnable Python backend foundation.

Tasks:

- Create `pyproject.toml`.
- Create FastAPI `app/main.py`.
- Create settings loader.
- Create logging setup.
- Create `/health` endpoint.
- Create CORS middleware from settings.
- Create DB engine/session with SQLAlchemy.
- Add pytest smoke test.

Deliverables:

- `pyproject.toml`
- `.env.example`
- `app/main.py`
- `app/config/settings.py`
- `app/db/engine.py`
- `app/db/session.py`
- `tests/test_health.py`

Validation:

- `py -m pytest` passes.
- `uvicorn app.main:app --reload` starts.
- `GET /health` returns status.

### Phase 1 - Database Baseline

Goal:

Represent current qifu4 schema in Python and make repository access possible.

Tasks:

- Parse `backend/doc/qifu4.sql` directly.
- Create SQLAlchemy models for 27 core tables.
- Create Alembic baseline migration.
- Create seed script for initial data.
- Create DB session dependency.
- Implement simple repository base.

Deliverables:

- `app/db/base.py`
- `app/domain/*/models.py`
- `alembic/env.py`
- first Alembic revision
- `scripts/seed_qifu4.py` or `app/db/seed.py`

Validation:

- Alembic can create schema on empty MariaDB.
- Seed data can be inserted.
- Python can query `tb_account`, `tb_role`, `tb_user_role`, `tb_role_permission`.

Important:

Do not rely on the generated SQL summary in `java-doc-sql-resource.md` for columns. Use original `C:\home\qifu4\backend\doc\qifu4.sql`.

Java verified: the SQL currently has 27 `CREATE TABLE` statements. Completion requires every column plus PK, UK, index, default, nullability, and MySQL index-length details; table count alone is insufficient.

### Phase 2 - Base Models and Exceptions

Goal:

Port the reusable response, exception, pagination, search, and context layer.

Tasks:

- Convert constants.
- Convert exception hierarchy.
- Convert default response envelopes.
- Convert pagination/search models.
- Implement request/user context via `contextvars`.
- Implement resource JSON loader.

Deliverables:

- `app/common/constants.py`
- `app/common/exceptions.py`
- `app/common/result.py`
- `app/common/pagination.py`
- `app/common/search.py`
- `app/common/context.py`
- `app/common/resources.py`

Validation:

- Unit tests for response envelope.
- Unit tests for pagination/search parsing.
- Context is isolated per request/test.
- Contract tests use Java names and values: `success` is `Y/N`; controller envelopes include `login`, `isAuth`, `checkFields`; query envelopes use the four `pageOf*` fields.
- Pagination covers string inputs, allowed `showRow` values 10/30/50/100, select clamping, page calculation, and order/sort sanitization.

### Phase 3 - Security Foundation

Goal:

Port login/token/security primitives before API migration.

Java compatibility note:

- `excludePathPatterns.json` is consumed as Spring Security `permitAll()` matchers and includes `/api**` and `/api/**`.
- This does not make APIs finally public; Java applies `ControllerAuthorityCheckInterceptor` to `/api/*` and `/api/**` afterward.
- Keep security-chain bypass, optional JWT context, auth-endpoint bypass, and final controller permission enforcement separate.
- Do not remove `/api/**` while claiming parity, and do not implement it as unconditional final access.

Tasks:

- Implement password hashing/checking.
- Implement JWT creation/verification.
- Implement access token + refresh token model.
- Implement HttpOnly cookie setter/clearer.
- Implement CSRF double-submit token.
- Implement FastAPI exception handlers for 401/403/service errors.
- Implement auth bypass rules from `excludePathPatterns.json`.
- Test that `/api/**` bypasses the token gate but is still rejected by controller authority when user context is absent.

Deliverables:

- `app/security/password.py`
- `app/security/jwt.py`
- `app/security/cookies.py`
- `app/security/csrf.py`
- `app/security/dependencies.py`
- `app/security/permissions.py`

Validation:

- Token create/verify tests.
- Expired/invalid token returns 401.
- CSRF missing/mismatch returns 403 for mutating requests.
- Cookies use HttpOnly for JWT.
- Cookie tests cover Java names, Secure, SameSite=Lax, Path=/, and 25/40 minute expiry.
- CSRF tests prove signin/logout/validLogined bypass and refreshNewToken enforcement.
- JWT validation includes database-backed active-token validation, not signature/expiry alone.

### Phase 4 - User Context and Permission Queries

Goal:

Rebuild the behavior of `JwtUserContextFilter`, `UserUtils`, and permission map loading.

Ordering requirement:

- Build context only after successful JWT authentication.
- A `permitAll` request may have no JWT and therefore no user context.
- Always clear request/contextvar state after the response, matching Java's `finally` cleanup.

Tasks:

- Implement JWT user context middleware.
- Load user roles from DB.
- Load role permissions from DB.
- Store current user in `request.state.user`.
- Store current user in `contextvars`.
- Clear context after response.

Deliverables:

- `app/middleware/jwt_user_context.py`
- `app/security/permissions.py`
- account/role/permission repositories

Validation:

- Authenticated request has current user.
- Unauthenticated public route works.
- Context is cleared after request.
- Role permission map matches Java behavior for sample user.

### Phase 5 - Auth API

Goal:

Port `AuthController`.

Endpoints:

- `POST /api/auth/signin`
- `POST /api/auth/validLogined`
- `POST /api/auth/refreshNewToken`
- `POST /api/auth/logout`

Tasks:

- Implement login request schema.
- Implement account lookup.
- Check password.
- Check account lock behavior.
- Log login failure/success where applicable.
- Issue access/refresh token cookies.
- Mask accessToken and refreshToken as `Y` in successful signin/validLogined/refresh responses (Java verified).
- Refresh token rotation.
- Logout cookie clear, matching Java.
- Persisted-token revoke is an **open security enhancement**; implement only after documenting compatibility and multi-device/session semantics.

Deliverables:

- `app/api/auth.py`
- `app/domain/account/repository.py`
- `app/domain/account/service.py`
- token persistence/revoke repository if required

Validation:

- Existing frontend login flow can authenticate.
- Cookies are present after signin.
- Refresh returns new token.
- Logout clears cookies.
- Invalid login records failure.
- Three failures within five minutes lock signin attempts, matching Java.
- logout returns plain `OK`; refresh returns LoginRequest shape and requires CSRF.

### Phase 6 - Controller Authority and Service Authority

Goal:

Rebuild controller interceptor and service AOP behavior.

Java compatibility note:

- Controller authority is the final gate for most `/api/**` routes even though Spring Security marks them `permitAll()`.
- Exclude the four `CoreAppConstants.AUTH_PATH` endpoints and configured event-log path exactly as Java does before redesigning policy.
- Test missing user, admin, annotation bypass/check, URL permission, and denied permission separately.
- Admin means role id `admin` or `*`; permission checks match both exact string and type.

Tasks:

- Implement route dependency `require_controller_authority`.
- Implement decorator `@service_authority`.
- Implement event log support.
- Implement setting switches:
  - `base.enableControllerAuthCheckLog`
  - `base.enableServiceAuthChecLog`
- Implement permission type mapping.

Deliverables:

- `app/security/dependencies.py`
- `app/aspects/service_authority.py`
- `app/aspects/event_log.py`
- `app/domain/system/event_log_repository.py`

Validation:

- Route with missing permission returns 403.
- Route with permission succeeds.
- Service method with missing permission raises authority error.
- Event log rows match expected fields.

### Phase 7 - Core Repository and Service Migration

Goal:

Port MyBatis mapper/service behavior while minimizing semantic drift.

Strategy:

- Use SQLAlchemy Core/text SQL first.
- Keep hand-written SQL behavior close to MyBatis XML.
- Convert common CRUD to repository helpers.
- Only ORM-ify stable/simple access patterns.

Order:

1. account
2. role
3. role permission
4. user role
5. sys code
6. sys/menu/program
7. template
8. expression/job
9. upload/event log/mail helper

Deliverables:

- `app/domain/*/repository.py`
- `app/domain/*/service.py`
- repository tests with MariaDB test database

Validation:

- Query results match Java for sample data.
- Pagination and count match Java behavior.
- Insert/update/delete preserve audit fields.

### Phase 8 - API Migration

Goal:

Port REST controllers in a controlled order.

Order:

1. `HelloApiController`
2. `DashboardDemoController`
3. `BaseHelperApiController`
4. `PROG001D0001Controller`
5. `PROG001D0002Controller`
6. `PROG001D0003Controller`
7. `PROG001D0004Controller`
8. `PROG001D0005Controller`
9. `PROG002D0001Controller`
10. `PROG002D0002Controller`
11. `PROG002D0003Controller`
12. `PROG004D0001Controller`
13. `PROG004D0002Controller`
14. `PROG005D0001Controller` — excluded; keep as an explicit compatibility gap because it is entirely MQTT-backed

For each controller:

- Map Java path exactly first.
- Create request schema.
- Create response schema.
- Implement service call.
- Add permission dependency.
- Add integration test.
- Compare with Java response shape.

Report boundary: for `PROG001D0005Controller`, migrate report metadata/parameter CRUD only. Jasper compile/deploy/render calls are excluded or delegated. Do not expose a successful no-op for excluded operations.

Validation:

- Existing frontend route works.
- Response JSON shape matches Java unless intentionally changed.
- Permission behavior matches Java.

### Phase 9 - Jobs and Non-Core Adapters

Goal:

Port scheduled jobs and peripheral features except MQTT.

Included:

- `ClearSystemLogJob`
- `ClearTempUploadJob`
- `SendMailHelperJob`
- `SysExpressionJob`

Deferred / adapter-based:

- SOAP/CXF endpoint publishing
- LDAP login
- Mail delivery details

Excluded:

- MQTT broker
- MQTT monitoring
- JasperReport / PDF report generation

Scope clarification: MQTT configuration and monitoring are also excluded deliverables. Externalizing MQTT or restoring monitoring requires separate approved scope.

Validation:

- Jobs can run manually.
- Jobs can run in a separate process.
- Multi-instance duplicate execution is prevented by DB lock or deployment policy.

### Phase 10 - Compatibility and Cutover

Goal:

Run Python backend side-by-side with Java backend, then cut over safely.

Tasks:

- Add compatibility route aliases for Java path names.
- Add API diff tests where possible.
- Add frontend smoke tests.
- Add Dockerfile.
- Add deployment environment config.
- Add rollback plan.

Validation:

- Critical login/permission/menu flows pass.
- CRUD flows pass.
- Logs are usable.
- DB writes are compatible with Java schema.

## Verification Matrix

### Implemented controller checkpoint (2026-07-18)

- `PROG001D0001Controller` is implemented as `/api/PROG001D0001` with `findPage`, `load`,
  `save`, `update`, and `delete`.
- Controller permissions are the Java annotation values `CORE_PROG001D0001Q/C/E/U/D`.
- Java also applies a second gate to logic writes: `applicationSystemLogicServiceImpl:INSERT`,
  `:UPDATE`, or `:DELETE`. Python now enforces that gate; load/findPage call the unannotated
  `SysServiceImpl` path and therefore do not invent a service permission.
- Delete reloads by OID and rejects deletion when any `tb_sys_prog.PROG_SYSTEM` equals the
  selected system's `SYS_ID`.
- Query parity is limited to Java's actual mapper inputs: exact `sysId`, contains-style
  `nameLike`, fixed `SYS_ID ASC`, and Java-shaped `pageOf` string values.
- Isolated SQLite coverage passes; MariaDB collation, LIKE behavior, and transactional parity
  still require the real-database verification gate.

### PROG001D0002 implementation checkpoint (2026-07-18)

- `PROG001D0002Controller` is implemented with Java controller permissions
  `CORE_PROG001D0002Q/C/E/U/D`.
- The actual Java controller directly invokes `sysProgService.insert/update` for save and
  update. It does not invoke `SystemProgramLogicServiceImpl.create/update`; therefore the
  current Java request accepts `progSystem` and `icon` directly and does not apply
  `systemProgramLogicServiceImpl:INSERT|UPDATE`. Python follows that actual call path.
- Delete does invoke `SystemProgramLogicServiceImpl.delete`, so Python additionally requires
  `systemProgramLogicServiceImpl:DELETE`.
- Delete first rejects programs referenced by `tb_sys_menu.PROG_ID`; when no menu references
  exist it removes all matching `tb_sys_menu_role` rows and then deletes `tb_sys_prog` in
  one transaction.
- Java's program-ID validation expression refers to `sysId` even though `TbSysProg` exposes
  `progId`. This appears to be a Java defect; Python applies the intended A-Z/a-z/0-9 check
  to `progId` and records this intentional correction here.

### PROG001D0003 implementation checkpoint (2026-07-18)

- Folder loading directly uses `SysProgServiceImpl` and therefore has only controller
  permission `CORE_PROG001D0003Q`.
- Enabled/all loading calls `SystemMenuLogicServiceImpl.findForMenuSettingsEnableAndAll` and
  additionally requires `systemMenuLogicServiceImpl:SELECT`.
- Menu updates accept the same empty or comma-delimited OID path forms as Java and require
  either `systemMenuLogicServiceImpl:INSERT` or `:UPDATE`, in addition to
  `CORE_PROG001D0003U`.
- The root menu uses Java's zero UUID parent key. Updating replaces all children in one
  transaction, rejects missing program OIDs, and preserves Java's special rejection of
  `CORE_PROG999D9999Q`.
- Java uses unrestricted `@RequestMapping` for both update routes. Python accepts
  GET/POST/PUT/DELETE/PATCH for route parity, although the current frontend uses POST.

### PROG001D0004 implementation checkpoint (2026-07-18)

- All eight Template and Template Param routes are implemented with controller permissions
  `CORE_PROG001D0004Q/C/E/U/D`.
- Main Template create/update/delete call `SystemTemplateLogicServiceImpl` and additionally
  require `systemTemplateLogicServiceImpl:INSERT|UPDATE|DELETE` as appropriate.
- Template content uses Java's actual `String.length() > 4000` rule. The inherited Java
  error text says “words”, but the implementation counts characters; Python preserves both.
- Update reloads the old row and forcibly retains its existing `templateId`, regardless of
  the request value.
- Delete refuses `TPLMSG0001`, `TPLMSG0002`, and `TPLMSG0003` from
  `template-code-use.properties`; otherwise it deletes all matching params before the
  template in one transaction.
- `saveSetParam` directly calls `sysTemplateParamService.insert` in the Java controller.
  It does not call the available Logic `createParam` method, so Java does not verify that the
  Template exists and does not apply Logic INSERT permission. Python preserves this perhaps
  surprising behavior. `deleteSetParam` does use Logic DELETE permission.

### PROG001D0005 partial checkpoint (2026-07-18)

- `tb_sys_jreport` and `tb_sys_jreport_param` are modeled. Query/load use the Java
  “simple” contract and do not serialize the potentially large `CONTENT` BLOB.
- Report and parameter queries, parameter insert/delete, and transactional report-plus-param
  deletion are implemented with the Java controller/service permission split.
- Java save/update first writes decoded ZIP bytes to the database, then the controller deploys
  the archive to the configured report directory and compiles JRXML through JasperReports
  when `isCompile=Y`. Python currently has neither a Jasper/JVM runtime nor an approved
  external report deployment service.
- Therefore Python save/update deliberately fail closed before any database write with
  “Jasper report deployment is not enabled in the Python backend.” This is an explicit
  incomplete boundary, not claimed Java parity.
- `saveSetParam`, like the Template module, directly inserts in the Java controller and does
  not verify that its report exists. Python preserves that behavior; delete uses
  `systemJreportLogicServiceImpl:DELETE`.

### PROG002D0001 implementation checkpoint (2026-07-18)

- Role CRUD, permission query/insert/delete, and role-copy endpoints are implemented with
  controller permissions `CORE_PROG002D0001Q/C/E/U/D`.
- Main writes, role deletion, permission deletion, and copy use the corresponding
  `roleLogicServiceImpl:INSERT|UPDATE|DELETE` gate. Permission insert is a direct Java
  controller service call and deliberately has no Logic INSERT gate.
- Role deletion reloads `tb_sys_code(type=CMM, code=CMM_CONF001).param1`; `admin`, `*`,
  and that configured default role cannot be deleted. Missing/invalid default-role
  configuration fails deletion rather than guessing.
- A permitted role deletion removes matching role-permission, user-role, and menu-role rows
  before the role in one transaction.
- Role copy duplicates the role plus role-permission and menu-role rows. It deliberately does
  not copy user-role assignments, matching `RoleLogicServiceImpl.copyAsNew`.

### PROG002D0002 implementation checkpoint (2026-07-18)

- User loading has controller permission `CORE_PROG002D0002Q`; enable/all role loading also
  requires `roleLogicServiceImpl:SELECT`, and assignment requires
  `roleLogicServiceImpl:UPDATE` plus `CORE_PROG002D0002U`.
- Java serializes the complete `TbAccount` from `loadUserList`, including its `password`
  field. Python intentionally excludes that password hash because the frontend only consumes
  `oid` and `account`. This is a documented security correction rather than silent parity.
- Assignment accepts Java's empty and comma-delimited role-OID path forms, removes duplicates,
  validates every referenced role, and replaces all user-role rows in one transaction.
- Java's unrestricted `@RequestMapping` update routes accept multiple HTTP methods; Python
  mirrors GET/POST/PUT/DELETE/PATCH, while the frontend continues to use POST.

### PROG002D0003 implementation checkpoint (2026-07-18)

- Program loading uses the Java mapper's actual conditions: the program ID must occur in
  `tb_sys_menu`, `PROG_SYSTEM` must match the path system ID, and `EDIT_MODE='N'`.
  Because Java passes null parent/item filters, Python does not invent an ITEM-only condition.
- Program enable/all role loading requires controller `CORE_PROG002D0003Q` and
  `roleLogicServiceImpl:SELECT`; assignment requires `CORE_PROG002D0003U` and
  `roleLogicServiceImpl:UPDATE`.
- The comma-delimited role-OID path is de-duplicated and fully validated before all existing
  `tb_sys_menu_role` rows for the program are transactionally replaced. A comma-only value
  clears every assignment.
- Java again uses unrestricted `@RequestMapping` for update; Python accepts
  GET/POST/PUT/DELETE/PATCH, with POST used by the current frontend.

### PROG004D0001 implementation checkpoint (2026-07-18)

- Event-log findPage, single delete, and unconditional deleteAll are implemented with
  controller permissions `CORE_PROG004D0001Q/D`; the Java path has no Logic Service
  authority layer.
- Although the mapper can filter `sysId`, the Java controller passes only exact `user`.
  Python therefore ignores other request fields and orders by `CDATE DESC`.
- The Java entity's computed `cdateString` property is returned as
  `yyyy-MM-dd HH:mm:ss` for grid compatibility.
- `deleteAll` intentionally has no date/user predicate because the Java endpoint invokes
  the mapper's full-table `deleteAll`. Access remains protected by its delete controller
  permission.

### PROG004D0002 implementation checkpoint (2026-07-18)

- Token-log findPage/delete use controller permissions `CORE_PROG004D0002Q/D`, exact
  `userId` filtering, and `CDATE DESC`; there is no Logic Service authority layer.
- Java's `@JsonIgnore` prevents the full access token property from serialization, while
  `tokenShort` intentionally exposes its first 20 and last 5 characters. Python preserves
  that display contract and the three formatted date-string properties.
- In this schema the entity OID is itself the refresh token. Java serializes that OID to the
  grid as the delete key, exposing a complete refresh token. Python intentionally returns a
  SHA-256 opaque deletion handle instead and resolves it server-side for deletion, so the
  frontend behavior remains intact without disclosing replayable credentials.

### PROG005D0001 disabled-runtime checkpoint (2026-07-18)

- Dashboard, topic, and message routes are implemented with controller permission
  `CORE_PROG005D0001Q` and Java-shaped non-paginated QueryResult responses.

### DashboardDemo checkpoint (2026-07-18)

- Implemented `/api/DashboardDemo/findBoardDemo` and `/findSize` with Java-shaped,
  non-paginated `QueryResult` responses.
- Java has no `ControllerMethodAuthority` annotation on these methods, so no program
  permission is required; they are still login-protected because Java's JWT interceptor
  covers `/api/**`. Python preserves that distinction with authenticated, unchecked
  controller authority.
- `findBoardDemo` preserves Java's rolling range from the current instant through six
  days earlier, grouped by user, descending by count, limited to seven users.
- `findSize` separately preserves Java's seven local calendar-day buckets, oldest first,
  using inclusive `00:00:00.000` through `23:59:59.999` bounds.
- Isolated SQLite integration coverage verifies both range semantics and response shape.

### ClearSystemLogJob checkpoint (2026-07-18)

- Implemented the Java cleanup rule for both `tb_sys_event_log` and
  `tb_sys_login_log`: delete rows whose `CDATE` is less than or equal to the
  execution instant minus 14 days.
- Both deletes use one transaction and roll back together on failure.
- The callable has an explicit clock input and integration coverage for the inclusive
  cutoff boundary.
- Java schedules this at `04:00:01` every day. Python intentionally does not start a
  scheduler inside FastAPI web workers; a dedicated single scheduler process remains a
  deployment task so multiple web workers cannot execute the same cleanup concurrently.
- Java's default configuration has `mqttbroker.enable=false`; when its optional Moquette
  Server and monitoring interceptor beans are absent it returns disabled broker metadata and
  empty client/topic/message lists with `success=Y`. Python reproduces this state.
- Python does not embed a broker or monitoring interceptor. Until a real adapter is added it
  always reports `enable=false`, even if configuration requests true, rather than claiming a
  runtime capability that does not exist. Host and port remain visible configuration metadata.
- Live connected clients, observed/subscribed topics, subscriber counts, retained monitoring
  messages, and bounded per-topic history remain an explicit MQTT integration boundary.

| Area | Test type | Required before cutover |
| --- | --- | --- |
| health/config | unit + smoke | yes |
| DB schema | migration test | yes |
| repository | integration | yes |
| auth | integration | yes |
| JWT cookie | integration | yes |
| CSRF | integration | yes |
| CORS | browser/front-end smoke | yes |
| permission | integration | yes |
| service authority | unit + integration | yes |
| event log | integration | yes |
| each PROG API | integration | yes |
| scheduled jobs | manual + integration | before enabling jobs |
| SOAP/LDAP | feature-specific | before enabling feature |

## Risk Register

| Risk | Impact | Mitigation |
| --- | --- | --- |
| MyBatis XML dynamic SQL differs after rewrite | high | Port with SQLAlchemy Core/text first; compare SQL results with Java. |
| Permission behavior mismatch | high | Implement controller/service authority early; write permission matrix tests. |
| JWT cookie + CSRF incompatibility with frontend | high | Preserve current paths/cookie names initially; test in browser. |
| Hidden Java utility behavior | medium | Port only when referenced by migrated feature; avoid blind utility rewrite. |
| Scheduled jobs duplicate in multi-worker deployment | medium | Run jobs in separate single worker or add DB lock. |
| Report functionality is required later | medium | Keep it outside Python backend scope; call existing Java/report service if needed. |
| SQL schema parser misses MySQL details | medium | Use original `qifu4.sql`; manually review PK/index/charset/defaults. |
| Python dependency sprawl | medium | Keep stack small; add optional dependencies only when feature needs them. |

## First Implementation Slice

Recommended first coding slice:

1. Create FastAPI skeleton.
2. Create settings and DB engine.
3. Create health endpoint.
4. Create base exception/result models.
5. Create SQLAlchemy models for auth tables only:
   - `tb_account`
   - `tb_role`
   - `tb_user_role`
   - `tb_role_permission`
   - `tb_sys_code`
   - `tb_sys_login_log`
   - `tb_sys_token`
6. Implement auth repositories.
7. Implement JWT/cookie/CSRF.
8. Implement `/api/auth/signin`, `/refreshNewToken`, `/logout`, `/validLogined`.

Parity gates:

- Existing Python `successFlag=SUCCESS/FAIL` is not Java-compatible; Java controller results use `success=Y/N` and endpoint-specific fields.
- Preserve token masking, cookie attributes, DB-backed validation, refresh CSRF behavior, account lock rule, and response shapes.

This slice proves the hardest foundation: DB connectivity, security, cookie behavior, user context, and frontend login compatibility.

## Done Definition

The migration is not considered complete until:

- Python backend can start from clean checkout.
- Alembic can create or validate schema.
- Auth flow works with current frontend.
- Role/permission checks match Java behavior.
- All migrated APIs have tests.
- MQTT-related features are explicitly disabled or absent.
- JasperReport/PDF report features are explicitly disabled, absent, or delegated to an external service.
- Large behavior differences are documented in `README-python.md`.
