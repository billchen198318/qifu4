from datetime import datetime

from sqlalchemy import DateTime, String
from sqlalchemy.orm import Mapped, mapped_column

from app.db.base import Base


class TbAccount(Base):
    __tablename__ = "tb_account"

    oid: Mapped[str] = mapped_column("OID", String(36), primary_key=True)
    account: Mapped[str] = mapped_column("ACCOUNT", String(24), nullable=False, unique=True)
    password: Mapped[str] = mapped_column("PASSWORD", String(255), nullable=False)
    on_job: Mapped[str] = mapped_column("ON_JOB", String(50), nullable=False, default="Y", server_default="Y")
    cuserid: Mapped[str | None] = mapped_column("CUSERID", String(24))
    cdate: Mapped[datetime | None] = mapped_column("CDATE", DateTime)
    uuserid: Mapped[str | None] = mapped_column("UUSERID", String(24))
    udate: Mapped[datetime | None] = mapped_column("UDATE", DateTime)
