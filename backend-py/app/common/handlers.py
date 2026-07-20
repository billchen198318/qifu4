from fastapi import FastAPI, HTTPException, Request
from fastapi.responses import JSONResponse

from app.common.exceptions import BaseSysException


def register_exception_handlers(app: FastAPI) -> None:
    @app.exception_handler(HTTPException)
    async def http_exception_handler(request: Request, exc: HTTPException) -> JSONResponse:
        return JSONResponse(status_code=exc.status_code, content={
            "status": exc.status_code,
            "error": "Unauthorized" if exc.status_code == 401 else "Forbidden" if exc.status_code == 403 else "Error",
            "message": str(exc.detail),
            "path": request.url.path,
        }, headers=exc.headers)

    @app.exception_handler(BaseSysException)
    async def system_exception_handler(request: Request, exc: BaseSysException) -> JSONResponse:
        return JSONResponse(status_code=exc.status_code, content={
            "status": exc.status_code,
            "error": exc.__class__.__name__,
            "message": exc.message,
            "path": request.url.path,
        })
