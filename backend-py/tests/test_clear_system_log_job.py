from datetime import datetime, timedelta

from sqlalchemy import create_engine
from sqlalchemy.schema import CreateTable
from sqlalchemy.orm import Session
from sqlalchemy.pool import StaticPool

from app.domain.system.models import TbSysEventLog, TbSysLoginLog
from app.jobs.clear_system_log import clear_system_logs


def test_clear_system_logs_deletes_both_log_types_at_inclusive_fourteen_day_cutoff() -> None:
    engine = create_engine("sqlite+pysqlite:///:memory:", poolclass=StaticPool)
    with engine.begin() as connection:
        connection.execute(CreateTable(TbSysEventLog.__table__))
        connection.execute(CreateTable(TbSysLoginLog.__table__))
    db = Session(engine)
    now = datetime(2026, 7, 18, 4, 0, 1)
    cutoff = now - timedelta(days=14)
    db.add_all([
        TbSysEventLog(oid="event-old", user="sys", sys_id="CORE", execute_event="old",
                      is_permit="Y", cuserid="sys", cdate=cutoff),
        TbSysEventLog(oid="event-new", user="sys", sys_id="CORE", execute_event="new",
                      is_permit="Y", cuserid="sys", cdate=cutoff + timedelta(microseconds=1)),
        TbSysLoginLog(oid="login-old", user="sys", fail_flag="N",
                      cuserid="sys", cdate=cutoff - timedelta(days=1)),
        TbSysLoginLog(oid="login-new", user="sys", fail_flag="N",
                      cuserid="sys", cdate=cutoff + timedelta(seconds=1)),
    ])
    db.commit()

    result = clear_system_logs(db, now=now)

    assert result.cutoff == cutoff
    assert result.event_logs_deleted == 1
    assert result.login_logs_deleted == 1
    assert {row.oid for row in db.query(TbSysEventLog)} == {"event-new"}
    assert {row.oid for row in db.query(TbSysLoginLog)} == {"login-new"}
    db.close()
