from dataclasses import dataclass
from datetime import datetime, timedelta, timezone
from uuid import uuid4

from jose import JWTError, jwt

from app.config.settings import Settings, get_settings

USER_ID_CLAIM = "USER_ID"
CURRENT_TIME_MILLIS_CLAIM = "currentTimeMillis"
TOKEN_SUBJECT = "Authorization"


@dataclass(frozen=True)
class TokenPair:
    access: str
    refresh: str
    access_expires_at: datetime
    refresh_expires_at: datetime


def _utc_now() -> datetime:
    return datetime.now(timezone.utc)


def create_access_token(user_id: str, client_id: str = "", settings: Settings | None = None) -> tuple[str, datetime]:
    settings = settings or get_settings()
    now = _utc_now()
    expires_at = now + timedelta(minutes=settings.access_token_expire_minutes)
    payload = {
        "iss": settings.jwt_issuer,
        "aud": client_id or None,
        "sub": TOKEN_SUBJECT,
        "iat": now,
        "exp": expires_at,
        USER_ID_CLAIM: user_id or "",
        CURRENT_TIME_MILLIS_CLAIM: str(int(now.timestamp() * 1000)),
    }
    if not payload["aud"]:
        payload.pop("aud")
    token = jwt.encode(payload, settings.jwt_secret_key, algorithm=settings.jwt_algorithm)
    return token, expires_at


def create_token_pair(user_id: str, client_id: str = "", settings: Settings | None = None) -> TokenPair:
    settings = settings or get_settings()
    access, access_expires_at = create_access_token(user_id, client_id, settings)
    refresh_expires_at = _utc_now() + timedelta(minutes=settings.refresh_token_expire_minutes)
    return TokenPair(
        access=access,
        refresh=str(uuid4()),
        access_expires_at=access_expires_at,
        refresh_expires_at=refresh_expires_at,
    )


def verify_access_token(token: str, settings: Settings | None = None, audience: str | None = None) -> dict:
    settings = settings or get_settings()
    options = {"verify_aud": audience is not None}
    try:
        return jwt.decode(
            token,
            settings.jwt_secret_key,
            algorithms=[settings.jwt_algorithm],
            issuer=settings.jwt_issuer,
            audience=audience,
            options=options,
        )
    except JWTError as exc:
        raise ValueError("Invalid access token") from exc
