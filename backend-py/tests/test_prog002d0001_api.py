from datetime import datetime
from fastapi.testclient import TestClient
from sqlalchemy import create_engine, select
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.navigation.models import TbSysMenuRole
from app.domain.permission.models import TbRolePermission
from app.domain.role.models import TbRole, TbUserRole
from app.domain.system.models import TbSysCode
from app.main import create_app
from app.security.dependencies import get_request_user


def setup():
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    tables = [TbRole.__table__, TbRolePermission.__table__, TbUserRole.__table__,
              TbSysMenuRole.__table__, TbSysCode.__table__]
    Base.metadata.create_all(engine, tables=tables)
    db, now = Session(engine), datetime(2026, 1, 1)
    db.add(TbSysCode(oid="code", code="CMM_CONF001", type="CMM", name="Default role",
                     param1="staff", cuserid="admin", cdate=now))
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def test_role_crud_permissions_and_copy_children() -> None:
    client, db = setup()
    source = client.post("/api/PROG002D0001/save", json={
        "role": "source", "description": "source role"}).json()["value"]
    assert client.post("/api/PROG002D0001/saveSetParam", json={
        "role": "source", "permission": "P1", "permType": "CONTROLLER",
        "description": "permission"}).json()["success"] == "Y"
    db.add(TbSysMenuRole(oid="mr", prog_id="P1", role="source",
                         cuserid="admin", cdate=datetime(2026, 1, 1)))
    db.commit()
    copied = client.post("/api/PROG002D0001/roleCopySaveJson", json={
        "fromRoleOid": source["oid"], "role": "copied", "description": "copy"}).json()
    assert copied["success"] == "Y"
    assert db.scalar(select(TbRolePermission).where(TbRolePermission.role == "copied")) is not None
    assert db.scalar(select(TbSysMenuRole).where(TbSysMenuRole.role == "copied")) is not None
    found = client.post("/api/PROG002D0001/findPage", json={
        "field": {"role": "copied"}, "pageOf": {"select": "1", "showRow": "10"}}).json()
    assert found["pageOf"]["countSize"] == "1"
    db.close()


def test_role_delete_protection_and_full_cascade() -> None:
    client, db = setup()
    default = client.post("/api/PROG002D0001/save", json={"role": "staff"}).json()["value"]
    assert "cannot delete" in client.post(
        "/api/PROG002D0001/delete", json={"oid": default["oid"]}).json()["message"]
    role = client.post("/api/PROG002D0001/save", json={"role": "temporary"}).json()["value"]
    now = datetime(2026, 1, 1)
    db.add_all([
        TbRolePermission(oid="p", role="temporary", permission="X", perm_type="SERVICE",
                         description="", cuserid="admin", cdate=now),
        TbUserRole(oid="u", role="temporary", account="alice", description="",
                   cuserid="admin", cdate=now),
        TbSysMenuRole(oid="m", role="temporary", prog_id="X", cuserid="admin", cdate=now),
    ])
    db.commit()
    assert client.post("/api/PROG002D0001/delete", json={"oid": role["oid"]}).json()["success"] == "Y"
    assert db.scalar(select(TbRolePermission).where(TbRolePermission.role == "temporary")) is None
    assert db.scalar(select(TbUserRole).where(TbUserRole.role == "temporary")) is None
    assert db.scalar(select(TbSysMenuRole).where(TbSysMenuRole.role == "temporary")) is None
    db.close()
