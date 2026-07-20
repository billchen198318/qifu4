from sqlalchemy.orm import Session
from uuid import uuid4

from app.db.service import CrudService
from app.domain.navigation.models import TbSysMenu
from app.domain.navigation.repository import MenuRepository, ProgramRepository

ROOT_OID = "00000000-0000-0000-0000-000000000000"


class MenuSettingsService(CrudService[TbSysMenu]):
    def __init__(self, db: Session) -> None:
        self.programs = ProgramRepository(db)
        self.menus = MenuRepository(db)
        super().__init__(db, self.menus)

    def enabled_and_all(self, folder_oid: str) -> dict[str, list]:
        if not folder_oid:
            raise ValueError("parameter cann't blank!")
        folder = self.programs.get(folder_oid)
        if folder is None:
            raise ValueError("data no exist!")
        root = self.menus.find_root(folder.prog_id)
        enabled = [] if root is None else self.programs.find_enabled_items(
            folder.prog_system, root.oid)
        return {"enable": enabled, "all": self.programs.find_by_system(folder.prog_system)}

    def create_or_update(self, folder_oid: str, child_oids: list[str]) -> bool:
        if not folder_oid:
            raise ValueError("parameter cann't blank!")
        folder = self.programs.get(folder_oid)
        if folder is None:
            raise ValueError("data no exist!")
        children = []
        for oid in child_oids:
            child = self.programs.get(oid)
            if child is None:
                raise ValueError("data no exist!")
            if child.prog_id == "CORE_PROG999D9999Q":
                raise ValueError("The program - CORE_PROG999D9999Q cannot settings.")
            children.append(child)
        root = self.menus.find_root(folder.prog_id)
        if root is None:
            root = TbSysMenu(
                oid=str(uuid4()), prog_id=folder.prog_id, parent_oid=ROOT_OID,
                enable_flag="Y", cuserid=self._user_id(), cdate=self._now())
            self.menus.add(root)
            self.db.flush()
        self.menus.delete_children(root.oid)
        for child in children:
            model = TbSysMenu(oid="", prog_id=child.prog_id, parent_oid=root.oid,
                              enable_flag="Y", cuserid="", cdate=self._now())
            now, user_id = self._now(), self._user_id()
            model.oid = str(uuid4())
            model.cuserid, model.cdate = user_id, now
            self.menus.add(model)
        self.db.commit()
        return True
