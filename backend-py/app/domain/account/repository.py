from sqlalchemy import select
from sqlalchemy.orm import Session

from app.db.repository import Repository
from app.domain.account.models import TbAccount


class AccountRepository(Repository[TbAccount]):
    model = TbAccount

    def __init__(self, db: Session) -> None:
        super().__init__(db)

    def find_by_account(self, account: str) -> TbAccount | None:
        statement = select(TbAccount).where(TbAccount.account == account)
        return self.db.execute(statement).scalar_one_or_none()

    def find(self, account: str = "", on_job: str = "") -> list[TbAccount]:
        statement = select(TbAccount)
        if account:
            statement = statement.where(TbAccount.account == account)
        if on_job:
            statement = statement.where(TbAccount.on_job == on_job)
        return list(self.db.scalars(statement.order_by(TbAccount.account)).all())
