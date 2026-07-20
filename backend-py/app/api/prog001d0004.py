import re

from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from app.common.context import UserContext
from app.common.pagination import QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.template.models import TbSysTemplate, TbSysTemplateParam
from app.domain.template.repository import TemplateParamRepository, TemplateRepository
from app.domain.template.schemas import (
    TemplateParamPayload, TemplateParamView, TemplatePayload, TemplateSearchBody, TemplateView,
)
from app.domain.template.service import TemplateParamService, TemplateService
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG001D0004", tags=["CORE_PROG001D0004"])
SERVICE_ID = "systemTemplateLogicServiceImpl"


def _service_allowed(user: UserContext, method_type: str) -> bool:
    return is_admin(user) or is_permitted(
        f"{SERVICE_ID}:{method_type}", PermissionType.SERVICE, user)


def _template_errors(value: TemplatePayload) -> dict[str, str]:
    errors = {}
    for field, item, message in (
        ("templateId", value.template_id, "Please input template id!"),
        ("title", value.title, "Please input title!"),
        ("message", value.message, "Please input message!"),
    ):
        if not item.strip():
            errors[field] = message
    if value.template_id.strip() and re.fullmatch(r"[A-Za-z0-9]+", value.template_id) is None:
        errors["templateId"] = "Only 0-9, a-z and A-Z are allowed!"
    return errors


def _param_errors(value: TemplateParamPayload) -> dict[str, str]:
    errors = {}
    for field, item, message in (
        ("templateId", value.template_id, "Please input template id!"),
        ("isTitle", value.is_title, "Please input title flag!"),
        ("templateVar", value.template_var, "Please input template variable!"),
        ("objectVar", value.object_var, "Please input object variable!"),
    ):
        if not item.strip():
            errors[field] = message
    if value.template_id.strip() and re.fullmatch(r"[A-Za-z0-9]+", value.template_id) is None:
        errors["templateId"] = "Only 0-9, a-z and A-Z are allowed!"
    return errors


def _template_model(value: TemplatePayload) -> TbSysTemplate:
    return TbSysTemplate(oid=value.oid, template_id=value.template_id, title=value.title,
                         message=value.message, description=value.description,
                         cuserid="", cdate=TemplateService._now())


def _param_model(value: TemplateParamPayload) -> TbSysTemplateParam:
    return TbSysTemplateParam(
        oid=value.oid, template_id=value.template_id, is_title=value.is_title,
        template_var=value.template_var, object_var=value.object_var,
        cuserid="", cdate=TemplateParamService._now())


@router.post("/findPage", response_model=QueryResult[list[TemplateView]], response_model_by_alias=True)
def find_page(body: TemplateSearchBody,
              _=Depends(require_controller_authority("CORE_PROG001D0004Q")),
              db: Session = Depends(get_db_session)) -> QueryResult[list[TemplateView]]:
    page = body.page_of
    rows, count = TemplateRepository(db).find_page(
        str(body.field.get("templateId") or ""), str(body.field.get("titleLike") or ""),
        page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/load", response_model=DefaultControllerJsonResultObj[TemplateView],
             response_model_by_alias=True)
def load(value: TemplatePayload, _=Depends(require_controller_authority("CORE_PROG001D0004E")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[TemplateView]:
    row = TemplateRepository(db).get(value.oid) if value.oid else None
    if row is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=row)


@router.post("/save", response_model=DefaultControllerJsonResultObj[TemplateView],
             response_model_by_alias=True)
def save(value: TemplatePayload, user=Depends(require_controller_authority("CORE_PROG001D0004C")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[TemplateView]:
    if not _service_allowed(user, "INSERT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    errors = _template_errors(value)
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!",
                                              checkFields=errors)
    service = TemplateService(db)
    try:
        service.check_message(value.message)
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    if service.templates.find_by_template_id(value.template_id):
        return DefaultControllerJsonResultObj(isAuth="Y", message="data is exist!")
    row = service.create(_template_model(value))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="insert data success!", value=row)


@router.post("/update", response_model=DefaultControllerJsonResultObj[TemplateView],
             response_model_by_alias=True)
def update(value: TemplatePayload, user=Depends(require_controller_authority("CORE_PROG001D0004U")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[TemplateView]:
    if not _service_allowed(user, "UPDATE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    errors = _template_errors(value)
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!",
                                              checkFields=errors)
    try:
        row = TemplateService(db).update_checked(_template_model(value))
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="update data success!", value=row)


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete(value: TemplatePayload, user=Depends(require_controller_authority("CORE_PROG001D0004D")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[bool]:
    if not _service_allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    try:
        deleted = TemplateService(db).delete_checked(value.oid)
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="delete data success!", value=deleted)


@router.post("/findSetParamPage", response_model=QueryResult[list[TemplateParamView]],
             response_model_by_alias=True)
def find_param_page(
    body: TemplateSearchBody,
    _=Depends(require_controller_authority("CORE_PROG001D0004Q")),
    db: Session = Depends(get_db_session),
) -> QueryResult[list[TemplateParamView]]:
    page = body.page_of
    rows, count = TemplateParamRepository(db).find_page(
        str(body.field.get("templateId") or ""), page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/saveSetParam", response_model=DefaultControllerJsonResultObj[TemplateParamView],
             response_model_by_alias=True)
def save_param(
    value: TemplateParamPayload,
    _=Depends(require_controller_authority("CORE_PROG001D0004U")),
    db: Session = Depends(get_db_session),
) -> DefaultControllerJsonResultObj[TemplateParamView]:
    errors = _param_errors(value)
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!",
                                              checkFields=errors)
    repository = TemplateParamRepository(db)
    existing, _ = repository.find_page(value.template_id, 0, 1000000)
    if any(row.template_var == value.template_var and row.is_title == value.is_title
           for row in existing):
        return DefaultControllerJsonResultObj(isAuth="Y", message="data is exist!")
    row = TemplateParamService(db).create(_param_model(value))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="insert data success!", value=row)


@router.post("/deleteSetParam", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete_param(
    value: TemplateParamPayload,
    user=Depends(require_controller_authority("CORE_PROG001D0004D")),
    db: Session = Depends(get_db_session),
) -> DefaultControllerJsonResultObj[bool]:
    if not _service_allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    if not value.oid:
        return DefaultControllerJsonResultObj(isAuth="Y", message="parameter cann't blank!")
    deleted = TemplateParamService(db).delete(value.oid)
    if not deleted:
        return DefaultControllerJsonResultObj(isAuth="Y", message="delete data fail!")
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="delete data success!", value=True)
