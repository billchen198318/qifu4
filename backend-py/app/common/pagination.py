from typing import Generic, TypeVar

from pydantic import BaseModel, ConfigDict, Field, field_validator

from app.common.constants import DEFAULT_PAGE_SIZE, PAGE_SIZE_OPTIONS

T = TypeVar("T")


class PageOf(BaseModel):
    count_size: str = Field(default="0", alias="countSize")
    show_row: str = Field(default=str(DEFAULT_PAGE_SIZE), alias="showRow")
    size: str = "1"
    select: str = "1"
    order_by: str = Field(default="", alias="orderBy")
    sort_type: str = Field(default="", alias="sortType")

    model_config = ConfigDict(populate_by_name=True)

    @field_validator("show_row", mode="before")
    @classmethod
    def validate_show_row(cls, value: object) -> str:
        try:
            parsed = int(value)
        except (TypeError, ValueError):
            return str(DEFAULT_PAGE_SIZE)
        return str(parsed) if parsed in PAGE_SIZE_OPTIONS else str(DEFAULT_PAGE_SIZE)

    @field_validator("select", mode="before")
    @classmethod
    def validate_select(cls, value: object) -> str:
        try:
            parsed = int(value)
        except (TypeError, ValueError):
            return "1"
        return str(parsed) if 1 <= parsed <= 1_000_000 else "1"

    @field_validator("order_by")
    @classmethod
    def sanitize_order_by(cls, value: str | None) -> str:
        value = value or ""
        for character in (" ", "\r", "\t", "\n", ";", chr(39), "-"):
            value = value.replace(character, "")
        return value

    @field_validator("sort_type")
    @classmethod
    def validate_sort_type(cls, value: str | None) -> str:
        value = (value or "").strip().upper()
        return value if value in {"", "ASC", "DESC"} else "ASC"

    @property
    def offset(self) -> int:
        return (int(self.select) - 1) * int(self.show_row)

    def calculate_size(self, current_start_row: int | None = None) -> None:
        count = max(int(self.count_size or 0), 0)
        rows = int(self.show_row)
        pages = max(1, (count + rows - 1) // rows)
        self.size = str(pages)
        if int(self.select) > pages:
            self.select = "1" if current_start_row == 0 else str(pages)


class QueryResult(BaseModel, Generic[T]):
    page_of: PageOf | None = Field(default=None, alias="pageOf")
    is_auth: str = Field(default="N", alias="isAuth")
    value: T | None = None
    success: str = "N"
    message: str = ""

    model_config = ConfigDict(populate_by_name=True)
