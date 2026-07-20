# Qifu4 Python Backend

This directory contains the Python migration target for the qifu4 backend.

## Current Slice

- FastAPI application skeleton
- pydantic-settings based configuration
- CORS middleware
- SQLAlchemy engine/session factory
- `/health` smoke endpoint
- shared result, exception, pagination, search, context, and resource helpers
- auth-table models and basic repositories for 7 tables
- bcrypt, JWT creation/verification, HttpOnly cookies, and CSRF primitives
- Java-compatible common response and pagination contracts
- DB-backed auth service with signin, validLogined, refreshNewToken, and logout routes
- access/refresh token persistence and active-token validation
- JWT user-context middleware and controller permission dependency
- Java-compatible service authority decorator (`serviceId:METHOD_TYPE`)
- controller/service permit-deny event logging with `tb_sys_event_log`
- reusable transaction-aware CRUD service with UUID/create/update audit fields
- account, role, user-role, role-permission, and sys-code repository filters and CRUD services
- `tb_sys`, `tb_sys_prog`, `tb_sys_menu`, and `tb_sys_menu_role` schema models
- Java-compatible `/api/menu/getMemuItemAndProgList` menu tree and program-list flow
- Java-compatible `HelloApiController` GET/POST/DELETE routes
- Java-compatible authenticated `DashboardDemoController` rolling-user and seven-calendar-day token counts
- Java-compatible `PROG001D0001` application-system findPage/load/save/update/delete routes
- Java-compatible `PROG001D0002` program-page findPage/load/save/update/delete routes
- Java-compatible `PROG001D0003` folder-menu assignment query/update routes
- Java-compatible `PROG001D0004` template and template-parameter management routes
- partial `PROG001D0005` report metadata/parameter routes with Jasper deployment fail-closed
- Java-compatible `PROG002D0001` role, permission, protected-delete, and role-copy routes
- `PROG002D0002` user-role assignment routes with password-field exposure corrected
- Java-compatible `PROG002D0003` menu-program role assignment routes
- Java-compatible `PROG004D0001` event-log query/single-delete/delete-all routes
- `PROG004D0002` token-log query/delete with refresh-token handle exposure corrected
- `PROG005D0001` MQTT dashboard disabled-runtime response contract
- Java-compatible `ClearSystemLogJob` logic for inclusive 14-day event/login-log cleanup
- application-system controller plus `applicationSystemLogicServiceImpl:INSERT|UPDATE|DELETE` double permission gates
- application-system delete dependency guard against `tb_sys_prog.PROG_SYSTEM`
- non-paginated `QueryResult.pageOf=null` compatibility
- 53 passing tests

## Compatibility Status

This is a foundation/auth/authority/core-CRUD/menu/early-controller slice, not a Java-compatible replacement yet. Sixteen of 27 schema tables are modeled, while most business APIs, Alembic migrations, seed scripts, LDAP auth, and real-MariaDB integration verification remain incomplete. Login-to-menu, Hello API, and PROG001D0001-0004 flows have isolated integration coverage; PROG001D0005 is partial because Jasper deployment/runtime remains unavailable. MariaDB/MyBatis parity remains a required gate.

The common result model now uses Java `success=Y/N` and endpoint-specific controller/query fields. Each migrated business endpoint still needs its own response snapshot test because Java does not use one universal envelope.

MQTT and JasperReport/PDF generation are intentionally out of scope for this Python backend.

`ClearSystemLogJob` is implemented as an atomic callable for a dedicated scheduler process.
It is not started inside FastAPI workers: deployment still needs one scheduler worker at
Java's `04:00:01` daily cron to avoid duplicate execution in multi-worker deployments.

## Local Commands

```powershell
py -m pip install -e ".[test]"
py -m pytest
py -m uvicorn app.main:app --reload
```
