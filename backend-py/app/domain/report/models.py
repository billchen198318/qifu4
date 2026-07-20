from datetime import datetime

from sqlalchemy import DateTime, LargeBinary, String, UniqueConstraint
from sqlalchemy.orm import Mapped, mapped_column

from app.db.base import Base


class TbSysJreport(Base):
    __tablename__ = "tb_sys_jreport"
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    report_id: Mapped[str] = mapped_column("REPORT_ID", String(50), nullable=False, unique=True)
    file: Mapped[str] = mapped_column("FILE", String(100), nullable=False)
    is_compile: Mapped[str] = mapped_column("IS_COMPILE", String(50), nullable=False, default="N")
    content: Mapped[bytes] = mapped_column("CONTENT", LargeBinary, nullable=False)
    description: Mapped[str] = mapped_column("DESCRIPTION", String(500), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysJreportParam(Base):
    __tablename__ = "tb_sys_jreport_param"
    __table_args__ = (UniqueConstraint("REPORT_ID", "RPT_PARAM", name="UK_1"),)
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    report_id: Mapped[str] = mapped_column("REPORT_ID", String(50), nullable=False)
    url_param: Mapped[str] = mapped_column("URL_PARAM", String(100), nullable=False)
    rpt_param: Mapped[str] = mapped_column("RPT_PARAM", String(100), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)
