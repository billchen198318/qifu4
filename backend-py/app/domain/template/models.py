from datetime import datetime

from sqlalchemy import DateTime, String, UniqueConstraint
from sqlalchemy.orm import Mapped, mapped_column

from app.db.base import Base


class TbSysTemplate(Base):
    __tablename__ = "tb_sys_template"
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    template_id: Mapped[str] = mapped_column("TEMPLATE_ID", String(10), nullable=False, unique=True)
    title: Mapped[str] = mapped_column("TITLE", String(200), nullable=False)
    message: Mapped[str] = mapped_column("MESSAGE", String(4000), nullable=False)
    description: Mapped[str] = mapped_column("DESCRIPTION", String(200), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysTemplateParam(Base):
    __tablename__ = "tb_sys_template_param"
    __table_args__ = (UniqueConstraint(
        "TEMPLATE_ID", "TEMPLATE_VAR", "IS_TITLE", name="UK_1"),)
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    template_id: Mapped[str] = mapped_column("TEMPLATE_ID", String(10), nullable=False)
    is_title: Mapped[str] = mapped_column(
        "IS_TITLE", String(1), nullable=False, default="N", server_default="N")
    template_var: Mapped[str] = mapped_column("TEMPLATE_VAR", String(100), nullable=False)
    object_var: Mapped[str] = mapped_column("OBJECT_VAR", String(100), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)
