from sqlalchemy.orm import DeclarativeBase


class Base(DeclarativeBase):
    pass


def import_all_models() -> None:
    from app.domain.account import models as _account_models  # noqa: F401
    from app.domain.permission import models as _permission_models  # noqa: F401
    from app.domain.role import models as _role_models  # noqa: F401
    from app.domain.system import models as _system_models  # noqa: F401
    from app.domain.navigation import models as _navigation_models  # noqa: F401
