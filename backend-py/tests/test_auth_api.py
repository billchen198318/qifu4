from datetime import datetime, timedelta, timezone

from fastapi.testclient import TestClient

from app.api.auth import get_auth_service
from app.config.settings import Settings
from app.domain.account.schemas import AuthUser
from app.main import create_app
from app.security.jwt import TokenPair


def pair() -> TokenPair:
    now = datetime.now(timezone.utc)
    return TokenPair(access="raw-access", refresh="raw-refresh",
                     access_expires_at=now + timedelta(minutes=25),
                     refresh_expires_at=now + timedelta(minutes=40))


class FakeAuthService:
    def signin(self, username: str, password: str):
        return AuthUser(userId=username, username=username, onJob="Y",
                        accessToken="Y", refreshToken="Y"), pair()

    def validate(self, access: str, refresh: str):
        return AuthUser(userId="admin", username="admin", onJob="Y",
                        accessToken="Y", refreshToken="Y")

    def refresh(self, refresh: str, username: str = ""):
        return (username or "admin", pair())


def make_client() -> tuple[TestClient, Settings]:
    settings = Settings(jwt_secret_key="test-secret", cookie_secure=True)
    app = create_app(settings)
    app.dependency_overrides[get_auth_service] = FakeAuthService
    return TestClient(app), settings


def test_signin_masks_body_tokens_and_sets_raw_httponly_cookies() -> None:
    client, settings = make_client()
    response = client.post("/api/auth/signin", json={"username": "admin", "password": "secret"})
    assert response.status_code == 200
    assert response.json()["accessToken"] == "Y"
    assert response.json()["refreshToken"] == "Y"
    cookies = response.headers.get_list("set-cookie")
    assert any(f"{settings.access_token_cookie_name}=raw-access" in item and "HttpOnly" in item for item in cookies)


def test_refresh_requires_csrf_and_returns_java_shape() -> None:
    client, settings = make_client()
    denied = client.post("/api/auth/refreshNewToken", json={"refreshToken": "raw-refresh"})
    assert denied.status_code == 403
    client.cookies.set(settings.csrf_cookie_name, "csrf")
    response = client.post("/api/auth/refreshNewToken", json={"refreshToken": "raw-refresh"},
                           headers={settings.csrf_header_name: "csrf"})
    assert response.status_code == 200
    assert response.json() == {"username": "admin", "password": "", "refreshToken": "Y", "accessToken": "Y"}


def test_logout_returns_plain_ok_and_clears_cookies() -> None:
    client, _settings = make_client()
    response = client.post("/api/auth/logout")
    assert response.status_code == 200
    assert response.json() == "OK"
    assert len(response.headers.get_list("set-cookie")) == 2
