from unittest.mock import Mock

import pytest

from app.aspects.service_authority import ServiceMethodType, service_authority
from app.common.context import UserContext, reset_current_user_context, set_current_user_context
from app.common.exceptions import AuthorityException
from app.domain.system.repository import SysEventLogRepository


def run_as(user: UserContext, function):
    token = set_current_user_context(user)
    try:
        return function()
    finally:
        reset_current_user_context(token)


def test_service_authority_uses_java_permission_id() -> None:
    events = []

    @service_authority("roleLogicServiceImpl", (ServiceMethodType.INSERT,),
                       event_logger=lambda event, permit: events.append((event, permit)))
    def save():
        return "saved"

    allowed = UserContext(account="user", permissions={"SERVICE": {"roleLogicServiceImpl:INSERT"}})
    assert run_as(allowed, save) == "saved"
    assert events[-1] == ("roleLogicServiceImpl@save", True)

    with pytest.raises(AuthorityException):
        run_as(UserContext(account="guest"), save)
    assert events[-1] == ("roleLogicServiceImpl@save", False)


def test_service_authority_admin_and_unannotated_method_bypass() -> None:
    @service_authority("service", (ServiceMethodType.DELETE,))
    def remove():
        return True

    assert run_as(UserContext(account="admin", roles=("admin",)), remove)

    @service_authority("service", None)
    def unannotated():
        return True

    assert run_as(UserContext(account="guest"), unannotated)


def test_event_log_repository_matches_java_fields_and_truncates_event() -> None:
    db = Mock()
    result = SysEventLogRepository(db).record("admin", "CORE", "x" * 300, False)
    assert result is not None
    assert result.user == "admin"
    assert result.is_permit == "N"
    assert len(result.execute_event) == 255
    db.add.assert_called_once_with(result)


def test_event_log_skips_blank_required_values() -> None:
    db = Mock()
    assert SysEventLogRepository(db).record("", "CORE", "event", True) is None
    db.add.assert_not_called()
