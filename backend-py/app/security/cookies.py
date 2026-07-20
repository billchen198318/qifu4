from fastapi import Response

from app.config.settings import Settings, get_settings


def set_token_cookie(response: Response, name: str, value: str, minutes: int, settings: Settings | None = None) -> None:
    settings = settings or get_settings()
    response.set_cookie(
        key=name,
        value=value,
        max_age=minutes * 60,
        path="/",
        httponly=True,
        secure=settings.cookie_secure,
        samesite=settings.cookie_samesite,
    )


def set_auth_cookies(response: Response, access_token: str, refresh_token: str, settings: Settings | None = None) -> None:
    settings = settings or get_settings()
    set_token_cookie(response, settings.access_token_cookie_name, access_token, settings.access_token_expire_minutes, settings)
    set_token_cookie(response, settings.refresh_token_cookie_name, refresh_token, settings.refresh_token_expire_minutes, settings)


def clear_auth_cookies(response: Response, settings: Settings | None = None) -> None:
    settings = settings or get_settings()
    for name in (settings.access_token_cookie_name, settings.refresh_token_cookie_name):
        response.delete_cookie(key=name, path="/", secure=settings.cookie_secure, samesite=settings.cookie_samesite)
