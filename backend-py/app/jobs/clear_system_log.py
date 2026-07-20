from dataclasses import dataclass
from datetime import datetime, timedelta

from sqlalchemy.orm import Session

from app.domain.system.repository import SysEventLogRepository, SysLoginLogRepository


@dataclass(frozen=True)
class ClearSystemLogResult:
    cutoff: datetime
    event_logs_deleted: int
    login_logs_deleted: int


def clear_system_logs(db: Session, now: datetime | None = None) -> ClearSystemLogResult:
    """Match Java ClearSystemLogJob's inclusive, rolling fourteen-day cutoff."""
    cutoff = (now or datetime.now()).replace(tzinfo=None) - timedelta(days=14)
    try:
        event_count = SysEventLogRepository(db).delete_created_on_or_before(cutoff)
        login_count = SysLoginLogRepository(db).delete_created_on_or_before(cutoff)
        db.commit()
    except Exception:
        db.rollback()
        raise
    return ClearSystemLogResult(
        cutoff=cutoff, event_logs_deleted=event_count, login_logs_deleted=login_count)
