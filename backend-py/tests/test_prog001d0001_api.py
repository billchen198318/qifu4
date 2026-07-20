from datetime import datetime

from fastapi.testclient import TestClient
from sqlalchemy import create_engine
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool

from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.navigation.models import TbSys, TbSysProg
from app.main import create_app
from app.security.dependencies import get_request_user


def client_and_db() -> tuple[TestClient, Session]:
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[TbSys.__table__, TbSysProg.__table__])
    db = Session(engine)
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def payload(system_id: str, name: str = "Core") -> dict[str, str]:
    return {"sysId": system_id, "name": name, "host": "localhost",
            "contextPath": "/core", "isLocal": "Y", "icon": "SYSTEM"}


def test_application_system_crud_and_java_response_shapes() -> None:
    client, db = client_and_db()
    assert client.post("/api/PROG001D0001/save", json={"sysId": "bad-id"}).json()["checkFields"] == {
        "sysId": "Only 0-9, a-z and A-Z are allowed!", "name": "Please input name!",
        "host": "Please input host!", "contextPath": "Please input context path!"}

    created = client.post("/api/PROG001D0001/save", json=payload("CORE")).json()
    assert created["success"] == "Y"
    assert created["message"] == "insert data success!"
    oid = created["value"]["oid"]

    loaded = client.post("/api/PROG001D0001/load", json={"oid": oid}).json()
    assert loaded["value"]["contextPath"] == "/core"
    updated_payload = payload("CORE", "Core Updated") | {"oid": oid}
    assert client.post("/api/PROG001D0001/update", json=updated_payload).json()["success"] == "Y"

    client.post("/api/PROG001D0001/save", json=payload("AUX", "Auxiliary"))
    found = client.post("/api/PROG001D0001/findPage", json={
        "field": {"nameLike": "Updated"}, "pageOf": {"select": "1", "showRow": "10"}}).json()
    assert found["success"] == "Y"
    assert found["pageOf"]["countSize"] == "1"
    assert [row["sysId"] for row in found["value"]] == ["CORE"]

    deleted = client.post("/api/PROG001D0001/delete", json={"oid": oid}).json()
    assert deleted == {"value": True, "success": "Y", "message": "delete data success!",
                       "login": "N", "isAuth": "Y", "checkFields": {}}
    db.close()


def test_delete_rejects_system_referenced_by_program() -> None:
    client, db = client_and_db()
    created = client.post("/api/PROG001D0001/save", json=payload("CORE")).json()["value"]
    db.add(TbSysProg(oid="p1", prog_id="P1", name="Program", url="/p1", prog_system="CORE",
                     item_type="ITEM", icon="x", cuserid="admin", cdate=datetime(2026, 1, 1)))
    db.commit()
    result = client.post("/api/PROG001D0001/delete", json={"oid": created["oid"]}).json()
    assert result["success"] == "N"
    assert result["message"] == "Data to be used, and can not be deleted!"
    assert db.get(TbSys, created["oid"]) is not None
    db.close()
