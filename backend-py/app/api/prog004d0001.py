from datetime import datetime
from typing import Any
from fastapi import APIRouter, Depends
from pydantic import BaseModel, ConfigDict, Field, computed_field
from sqlalchemy.orm import Session
from app.common.pagination import PageOf, QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.system.repository import SysEventLogRepository
from app.security.dependencies import require_controller_authority

router = APIRouter(prefix="/api/PROG004D0001", tags=["CORE_PROG004D0001"])


class EventLogPayload(BaseModel):
    oid: str = ""


class EventLogView(BaseModel):
    oid: str
    user: str
    sys_id: str = Field(alias="sysId")
    execute_event: str = Field(alias="executeEvent")
    is_permit: str = Field(alias="isPermit")
    cuserid: str
    cdate: datetime
    uuserid: str | None = None
    udate: datetime | None = None
    model_config = ConfigDict(populate_by_name=True, from_attributes=True)

    @computed_field(alias="cdateString")
    @property
    def cdate_string(self) -> str:
        return self.cdate.strftime("%Y-%m-%d %H:%M:%S")


class EventLogSearch(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")
    model_config = ConfigDict(populate_by_name=True)


@router.post("/findPage", response_model=QueryResult[list[EventLogView]],
             response_model_by_alias=True)
def find_page(body: EventLogSearch,
              _=Depends(require_controller_authority("CORE_PROG004D0001Q")),
              db: Session = Depends(get_db_session)):
    page = body.page_of
    rows, count = SysEventLogRepository(db).find_page(
        str(body.field.get("user") or ""), page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete_one(value: EventLogPayload,
               _=Depends(require_controller_authority("CORE_PROG004D0001D")),
               db: Session = Depends(get_db_session)):
    if not value.oid:
        return DefaultControllerJsonResultObj(isAuth="Y", message="parameter cann't blank!")
    deleted = SysEventLogRepository(db).delete_by_oid(value.oid)
    db.commit()
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y" if deleted else "N",
        message="delete data success!" if deleted else "delete data fail!", value=deleted)


@router.post("/deleteAll", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete_all(_=Depends(require_controller_authority("CORE_PROG004D0001D")),
               db: Session = Depends(get_db_session)):
    value = SysEventLogRepository(db).delete_all()
    db.commit()
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y", message="delete data success!", value=value)
