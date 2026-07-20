from fastapi.testclient import TestClient
from sqlalchemy import create_engine, select
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool

from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.template.models import TbSysTemplate, TbSysTemplateParam
from app.main import create_app
from app.security.dependencies import get_request_user


def client_and_db() -> tuple[TestClient, Session]:
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(
        engine, tables=[TbSysTemplate.__table__, TbSysTemplateParam.__table__])
    db = Session(engine)
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def template(template_id: str, message: str = "Hello") -> dict[str, str]:
    return {"templateId": template_id, "title": "Mail title",
            "message": message, "description": "Description"}


def test_template_crud_limits_and_immutable_id() -> None:
    client, db = client_and_db()
    too_long = client.post("/api/PROG001D0004/save",
                           json=template("LONG", "x" * 4001)).json()
    assert too_long["message"] == "Content max only 4000 words!"
    created = client.post("/api/PROG001D0004/save", json=template("TPL0001")).json()
    assert created["success"] == "Y"
    oid = created["value"]["oid"]
    changed = template("CHANGED") | {"oid": oid, "title": "Updated"}
    updated = client.post("/api/PROG001D0004/update", json=changed).json()
    assert updated["value"]["templateId"] == "TPL0001"
    found = client.post("/api/PROG001D0004/findPage", json={
        "field": {"titleLike": "Updated"}, "pageOf": {"select": "1", "showRow": "10"}}).json()
    assert found["pageOf"]["countSize"] == "1"
    assert client.post("/api/PROG001D0004/load", json={"oid": oid}).json()["success"] == "Y"
    db.close()


def test_param_direct_insert_and_template_cascade_delete() -> None:
    client, db = client_and_db()
    created = client.post("/api/PROG001D0004/save", json=template("TPL0002")).json()["value"]
    param = {"templateId": "TPL0002", "isTitle": "N",
             "templateVar": "userName", "objectVar": "user.name"}
    saved = client.post("/api/PROG001D0004/saveSetParam", json=param).json()
    assert saved["success"] == "Y"
    listed = client.post("/api/PROG001D0004/findSetParamPage", json={
        "field": {"templateId": "TPL0002"},
        "pageOf": {"select": "1", "showRow": "100"}}).json()
    assert listed["value"][0]["templateVar"] == "userName"
    deleted = client.post("/api/PROG001D0004/delete", json={"oid": created["oid"]}).json()
    assert deleted["success"] == "Y"
    assert db.scalar(select(TbSysTemplateParam)) is None

    orphan = client.post("/api/PROG001D0004/saveSetParam", json={
        "templateId": "MISSING", "isTitle": "Y",
        "templateVar": "subject", "objectVar": "mail.subject"}).json()
    assert orphan["success"] == "Y"
    assert client.post("/api/PROG001D0004/deleteSetParam",
                       json={"oid": orphan["value"]["oid"]}).json()["success"] == "Y"
    db.close()


def test_built_in_template_cannot_be_deleted() -> None:
    client, db = client_and_db()
    created = client.post("/api/PROG001D0004/save", json=template("TPLMSG0001")).json()["value"]
    result = client.post("/api/PROG001D0004/delete", json={"oid": created["oid"]}).json()
    assert result["success"] == "N"
    assert result["message"] == "Data to be used, and can not be deleted!"
    db.close()
