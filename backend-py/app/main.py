from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware

from app.api.auth import router as auth_router
from app.api.dashboard_demo import router as dashboard_demo_router
from app.api.hello import router as hello_router
from app.api.menu import router as menu_router
from app.api.prog001d0001 import router as prog001d0001_router
from app.api.prog001d0002 import router as prog001d0002_router
from app.api.prog001d0003 import router as prog001d0003_router
from app.api.prog001d0004 import router as prog001d0004_router
from app.api.prog001d0005 import router as prog001d0005_router
from app.api.prog002d0001 import router as prog002d0001_router
from app.api.prog002d0002 import router as prog002d0002_router
from app.api.prog002d0003 import router as prog002d0003_router
from app.api.prog004d0001 import router as prog004d0001_router
from app.api.prog004d0002 import router as prog004d0002_router
from app.api.prog005d0001 import router as prog005d0001_router
from app.common.handlers import register_exception_handlers
from app.common.result import DefaultResult
from app.config.logging import configure_logging
from app.config.settings import Settings, get_settings
from app.middleware.jwt_user_context import JwtUserContextMiddleware


def create_app(settings: Settings | None = None) -> FastAPI:
    settings = settings or get_settings()
    configure_logging(settings.log_level)

    app = FastAPI(
        title=settings.app_name,
        debug=settings.debug,
        version="0.1.0",
    )

    app.add_middleware(
        CORSMiddleware,
        allow_origins=settings.allowed_origins,
        allow_credentials=True,
        allow_methods=["GET", "POST", "PUT", "DELETE", "OPTIONS"],
        allow_headers=[
            "Authorization",
            "Content-Type",
            settings.csrf_header_name,
            "X-Requested-With",
        ],
    )
    app.add_middleware(JwtUserContextMiddleware, settings=settings)
    app.include_router(auth_router)
    app.include_router(dashboard_demo_router)
    app.include_router(hello_router)
    app.include_router(menu_router)
    app.include_router(prog001d0001_router)
    app.include_router(prog001d0002_router)
    app.include_router(prog001d0003_router)
    app.include_router(prog001d0004_router)
    app.include_router(prog001d0005_router)
    app.include_router(prog002d0001_router)
    app.include_router(prog002d0002_router)
    app.include_router(prog002d0003_router)
    app.include_router(prog004d0001_router)
    app.include_router(prog004d0002_router)
    app.include_router(prog005d0001_router)
    register_exception_handlers(app)

    @app.get("/health", tags=["system"])
    def health() -> DefaultResult[dict[str, str]]:
        return DefaultResult.ok({"status": "UP"})

    return app


app = create_app()
