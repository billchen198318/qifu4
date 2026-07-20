from datetime import datetime
from typing import Any

from pydantic import BaseModel, ConfigDict, Field
from app.common.pagination import PageOf


class ReportPayload(BaseModel):
    oid: str = ""
    report_id: str = Field(default="", alias="reportId")
    file: str = ""
    is_compile: str = Field(default="N", alias="isCompile")
    description: str = ""
    upload_base64: str = Field(default="", alias="uploadBase64")
    model_config = ConfigDict(populate_by_name=True)


class ReportView(ReportPayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None
    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class ReportParamPayload(BaseModel):
    oid: str = ""
    report_id: str = Field(default="", alias="reportId")
    url_param: str = Field(default="", alias="urlParam")
    rpt_param: str = Field(default="", alias="rptParam")
    model_config = ConfigDict(populate_by_name=True)


class ReportParamView(ReportParamPayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None
    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class ReportSearchBody(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")
    model_config = ConfigDict(populate_by_name=True)
