from datetime import datetime
from uuid import uuid4
from fastapi import APIRouter, Depends
from sqlalchemy import select
from sqlalchemy.orm import Session
from app.common.context import UserContext
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.navigation.models import TbSysMenuRole
from app.domain.navigation.program_schemas import ProgramPayload, ProgramView
from app.domain.navigation.repository import ProgramRepository
from app.domain.role.models import TbRole
from app.domain.role.repository import RoleRepository
from app.domain.role.schemas import RoleView
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG002D0003", tags=["CORE_PROG002D0003"])


def allowed(user: UserContext, kind: str) -> bool:
    return is_admin(user) or is_permitted(
        f"roleLogicServiceImpl:{kind}", PermissionType.SERVICE, user)


@router.post("/findProgramFolderMenuItem/{system_id}",
             response_model=DefaultControllerJsonResultObj[list[ProgramView]],
             response_model_by_alias=True)
def find_menu_programs(system_id: str,
                       _=Depends(require_controller_authority("CORE_PROG002D0003Q")),
                       db: Session = Depends(get_db_session)):
    if not system_id.strip():
        return DefaultControllerJsonResultObj(isAuth="Y", message="parameter cann't blank!")
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y", value=ProgramRepository(db).find_menu_programs(system_id))


@router.post("/findMenuProgramRoleList",
             response_model=DefaultControllerJsonResultObj[dict[str, list[RoleView]]],
             response_model_by_alias=True)
def find_program_roles(value: ProgramPayload,
                       user=Depends(require_controller_authority("CORE_PROG002D0003Q")),
                       db: Session = Depends(get_db_session)):
    if not allowed(user, "SELECT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    program = ProgramRepository(db).get(value.oid) if value.oid else None
    if program is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    enabled = list(db.scalars(select(TbRole).where(TbRole.role.in_(
        select(TbSysMenuRole.role).where(TbSysMenuRole.prog_id == program.prog_id)
    )).order_by(TbRole.role)).all())
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y",
        value={"enable": enabled, "all": RoleRepository(db).find()})


def role_oids(value: str) -> list[str]:
    result = []
    for oid in value.split(","):
        if oid.strip() and oid not in result:
            result.append(oid)
    return result


@router.api_route("/updateMenuRole/{prog_oid}/{append_oid:path}",
                  methods=["GET", "POST", "PUT", "DELETE", "PATCH"],
                  response_model=DefaultControllerJsonResultObj[bool],
                  response_model_by_alias=True)
def update_menu_roles(prog_oid: str, append_oid: str,
                      user=Depends(require_controller_authority("CORE_PROG002D0003U")),
                      db: Session = Depends(get_db_session)):
    if not allowed(user, "UPDATE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    program = ProgramRepository(db).get(prog_oid) if prog_oid else None
    if program is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    roles, repository = [], RoleRepository(db)
    for oid in role_oids(append_oid):
        role = repository.get(oid)
        if role is None:
            return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
        roles.append(role)
    for row in db.scalars(select(TbSysMenuRole).where(
            TbSysMenuRole.prog_id == program.prog_id)).all():
        db.delete(row)
    now = datetime.now().replace(tzinfo=None)
    for role in roles:
        db.add(TbSysMenuRole(oid=str(uuid4()), prog_id=program.prog_id, role=role.role,
                             cuserid=user.account, cdate=now))
    db.commit()
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y", message="update data success!", value=True)
