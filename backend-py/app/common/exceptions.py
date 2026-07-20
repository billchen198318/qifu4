class BaseSysException(Exception):
    status_code = 500

    def __init__(self, message: str = "", code: str | None = None) -> None:
        super().__init__(message)
        self.message = message
        self.code = code


class AuthorityException(BaseSysException):
    status_code = 403


class ControllerException(BaseSysException):
    status_code = 400


class ServiceException(BaseSysException):
    status_code = 400
