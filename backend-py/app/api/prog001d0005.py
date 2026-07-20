import re

from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from app.common.context import UserContext
from app.common.pagination import QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.db.service import CrudService
from app.db.session import get_db_session
from app.domain.report.models import TbSysJreportParam
from app.domain.report.repository import ReportParamRepository, ReportRepository
from app.domain.report.schemas import (
    ReportParamPayload, ReportParamView, ReportPayload, ReportSearchBody, ReportView,
)
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG001D0005", tags=["CORE_PROG001D0005"])
SERVICE_ID = "systemJreportLogicServiceImpl"
UNAVAILABLE = "Jasper report deployment is not enabled in the Python backend."


def _service_allowed(user: UserContext, method_type: str) -> bool:
    return is_admin(user) or is_permitted(
        f"{SERVICE_ID}:{method_type}", PermissionType.SERVICE, user)


@router.post("/findPage", response_model=QueryResult[list[ReportView]], response_model_by_alias=True)
def find_page(body: ReportSearchBody,
              _=Depends(require_controller_authority("CORE_PROG001D0005Q")),
              db: Session = Depends(get_db_session)) -> QueryResult[list[ReportView]]:
    page = body.page_of
    rows, count = ReportRepository(db).find_page(
        str(body.field.get("reportId") or ""), page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/load", response_model=DefaultControllerJsonResultObj[ReportView],
             response_model_by_alias=True)
def load(value: ReportPayload, _=Depends(require_controller_authority("CORE_PROG001D0005E")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[ReportView]:
    row = ReportRepository(db).get(value.oid) if value.oid else None
    if row is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=row)


@router.post("/save", response_model=DefaultControllerJsonResultObj[ReportView],
             response_model_by_alias=True)
def save(_: ReportPayload,
         user=Depends(require_controller_authority("CORE_PROG001D0005C"))
         ) -> DefaultControllerJsonResultObj[ReportView]:
    if not _service_allowed(user, "INSERT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    return DefaultControllerJsonResultObj(isAuth="Y", message=UNAVAILABLE)


@router.post("/update", response_model=DefaultControllerJsonResultObj[ReportView],
             response_model_by_alias=True)
def update(_: ReportPayload,
           user=Depends(require_controller_authority("CORE_PROG001D0005U"))
           ) -> DefaultControllerJsonResultObj[ReportView]:
    if not _service_allowed(user, "UPDATE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    return DefaultControllerJsonResultObj(isAuth="Y", message=UNAVAILABLE)


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete(value: ReportPayload,
           user=Depends(require_controller_authority("CORE_PROG001D0005D")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[bool]:
    if not _service_allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    repository = ReportRepository(db)
    row = repository.get(value.oid) if value.oid else None
    if row is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    ReportParamRepository(db).delete_for_report(row.report_id)
    deleted = repository.delete_by_oid(row.oid)
    db.commit()
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="delete data success!", value=deleted)


@router.post("/findSetParamPage", response_model=QueryResult[list[ReportParamView]],
             response_model_by_alias=True)
def find_param_page(body: ReportSearchBody,
                    _=Depends(require_controller_authority("CORE_PROG001D0005Q")),
                    db: Session = Depends(get_db_session)) -> QueryResult[list[ReportParamView]]:
    page = body.page_of
    rows, count = ReportParamRepository(db).find_page(
        str(body.field.get("reportId") or ""), page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/saveSetParam", response_model=DefaultControllerJsonResultObj[ReportParamView],
             response_model_by_alias=True)
def save_param(value: ReportParamPayload,
               _=Depends(require_controller_authority("CORE_PROG001D0005C")),
               db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[ReportParamView]:
    errors = {}
    for field, item in (("reportId", value.report_id), ("urlParam", value.url_param),
                        ("rptParam", value.rpt_param)):
        if not item.strip():
            errors[field] = f"Please input {field}!"
    for field, item in (("urlParam", value.url_param), ("rptParam", value.rpt_param)):
        if item and re.fullmatch(r"[A-Za-z0-9]+", item) is None:
            errors[field] = "Only 0-9, a-z and A-Z are allowed!"
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!",
                                              checkFields=errors)
    existing, _ = ReportParamRepository(db).find_page(value.report_id, 0, 1000000)
    if any(row.rpt_param == value.rpt_param for row in existing):
        return DefaultControllerJsonResultObj(isAuth="Y", message="data is exist!")
    model = TbSysJreportParam(oid="", report_id=value.report_id, url_param=value.url_param,
                              rpt_param=value.rpt_param, cuserid="", cdate=CrudService._now())
    row = CrudService(db, ReportParamRepository(db)).create(model)
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="insert data success!", value=row)


@router.post("/deleteSetParam", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete_param(value: ReportParamPayload,
                 user=Depends(require_controller_authority("CORE_PROG001D0005D")),
                 db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[bool]:
    if not _service_allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    if not value.oid:
        return DefaultControllerJsonResultObj(isAuth="Y", message="parameter cann't blank!")
    deleted = CrudService(db, ReportParamRepository(db)).delete(value.oid)
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y" if deleted else "N",
        message="delete data success!" if deleted else "delete data fail!", value=deleted)
