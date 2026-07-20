import re
from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session
from app.common.context import UserContext
from app.common.pagination import QueryResult
from app.common.result import DefaultControllerJsonResultObj
from app.db.service import CrudService
from app.db.session import get_db_session
from app.domain.permission.models import TbRolePermission
from app.domain.permission.repository import RolePermissionRepository
from app.domain.role.logic_service import RoleLogicService
from app.domain.role.models import TbRole
from app.domain.role.repository import RoleRepository
from app.domain.role.schemas import PermissionPayload, PermissionView, RolePayload, RoleSearchBody, RoleView
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG002D0001", tags=["CORE_PROG002D0001"])


def allowed(user: UserContext, kind: str) -> bool:
    return is_admin(user) or is_permitted(f"roleLogicServiceImpl:{kind}", PermissionType.SERVICE, user)


def role_model(value: RolePayload) -> TbRole:
    return TbRole(oid=value.oid, role=value.role, description=value.description,
                  cuserid="", cdate=RoleLogicService._now())


def role_errors(value: RolePayload) -> dict[str, str]:
    if not value.role.strip():
        return {"role": "Please input role!"}
    if re.fullmatch(r"[A-Za-z0-9]+", value.role) is None:
        return {"role": "Only 0-9, a-z and A-Z are allowed!"}
    return {}


@router.post("/findPage", response_model=QueryResult[list[RoleView]], response_model_by_alias=True)
def find_page(body: RoleSearchBody, _=Depends(require_controller_authority("CORE_PROG002D0001Q")),
              db: Session = Depends(get_db_session)):
    page = body.page_of
    rows, count = RoleRepository(db).find_page(str(body.field.get("role") or ""),
                                                page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/load", response_model=DefaultControllerJsonResultObj[RoleView], response_model_by_alias=True)
def load(value: RolePayload, _=Depends(require_controller_authority("CORE_PROG002D0001E")),
         db: Session = Depends(get_db_session)):
    row = RoleRepository(db).get(value.oid) if value.oid else None
    return (DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=row) if row else
            DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!"))


def write(value: RolePayload, db: Session, update: bool):
    errors = role_errors(value)
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!", checkFields=errors)
    service, model = RoleLogicService(db), role_model(value)
    try:
        if update:
            old = service.roles.get(value.oid) if value.oid else None
            if old is None:
                raise ValueError("data no exist!")
            model.description = (model.description or "")[:500]
            model.cuserid, model.cdate = old.cuserid, old.cdate
            row, message = service.update(model), "update data success!"
        else:
            row, message = service.create_checked(model), "insert data success!"
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", message=message, value=row)


@router.post("/save", response_model=DefaultControllerJsonResultObj[RoleView], response_model_by_alias=True)
def save(value: RolePayload, user=Depends(require_controller_authority("CORE_PROG002D0001C")),
         db: Session = Depends(get_db_session)):
    return write(value, db, False) if allowed(user, "INSERT") else DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")


@router.post("/update", response_model=DefaultControllerJsonResultObj[RoleView], response_model_by_alias=True)
def update(value: RolePayload, user=Depends(require_controller_authority("CORE_PROG002D0001U")),
           db: Session = Depends(get_db_session)):
    return write(value, db, True) if allowed(user, "UPDATE") else DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")


@router.post("/delete", response_model=DefaultControllerJsonResultObj[bool], response_model_by_alias=True)
def delete(value: RolePayload, user=Depends(require_controller_authority("CORE_PROG002D0001D")),
           db: Session = Depends(get_db_session)):
    if not allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    try:
        result = RoleLogicService(db).delete_checked(value.oid)
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", message="delete data success!", value=result)


@router.post("/findSetParamPage", response_model=QueryResult[list[PermissionView]], response_model_by_alias=True)
def find_permissions(body: RoleSearchBody,
                     _=Depends(require_controller_authority("CORE_PROG002D0001Q")),
                     db: Session = Depends(get_db_session)):
    page = body.page_of
    rows, count = RolePermissionRepository(db).find_page(
        str(body.field.get("role") or ""), page.offset, int(page.show_row))
    page.count_size = str(count)
    page.calculate_size(page.offset)
    return QueryResult(isAuth="Y", success="Y", value=rows, pageOf=page)


@router.post("/saveSetParam", response_model=DefaultControllerJsonResultObj[PermissionView], response_model_by_alias=True)
def save_permission(value: PermissionPayload,
                    _=Depends(require_controller_authority("CORE_PROG002D0001C")),
                    db: Session = Depends(get_db_session)):
    errors = {field: f"Please input {field}!" for field, item in (
        ("permission", value.permission), ("permType", value.perm_type)) if not item.strip()}
    if errors:
        return DefaultControllerJsonResultObj(isAuth="Y", message="Please check fields!", checkFields=errors)
    repository = RolePermissionRepository(db)
    if repository.find_unique(value.role, value.permission):
        return DefaultControllerJsonResultObj(isAuth="Y", message="data is exist!")
    model = TbRolePermission(oid="", role=value.role, permission=value.permission,
                             perm_type=value.perm_type, description=value.description,
                             cuserid="", cdate=CrudService._now())
    row = CrudService(db, repository).create(model)
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", message="insert data success!", value=row)


@router.post("/deleteSetParam", response_model=DefaultControllerJsonResultObj[bool], response_model_by_alias=True)
def delete_permission(value: PermissionPayload,
                      user=Depends(require_controller_authority("CORE_PROG002D0001D")),
                      db: Session = Depends(get_db_session)):
    if not allowed(user, "DELETE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    deleted = CrudService(db, RolePermissionRepository(db)).delete(value.oid) if value.oid else False
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y" if deleted else "N",
        message="delete data success!" if deleted else "parameter cann't blank!", value=deleted)


@router.post("/roleCopySaveJson", response_model=DefaultControllerJsonResultObj[RoleView], response_model_by_alias=True)
def copy_role(value: RolePayload, user=Depends(require_controller_authority("CORE_PROG002D0001C")),
              db: Session = Depends(get_db_session)):
    if not allowed(user, "INSERT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    if role_errors(value) or not value.from_role_oid:
        return DefaultControllerJsonResultObj(isAuth="Y", message="parameter cann't blank!")
    try:
        row = RoleLogicService(db).copy_as_new(value.from_role_oid, role_model(value))
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", message="insert data success!", value=row)
