from sqlalchemy.orm import Session

from app.db.service import CrudService
from app.domain.template.models import TbSysTemplate, TbSysTemplateParam
from app.domain.template.repository import TemplateParamRepository, TemplateRepository

USED_TEMPLATE_IDS = {"TPLMSG0001", "TPLMSG0002", "TPLMSG0003"}


class TemplateService(CrudService[TbSysTemplate]):
    def __init__(self, db: Session) -> None:
        self.templates = TemplateRepository(db)
        self.params = TemplateParamRepository(db)
        super().__init__(db, self.templates)

    @staticmethod
    def check_message(message: str) -> None:
        if len(message or "") > 4000:
            raise ValueError("Content max only 4000 words!")

    def update_checked(self, model: TbSysTemplate) -> TbSysTemplate:
        if not model.oid:
            raise ValueError("parameter cann't blank!")
        old = self.templates.get(model.oid)
        if old is None:
            raise ValueError("data no exist!")
        self.check_message(model.message)
        model.template_id = old.template_id
        model.cuserid, model.cdate = old.cuserid, old.cdate
        return self.update(model)

    def delete_checked(self, oid: str) -> bool:
        if not oid:
            raise ValueError("parameter cann't blank!")
        old = self.templates.get(oid)
        if old is None:
            raise ValueError("data no exist!")
        if old.template_id in USED_TEMPLATE_IDS:
            raise ValueError("Data to be used, and can not be deleted!")
        self.params.delete_by_template_id(old.template_id)
        deleted = self.templates.delete_by_oid(oid)
        self.db.commit()
        return deleted


class TemplateParamService(CrudService[TbSysTemplateParam]):
    def __init__(self, db: Session) -> None:
        super().__init__(db, TemplateParamRepository(db))
