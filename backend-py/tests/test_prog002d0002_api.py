from datetime import datetime
from fastapi.testclient import TestClient
from sqlalchemy import create_engine, select
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.account.models import TbAccount
from app.domain.role.models import TbRole, TbUserRole
from app.main import create_app
from app.security.dependencies import get_request_user


def setup():
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[
        TbAccount.__table__, TbRole.__table__, TbUserRole.__table__])
    db, now = Session(engine), datetime(2026, 1, 1)
    db.add_all([
        TbAccount(oid="account1", account="alice", password="secret-hash",
                  on_job="Y", cuserid="admin", cdate=now),
        TbRole(oid="r1", role="staff", description="", cuserid="admin", cdate=now),
        TbRole(oid="r2", role="manager", description="", cuserid="admin", cdate=now),
    ])
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def test_user_list_excludes_password_and_role_round_trip() -> None:
    client, db = setup()
    user = client.post("/api/PROG002D0002/loadUserList").json()["value"][0]
    assert user["account"] == "alice"
    assert "password" not in user
    initial = client.post(
        "/api/PROG002D0002/findUserRoleListByAccountOid", json={"oid": "account1"}).json()
    assert initial["value"]["enable"] == []
    assert [role["role"] for role in initial["value"]["all"]] == ["manager", "staff"]
    assert client.post("/api/PROG002D0002/updateUserRole/account1/r1,r2,").json()["success"] == "Y"
    loaded = client.post(
        "/api/PROG002D0002/findUserRoleListByAccountOid", json={"oid": "account1"}).json()
    assert [role["role"] for role in loaded["value"]["enable"]] == ["manager", "staff"]
    db.close()


def test_empty_assignment_removes_all_user_roles() -> None:
    client, db = setup()
    client.post("/api/PROG002D0002/updateUserRole/account1/r1,")
    assert client.post("/api/PROG002D0002/updateUserRole/account1/,").json()["success"] == "Y"
    assert db.scalar(select(TbUserRole).where(TbUserRole.account == "alice")) is None
    db.close()
