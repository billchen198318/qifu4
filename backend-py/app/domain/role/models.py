from datetime import datetime

from sqlalchemy import DateTime, String, UniqueConstraint
from sqlalchemy.orm import Mapped, mapped_column

from app.db.base import Base


class TbRole(Base):
    __tablename__ = "tb_role"

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    role: Mapped[str] = mapped_column("ROLE", String(50), nullable=False, unique=True)
    description: Mapped[str] = mapped_column("DESCRIPTION", String(500), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(50))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)


class TbUserRole(Base):
    __tablename__ = "tb_user_role"
    __table_args__ = (UniqueConstraint("ROLE", "ACCOUNT", name="UK_1"),)

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    role: Mapped[str] = mapped_column("ROLE", String(50), nullable=False)
    account: Mapped[str] = mapped_column("ACCOUNT", String(24), nullable=False)
    description: Mapped[str] = mapped_column("DESCRIPTION", String(500), nullable=False)
    cuserid: Mapped[str] = mapped_column("CUSERID", String(24), nullable=False)
    cdate: Mapped[datetime] = mapped_column("CDATE", DateTime, nullable=False)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(50))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)
