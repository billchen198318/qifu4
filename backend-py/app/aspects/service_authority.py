from collections.abc import Callable
from enum import StrEnum
from functools import wraps
from typing import Any, ParamSpec, TypeVar

from app.common.context import UserContext, get_current_user_context
from app.common.exceptions import AuthorityException
from app.security.permissions import PermissionType, is_admin, is_permitted

P = ParamSpec("P")
R = TypeVar("R")


class ServiceMethodType(StrEnum):
    SELECT = "SELECT"
    INSERT = "INSERT"
    UPDATE = "UPDATE"
    DELETE = "DELETE"


EventLogger = Callable[[str, bool], None]


def service_authority(
    service_id: str,
    method_types: tuple[ServiceMethodType, ...] | None = None,
    *,
    check: bool = True,
    event_logger: EventLogger | None = None,
) -> Callable[[Callable[P, R]], Callable[P, R]]:
    def decorate(function: Callable[P, R]) -> Callable[P, R]:
        @wraps(function)
        def wrapped(*args: P.args, **kwargs: P.kwargs) -> R:
            user = get_current_user_context()
            allowed = _is_allowed(user, service_id, method_types, check)
            if event_logger is not None:
                event_logger(f"{service_id}@{function.__name__}", allowed)
            if not allowed:
                raise AuthorityException("no permission")
            return function(*args, **kwargs)
        return wrapped
    return decorate


def _is_allowed(user: UserContext | None, service_id: str,
                method_types: tuple[ServiceMethodType, ...] | None, check: bool) -> bool:
    if is_admin(user) or not service_id.strip() or not check or method_types is None:
        return True
    if user is None:
        return False
    return any(is_permitted(f"{service_id}:{method_type.value}", PermissionType.SERVICE, user)
               for method_type in method_types)
