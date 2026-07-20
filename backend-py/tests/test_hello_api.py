from fastapi.testclient import TestClient

from app.common.context import UserContext
from app.config.settings import Settings
from app.main import create_app
from app.security.dependencies import get_request_user


def client() -> TestClient:
    app = create_app(Settings(jwt_secret_key="test-secret"))
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app)


def test_delete_play_always_returns_java_no_flag_as_plain_text() -> None:
    response = client().delete("/api/hello/delPlay", params={"key": "value"})
    assert response.status_code == 200
    assert response.text == "N"
    assert response.headers["content-type"].startswith("text/plain")


def test_play_requires_key_and_returns_json_string_value() -> None:
    failed = client().post("/api/hello/play", json={"key": "", "msg": "hello"})
    assert failed.json() == {
        "pageOf": None, "isAuth": "Y", "value": None, "success": "N",
        "message": "parameter cann't blank!",
    }
    success = client().post("/api/hello/play", json={"key": "key", "msg": "hello"})
    assert success.json()["success"] == "Y"
    assert success.json()["value"] == '{"str":"hello"}'


def test_path_variable_matches_java_query_result() -> None:
    response = client().get("/api/hello/testPV/abc")
    assert response.json() == {
        "pageOf": None, "isAuth": "Y", "value": "abc", "success": "Y", "message": "hello.",
    }


def test_hello_requires_authenticated_user() -> None:
    app = create_app(Settings(jwt_secret_key="test-secret"))
    response = TestClient(app).get("/api/hello/testPV/abc")
    assert response.status_code == 401
