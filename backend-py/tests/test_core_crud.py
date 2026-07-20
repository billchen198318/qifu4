from sqlalchemy import create_engine
from sqlalchemy.orm import Session

from app.common.context import UserContext, reset_current_user_context, set_current_user_context
from app.db.base import Base
from app.domain.account.models import TbAccount
from app.domain.account.repository import AccountRepository
from app.domain.account.service import AccountCrudService
from app.domain.permission.models import TbRolePermission
from app.domain.permission.repository import RolePermissionRepository
from app.domain.permission.service import RolePermissionCrudService
from app.domain.role.models import TbRole, TbUserRole
from app.domain.role.repository import RoleRepository, UserRoleRepository
from app.domain.role.service import RoleCrudService, UserRoleCrudService
from app.domain.system.models import TbSysCode
from app.domain.system.repository import SysCodeRepository
from app.domain.system.service import SysCodeCrudService

TABLES = [TbAccount.__table__, TbRole.__table__, TbUserRole.__table__,
          TbRolePermission.__table__, TbSysCode.__table__]


def session() -> Session:
    engine = create_engine("sqlite+pysqlite:///:memory:")
    Base.metadata.create_all(engine, tables=TABLES)
    return Session(engine)


def test_crud_services_apply_uuid_and_audit_fields() -> None:
    db = session()
    context_token = set_current_user_context(UserContext(account="admin"))
    try:
        role = RoleCrudService(db).create(TbRole(role="operator", description="Operator"))
        assert len(role.oid) == 36
        assert role.cuserid == "admin"
        assert role.cdate is not None

        role.description = "Updated"
        updated = RoleCrudService(db).update(role)
        assert updated.uuserid == "admin"
        assert updated.udate is not None
        assert RoleCrudService(db).delete(role.oid)
    finally:
        reset_current_user_context(context_token)
        db.close()


def test_java_mapper_filters_and_unique_keys() -> None:
    db = session()
    context_token = set_current_user_context(UserContext(account="admin"))
    try:
        AccountCrudService(db).create(TbAccount(account="alice", password="hash", on_job="Y"))
        RoleCrudService(db).create(TbRole(role="staff", description="Staff"))
        UserRoleCrudService(db).create(TbUserRole(role="staff", account="alice", description="mapping"))
        RolePermissionCrudService(db).create(TbRolePermission(
            role="staff", permission="CORE_TESTQ", perm_type="CONTROLLER", description="query"))
        SysCodeCrudService(db).create(TbSysCode(code="TOKEN", type="AUTH", name="Token"))

        assert AccountRepository(db).find(account="alice", on_job="Y")[0].account == "alice"
        assert RoleRepository(db).find("staff")[0].description == "Staff"
        assert UserRoleRepository(db).find_by_role_and_account("staff", "alice") is not None
        assert RolePermissionRepository(db).find("staff", perm_type="CONTROLLER")[0].permission == "CORE_TESTQ"
        assert SysCodeRepository(db).find(code_type="AUTH")[0].code == "TOKEN"
    finally:
        reset_current_user_context(context_token)
        db.close()
