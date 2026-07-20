import re

from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from app.common.context import UserContext
from app.common.pagination import QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.navigation.models import TbSysProg
from app.domain.navigation.program_schemas import ProgramPayload, ProgramSearchBody, ProgramView
from app.domain.navigation.program_service import SystemProgramService
from app.domain.navigation.repository import ProgramRepository
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG001D0002", tags=["CORE_PROG001D0002"])


def _delete_logic_allowed(user: UserContext) -> bool:
    return is_admin(user) or is_permitted(
        "systemProgramLogicServiceImpl:DELETE", PermissionType.SERVICE, user)


def _validation(payload: ProgramPayload) -> dict[str, str]:
    errors = {}
    values = (
        ("progId", payload.prog_id, "Please input program id!"),
        ("name", payload.name, "Please input name!"),
        ("url", payload.url, "Please input url!"),
        ("editMode", payload.edit_mode, "Please input edit mode!"),
        ("isDialog", payload.is_dialog, "Please input dialog flag!"),
        ("progSystem", payload.prog_system, "Please input system!"),
        ("itemType", payload.item_type, "Please input item type!"),
        ("icon", payload.icon, "Please input icon!"),
        ("fontIconClassId", payload.font_icon_class_id, "Please input icon class!"),
    )
    for field, value, message in values:
        if not value.strip():
            errors[field] = message
    if payload.dialog_w is None:
        errors["dialogW"] = "Please input dialog width!"
    if payload.dialog_h is None:
        errors["dialogH"] = "Please input dialog height!"
    if payload.prog_id.strip() and re.fullmatch(r"[A-Za-z0-9]+", payload.prog_id) is None:
        errors["progId"] = "Only 0-9, a-z and A-Z are allowed!"
    return errors


def _model(payload: ProgramPayload) -> TbSysProg:
    return TbSysProg(
        oid=payload.oid, prog_id=payload.prog_id, name=payload.name, url=payload.url,
        edit_mode=payload.edit_mode, is_dialog=payload.is_dialog,
        dialog_w=payload.dialog_w or 0, dialog_h=payload.dialog_h or 0,
        prog_system=payload.prog_system, item_type=payload.item_type, icon=payload.icon,
        font_icon_class_id=payload.font_icon_class_id, cuserid="",
        cdate=SystemProgramService._now())


@router.post("/findPage", response_model=QueryResult[list[ProgramView]], response_model_by_alias=True)
def find_page(body: ProgramSearchBody, _=Depends(require_controller_authority("CORE_PROG001D0002Q")),
              db: Session = Depends(get_db_session)) -> QueryResult[list[ProgramView]]:
    page = body.page_of
    rows, count = ProgramRepository(db).find_page(str(body.field.get("progId") or ""),
                                                   str(body.field.get("nameLike") or ""),
                                                   offset=page.offset, limit=int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/load", response_model=DefaultControllerJsonResultObj[ProgramView],
             response_model_by_alias=True)
def load(payload: ProgramPayload, _=Depends(require_controller_authority("CORE_PROG001D0002E")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[ProgramView]:
    row = ProgramRepository(db).get(payload.oid) if payload.oid else None
    if row is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=row)


def _write(payload: ProgramPayload, db: Session, update: bool) -> DefaultControllerJsonResultObj[ProgramView]:
    errors = _validation(payload)
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!",
                                              checkFields=errors)
    service, model = SystemProgramService(db), _model(payload)
    if update:
        old = service.programs.get(payload.oid) if payload.oid else None
        if old is None:
            return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
        model.cuserid, model.cdate = old.cuserid, old.cdate
        value, message = service.update(model), "update data success!"
    else:
        if service.programs.find_by_prog_id(payload.prog_id) is not None:
            return DefaultControllerJsonResultObj(isAuth="Y", message="data is exist!")
        value, message = service.create(model), "insert data success!"
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", message=message, value=value)


@router.post("/save", response_model=DefaultControllerJsonResultObj[ProgramView],
             response_model_by_alias=True)
def save(payload: ProgramPayload, _=Depends(require_controller_authority("CORE_PROG001D0002C")),
         db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[ProgramView]:
    return _write(payload, db, False)


@router.post("/update", response_model=DefaultControllerJsonResultObj[ProgramView],
             response_model_by_alias=True)
def update(payload: ProgramPayload, _=Depends(require_controller_authority("CORE_PROG001D0002U")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[ProgramView]:
    return _write(payload, db, True)


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool],
             response_model_by_alias=True)
def delete(payload: ProgramPayload,
           user=Depends(require_controller_authority("CORE_PROG001D0002D")),
           db: Session = Depends(get_db_session)) -> DefaultControllerJsonResultObj[bool]:
    if not _delete_logic_allowed(user):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    try:
        deleted = SystemProgramService(db).delete_checked(payload.oid)
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="delete data success!", value=deleted)
