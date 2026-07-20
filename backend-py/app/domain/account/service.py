from datetime import datetime, timedelta, timezone

from sqlalchemy.orm import Session

from app.config.settings import Settings
from app.domain.account.repository import AccountRepository
from app.domain.account.schemas import AuthUser, RolePermission, UserRole
from app.domain.permission.repository import RolePermissionRepository
from app.domain.role.repository import UserRoleRepository
from app.domain.system.models import TbSysToken
from app.domain.system.repository import SysLoginLogRepository, SysTokenRepository
from app.security.jwt import TokenPair, create_token_pair, verify_access_token
from app.security.password import verify_password
from app.db.service import CrudService
from app.domain.account.models import TbAccount
from app.common.exceptions import ServiceException


class AuthenticationError(ValueError):
    pass


class AccountLockedError(AuthenticationError):
    pass


class AccountCrudService(CrudService[TbAccount]):
    def __init__(self, db: Session) -> None:
        super().__init__(db, AccountRepository(db))

    def create(self, model: TbAccount) -> TbAccount:
        if self.repository.find_by_account(model.account):
            raise ServiceException("Account already exists")
        return super().create(model)


class AuthService:
    def __init__(self, db: Session, settings: Settings) -> None:
        self.db, self.settings = db, settings
        self.accounts = AccountRepository(db)
        self.user_roles = UserRoleRepository(db)
        self.role_permissions = RolePermissionRepository(db)
        self.login_logs = SysLoginLogRepository(db)
        self.tokens = SysTokenRepository(db)

    @staticmethod
    def now() -> datetime:
        return datetime.now(timezone.utc).replace(tzinfo=None)

    def signin(self, username: str, password: str) -> tuple[AuthUser, TokenPair]:
        username, now = username.strip(), self.now()
        if not username:
            raise AuthenticationError("Account is blank.")
        if self.login_logs.count_recent_failures(username, now - timedelta(minutes=5)) >= 3:
            raise AccountLockedError("Account is locked due to multiple failed login attempts. Please try again later.")
        account = self.accounts.find_by_account(username)
        if account is None or account.on_job != "Y" or not verify_password(password, account.password):
            self.login_logs.add_failure(username, now)
            self.db.commit()
            raise AuthenticationError("Authentication failed")
        pair = create_token_pair(username, settings=self.settings)
        self._save_pair(username, pair, now)
        self.db.commit()
        return self.build_user(username), pair

    def validate(self, access_token: str, refresh_token: str) -> AuthUser | None:
        now = self.now()
        stored = self.tokens.find_active_by_refresh(refresh_token, now)
        if stored is None or stored.token != access_token or not self.tokens.is_access_active(access_token, now):
            return None
        try:
            payload = verify_access_token(access_token, self.settings)
        except ValueError:
            return None
        username = str(payload.get("USER_ID", ""))
        return self.build_user(username, view_only=True) if username and stored.user_id == username else None

    def refresh(self, refresh_token: str, username: str = "") -> tuple[str, TokenPair] | None:
        stored = self.tokens.find_active_by_refresh(refresh_token, self.now())
        if stored is None:
            return None
        user_id = username.strip() or stored.user_id
        if user_id != stored.user_id:
            return None
        pair = create_token_pair(user_id, settings=self.settings)
        self._save_pair(user_id, pair, self.now())
        self.db.commit()
        return user_id, pair

    def build_user(self, username: str, view_only: bool = False) -> AuthUser:
        account = self.accounts.find_by_account(username)
        if account is None:
            raise AuthenticationError("Account not found")
        roles = []
        for user_role in self.user_roles.find_by_account(username):
            permissions = self.role_permissions.find_by_roles([user_role.role])
            roles.append(UserRole(role=user_role.role, rolePermission=[
                RolePermission(permission=item.permission, type=item.perm_type)
                for item in permissions if not view_only or item.perm_type == "VIEW"
            ]))
        return AuthUser(userId=username, username=username, password="", roles=roles,
                        onJob=account.on_job, accessToken="Y", refreshToken="Y")

    def _save_pair(self, username: str, pair: TokenPair, now: datetime) -> None:
        self.db.add(TbSysToken(oid=pair.refresh, user_id=username, token=pair.access,
            expires_date=pair.access_expires_at.replace(tzinfo=None),
            rf_expires_date=pair.refresh_expires_at.replace(tzinfo=None), cdate=now))
