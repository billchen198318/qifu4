from datetime import datetime, time, timedelta

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
    today = datetime.now().date()

    def token(oid: str, user: str, day_offset: int, hour: int = 12) -> TbSysToken:
        created = datetime.combine(today + timedelta(days=day_offset), time(hour))
        return TbSysToken(oid=oid, user_id=user, token=f"token-{oid}",
                          expires_date=created + timedelta(days=1),
                          rf_expires_date=created + timedelta(days=2), cdate=created)

    db.add_all([
        token("a1", "alice", 0),
        token("a2", "alice", -1),
        token("b1", "bob", -1),
        token("old", "old-user", -7),
    ])
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db, today


def test_find_board_demo_returns_top_users_for_rolling_six_days() -> None:
    client, db, _ = setup()
    result = client.post("/api/DashboardDemo/findBoardDemo").json()
    assert result["success"] == "Y"
    assert result["pageOf"] is None
    assert result["value"] == [
        {"userId": "alice", "countSize": 2, "date": ""},
        {"userId": "bob", "countSize": 1, "date": ""},
    ]
    db.close()


def test_find_size_returns_seven_calendar_days_oldest_first() -> None:
    client, db, today = setup()
    result = client.post("/api/DashboardDemo/findSize").json()
    assert result["success"] == "Y"
    assert result["pageOf"] is None
    assert [row["date"] for row in result["value"]] == [
        (today - timedelta(days=days)).isoformat() for days in range(6, -1, -1)
    ]
    assert [row["countSize"] for row in result["value"]] == [0, 0, 0, 0, 0, 2, 1]
    assert all(row["userId"] == "" for row in result["value"])
    db.close()
