from datetime import datetime, timezone
from typing import Generic, TypeVar
from uuid import uuid4

from sqlalchemy.orm import Session

from app.common.context import get_current_user_context
from app.db.base import Base
from app.db.repository import Repository

ModelT = TypeVar("ModelT", bound=Base)


class CrudService(Generic[ModelT]):
    def __init__(self, db: Session, repository: Repository[ModelT]) -> None:
        self.db, self.repository = db, repository

    @staticmethod
    def _now() -> datetime:
        return datetime.now(timezone.utc).replace(tzinfo=None)

    @staticmethod
    def _user_id() -> str:
        user = get_current_user_context()
        return user.account if user is not None else "system"

    def create(self, model: ModelT) -> ModelT:
        now, user_id = self._now(), self._user_id()
        if hasattr(model, "oid") and not getattr(model, "oid", None):
            model.oid = str(uuid4())
        if hasattr(model, "cuserid"):
            model.cuserid = user_id
        if hasattr(model, "cdate"):
            model.cdate = now
        self.repository.add(model)
        self.db.commit()
        self.db.refresh(model)
        return model

    def update(self, model: ModelT) -> ModelT:
        if hasattr(model, "uuserid"):
            model.uuserid = self._user_id()
        if hasattr(model, "udate"):
            model.udate = self._now()
        merged = self.db.merge(model)
        self.db.commit()
        self.db.refresh(merged)
        return merged

    def delete(self, oid: str) -> bool:
        deleted = self.repository.delete_by_oid(oid)
        self.db.commit()
        return deleted
