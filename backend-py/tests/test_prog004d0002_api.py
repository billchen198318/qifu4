from datetime import datetime
from fastapi.testclient import TestClient
from sqlalchemy import create_engine
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.system.models import TbSysToken
from app.main import create_app
from app.security.dependencies import get_request_user


def setup():
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[TbSysToken.__table__])
    db = Session(engine)
    db.add_all([
        TbSysToken(oid="refresh-secret-one", user_id="alice",
                   token="abcdefghijklmnopqrstuvwxyz1234567890", expires_date=datetime(2026, 2, 1),
                   rf_expires_date=datetime(2026, 3, 1), cdate=datetime(2026, 1, 2)),
        TbSysToken(oid="refresh-secret-two", user_id="bob", token="short",
                   expires_date=datetime(2026, 2, 1), rf_expires_date=datetime(2026, 3, 1),
                   cdate=datetime(2026, 1, 1)),
    ])
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def test_token_query_masks_access_and_refresh_tokens() -> None:
    client, db = setup()
    result = client.post("/api/PROG004D0002/findPage", json={
        "field": {"userId": "alice"}, "pageOf": {"select": "1", "showRow": "10"}}).json()
    row = result["value"][0]
    assert row["tokenShort"] == "abcdefghijklmnopqrst...67890"
    assert "token" not in row
    assert "refresh-secret" not in row["oid"]
    assert len(row["oid"]) == 64
    assert row["expiresDateString"] == "2026-02-01 00:00:00"
    db.close()


def test_token_delete_accepts_only_opaque_handle() -> None:
    client, db = setup()
    row = client.post("/api/PROG004D0002/findPage", json={
        "field": {"userId": "alice"}, "pageOf": {"select": "1", "showRow": "10"}}).json()["value"][0]
    assert client.post("/api/PROG004D0002/delete", json={"oid": row["oid"]}).json()["success"] == "Y"
    assert db.get(TbSysToken, "refresh-secret-one") is None
    db.close()
