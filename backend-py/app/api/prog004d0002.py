from datetime import datetime
from hashlib import sha256
from typing import Any
from fastapi import APIRouter, Depends
from pydantic import BaseModel, ConfigDict, Field, computed_field
from sqlalchemy import select
from sqlalchemy.orm import Session
from app.common.pagination import PageOf, QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.system.models import TbSysToken
from app.domain.system.repository import SysTokenRepository
from app.security.dependencies import require_controller_authority

router = APIRouter(prefix="/api/PROG004D0002", tags=["CORE_PROG004D0002"])


def handle(value: str) -> str:
    return sha256(value.encode("utf-8")).hexdigest()


class TokenPayload(BaseModel):
    oid: str = ""


class TokenView(BaseModel):
    refresh_value: str = Field(exclude=True)
    user_id: str = Field(alias="userId")
    access_value: str = Field(exclude=True)
    expires_date: datetime = Field(alias="expiresDate")
    rf_expires_date: datetime = Field(alias="rfExpiresDate")
    cdate: datetime
    model_config = ConfigDict(populate_by_name=True)

    @computed_field
    @property
    def oid(self) -> str:
        return handle(self.refresh_value)

    @computed_field(alias="tokenShort")
    @property
    def token_short(self) -> str:
        value = self.access_value
        return f"{value[:20]}...{value[-5:]}" if len(value) >= 30 else value

    @computed_field(alias="expiresDateString")
    @property
    def expires_date_string(self) -> str:
        return self.expires_date.strftime("%Y-%m-%d %H:%M:%S")

    @computed_field(alias="rfExpiresDateString")
    @property
    def rf_expires_date_string(self) -> str:
        return self.rf_expires_date.strftime("%Y-%m-%d %H:%M:%S")

    @computed_field(alias="cdateString")
    @property
    def cdate_string(self) -> str:
        return self.cdate.strftime("%Y-%m-%d %H:%M:%S")


class TokenSearch(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")
    model_config = ConfigDict(populate_by_name=True)


def view(row: TbSysToken) -> TokenView:
    return TokenView(refresh_value=row.oid, userId=row.user_id, access_value=row.token,
                     expiresDate=row.expires_date, rfExpiresDate=row.rf_expires_date,
                     cdate=row.cdate)


@router.post("/findPage", response_model=QueryResult[list[TokenView]], response_model_by_alias=True)
def find_page(body: TokenSearch,
              _=Depends(require_controller_authority("CORE_PROG004D0002Q")),
              db: Session = Depends(get_db_session)):
    page = body.page_of
    rows, count = SysTokenRepository(db).find_page(
        str(body.field.get("userId") or ""), page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=[view(row) for row in rows], pageOf=page)


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete_token(value: TokenPayload,
                 _=Depends(require_controller_authority("CORE_PROG004D0002D")),
                 db: Session = Depends(get_db_session)):
    if not value.oid:
        return DefaultControllerJsonResultObj(isAuth="Y", message="parameter cann't blank!")
    row = next((row for row in db.scalars(select(TbSysToken)).all()
                if handle(row.oid) == value.oid), None)
    if row is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="delete data fail!", value=False)
    db.delete(row)
    db.commit()
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y", message="delete data success!", value=True)
