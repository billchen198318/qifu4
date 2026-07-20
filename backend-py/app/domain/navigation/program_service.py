from sqlalchemy.orm import Session

from app.db.service import CrudService
from app.domain.navigation.models import TbSysProg
from app.domain.navigation.repository import MenuRepository, MenuRoleRepository, ProgramRepository


class SystemProgramService(CrudService[TbSysProg]):
    def __init__(self, db: Session) -> None:
        self.programs = ProgramRepository(db)
        self.menus = MenuRepository(db)
        self.menu_roles = MenuRoleRepository(db)
        super().__init__(db, self.programs)

    def delete_checked(self, oid: str) -> bool:
        if not oid:
            raise ValueError("parameter cann't blank!")
        program = self.programs.get(oid)
        if program is None:
            raise ValueError("data no exist!")
        if self.menus.count_by_prog_id(program.prog_id) > 0:
            raise ValueError("Data to be used, and can not be deleted!")
        self.menu_roles.delete_by_prog_id(program.prog_id)
        deleted = self.programs.delete_by_oid(oid)
        self.db.commit()
        return deleted
