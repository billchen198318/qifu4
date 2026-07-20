from sqlalchemy.orm import Session

from app.domain.navigation.repository import MenuRepository, ProgramRepository
from app.domain.navigation.schemas import MenuChild, MenuItem, ProgramAndMenuResult, ProgramItem


class NavigationService:
    def __init__(self, db: Session, main_system: str) -> None:
        self.menus = MenuRepository(db)
        self.programs = ProgramRepository(db)
        self.main_system = main_system

    def get_menu_and_programs(self, account: str, is_admin: bool) -> ProgramAndMenuResult:
        rows = self.menus.find_for_generator(self.main_system, "" if is_admin else account)
        folders = [row for row in rows if row.item_type == "FOLDER" and row.enable_flag == "Y"]
        menu_list = []
        for folder in folders:
            children = [row for row in rows if row.item_type == "ITEM" and row.enable_flag == "Y"
                        and row.parent_oid == folder.oid]
            if not children:
                continue
            menu_list.append(MenuItem(
                id=folder.prog_id, type=folder.item_type, name=folder.name,
                icon=folder.font_icon_class_id,
                items=[MenuChild(id=item.prog_id, type=item.item_type, name=item.name,
                                 icon=item.font_icon_class_id, url=item.url) for item in children],
            ))
        programs = [ProgramItem.model_validate(item) for item in self.programs.find_items_for_user("")]
        return ProgramAndMenuResult(menuList=menu_list, programList=programs)
