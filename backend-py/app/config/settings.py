from functools import lru_cache
from typing import Any

from pydantic import Field, field_validator
from pydantic_settings import BaseSettings, SettingsConfigDict


class Settings(BaseSettings):
    app_name: str = "qifu4-backend-py"
    app_env: str = "local"
    debug: bool = False
    log_level: str = "INFO"
    system_id: str = "CORE"
    main_system: str = "CORE"
    enable_controller_auth_check_log: bool = False
    enable_service_auth_check_log: bool = False
    mqtt_broker_enable: bool = False
    mqtt_broker_host: str = "127.0.0.1"
    mqtt_broker_port: str = "1883"

    database_url: str = "mysql+pymysql://qifu4:qifu4@127.0.0.1:3306/qifu4?charset=utf8mb4"
    db_pool_size: int = 10
    db_max_overflow: int = 20
    db_pool_recycle: int = 840
    db_pool_pre_ping: bool = True

    allowed_origins: list[str] = Field(default_factory=lambda: ["http://localhost:5173"])

    jwt_secret_key: str = "change-this-in-production"
    jwt_algorithm: str = "HS256"
    jwt_issuer: str = "QIFU4Application"
    access_token_expire_minutes: int = 25
    refresh_token_expire_minutes: int = 40
    access_token_cookie_name: str = "QIFU4VNX__uat"
    refresh_token_cookie_name: str = "QIFU4VNX__urt"
    cookie_secure: bool = False
    cookie_samesite: str = "lax"

    csrf_cookie_name: str = "XSRF-TOKEN"
    csrf_header_name: str = "X-CSRF-Token"

    model_config = SettingsConfigDict(
        env_file=".env",
        env_file_encoding="utf-8",
        case_sensitive=False,
        extra="ignore",
    )

    @field_validator("allowed_origins", mode="before")
    @classmethod
    def parse_allowed_origins(cls, value: Any) -> list[str]:
        if value is None or value == "":
            return []
        if isinstance(value, str):
            return [item.strip() for item in value.split(",") if item.strip()]
        return value


@lru_cache
def get_settings() -> Settings:
    return Settings()


