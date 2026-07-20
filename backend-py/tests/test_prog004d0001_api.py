from datetime import datetime
from fastapi.testclient import TestClient
from sqlalchemy import create_engine
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.system.models import TbSysEventLog
from app.main import create_app
from app.security.dependencies import get_request_user


def setup():
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[TbSysEventLog.__table__])
    db = Session(engine)
    db.add_all([
        TbSysEventLog(oid="old", user="alice", sys_id="CORE", execute_event="old",
                      is_permit="Y", cuserid="alice", cdate=datetime(2026, 1, 1, 1, 2, 3)),
        TbSysEventLog(oid="new", user="alice", sys_id="AUX", execute_event="new",
                      is_permit="N", cuserid="alice", cdate=datetime(2026, 1, 2, 4, 5, 6)),
        TbSysEventLog(oid="bob", user="bob", sys_id="CORE", execute_event="other",
                      is_permit="Y", cuserid="bob", cdate=datetime(2026, 1, 3)),
    ])
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def test_event_log_query_uses_only_user_and_descending_date() -> None:
    client, db = setup()
    result = client.post("/api/PROG004D0001/findPage", json={
        "field": {"user": "alice", "sysId": "CORE"},
        "pageOf": {"select": "1", "showRow": "10"}}).json()
    assert [row["oid"] for row in result["value"]] == ["new", "old"]
    assert result["value"][0]["cdateString"] == "2026-01-02 04:05:06"
    assert result["pageOf"]["countSize"] == "2"
    db.close()


def test_event_log_delete_one_and_all() -> None:
    client, db = setup()
    assert client.post("/api/PROG004D0001/delete", json={"oid": "old"}).json()["success"] == "Y"
    result = client.post("/api/PROG004D0001/deleteAll").json()
    assert result["success"] == "Y"
    assert result["value"] is True
    assert db.query(TbSysEventLog).count() == 0
    db.close()
