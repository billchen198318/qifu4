from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from app.common.context import UserContext
from app.common.result import DefaultControllerJsonResultObj
from app.db.session import get_db_session
from app.domain.navigation.menu_settings_service import MenuSettingsService
from app.domain.navigation.program_schemas import ProgramView
from app.domain.navigation.repository import ProgramRepository
from app.security.dependencies import require_controller_authority
from app.security.permissions import PermissionType, is_admin, is_permitted

router = APIRouter(prefix="/api/PROG001D0003", tags=["CORE_PROG001D0003"])
SERVICE_ID = "systemMenuLogicServiceImpl"


def _service_allowed(user: UserContext, *method_types: str) -> bool:
    return is_admin(user) or any(is_permitted(
        f"{SERVICE_ID}:{method_type}", PermissionType.SERVICE, user)
        for method_type in method_types)


@router.post("/loadProgramFolder",
             response_model=DefaultControllerJsonResultObj[list[ProgramView]],
             response_model_by_alias=True)
def load_program_folder(
    _=Depends(require_controller_authority("CORE_PROG001D0003Q")),
    db: Session = Depends(get_db_session),
) -> DefaultControllerJsonResultObj[list[ProgramView]]:
    rows = ProgramRepository(db).find_by_item_type("FOLDER")
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=rows)


@router.post("/loadProgramEnableAndAllList/{oid}",
             response_model=DefaultControllerJsonResultObj[dict[str, list[ProgramView]]],
             response_model_by_alias=True)
def load_program_enable_and_all(
    oid: str,
    user=Depends(require_controller_authority("CORE_PROG001D0003Q")),
    db: Session = Depends(get_db_session),
) -> DefaultControllerJsonResultObj[dict[str, list[ProgramView]]]:
    if not _service_allowed(user, "SELECT"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    try:
        value = MenuSettingsService(db).enabled_and_all(oid)
    except ValueError as error:
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y", value=value)


def _append_oids(append_oid: str = "") -> list[str]:
    result = []
    for oid in append_oid.split(","):
        if oid.strip() and oid not in result:
            result.append(oid)
    return result


def _update(folder_oid: str, append_oid: str, user: UserContext,
            db: Session) -> DefaultControllerJsonResultObj[bool]:
    if not _service_allowed(user, "INSERT", "UPDATE"):
        return DefaultControllerJsonResultObj(isAuth="Y", message="No permission!")
    try:
        value = MenuSettingsService(db).create_or_update(
            folder_oid, _append_oids(append_oid))
    except ValueError as error:
        db.rollback()
        return DefaultControllerJsonResultObj(isAuth="Y", message=str(error))
    return DefaultControllerJsonResultObj(isAuth="Y", success="Y",
                                          message="update data success!", value=value)


@router.api_route("/updateMenu/{folder_oid}", methods=["GET", "POST", "PUT", "DELETE", "PATCH"],
                  response_model=DefaultControllerJsonResultObj[bool],
                  response_model_by_alias=True)
def update_menu_empty(
    folder_oid: str,
    user=Depends(require_controller_authority("CORE_PROG001D0003U")),
    db: Session = Depends(get_db_session),
) -> DefaultControllerJsonResultObj[bool]:
    return _update(folder_oid, "", user, db)


@router.api_route("/updateMenu/{folder_oid}/{append_oid:path}",
                  methods=["GET", "POST", "PUT", "DELETE", "PATCH"],
                  response_model=DefaultControllerJsonResultObj[bool],
                  response_model_by_alias=True)
def update_menu(
    folder_oid: str,
    append_oid: str,
    user=Depends(require_controller_authority("CORE_PROG001D0003U")),
    db: Session = Depends(get_db_session),
) -> DefaultControllerJsonResultObj[bool]:
    return _update(folder_oid, append_oid, user, db)
