from pydantic import BaseModel, ConfigDict, Field


class LoginRequest(BaseModel):
    username: str = ""
    password: str = ""
    refresh_token: str = Field(default="", alias="refreshToken")
    access_token: str = Field(default="", alias="accessToken")

    model_config = ConfigDict(populate_by_name=True)


class RolePermission(BaseModel):
    permission: str
    type: str


class UserRole(BaseModel):
    role: str
    role_permission: list[RolePermission] = Field(default_factory=list, alias="rolePermission")

    model_config = ConfigDict(populate_by_name=True)


class AuthUser(BaseModel):
    user_id: str = Field(default="", alias="userId")
    access_token: str = Field(default="", alias="accessToken")
    refresh_token: str = Field(default="", alias="refreshToken")
    username: str = ""
    password: str = ""
    roles: list[UserRole] = Field(default_factory=list)
    on_job: str = Field(default="N", alias="onJob")
    by_ldap: str = Field(default="N", alias="byLdap")

    model_config = ConfigDict(populate_by_name=True)
