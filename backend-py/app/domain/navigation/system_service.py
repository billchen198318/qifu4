from sqlalchemy.orm import Session

from app.db.service import CrudService
from app.domain.navigation.models import TbSys
from app.domain.navigation.repository import ProgramRepository, SystemRepository


class ApplicationSystemService(CrudService[TbSys]):
    def __init__(self, db: Session) -> None:
        self.systems = SystemRepository(db)
        self.programs = ProgramRepository(db)
        super().__init__(db, self.systems)

    def delete_checked(self, oid: str) -> bool:
        if not oid:
            raise ValueError("parameter cann't blank!")
        system = self.systems.get(oid)
        if system is None:
            raise ValueError("data no exist!")
        if self.programs.count_by_system(system.sys_id) > 0:
            raise ValueError("Data to be used, and can not be deleted!")
        return self.delete(oid)
