from sqlalchemy.orm import Session

from app.common.exceptions import ServiceException
from app.db.service import CrudService
from app.domain.role.models import TbRole, TbUserRole
from app.domain.role.repository import RoleRepository, UserRoleRepository


class RoleCrudService(CrudService[TbRole]):
    def __init__(self, db: Session) -> None:
        super().__init__(db, RoleRepository(db))

    def create(self, model: TbRole) -> TbRole:
        if self.repository.find_by_role(model.role):
            raise ServiceException("Role already exists")
        return super().create(model)


class UserRoleCrudService(CrudService[TbUserRole]):
    def __init__(self, db: Session) -> None:
        super().__init__(db, UserRoleRepository(db))

    def create(self, model: TbUserRole) -> TbUserRole:
        if self.repository.find_by_role_and_account(model.role, model.account):
            raise ServiceException("User role already exists")
        return super().create(model)
