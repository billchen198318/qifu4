from pydantic import BaseModel, ConfigDict, Field


class MenuChild(BaseModel):
    id: str
    type: str
    name: str
    icon: str
    url: str


class MenuItem(BaseModel):
    id: str
    type: str
    name: str
    icon: str
    items: list[MenuChild] = Field(default_factory=list)


class ProgramItem(BaseModel):
    prog_id: str = Field(alias="progId")
    name: str
    url: str
    edit_mode: str = Field(alias="editMode")
    is_dialog: str = Field(alias="isDialog")
    dialog_w: int = Field(alias="dialogW")
    dialog_h: int = Field(alias="dialogH")
    prog_system: str = Field(alias="progSystem")
    item_type: str = Field(alias="itemType")
    icon: str
    font_icon_class_id: str = Field(alias="fontIconClassId")

    model_config = ConfigDict(populate_by_name=True, from_attributes=True)


class ProgramAndMenuResult(BaseModel):
    menu_list: list[MenuItem] = Field(default_factory=list, alias="menuList")
    program_list: list[ProgramItem] = Field(default_factory=list, alias="programList")

    model_config = ConfigDict(populate_by_name=True)
