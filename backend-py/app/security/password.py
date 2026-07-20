import bcrypt


def _bcrypt_bytes(value: str) -> bytes:
    return value.encode("utf-8")


def _normalize_bcrypt_hash(hashed_password: str) -> bytes:
    value = hashed_password.encode("utf-8")
    if value.startswith(b"$2y$"):
        return b"$2b$" + value[4:]
    return value


def verify_password(plain_password: str, hashed_password: str) -> bool:
    if not plain_password or not hashed_password:
        return False
    return bcrypt.checkpw(_bcrypt_bytes(plain_password), _normalize_bcrypt_hash(hashed_password))


def hash_password(password: str) -> str:
    return bcrypt.hashpw(_bcrypt_bytes(password), bcrypt.gensalt(rounds=12)).decode("utf-8")
