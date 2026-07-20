from datetime import datetime
from fastapi.testclient import TestClient
from sqlalchemy import create_engine
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.base import Base
from app.db.session import get_db_session
from app.domain.report.models import TbSysJreport, TbSysJreportParam
from app.main import create_app
from app.security.dependencies import get_request_user


def client_and_db() -> tuple[TestClient, Session]:
    engine = create_engine("sqlite+pysqlite:///:memory:", connect_args={"check_same_thread": False},
                           poolclass=StaticPool)
    Base.metadata.create_all(engine, tables=[TbSysJreport.__table__, TbSysJreportParam.__table__])
    db = Session(engine)
    db.add(TbSysJreport(oid="report1", report_id="RPT1", file="RPT1.jasper",
                        is_compile="N", content=b"compiled", description="Report",
                        cuserid="admin", cdate=datetime(2026, 1, 1)))
    db.commit()
    settings = Settings(jwt_secret_key="test-secret")
    app = create_app(settings)
    app.dependency_overrides[get_db_session] = lambda: db
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app), db


def test_report_read_routes_omit_blob_and_writes_fail_closed() -> None:
    client, db = client_and_db()
    found = client.post("/api/PROG001D0005/findPage", json={
        "field": {"reportId": "RPT1"}, "pageOf": {"select": "1", "showRow": "10"}}).json()
    assert found["value"][0]["reportId"] == "RPT1"
    assert "content" not in found["value"][0]
    assert client.post("/api/PROG001D0005/load", json={"oid": "report1"}).json()["success"] == "Y"
    rejected = client.post("/api/PROG001D0005/save", json={
        "reportId": "NEW", "file": "NEW.jasper", "uploadBase64": "eA=="}).json()
    assert rejected["success"] == "N"
    assert "not enabled" in rejected["message"]
    assert db.query(TbSysJreport).count() == 1
    db.close()


def test_report_param_crud_and_main_cascade_delete() -> None:
    client, db = client_and_db()
    saved = client.post("/api/PROG001D0005/saveSetParam", json={
        "reportId": "RPT1", "urlParam": "account", "rptParam": "ACCOUNT"}).json()
    assert saved["success"] == "Y"
    listed = client.post("/api/PROG001D0005/findSetParamPage", json={
        "field": {"reportId": "RPT1"},
        "pageOf": {"select": "1", "showRow": "100"}}).json()
    assert listed["value"][0]["rptParam"] == "ACCOUNT"
    assert client.post("/api/PROG001D0005/delete", json={"oid": "report1"}).json()["success"] == "Y"
    assert db.query(TbSysJreportParam).count() == 0
    db.close()
