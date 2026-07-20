from fastapi import APIRouter, Depends
from sqlalchemy.orm import Session

from app.common.context import UserContext
from app.common.pagination import QueryResult
from app.config.settings import Settings, get_settings
from app.db.session import get_db_session
from app.domain.navigation.schemas import ProgramAndMenuResult
from app.domain.navigation.service import NavigationService
from app.security.dependencies import require_controller_authority
from app.security.permissions import is_admin

router = APIRouter(prefix="/api/menu", tags=["menu"])


@router.post("/getMemuItemAndProgList", response_model=QueryResult[ProgramAndMenuResult], response_model_by_alias=True)
def get_menu_item_and_program_list(
    user: UserContext = Depends(require_controller_authority(check=False)),
    db: Session = Depends(get_db_session),
    settings: Settings = Depends(get_settings),
) -> QueryResult[ProgramAndMenuResult]:
    value = NavigationService(db, settings.main_system).get_menu_and_programs(user.account, is_admin(user))
    return QueryResult(isAuth="Y", success="Y", value=value)
