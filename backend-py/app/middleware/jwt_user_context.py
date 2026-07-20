from datetime import datetime, timezone

from fastapi import Request
from starlette.middleware.base import BaseHTTPMiddleware, RequestResponseEndpoint
from starlette.responses import Response

from app.common.context import UserContext, reset_current_user_context, set_current_user_context
from app.config.settings import Settings
from app.db.session import SessionLocal
from app.domain.account.service import AuthService
from app.domain.system.repository import SysTokenRepository
from app.security.jwt import USER_ID_CLAIM, verify_access_token


class JwtUserContextMiddleware(BaseHTTPMiddleware):
    def __init__(self, app, settings: Settings) -> None:
        super().__init__(app)
        self.settings = settings

    async def dispatch(self, request: Request, call_next: RequestResponseEndpoint) -> Response:
        context_token = None
        try:
            user = self._load_user(request)
            request.state.user = user
            if user is not None:
                context_token = set_current_user_context(user)
            return await call_next(request)
        finally:
            if context_token is not None:
                reset_current_user_context(context_token)

    def _load_user(self, request: Request) -> UserContext | None:
        if request.url.path.startswith("/api/auth/"):
            return None
        authorization = request.headers.get("Authorization", "")
        token = authorization[7:].strip() if authorization.lower().startswith("bearer ") else ""
        if not token and request.url.path.startswith("/api/"):
            token = request.cookies.get(self.settings.access_token_cookie_name, "")
        if not token:
            return None
        try:
            payload = verify_access_token(token, self.settings)
        except ValueError:
            return None
        account = str(payload.get(USER_ID_CLAIM, ""))
        if not account:
            return None
        with SessionLocal() as db:
            now = datetime.now(timezone.utc).replace(tzinfo=None)
            if not SysTokenRepository(db).is_access_active(token, now):
                return None
            auth_user = AuthService(db, self.settings).build_user(account)
        permissions: dict[str, set[str]] = {}
        for role in auth_user.roles:
            for item in role.role_permission:
                permissions.setdefault(item.type, set()).add(item.permission)
        return UserContext(account=account, user_id=account,
                           roles=tuple(role.role for role in auth_user.roles), permissions=permissions)
