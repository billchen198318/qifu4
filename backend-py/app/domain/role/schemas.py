from datetime import datetime
from typing import Any
from pydantic import BaseModel, ConfigDict, Field
from app.common.pagination import PageOf


class RolePayload(BaseModel):
    oid: str = ""
    role: str = ""
    description: str = ""
    from_role_oid: str = Field(default="", alias="fromRoleOid")
    model_config = ConfigDict(populate_by_name=True)


class RoleView(RolePayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None
    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class PermissionPayload(BaseModel):
    oid: str = ""
    role: str = ""
    permission: str = ""
    perm_type: str = Field(default="", alias="permType")
    description: str = ""
    model_config = ConfigDict(populate_by_name=True)


class PermissionView(PermissionPayload):
    cuserid: str = ""
    cdate: datetime | None = None
    uuserid: str | None = None
    udate: datetime | None = None
    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class RoleSearchBody(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    page_of: PageOf = Field(default_factory=PageOf, alias="pageOf")
    model_config = ConfigDict(populate_by_name=True)
