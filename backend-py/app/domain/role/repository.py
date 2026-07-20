from sqlalchemy import select
from sqlalchemy.orm import Session
from sqlalchemy import func

from app.db.repository import Repository
from app.domain.role.models import TbRole, TbUserRole


class RoleRepository(Repository[TbRole]):
    model = TbRole

    def __init__(self, db: Session) -> None:
        super().__init__(db)

    def find_by_role(self, role: str) -> TbRole | None:
        statement = select(TbRole).where(TbRole.role == role)
        return self.db.execute(statement).scalar_one_or_none()

    def find(self, role: str = "") -> list[TbRole]:
        statement = select(TbRole)
        if role:
            statement = statement.where(TbRole.role == role)
        return list(self.db.scalars(statement.order_by(TbRole.role)).all())


    def find_page(self, role: str, offset: int, limit: int) -> tuple[list[TbRole], int]:
        conditions = [] if not role else [TbRole.role == role]
        count = int(self.db.scalar(select(func.count()).select_from(TbRole).where(*conditions)) or 0)
        rows = list(self.db.scalars(select(TbRole).where(*conditions).order_by(
            TbRole.role).offset(offset).limit(limit)).all())
        return rows, count


class UserRoleRepository(Repository[TbUserRole]):
    model = TbUserRole

    def __init__(self, db: Session) -> None:
        super().__init__(db)

    def find_by_account(self, account: str) -> list[TbUserRole]:
        statement = select(TbUserRole).where(TbUserRole.account == account).order_by(TbUserRole.role)
        return list(self.db.execute(statement).scalars().all())

    def find_by_role_and_account(self, role: str, account: str) -> TbUserRole | None:
        statement = select(TbUserRole).where(TbUserRole.role == role, TbUserRole.account == account)
        return self.db.execute(statement).scalar_one_or_none()
