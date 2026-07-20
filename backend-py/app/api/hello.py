import json

from fastapi import APIRouter, Depends, Query
from fastapi.responses import PlainTextResponse
from pydantic import BaseModel

from app.common.context import UserContext
from app.common.pagination import QueryResult
from app.security.dependencies import require_controller_authority

router = APIRouter(prefix="/api/hello", tags=["hello"])
authenticated = require_controller_authority(check=False)


class TestModel(BaseModel):
    key: str | None = None
    msg: str | None = None


@router.delete("/delPlay", response_class=PlainTextResponse)
def delete_play(key: str | None = Query(default=None), _user: UserContext = Depends(authenticated)) -> str:
    return "N"


@router.post("/play", response_model=QueryResult[str], response_model_by_alias=True)
def play(data: TestModel, _user: UserContext = Depends(authenticated)) -> QueryResult[str]:
    if not data.key or not data.key.strip():
        return QueryResult(isAuth="Y", success="N", message="parameter cann't blank!")
    value = json.dumps({"str": data.msg}, ensure_ascii=False, separators=(",", ":"))
    return QueryResult(isAuth="Y", success="Y", value=value)


@router.get("/testPV/{id}", response_model=QueryResult[str], response_model_by_alias=True)
def test_path_variable(id: str, _user: UserContext = Depends(authenticated)) -> QueryResult[str]:
    return QueryResult(isAuth="Y", success="Y", message="hello.", value=id)
