from datetime import datetime

from sqlalchemy import DateTime, Index, Integer, String, UniqueConstraint
from sqlalchemy.orm import Mapped, mapped_column

from app.db.base import Base


class TbSys(Base):
    __tablename__ = "tb_sys"
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    sys_id: Mapped[str] = mapped_column("SYS_ID", String(10), nullable=False, unique=True)
    name: Mapped[str] = mapped_column("NAME", String(100), nullable=False)
    host: Mapped[str] = mapped_column("HOST", String(200), nullable=False)
    context_path: Mapped[str] = mapped_column("CONTEXT_PATH", String(100), nullable=False)
    is_local: Mapped[str] = mapped_column("IS_LOCAL", String(1), nullable=False, default="Y", server_default="Y")
    icon: Mapped[str] = mapped_column("ICON", String(20), nullable=False, default=" ", server_default=" ")
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysProg(Base):
    __tablename__ = "tb_sys_prog"
    __table_args__ = (Index("IDX_1", "PROG_SYSTEM"),)
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    prog_id: Mapped[str] = mapped_column("PROG_ID", String(50), nullable=False, unique=True)
    name: Mapped[str] = mapped_column("NAME", String(100), nullable=False)
    url: Mapped[str] = mapped_column("URL", String(255), nullable=False)
    edit_mode: Mapped[str] = mapped_column("EDIT_MODE", String(1), nullable=False, default="N", server_default="N")
    is_dialog: Mapped[str] = mapped_column("IS_DIALOG", String(1), nullable=False, default="N", server_default="N")
    dialog_w: Mapped[int] = mapped_column("DIALOG_W", Integer, nullable=False, default=0, server_default="0")
    dialog_h: Mapped[int] = mapped_column("DIALOG_H", Integer, nullable=False, default=0, server_default="0")
    prog_system: Mapped[str] = mapped_column("PROG_SYSTEM", String(10), nullable=False)
    item_type: Mapped[str] = mapped_column("ITEM_TYPE", String(10), nullable=False)
    icon: Mapped[str] = mapped_column("ICON", String(20), nullable=False)
    font_icon_class_id: Mapped[str] = mapped_column("FONT_ICON_CLASS_ID", String(100), nullable=False, default="circle-o", server_default="circle-o")
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysMenu(Base):
    __tablename__ = "tb_sys_menu"
    __table_args__ = (UniqueConstraint("PROG_ID", "PARENT_OID", name="UK_1"),)
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    prog_id: Mapped[str] = mapped_column("PROG_ID", String(50), nullable=False)
    parent_oid: Mapped[str] = mapped_column("PARENT_OID", String(36), nullable=False)
    enable_flag: Mapped[str] = mapped_column("ENABLE_FLAG", String(1), nullable=False, default="Y", server_default="Y")
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbSysMenuRole(Base):
    __tablename__ = "tb_sys_menu_role"
    __table_args__ = (UniqueConstraint("PROG_ID", "ROLE", name="UK_1"),)
    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    prog_id: Mapped[str] = mapped_column("PROG_ID", String(50), nullable=False)
    role: Mapped[str] = mapped_column("ROLE", String(50), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)
