from sqlalchemy import select
from sqlalchemy.orm import Session
from sqlalchemy import func

from app.db.repository import Repository
from app.domain.permission.models import TbRolePermission


class RolePermissionRepository(Repository[TbRolePermission]):
    model = TbRolePermission

    def __init__(self, db: Session) -> None:
        super().__init__(db)

    def find_by_roles(self, roles: list[str]) -> list[TbRolePermission]:
        if not roles:
            return []
        statement = (
            select(TbRolePermission)
            .where(TbRolePermission.role.in_(roles))
            .order_by(TbRolePermission.role, TbRolePermission.permission)
        )
        return list(self.db.execute(statement).scalars().all())

    def find(self, role: str = "", permission: str = "", perm_type: str = "") -> list[TbRolePermission]:
        statement = select(TbRolePermission)
        if role:
            statement = statement.where(TbRolePermission.role == role)
        if permission:
            statement = statement.where(TbRolePermission.permission == permission)
        if perm_type:
            statement = statement.where(TbRolePermission.perm_type == perm_type)
        return list(self.db.scalars(statement.order_by(TbRolePermission.role, TbRolePermission.permission)).all())

    def find_unique(self, role: str, permission: str) -> TbRolePermission | None:
        statement = select(TbRolePermission).where(
            TbRolePermission.role == role, TbRolePermission.permission == permission)
        return self.db.execute(statement).scalar_one_or_none()

    def find_page(self, role: str, offset: int, limit: int) -> tuple[list[TbRolePermission], int]:
        condition = TbRolePermission.role == role
        count = int(self.db.scalar(select(func.count()).select_from(
            TbRolePermission).where(condition)) or 0)
        rows = list(self.db.scalars(select(TbRolePermission).where(condition).order_by(
            TbRolePermission.perm_type, TbRolePermission.permission
        ).offset(offset).limit(limit)).all())
        return rows, count
