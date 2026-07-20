from datetime import datetime, time, timedelta
from fastapi import APIRouter, Depends
from pydantic import BaseModel, ConfigDict, Field
from sqlalchemy.orm import Session
from app.common.pagination import QueryResult
from app.db.session import get_db_session
from app.domain.system.repository import SysTokenRepository
from app.security.dependencies import require_controller_authority

router = APIRouter(prefix="/api/DashboardDemo", tags=["DASHBOARD_DEMO"])


class BoardDemo(BaseModel):
    user_id: str = Field(default="", alias="userId")
    count_size: int = Field(default=0, alias="countSize")
    date: str = ""
    model_config = ConfigDict(populate_by_name=True)


@router.post("/findBoardDemo", response_model=QueryResult[list[BoardDemo]],
             response_model_by_alias=True)
def find_board_demo(
    _=Depends(require_controller_authority(check=False)),
    db: Session = Depends(get_db_session),
):
    end = datetime.now().replace(tzinfo=None)
    start = end - timedelta(days=6)
    value = [BoardDemo(userId=user_id, countSize=count)
             for user_id, count in SysTokenRepository(db).top_users_between(start, end)]
    return QueryResult(isAuth="Y", success="Y", value=value)


@router.post("/findSize", response_model=QueryResult[list[BoardDemo]],
             response_model_by_alias=True)
def find_size(
    _=Depends(require_controller_authority(check=False)),
    db: Session = Depends(get_db_session),
):
    today = datetime.now().date()
    repository, value = SysTokenRepository(db), []
    for days_ago in range(6, -1, -1):
        day = today - timedelta(days=days_ago)
        start = datetime.combine(day, time.min)
        end = datetime.combine(day, time(23, 59, 59, 999000))
        value.append(BoardDemo(
            date=day.isoformat(), countSize=repository.count_created_between(start, end)))
    return QueryResult(isAuth="Y", success="Y", value=value)
