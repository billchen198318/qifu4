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
from app.main import create_app
from app.security.dependencies import get_request_user


def client_and_db() -> tuple[TestClient, Session]:
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[
        TbSysProg.__table__, TbSysMenu.__table__, TbSysMenuRole.__table__])
    db = Session(engine)
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def payload(program_id: str, name: str = "Program") -> dict:
    return {
        "progId": program_id, "name": name, "url": f"/{program_id.lower()}",
        "editMode": "N", "isDialog": "N", "dialogW": 0, "dialogH": 0,
        "progSystem": "CORE", "itemType": "ITEM", "icon": "SYSTEM",
        "fontIconClassId": "globe2", "editModeVar": False,
    }


def test_program_crud_query_and_response_aliases() -> None:
    client, db = client_and_db()
    invalid = client.post("/api/PROG001D0002/save", json={"progId": "bad-id"}).json()
    assert invalid["checkFields"]["progId"] == "Only 0-9, a-z and A-Z are allowed!"
    assert "fontIconClassId" in invalid["checkFields"]
    created = client.post("/api/PROG001D0002/save", json=payload("PROG1")).json()
    assert created["success"] == "Y"
    assert created["value"]["fontIconClassId"] == "globe2"
    oid = created["value"]["oid"]
    loaded = client.post("/api/PROG001D0002/load", json={"oid": oid}).json()
    assert loaded["value"]["progSystem"] == "CORE"
    changed = payload("PROG1", "Changed Program") | {"oid": oid}
    assert client.post("/api/PROG001D0002/update", json=changed).json()["success"] == "Y"
    found = client.post("/api/PROG001D0002/findPage", json={
        "field": {"nameLike": "Changed"}, "pageOf": {"select": "1", "showRow": "10"}}).json()
    assert found["pageOf"]["countSize"] == "1"
    assert found["value"][0]["progId"] == "PROG1"
    db.close()


def test_delete_matches_java_menu_guard_and_menu_role_cleanup() -> None:
    client, db = client_and_db()
    now = datetime(2026, 1, 1)
    first = client.post("/api/PROG001D0002/save", json=payload("USED")).json()["value"]
    db.add(TbSysMenu(oid="m1", prog_id="USED", parent_oid="root",
                     cuserid="admin", cdate=now))
    db.commit()
    rejected = client.post("/api/PROG001D0002/delete", json={"oid": first["oid"]}).json()
    assert rejected["message"] == "Data to be used, and can not be deleted!"
    second = client.post("/api/PROG001D0002/save", json=payload("FREE")).json()["value"]
    db.add(TbSysMenuRole(oid="mr1", prog_id="FREE", role="staff",
                         cuserid="admin", cdate=now))
    db.commit()
    deleted = client.post("/api/PROG001D0002/delete", json={"oid": second["oid"]}).json()
    assert deleted["success"] == "Y"
    assert db.get(TbSysProg, second["oid"]) is None
    assert db.scalar(select(TbSysMenuRole).where(TbSysMenuRole.prog_id == "FREE")) is None
    db.close()
