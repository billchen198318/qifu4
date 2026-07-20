from fastapi import FastAPI, Request
from fastapi.testclient import TestClient

from app.config.settings import Settings
from app.security.cookies import clear_auth_cookies, set_auth_cookies
from app.security.csrf import generate_csrf_token, set_csrf_cookie, validate_csrf_request
from app.security.jwt import USER_ID_CLAIM, create_token_pair, verify_access_token
from app.security.password import hash_password, verify_password


def test_password_hash_and_verify() -> None:
    hashed = hash_password("secret")

    assert verify_password("secret", hashed)
    assert not verify_password("wrong", hashed)


def test_create_and_verify_access_token() -> None:
    settings = Settings(jwt_secret_key="test-secret")

    pair = create_token_pair("admin", "qifu4", settings)
    payload = verify_access_token(pair.access, settings, audience="qifu4")

    assert payload[USER_ID_CLAIM] == "admin"
    assert payload["iss"] == "QIFU4Application"
    assert pair.refresh
    assert pair.refresh != pair.access
    assert pair.refresh_expires_at > pair.access_expires_at


def test_auth_cookies_are_httponly_and_java_compatible_names() -> None:
    app = FastAPI()
    settings = Settings(jwt_secret_key="test-secret", cookie_secure=True)

    @app.post("/login")
    def login():
        from fastapi import Response

        response = Response(status_code=204)
        set_auth_cookies(response, "access-token", "refresh-token", settings)
        return response

    response = TestClient(app).post("/login")
    set_cookie = response.headers.get_list("set-cookie")

    assert any("QIFU4VNX__uat=access-token" in value and "HttpOnly" in value for value in set_cookie)
    assert any("QIFU4VNX__urt=refresh-token" in value and "HttpOnly" in value for value in set_cookie)
    assert all("SameSite=lax" in value for value in set_cookie)


def test_clear_auth_cookies_expires_both_tokens() -> None:
    app = FastAPI()
    settings = Settings(jwt_secret_key="test-secret")

    @app.post("/logout")
    def logout():
        from fastapi import Response

        response = Response(status_code=204)
        clear_auth_cookies(response, settings)
        return response

    response = TestClient(app).post("/logout")
    set_cookie = response.headers.get_list("set-cookie")

    assert any("QIFU4VNX__uat=\"\"" in value and "Max-Age=0" in value for value in set_cookie)
    assert any("QIFU4VNX__urt=\"\"" in value and "Max-Age=0" in value for value in set_cookie)


def test_csrf_cookie_and_header_double_submit() -> None:
    app = FastAPI()
    settings = Settings(jwt_secret_key="test-secret")

    @app.get("/csrf")
    def csrf():
        from fastapi import Response

        response = Response(status_code=204)
        set_csrf_cookie(response, "csrf-token", settings)
        return response

    @app.post("/mutate")
    def mutate(request: Request):
        validate_csrf_request(request, settings)
        return {"ok": True}

    client = TestClient(app)
    response = client.get("/csrf")

    assert response.headers[settings.csrf_header_name] == "csrf-token"
    assert "HttpOnly" not in response.headers["set-cookie"]

    ok = client.post("/mutate", headers={settings.csrf_header_name: "csrf-token"})
    assert ok.status_code == 200

    failed = client.post("/mutate", headers={settings.csrf_header_name: "wrong"})
    assert failed.status_code == 403

