from enum import StrEnum

from app.common.context import UserContext, get_current_user_context


class PermissionType(StrEnum):
    VIEW = "VIEW"
    CONTROLLER = "CONTROLLER"
    SERVICE = "SERVICE"


def is_admin(user: UserContext | None = None) -> bool:
    user = user or get_current_user_context()
    return user is not None and any(role in {"admin", "*"} for role in user.roles)


def is_permitted(permission: str, permission_type: PermissionType | str,
                 user: UserContext | None = None) -> bool:
    user = user or get_current_user_context()
    if user is None:
        return False
    if is_admin(user):
        return True
    return permission in user.permissions.get(PermissionType(permission_type).value, set())
