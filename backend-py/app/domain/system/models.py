from datetime import datetime

from sqlalchemy import DateTime, Index, String
from sqlalchemy.orm import Mapped, mapped_column

from app.db.base import Base


class TbSysCode(Base):
    __tablename__ = "tb_sys_code"

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    code: Mapped[str] = mapped_column("CODE", String(25), nullable=False, unique=True)
    type: Mapped[str] = mapped_column("TYPE", String(10), nullable=False)
    name: Mapped[str] = mapped_column("NAME", String(100), nullable=False)
    param1: Mapped[str | None] = mapped_column("PARAM1", String(100))
    param2: Mapped[str | None] = mapped_column("PARAM2", String(100))
    param3: Mapped[str | None] = mapped_column("PARAM3", String(100))
    param4: Mapped[str | None] = mapped_column("PARAM4", String(100))
    param5: Mapped[str | None] = mapped_column("PARAM5", String(100))
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysLoginLog(Base):
    __tablename__ = "tb_sys_login_log"
    __table_args__ = (
        Index("IDX_1", "USER"),
        Index("IDX_2", "CDATE"),
    )

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    user: Mapped[str] = mapped_column("USER", String(24), nullable=False)
    fail_flag: Mapped[str] = mapped_column("FAIL_FLAG", String(1), nullable=False, default="N", server_default="N")
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysToken(Base):
    __tablename__ = "tb_sys_token"
    __table_args__ = (
        Index("IDX_1", "USER_ID"),
        Index("IDX_2", "TOKEN", mysql_length=1024),
    )

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    user_id: Mapped[str] = mapped_column("USER_ID", String(24), nullable=False)
    token: Mapped[str] = mapped_column("TOKEN", String(2048), nullable=False)
    expires_date: Mapped[datetime] = mapped_column("EXPIRES_DATE", DateTime, nullable=False)
    rf_expires_date: Mapped[datetime] = mapped_column("RF_EXPIRES_DATE", DateTime, nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)


class TbSysEventLog(Base):
    __tablename__ = "tb_sys_event_log"
    __table_args__ = (Index("IDX_1", "USER"), Index("IDX_2", "CDATE"))

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    user: Mapped[str] = mapped_column("USER", String(24), nullable=False)
    sys_id: Mapped[str] = mapped_column("SYS_ID", String(10), nullable=False)
    execute_event: Mapped[str] = mapped_column("EXECUTE_EVENT", String(255), nullable=False)
    is_permit: Mapped[str] = mapped_column("IS_PERMIT", String(1), nullable=False, default="N", server_default="N")
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)
