from uuid import uuid4
from sqlalchemy import select
from sqlalchemy.orm import Session
from app.db.service import CrudService
from app.domain.navigation.models import TbSysMenuRole
from app.domain.permission.models import TbRolePermission
from app.domain.permission.repository import RolePermissionRepository
from app.domain.role.models import TbRole, TbUserRole
from app.domain.role.repository import RoleRepository
from app.domain.system.models import TbSysCode


class RoleLogicService(CrudService[TbRole]):
    def __init__(self, db: Session) -> None:
        self.roles, self.permissions = RoleRepository(db), RolePermissionRepository(db)
        super().__init__(db, self.roles)

    def create_checked(self, model: TbRole) -> TbRole:
        model.description = (model.description or "")[:500]
        if self.roles.find_by_role(model.role):
            raise ValueError("data is exist!")
        return self.create(model)

    def delete_checked(self, oid: str) -> bool:
        role = self.roles.get(oid) if oid else None
        if role is None:
            raise ValueError("data no exist!")
        if role.role in {"admin", "*"}:
            raise ValueError("Administrator or super role cannot delete!")
        code = self.db.execute(select(TbSysCode).where(
            TbSysCode.type == "CMM", TbSysCode.code == "CMM_CONF001")).scalar_one_or_none()
        if code is None or not (code.param1 or "").strip():
            raise ValueError("Data errors!")
        if role.role == code.param1:
            raise ValueError(f"Default user role: {code.param1} cannot delete!")
        for model in (TbRolePermission, TbUserRole, TbSysMenuRole):
            for row in self.db.scalars(select(model).where(model.role == role.role)).all():
                self.db.delete(row)
        self.db.delete(role)
        self.db.commit()
        return True

    def copy_as_new(self, source_oid: str, target: TbRole) -> TbRole:
        source = self.roles.get(source_oid) if source_oid else None
        if source is None:
            raise ValueError("data no exist!")
        target.description = (target.description or "")[:500]
        if self.roles.find_by_role(target.role):
            raise ValueError("data is exist!")
        now, user = self._now(), self._user_id()
        target.oid, target.cuserid, target.cdate = str(uuid4()), user, now
        self.db.add(target)
        for permission in self.permissions.find(role=source.role):
            self.db.add(TbRolePermission(
                oid=str(uuid4()), role=target.role, permission=permission.permission,
                perm_type=permission.perm_type, description=permission.description,
                cuserid=user, cdate=now))
        for menu_role in self.db.scalars(select(TbSysMenuRole).where(
                TbSysMenuRole.role == source.role)).all():
            self.db.add(TbSysMenuRole(
                oid=str(uuid4()), prog_id=menu_role.prog_id, role=target.role,
                cuserid=user, cdate=now))
        self.db.commit()
        self.db.refresh(target)
        return target
