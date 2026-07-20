from datetime import datetime
from typing import Any

from pydantic import BaseModel, ConfigDict, Field

from app.common.pagination import PageOf


class SystemPayload(BaseModel):
    oid: str = ""
    sys_id: str = Field(default="", alias="sysId")
    name: str = ""
    host: str = ""
    context_path: str = Field(default="", alias="contextPath")
    is_local: str = Field(default="Y", alias="isLocal")
    icon: str = " "

    model_config = ConfigDict(populate_by_name=True)


class SystemView(SystemPayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None

    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class SystemSearchBody(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")

    model_config = ConfigDict(populate_by_name=True)
