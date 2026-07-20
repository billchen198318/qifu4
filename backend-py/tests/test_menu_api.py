from datetime import datetime

from fastapi.testclient import TestClient
from sqlalchemy import create_engine
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool

from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.navigation.models import TbSysMenu, TbSysMenuRole, TbSysProg
from app.domain.navigation.service import NavigationService
from app.domain.permission.models import TbRolePermission
from app.domain.role.models import TbUserRole
from app.main import create_app
from app.security.dependencies import get_request_user

TABLES = [TbSysProg.__table__, TbSysMenu.__table__, TbSysMenuRole.__table__,
          TbUserRole.__table__, TbRolePermission.__table__]


def seeded_session() -> Session:
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=TABLES)
    db, now = Session(engine), datetime(2026, 1, 1)
    common = {"cuserid": "admin", "cdate": now}
    db.add_all([
        TbSysProg(oid="p1", prog_id="FOLDER", name="A Folder", url="/", prog_system="CORE",
                  item_type="FOLDER", icon="folder", font_icon_class_id="folder-icon", **common),
        TbSysProg(oid="p2", prog_id="ITEM_ALLOWED", name="B Allowed", url="#/allowed", prog_system="CORE",
                  item_type="ITEM", icon="item", font_icon_class_id="item-icon", **common),
        TbSysProg(oid="p3", prog_id="ITEM_HIDDEN", name="C Hidden", url="#/hidden", prog_system="CORE",
                  item_type="ITEM", icon="item", font_icon_class_id="hidden-icon", **common),
        TbSysMenu(oid="m1", prog_id="FOLDER", parent_oid="root", **common),
        TbSysMenu(oid="m2", prog_id="ITEM_ALLOWED", parent_oid="m1", **common),
        TbSysMenu(oid="m3", prog_id="ITEM_HIDDEN", parent_oid="m1", **common),
        TbUserRole(oid="ur1", role="staff", account="alice", description="mapping", **common),
        TbSysMenuRole(oid="mr1", prog_id="FOLDER", role="staff", **common),
        TbSysMenuRole(oid="mr2", prog_id="ITEM_ALLOWED", role="staff", **common),
        TbRolePermission(oid="rp1", role="staff", permission="ITEM_ALLOWED", perm_type="CONTROLLER",
                         description="allowed", **common),
    ])
    db.commit()
    return db


def test_navigation_service_matches_java_menu_tree_and_program_behavior() -> None:
    db = seeded_session()
    result = NavigationService(db, "CORE").get_menu_and_programs("alice", False)
    assert result.model_dump(by_alias=True)["menuList"] == [{
        "id": "FOLDER", "type": "FOLDER", "name": "A Folder", "icon": "folder-icon",
        "items": [{"id": "ITEM_ALLOWED", "type": "ITEM", "name": "B Allowed",
                   "icon": "item-icon", "url": "#/allowed"}],
    }]
    assert [item.prog_id for item in result.program_list] == ["ITEM_ALLOWED", "ITEM_HIDDEN"]
    db.close()


def test_menu_api_java_response_shape() -> None:
    db, settings = seeded_session(), Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="alice", roles=("staff",))
    response = TestClient(app).post("/api/menu/getMemuItemAndProgList")
    assert response.status_code == 200
    body = response.json()
    assert body["isAuth"] == "Y"
    assert body["success"] == "Y"
    assert body["value"]["menuList"][0]["items"][0]["id"] == "ITEM_ALLOWED"
    assert body["pageOf"] is None
    db.close()
