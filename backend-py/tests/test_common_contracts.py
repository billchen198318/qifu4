from app.common.pagination import PageOf
from app.common.result import DefaultControllerJsonResultObj, QueryControllerJsonResultObj


def test_java_controller_result_field_names() -> None:
    result = DefaultControllerJsonResultObj(value={"id": "1"}, success="Y")
    assert result.model_dump(by_alias=True) == {
        "value": {"id": "1"},
        "success": "Y",
        "message": "",
        "login": "N",
        "isAuth": "N",
        "checkFields": {},
    }
    query = QueryControllerJsonResultObj(pageOfCountSize=5)
    assert query.model_dump(by_alias=True)["pageOfCountSize"] == 5


def test_java_page_of_validation_and_calculation() -> None:
    page = PageOf(showRow="25", select="2000000", orderBy=" name; -- ", sortType="invalid", countSize="31")
    assert page.show_row == "10"
    assert page.select == "1"
    assert page.order_by == "name"
    assert page.sort_type == "ASC"
    page.calculate_size()
    assert page.size == "4"
    assert page.offset == 0
