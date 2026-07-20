from sqlalchemy import func, select

from app.db.repository import Repository
from app.domain.template.models import TbSysTemplate, TbSysTemplateParam


class TemplateRepository(Repository[TbSysTemplate]):
    model = TbSysTemplate

    def find_by_template_id(self, template_id: str) -> TbSysTemplate | None:
        return self.db.execute(select(TbSysTemplate).where(
            TbSysTemplate.template_id == template_id)).scalar_one_or_none()

    def find_page(self, template_id: str, title_like: str, offset: int,
                  limit: int) -> tuple[list[TbSysTemplate], int]:
        conditions = []
        if template_id:
            conditions.append(TbSysTemplate.template_id == template_id)
        if title_like:
            conditions.append(TbSysTemplate.title.like(f"%{title_like}%"))
        count = int(self.db.scalar(select(func.count()).select_from(TbSysTemplate).where(
            *conditions)) or 0)
        rows = list(self.db.scalars(select(TbSysTemplate).where(*conditions).order_by(
            TbSysTemplate.template_id).offset(offset).limit(limit)).all())
        return rows, count


class TemplateParamRepository(Repository[TbSysTemplateParam]):
    model = TbSysTemplateParam

    def find_page(self, template_id: str, offset: int,
                  limit: int) -> tuple[list[TbSysTemplateParam], int]:
        condition = TbSysTemplateParam.template_id == template_id
        count = int(self.db.scalar(select(func.count()).select_from(
            TbSysTemplateParam).where(condition)) or 0)
        rows = list(self.db.scalars(select(TbSysTemplateParam).where(condition).order_by(
            TbSysTemplateParam.template_var).offset(offset).limit(limit)).all())
        return rows, count

    def delete_by_template_id(self, template_id: str) -> int:
        rows = list(self.db.scalars(select(TbSysTemplateParam).where(
            TbSysTemplateParam.template_id == template_id)).all())
        for row in rows:
            self.db.delete(row)
        return len(rows)
