from sqlalchemy.orm import Session

from app.common.exceptions import ServiceException
from app.db.service import CrudService
from app.domain.system.models import TbSysCode
from app.domain.system.repository import SysCodeRepository


class SysCodeCrudService(CrudService[TbSysCode]):
    def __init__(self, db: Session) -> None:
        super().__init__(db, SysCodeRepository(db))

    def create(self, model: TbSysCode) -> TbSysCode:
        if self.repository.find_by_code(model.code):
            raise ServiceException("System code already exists")
        return super().create(model)
