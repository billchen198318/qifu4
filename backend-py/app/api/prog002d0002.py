from datetime import datetime
from uuid import uuid4
from fastapi import APIRouter, Depends
from pydantic import BaseModel, ConfigDict, Field
from sqlalchemy import select
from sqlalchemy.orm import Session
from app.common.context import UserContext
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.account.repository import AccountRepository
from app.domain.role.models import TbRole, TbUserRole
from app.domain.role.repository import RoleRepository
from app.domain.role.schemas import RoleView
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG002D0002", tags=["CORE_PROG002D0002"])


class AccountOid(BaseModel):
    oid: str = ""


class AccountListView(BaseModel):
    oid: str
    account: str
    on_job: str = Field(alias="onJob")
    cuserid: str | None = None
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None
    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


def allowed(user: UserContext, kind: str) -> bool:
    return is_admin(user) or is_permitted(
        f"roleLogicServiceImpl:{kind}", PermissionType.SERVICE, user)


@router.post("/loadUserList", response_model=DefaultControllerJsonResultObj[list[AccountListView]],
             response_model_by_alias=True)
def load_users(_=Depends(require_controller_authority("CORE_PROG002D0002Q")),
               db: Session = Depends(get_db_session)):
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y", value=AccountRepository(db).find())


@router.post("/findUserRoleListByAccountOid",
             response_model=DefaultControllerJsonResultObj[dict[str, list[RoleView]]],
             response_model_by_alias=True)
def find_user_roles(value: AccountOid,
                    user=Depends(require_controller_authority("CORE_PROG002D0002Q")),
                    db: Session = Depends(get_db_session)):
    if not allowed(user, "SELECT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    account = AccountRepository(db).get(value.oid) if value.oid else None
    if account is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    enabled = list(db.scalars(select(TbRole).where(TbRole.role.in_(
        select(TbUserRole.role).where(TbUserRole.account == account.account)
    )).order_by(TbRole.role)).all())
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y",
        value={"enable": enabled, "all": RoleRepository(db).find()})


def append_oids(value: str) -> list[str]:
    result = []
    for oid in value.split(","):
        if oid.strip() and oid not in result:
            result.append(oid)
    return result


def assign(account_oid: str, appended: str, user: UserContext, db: Session):
    if not allowed(user, "UPDATE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    account = AccountRepository(db).get(account_oid) if account_oid else None
    if account is None:
        return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
    roles = []
    repository = RoleRepository(db)
    for oid in append_oids(appended):
        role = repository.get(oid)
        if role is None:
            return DefaultControllerJsonResultObj(isAuth="Y", message="data no exist!")
        roles.append(role)
    for row in db.scalars(select(TbUserRole).where(
            TbUserRole.account == account.account)).all():
        db.delete(row)
    now = datetime.now().replace(tzinfo=None)
    for role in roles:
        db.add(TbUserRole(oid=str(uuid4()), role=role.role, account=account.account,
                          description="", cuserid=user.account, cdate=now))
    db.commit()
    return DefaultControllerJsonResultObj(
        isAuth="Y", success="Y", message="update data success!", value=True)


@router.api_route("/updateUserRole/{account_oid}",
                  methods=["GET", "POST", "PUT", "DELETE", "PATCH"],
                  response_model=DefaultControllerJsonResultObj[bool], response_model_by_alias=True)
def update_empty(account_oid: str,
                 user=Depends(require_controller_authority("CORE_PROG002D0002U")),
                 db: Session = Depends(get_db_session)):
    return assign(account_oid, "", user, db)


@router.api_route("/updateUserRole/{account_oid}/{role_oids:path}",
                  methods=["GET", "POST", "PUT", "DELETE", "PATCH"],
                  response_model=DefaultControllerJsonResultObj[bool], response_model_by_alias=True)
def update_roles(account_oid: str, role_oids: str,
                 user=Depends(require_controller_authority("CORE_PROG002D0002U")),
                 db: Session = Depends(get_db_session)):
    return assign(account_oid, role_oids, user, db)
