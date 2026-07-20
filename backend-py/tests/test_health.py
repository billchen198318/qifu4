from fastapi.testclient import TestClient

from app.main import create_app


def test_health_returns_up() -> None:
    client = TestClient(create_app())

    response = client.get("/health")

    assert response.status_code == 200
    assert response.json() == {
        "isAuth": "N",
        "success": "Y",
        "message": "",
        "value": {"status": "UP"},
    }
