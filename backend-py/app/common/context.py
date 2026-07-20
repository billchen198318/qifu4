from contextvars import ContextVar, Token
from dataclasses import dataclass, field


@dataclass(frozen=True)
class UserContext:
    account: str
    user_id: str | None = None
    locale: str | None = None
    roles: tuple[str, ...] = ()
    permissions: dict[str, set[str]] = field(default_factory=dict)


current_user_var: ContextVar[UserContext | None] = ContextVar("current_user", default=None)


def get_current_user_context() -> UserContext | None:
    return current_user_var.get()


def set_current_user_context(user: UserContext | None) -> Token[UserContext | None]:
    return current_user_var.set(user)


def reset_current_user_context(token: Token[UserContext | None]) -> None:
    current_user_var.reset(token)
