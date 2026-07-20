from sqlalchemy.orm import Session

from app.common.exceptions import ServiceException
from app.db.service import CrudService
from app.domain.permission.models import TbRolePermission
from app.domain.permission.repository import RolePermissionRepository


class RolePermissionCrudService(CrudService[TbRolePermission]):
    def __init__(self, db: Session) -> None:
        super().__init__(db, RolePermissionRepository(db))

    def create(self, model: TbRolePermission) -> TbRolePermission:
        if self.repository.find_unique(model.role, model.permission):
            raise ServiceException("Role permission already exists")
        return super().create(model)
