import re

from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from app.common.pagination import QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.common.context import UserContext
from app.db.session import get_db_session
from app.domain.navigation.models import TbSys
from app.domain.navigation.repository import SystemRepository
from app.domain.navigation.system_schemas import SystemPayload, SystemSearchBody, SystemView
from app.domain.navigation.system_service import ApplicationSystemService
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG001D0001", tags=["CORE_PROG001D0001"])


def _logic_allowed(user: UserContext, method_type: str) -> bool:
    return is_admin(user) or is_permitted(
        f"applicationSystemLogicServiceImpl:{method_type}", PermissionType.SERVICE, user)


def _validation(payload: SystemPayload) -> dict[str, str]:
    errors = {}
    for field, value, message in (
        ("sysId", payload.sys_id, "Please input system id!"),
        ("name", payload.name, "Please input name!"),
        ("host", payload.host, "Please input host!"),
        ("contextPath", payload.context_path, "Please input context path!"),
    ):
        if not value.strip():
            errors[field] = message
    if payload.sys_id.strip() and re.fullmatch(r"[A-Za-z0-9]+", payload.sys_id) is None:
        errors["sysId"] = "Only 0-9, a-z and A-Z are allowed!"
    return errors


def _model(payload: SystemPayload) -> TbSys:
    return TbSys(oid=payload.oid, sys_id=payload.sys_id, name=payload.name, host=payload.host,
                 context_path=payload.context_path, is_local=payload.is_local, icon=payload.icon,
                 cuserid="", cdate=ApplicationSystemService._now())


@router.post("/findPage", response_model=QueryResult[list[SystemView]], response_model_by_alias=True)
def find_page(body: SystemSearchBody, _=Depends(require_controller_authority("CORE_PROG001D0001Q")),
              db: Session = Depends(get_db_session)) -> QueryResult[list[SystemView]]:
    page = body.page_of
    rows, count = SystemRepository(db).find_page(str(body.field.get("sysId") or ""),
                                                  str(body.field.get("nameLike") or ""),
                                                  offset=page.offset, limit=int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/load", response_model=DefaultControllerJsonResultObj[SystemView], response_model_by_alias=True)
def load(payload: SystemPayload, _=Depends(require_controller_authority("CORE_PROG001D0001E")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[SystemView]:
    row = SystemRepository(db).get(payload.oid) if payload.oid else None
    if row is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=row)


def _write(payload: SystemPayload, db: Session, update: bool) -> DefaultControllerJsonResultObj[SystemView]:
    errors = _validation(payload)
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!", checkFields=errors)
    service, model = ApplicationSystemService(db), _model(payload)
    if update:
        old = service.systems.get(payload.oid) if payload.oid else None
        if old is None:
            return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
        model.cuserid, model.cdate = old.cuserid, old.cdate
        value, message = service.update(model), "update data success!"
    else:
        if service.systems.find_by_sys_id(payload.sys_id) is not None:
            return DefaultControllerJsonResultObj(isAuth="Y", message="data is exist!")
        value, message = service.create(model), "insert data success!"
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", message=message, value=value)


@router.post("/save", response_model=DefaultControllerJsonResultObj[SystemView], response_model_by_alias=True)
def save(payload: SystemPayload, user=Depends(require_controller_authority("CORE_PROG001D0001C")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[SystemView]:
    if not _logic_allowed(user, "INSERT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    return _write(payload, db, False)


@router.post("/update", response_model=DefaultControllerJsonResultObj[SystemView], response_model_by_alias=True)
def update(payload: SystemPayload, user=Depends(require_controller_authority("CORE_PROG001D0001U")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[SystemView]:
    if not _logic_allowed(user, "UPDATE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    return _write(payload, db, True)


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool], response_model_by_alias=True)
def delete(payload: SystemPayload, user=Depends(require_controller_authority("CORE_PROG001D0001D")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[bool]:
    if not _logic_allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    try:
        deleted = ApplicationSystemService(db).delete_checked(payload.oid)
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="delete data success!", value=deleted)
