from sqlalchemy import func, select
from app.db.repository import Repository
from app.domain.report.models import TbSysJreport, TbSysJreportParam


class ReportRepository(Repository[TbSysJreport]):
    model = TbSysJreport

    def find_page(self, report_id: str, offset: int, limit: int):
        conditions = [] if not report_id else [TbSysJreport.report_id == report_id]
        count = int(self.db.scalar(select(func.count()).select_from(TbSysJreport).where(*conditions)) or 0)
        rows = list(self.db.scalars(select(TbSysJreport).where(*conditions).order_by(
            TbSysJreport.report_id).offset(offset).limit(limit)).all())
        return rows, count


class ReportParamRepository(Repository[TbSysJreportParam]):
    model = TbSysJreportParam

    def find_page(self, report_id: str, offset: int, limit: int):
        condition = TbSysJreportParam.report_id == report_id
        count = int(self.db.scalar(select(func.count()).select_from(TbSysJreportParam).where(condition)) or 0)
        rows = list(self.db.scalars(select(TbSysJreportParam).where(condition).order_by(
            TbSysJreportParam.rpt_param).offset(offset).limit(limit)).all())
        return rows, count

    def delete_for_report(self, report_id: str) -> None:
        for row in self.db.scalars(select(TbSysJreportParam).where(
                TbSysJreportParam.report_id == report_id)).all():
            self.db.delete(row)
