from datetime import datetime
from typing import Any

from pydantic import BaseModel, ConfigDict, Field

from app.common.pagination import PageOf


class ProgramPayload(BaseModel):
    oid: str = ""
    prog_id: str = Field(default="", alias="progId")
    name: str = ""
    url: str = ""
    edit_mode: str = Field(default="N", alias="editMode")
    is_dialog: str = Field(default="N", alias="isDialog")
    dialog_w: int | None = Field(default=0, alias="dialogW")
    dialog_h: int | None = Field(default=0, alias="dialogH")
    prog_system: str = Field(default="", alias="progSystem")
    item_type: str = Field(default="", alias="itemType")
    icon: str = ""
    font_icon_class_id: str = Field(default="", alias="fontIconClassId")

    model_config = ConfigDict(populate_by_name=True)


class ProgramView(ProgramPayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None

    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class ProgramSearchBody(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")

    model_config = ConfigDict(populate_by_name=True)
