from dataclasses import dataclass

from sqlalchemy import func, select
from sqlalchemy.orm import Session

from app.db.repository import Repository
from app.domain.navigation.models import TbSys, TbSysMenu, TbSysMenuRole, TbSysProg
from app.domain.permission.models import TbRolePermission
from app.domain.role.models import TbUserRole


@dataclass(frozen=True)
class MenuRow:
    oid: str
    prog_id: str
    parent_oid: str
    enable_flag: str
    name: str
    url: str
    prog_system: str
    item_type: str
    icon: str
    font_icon_class_id: str


class SystemRepository(Repository[TbSys]):
    model = TbSys

    def find_by_sys_id(self, sys_id: str) -> TbSys | None:
        return self.db.execute(select(TbSys).where(TbSys.sys_id == sys_id)).scalar_one_or_none()

    def find_page(self, sys_id: str = "", name_like: str = "", *, offset: int = 0,
                  limit: int = 10) -> tuple[list[TbSys], int]:
        conditions = []
        if sys_id:
            conditions.append(TbSys.sys_id == sys_id)
        if name_like:
            conditions.append(TbSys.name.like(f"%{name_like}%"))
        base = select(TbSys).where(*conditions)
        count = int(self.db.scalar(select(func.count()).select_from(TbSys).where(*conditions)) or 0)
        rows = list(self.db.scalars(base.order_by(TbSys.sys_id.asc()).offset(offset).limit(limit)).all())
        return rows, count


class ProgramRepository(Repository[TbSysProg]):
    model = TbSysProg

    def count_by_system(self, system_id: str) -> int:
        return int(self.db.scalar(select(func.count()).select_from(TbSysProg).where(
            TbSysProg.prog_system == system_id)) or 0)

    def find_by_prog_id(self, prog_id: str) -> TbSysProg | None:
        return self.db.execute(select(TbSysProg).where(
            TbSysProg.prog_id == prog_id)).scalar_one_or_none()

    def find_page(self, prog_id: str = "", name_like: str = "", *, offset: int = 0,
                  limit: int = 10) -> tuple[list[TbSysProg], int]:
        conditions = []
        if prog_id:
            conditions.append(TbSysProg.prog_id == prog_id)
        if name_like:
            conditions.append(TbSysProg.name.like(f"%{name_like}%"))
        count = int(self.db.scalar(select(func.count()).select_from(TbSysProg).where(
            *conditions)) or 0)
        rows = list(self.db.scalars(select(TbSysProg).where(*conditions).order_by(
            TbSysProg.prog_id.asc()).offset(offset).limit(limit)).all())
        return rows, count

    def find_by_item_type(self, item_type: str) -> list[TbSysProg]:
        return list(self.db.scalars(select(TbSysProg).where(
            TbSysProg.item_type == item_type).order_by(TbSysProg.prog_id.asc())).all())

    def find_by_system(self, system_id: str) -> list[TbSysProg]:
        return list(self.db.scalars(select(TbSysProg).where(
            TbSysProg.prog_system == system_id).order_by(TbSysProg.prog_id.asc())).all())

    def find_enabled_items(self, system_id: str, parent_oid: str) -> list[TbSysProg]:
        return list(self.db.scalars(select(TbSysProg).where(
            TbSysProg.prog_system == system_id,
            TbSysProg.item_type == "ITEM",
            TbSysProg.prog_id.in_(select(TbSysMenu.prog_id).where(
                TbSysMenu.parent_oid == parent_oid)),
            TbSysProg.edit_mode == "N",
        ).order_by(TbSysProg.prog_id.asc())).all())

    def find_menu_programs(self, system_id: str) -> list[TbSysProg]:
        return list(self.db.scalars(select(TbSysProg).where(
            TbSysProg.prog_id.in_(select(TbSysMenu.prog_id)),
            TbSysProg.edit_mode == "N",
            TbSysProg.prog_system == system_id,
        ).order_by(TbSysProg.prog_id.asc())).all())

    def find_items_for_user(self, account: str = "") -> list[TbSysProg]:
        statement = select(TbSysProg).where(TbSysProg.item_type == "ITEM")
        if account:
            permitted = select(TbRolePermission.permission).where(
                TbRolePermission.perm_type == "CONTROLLER",
                TbRolePermission.role.in_(select(TbUserRole.role).where(TbUserRole.account == account)))
            statement = statement.where(TbSysProg.prog_id.in_(permitted))
        return list(self.db.scalars(statement.order_by(TbSysProg.prog_id)).all())


class MenuRepository(Repository[TbSysMenu]):
    model = TbSysMenu

    def count_by_prog_id(self, prog_id: str) -> int:
        return int(self.db.scalar(select(func.count()).select_from(TbSysMenu).where(
            TbSysMenu.prog_id == prog_id)) or 0)

    def find_root(self, prog_id: str) -> TbSysMenu | None:
        return self.db.execute(select(TbSysMenu).where(
            TbSysMenu.prog_id == prog_id,
            TbSysMenu.parent_oid == "00000000-0000-0000-0000-000000000000",
        )).scalar_one_or_none()

    def delete_children(self, parent_oid: str) -> int:
        rows = list(self.db.scalars(select(TbSysMenu).where(
            TbSysMenu.parent_oid == parent_oid)).all())
        for row in rows:
            self.db.delete(row)
        return len(rows)

    def find_for_generator(self, prog_system: str, account: str = "") -> list[MenuRow]:
        statement = select(
            TbSysMenu.oid, TbSysMenu.prog_id, TbSysMenu.parent_oid, TbSysMenu.enable_flag,
            TbSysProg.name, TbSysProg.url, TbSysProg.prog_system, TbSysProg.item_type,
            TbSysProg.icon, TbSysProg.font_icon_class_id,
        ).join(TbSysProg, TbSysMenu.prog_id == TbSysProg.prog_id).where(
            TbSysProg.prog_system == prog_system)
        if account:
            permitted = select(TbSysMenuRole.prog_id).where(
                TbSysMenuRole.role.in_(select(TbUserRole.role).where(TbUserRole.account == account)))
            statement = statement.where(TbSysMenu.prog_id.in_(permitted))
        rows = self.db.execute(statement.order_by(TbSysProg.name)).all()
        return [MenuRow(*row) for row in rows]


class MenuRoleRepository(Repository[TbSysMenuRole]):
    model = TbSysMenuRole

    def delete_by_prog_id(self, prog_id: str) -> int:
        rows = list(self.db.scalars(select(TbSysMenuRole).where(
            TbSysMenuRole.prog_id == prog_id)).all())
        for row in rows:
            self.db.delete(row)
        return len(rows)
