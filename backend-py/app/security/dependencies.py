from collections.abc import Callable

from fastapi import Depends, HTTPException, Request, status
from sqlalchemy.orm import Session

from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.db.session import get_db_session
from app.domain.system.repository import SysEventLogRepository
from app.security.permissions import PermissionType, is_permitted


def get_request_user(request: Request) -> UserContext:
    user = getattr(request.state, "user", None)
    if user is None:
        raise HTTPException(status_code=status.HTTP_401_UNAUTHORIZED, detail="Please login!")
    return user


def require_controller_authority(permission: str | None = None, check: bool = True) -> Callable:
    def dependency(
        request: Request,
        user: UserContext = Depends(get_request_user),
        db: Session = Depends(get_db_session),
        settings: Settings = Depends(get_settings),
    ) -> UserContext:
        allowed = not check or not permission or is_permitted(permission, PermissionType.CONTROLLER, user)
        if settings.enable_controller_auth_check_log:
            SysEventLogRepository(db).record(user.account, settings.system_id,
                                             permission or request.url.path, allowed)
            db.commit()
        if not allowed:
            raise HTTPException(status_code=status.HTTP_403_FORBIDDEN, detail="no authorize!")
        return user
    return dependency
