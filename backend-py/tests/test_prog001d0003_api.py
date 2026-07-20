from datetime import datetime

from fastapi.testclient import TestClient
from sqlalchemy import create_engine, select
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool

from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.navigation.models import TbSysMenu, TbSysProg
from app.main import create_app
from app.security.dependencies import get_request_user

ROOT_OID = "00000000-0000-0000-0000-000000000000"


def client_and_db() -> tuple[TestClient, Session]:
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[TbSysProg.__table__, TbSysMenu.__table__])
    db, now = Session(engine), datetime(2026, 1, 1)
    common = {"prog_system": "CORE", "icon": "SYSTEM", "cuserid": "admin", "cdate": now}
    db.add_all([
        TbSysProg(oid="folder", prog_id="FOLDER1", name="Folder", url="/",
                  item_type="FOLDER", font_icon_class_id="folder", **common),
        TbSysProg(oid="item1", prog_id="ITEM1", name="Item 1", url="/one",
                  item_type="ITEM", font_icon_class_id="one", **common),
        TbSysProg(oid="item2", prog_id="ITEM2", name="Item 2", url="/two",
                  item_type="ITEM", font_icon_class_id="two", **common),
        TbSysProg(oid="about", prog_id="CORE_PROG999D9999Q", name="About", url="/about",
                  item_type="ITEM", font_icon_class_id="info", **common),
    ])
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def test_load_folder_and_update_menu_round_trip() -> None:
    client, db = client_and_db()
    folders = client.post("/api/PROG001D0003/loadProgramFolder").json()
    assert [row["progId"] for row in folders["value"]] == ["FOLDER1"]
    initial = client.post("/api/PROG001D0003/loadProgramEnableAndAllList/folder").json()
    assert initial["value"]["enable"] == []
    assert [row["progId"] for row in initial["value"]["all"]] == [
        "CORE_PROG999D9999Q", "FOLDER1", "ITEM1", "ITEM2"]
    updated = client.post("/api/PROG001D0003/updateMenu/folder/item1,item2,").json()
    assert updated["success"] == "Y"
    loaded = client.post("/api/PROG001D0003/loadProgramEnableAndAllList/folder").json()
    assert [row["progId"] for row in loaded["value"]["enable"]] == ["ITEM1", "ITEM2"]
    root = db.scalar(select(TbSysMenu).where(TbSysMenu.parent_oid == ROOT_OID))
    assert root is not None
    assert client.post("/api/PROG001D0003/updateMenu/folder/,").json()["success"] == "Y"
    assert db.scalars(select(TbSysMenu).where(TbSysMenu.parent_oid == root.oid)).all() == []
    db.close()


def test_about_program_is_rejected_without_destroying_existing_menu() -> None:
    client, db = client_and_db()
    assert client.post("/api/PROG001D0003/updateMenu/folder/item1,").json()["success"] == "Y"
    rejected = client.post("/api/PROG001D0003/updateMenu/folder/about,").json()
    assert rejected["success"] == "N"
    assert rejected["message"] == "The program - CORE_PROG999D9999Q cannot settings."
    enabled = client.post("/api/PROG001D0003/loadProgramEnableAndAllList/folder").json()
    assert [row["progId"] for row in enabled["value"]["enable"]] == ["ITEM1"]
    db.close()
