from fastapi.testclient import TestClient
from app.common.context import UserContext
from app.config.settings import Settings, get_settings
from app.main import create_app
from app.security.dependencies import get_request_user


def client() -> TestClient:
    settings = Settings(
        jwt_secret_key="test-secret", mqtt_broker_enable=True,
        mqtt_broker_host="10.0.0.5", mqtt_broker_port="1884")
    app = create_app(settings)
    app.dependency_overrides[get_settings] = lambda: settings
    app.dependency_overrides[get_request_user] = lambda: UserContext(account="admin", roles=("admin",))
    return TestClient(app)


def test_mqtt_dashboard_fails_closed_without_runtime() -> None:
    response = client().post("/api/PROG005D0001/findPage", json={
        "field": {}, "pageOf": {"select": 1, "showRow": 1000}}).json()
    assert response["success"] == "Y"
    assert response["pageOf"] is None
    assert response["value"] == {
        "host": "10.0.0.5", "port": "1884", "enable": False,
        "clientSize": 0, "clients": []}


def test_mqtt_monitoring_lists_are_empty_without_interceptor() -> None:
    api = client()
    topics = api.post("/api/PROG005D0001/findTopics", json={"field": {}}).json()
    messages = api.post("/api/PROG005D0001/findMessages",
                        json={"field": {"topic": "demo/topic"}}).json()
    assert topics["success"] == "Y" and topics["value"] == []
    assert messages["success"] == "Y" and messages["value"] == []
