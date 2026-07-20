from enum import StrEnum
from typing import Any

from pydantic import BaseModel, Field


class SortType(StrEnum):
    ASC = "ASC"
    DESC = "DESC"


class SearchValue(BaseModel):
    field: str
    value: Any = None
    operator: str = "eq"


class SearchBody(BaseModel):
    filters: list[SearchValue] = Field(default_factory=list)
    sort_field: str | None = None
    sort_type: SortType = SortType.ASC
