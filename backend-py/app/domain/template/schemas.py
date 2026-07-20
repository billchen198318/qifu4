from datetime import datetime
from typing import Any

from pydantic import BaseModel, ConfigDict, Field

from app.common.pagination import PageOf


class TemplatePayload(BaseModel):
    oid: str = ""
    template_id: str = Field(default="", alias="templateId")
    title: str = ""
    message: str = ""
    description: str = ""

    model_config = ConfigDict(populate_by_name=True)


class TemplateView(TemplatePayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None

    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class TemplateParamPayload(BaseModel):
    oid: str = ""
    template_id: str = Field(default="", alias="templateId")
    is_title: str = Field(default="", alias="isTitle")
    template_var: str = Field(default="", alias="templateVar")
    object_var: str = Field(default="", alias="objectVar")

    model_config = ConfigDict(populate_by_name=True)


class TemplateParamView(TemplateParamPayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None

    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class TemplateSearchBody(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")

    model_config = ConfigDict(populate_by_name=True)
