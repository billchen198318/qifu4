from datetime import datetime
from fastapi.testclient import TestClient
from sqlalchemy import create_engine, select
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.navigation.models import TbSysMenu, TbSysMenuRole, TbSysProg
from app.domain.role.models import TbRole
from app.main import create_app
from app.security.dependencies import get_request_user


def setup():
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[
        TbSysProg.__table__, TbSysMenu.__table__, TbSysMenuRole.__table__, TbRole.__table__])
    db, now = Session(engine), datetime(2026, 1, 1)
    common = {"prog_system": "CORE", "item_type": "ITEM", "icon": "x",
              "font_icon_class_id": "x", "cuserid": "admin", "cdate": now}
    db.add_all([
        TbSysProg(oid="p1", prog_id="P1", name="Menu program", url="/p1", **common),
        TbSysProg(oid="p2", prog_id="P2", name="Edit program", url="/p2",
                  edit_mode="Y", **common),
        TbSysProg(oid="p3", prog_id="P3", name="Not in menu", url="/p3", **common),
        TbSysMenu(oid="m1", prog_id="P1", parent_oid="root", cuserid="admin", cdate=now),
        TbSysMenu(oid="m2", prog_id="P2", parent_oid="root", cuserid="admin", cdate=now),
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


def test_menu_program_filter_and_role_assignment() -> None:
    client, db = setup()
    programs = client.post("/api/PROG002D0003/findProgramFolderMenuItem/CORE").json()
    assert [row["progId"] for row in programs["value"]] == ["P1"]
    initial = client.post("/api/PROG002D0003/findMenuProgramRoleList", json={"oid": "p1"}).json()
    assert initial["value"]["enable"] == []
    assert [row["role"] for row in initial["value"]["all"]] == ["manager", "staff"]
    assert client.post("/api/PROG002D0003/updateMenuRole/p1/r1,r2,").json()["success"] == "Y"
    loaded = client.post("/api/PROG002D0003/findMenuProgramRoleList", json={"oid": "p1"}).json()
    assert [row["role"] for row in loaded["value"]["enable"]] == ["manager", "staff"]
    db.close()


def test_comma_only_assignment_clears_menu_roles() -> None:
    client, db = setup()
    client.post("/api/PROG002D0003/updateMenuRole/p1/r1,")
    assert client.post("/api/PROG002D0003/updateMenuRole/p1/,").json()["success"] == "Y"
    assert db.scalar(select(TbSysMenuRole).where(TbSysMenuRole.prog_id == "P1")) is None
    db.close()
