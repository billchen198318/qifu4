from fastapi import APIRouter, Depends, HTTPException, Request, Response, status
from sqlalchemy.orm import Session

from app.config.settings import Settings, get_settings
from app.db.session import get_db_session
from app.domain.account.schemas import AuthUser, LoginRequest
from app.domain.account.service import AuthenticationError, AuthService
from app.security.cookies import clear_auth_cookies, set_auth_cookies
from app.security.csrf import validate_csrf_request

router = APIRouter(prefix="/api/auth", tags=["auth"])


def get_auth_service(
    db: Session = Depends(get_db_session),
    settings: Settings = Depends(get_settings),
) -> AuthService:
    return AuthService(db, settings)


def cookie_or_body(request: Request, value: str, cookie_name: str) -> str:
    return request.cookies.get(cookie_name, "") if not value.strip() or value == "Y" else value


@router.post("/signin", response_model=AuthUser, response_model_by_alias=True)
def signin(
    body: LoginRequest,
    response: Response,
    service: AuthService = Depends(get_auth_service),
    settings: Settings = Depends(get_settings),
) -> AuthUser:
    try:
        user, pair = service.signin(body.username, body.password)
    except AuthenticationError as exc:
        raise HTTPException(status_code=status.HTTP_401_UNAUTHORIZED, detail=str(exc)) from exc
    set_auth_cookies(response, pair.access, pair.refresh, settings)
    return user


@router.post("/validLogined", response_model=AuthUser, response_model_by_alias=True)
def valid_logined(
    body: LoginRequest,
    request: Request,
    service: AuthService = Depends(get_auth_service),
    settings: Settings = Depends(get_settings),
) -> AuthUser:
    access = cookie_or_body(request, body.access_token, settings.access_token_cookie_name)
    refresh = cookie_or_body(request, body.refresh_token, settings.refresh_token_cookie_name)
    user = service.validate(access, refresh) if access and refresh else None
    return user or AuthUser()


@router.post("/refreshNewToken", response_model=LoginRequest, response_model_by_alias=True)
def refresh_new_token(
    body: LoginRequest,
    request: Request,
    response: Response,
    service: AuthService = Depends(get_auth_service),
    settings: Settings = Depends(get_settings),
) -> LoginRequest:
    validate_csrf_request(request, settings)
    refresh = cookie_or_body(request, body.refresh_token, settings.refresh_token_cookie_name)
    refreshed = service.refresh(refresh, body.username) if refresh else None
    if refreshed is None:
        raise HTTPException(status_code=status.HTTP_401_UNAUTHORIZED, detail="Token refresh failed")
    username, pair = refreshed
    set_auth_cookies(response, pair.access, pair.refresh, settings)
    return LoginRequest(username=username, accessToken="Y", refreshToken="Y")


@router.post("/logout")
def logout(response: Response, settings: Settings = Depends(get_settings)) -> str:
    clear_auth_cookies(response, settings)
    return "OK"
