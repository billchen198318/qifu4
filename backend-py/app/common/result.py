from typing import Generic, TypeVar

from pydantic import BaseModel, ConfigDict, Field

from app.common.constants import FAIL_CODE, NO, SUCCESS_CODE

T = TypeVar("T")


class DefaultResult(BaseModel, Generic[T]):
    is_auth: str = Field(default=NO, alias="isAuth")
    success: str = FAIL_CODE
    message: str = ""
    value: T | None = None

    model_config = ConfigDict(populate_by_name=True)

    @classmethod
    def ok(cls, value: T | None = None, message: str = "") -> "DefaultResult[T]":
        return cls(success=SUCCESS_CODE, message=message, value=value)

    @classmethod
    def fail(cls, message: str, value: T | None = None) -> "DefaultResult[T]":
        return cls(success=FAIL_CODE, message=message, value=value)


class DefaultControllerJsonResultObj(BaseModel, Generic[T]):
    value: T | None = None
    success: str = FAIL_CODE
    message: str = ""
    login: str = NO
    is_auth: str = Field(default=NO, alias="isAuth")
    check_fields: dict[str, str] = Field(default_factory=dict, alias="checkFields")

    model_config = ConfigDict(populate_by_name=True)


class QueryControllerJsonResultObj(DefaultControllerJsonResultObj[T], Generic[T]):
    page_of_show_row: int = Field(default=10, alias="pageOfShowRow")
    page_of_select: int = Field(default=1, alias="pageOfSelect")
    page_of_count_size: int = Field(default=0, alias="pageOfCountSize")
    page_of_size: int = Field(default=1, alias="pageOfSize")
