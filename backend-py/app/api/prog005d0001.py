from typing import Any
from fastapi import APIRouter, Depends
from pydantic import BaseModel, ConfigDict, Field
from app.common.pagination import QueryResult
from app.config.settings import Settings, get_settings
from app.security.dependencies import require_controller_authority

router = APIRouter(prefix="/api/PROG005D0001", tags=["CORE_PROG005D0001"])


class MqttSearch(BaseModel):
    field: dict[str, Any] = Field(default_factory=dict)
    model_config = ConfigDict(populate_by_name=True, extra="ignore")


class MqttClient(BaseModel):
    client_id: str = Field(alias="clientId")
    address: str
    port: int
    model_config = ConfigDict(populate_by_name=True)


class MqttBroker(BaseModel):
    host: str
    port: str
    enable: bool
    client_size: int = Field(alias="clientSize")
    clients: list[MqttClient]
    model_config = ConfigDict(populate_by_name=True)


class MqttTopic(BaseModel):
    topic: str
    subscriber_count: int = Field(default=0, alias="subscriberCount")
    last_message_time: str | None = Field(default=None, alias="lastMessageTime")
    topic_msg: str = Field(alias="topicMsg")
    model_config = ConfigDict(populate_by_name=True)


class MqttMessage(BaseModel):
    topic: str
    payload: str
    time: str


@router.post("/findPage", response_model=QueryResult[MqttBroker], response_model_by_alias=True)
def find_page(_: MqttSearch,
              _user=Depends(require_controller_authority("CORE_PROG005D0001Q")),
              settings: Settings = Depends(get_settings)):
    value = MqttBroker(
        host=settings.mqtt_broker_host, port=settings.mqtt_broker_port,
        enable=False, clientSize=0, clients=[])
    return QueryResult(isAuth="Y", success="Y", value=value)


@router.post("/findTopics", response_model=QueryResult[list[MqttTopic]],
             response_model_by_alias=True)
def find_topics(_: MqttSearch,
                _user=Depends(require_controller_authority("CORE_PROG005D0001Q"))):
    return QueryResult(isAuth="Y", success="Y", value=[])


@router.post("/findMessages", response_model=QueryResult[list[MqttMessage]],
             response_model_by_alias=True)
def find_messages(_: MqttSearch,
                  _user=Depends(require_controller_authority("CORE_PROG005D0001Q"))):
    return QueryResult(isAuth="Y", success="Y", value=[])
