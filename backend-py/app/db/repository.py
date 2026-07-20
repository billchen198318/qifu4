from typing import Generic, TypeVar

from sqlalchemy import delete, func, select
from sqlalchemy.orm import Session

from app.db.base import Base

ModelT = TypeVar("ModelT", bound=Base)


class Repository(Generic[ModelT]):
    model: type[ModelT]

    def __init__(self, db: Session) -> None:
        self.db = db

    def get(self, oid: str) -> ModelT | None:
        return self.db.get(self.model, oid)

    def add(self, model: ModelT) -> ModelT:
        self.db.add(model)
        return model

    def list_all(self, *, offset: int = 0, limit: int | None = None) -> list[ModelT]:
        statement = select(self.model).offset(offset)
        if limit is not None:
            statement = statement.limit(limit)
        return list(self.db.scalars(statement).all())

    def count_all(self) -> int:
        return int(self.db.scalar(select(func.count()).select_from(self.model)) or 0)

    def delete_by_oid(self, oid: str) -> bool:
        result = self.db.execute(delete(self.model).where(self.model.oid == oid))
        return bool(result.rowcount)
