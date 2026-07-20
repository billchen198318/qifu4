from datetime import datetime

from datetime import timezone
from uuid import uuid4

from sqlalchemy import delete, func, select
from sqlalchemy.orm import Session

from app.db.repository import Repository
from app.domain.system.models import TbSysCode, TbSysEventLog, TbSysLoginLog, TbSysToken


class SysCodeRepository(Repository[TbSysCode]):
    model = TbSysCode

    def find_by_code(self, code: str) -> TbSysCode | None:
        return self.db.execute(select(TbSysCode).where(TbSysCode.code == code)).scalar_one_or_none()

    def find(self, code: str = "", code_type: str = "") -> list[TbSysCode]:
        statement = select(TbSysCode)
        if code:
            statement = statement.where(TbSysCode.code == code)
        if code_type:
            statement = statement.where(TbSysCode.type == code_type)
        return list(self.db.scalars(statement.order_by(TbSysCode.code)).all())


class SysLoginLogRepository(Repository[TbSysLoginLog]):
    model = TbSysLoginLog

    def delete_created_on_or_before(self, cutoff: datetime) -> int:
        result = self.db.execute(delete(TbSysLoginLog).where(TbSysLoginLog.cdate <= cutoff))
        return result.rowcount or 0

    def count_recent_failures(self, user: str, since: datetime) -> int:
        statement = select(func.count()).select_from(TbSysLoginLog).where(
            TbSysLoginLog.user == user,
            TbSysLoginLog.fail_flag == "Y",
            TbSysLoginLog.cdate >= since,
        )
        return int(self.db.scalar(statement) or 0)

    def add_failure(self, user: str, now: datetime) -> TbSysLoginLog:
        log = TbSysLoginLog(oid=str(uuid4()), user=user, fail_flag="Y", cuserid=user, cdate=now)
        self.db.add(log)
        return log


class SysTokenRepository(Repository[TbSysToken]):
    model = TbSysToken

    def __init__(self, db: Session) -> None:
        super().__init__(db)

    def find_by_token(self, token: str) -> TbSysToken | None:
        statement = select(TbSysToken).where(TbSysToken.token == token)
        return self.db.execute(statement).scalar_one_or_none()

    def find_active_by_refresh(self, refresh_token: str, now: datetime) -> TbSysToken | None:
        return self.db.execute(
            select(TbSysToken).where(TbSysToken.oid == refresh_token, TbSysToken.rf_expires_date > now)
        ).scalar_one_or_none()

    def is_access_active(self, token: str, now: datetime) -> bool:
        statement = select(func.count()).select_from(TbSysToken).where(
            TbSysToken.token == token,
            TbSysToken.expires_date > now,
        )
        return bool(self.db.scalar(statement))

    def delete_expired(self, now: datetime) -> int:
        statement = delete(TbSysToken).where(TbSysToken.rf_expires_date < now)
        result = self.db.execute(statement)
        return result.rowcount or 0

    def find_page(self, user_id: str, offset: int, limit: int) -> tuple[list[TbSysToken], int]:
        conditions = [] if not user_id else [TbSysToken.user_id == user_id]
        count = int(self.db.scalar(select(func.count()).select_from(
            TbSysToken).where(*conditions)) or 0)
        rows = list(self.db.scalars(select(TbSysToken).where(*conditions).order_by(
            TbSysToken.cdate.desc()).offset(offset).limit(limit)).all())
        return rows, count

    def top_users_between(self, start: datetime, end: datetime) -> list[tuple[str, int]]:
        statement = select(TbSysToken.user_id, func.count().label("count_size")).where(
            TbSysToken.cdate >= start, TbSysToken.cdate <= end).group_by(
            TbSysToken.user_id).order_by(func.count().desc()).limit(7)
        return [(row.user_id, int(row.count_size)) for row in self.db.execute(statement)]

    def count_created_between(self, start: datetime, end: datetime) -> int:
        return int(self.db.scalar(select(func.count()).select_from(TbSysToken).where(
            TbSysToken.cdate >= start, TbSysToken.cdate <= end)) or 0)


class SysEventLogRepository(Repository[TbSysEventLog]):
    model = TbSysEventLog

    def delete_created_on_or_before(self, cutoff: datetime) -> int:
        result = self.db.execute(delete(TbSysEventLog).where(TbSysEventLog.cdate <= cutoff))
        return result.rowcount or 0

    def find_page(self, user: str, offset: int, limit: int) -> tuple[list[TbSysEventLog], int]:
        conditions = [] if not user else [TbSysEventLog.user == user]
        count = int(self.db.scalar(select(func.count()).select_from(
            TbSysEventLog).where(*conditions)) or 0)
        rows = list(self.db.scalars(select(TbSysEventLog).where(*conditions).order_by(
            TbSysEventLog.cdate.desc()).offset(offset).limit(limit)).all())
        return rows, count

    def delete_all(self) -> bool:
        self.db.execute(delete(TbSysEventLog))
        return True

    def record(self, user_id: str, system_id: str, event_id: str, permit: bool,
               now: datetime | None = None) -> TbSysEventLog | None:
        if not user_id.strip() or not system_id.strip() or not event_id.strip():
            return None
        log = TbSysEventLog(
            oid=str(uuid4()), user=user_id, sys_id=system_id,
            execute_event=event_id[:255], is_permit="Y" if permit else "N",
            cuserid=user_id, cdate=now or datetime.now(timezone.utc).replace(tzinfo=None),
        )
        self.db.add(log)
        return log
