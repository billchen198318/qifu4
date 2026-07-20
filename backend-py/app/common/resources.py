import json
from functools import lru_cache
from pathlib import Path
from typing import Any

RESOURCE_ROOT = Path(__file__).resolve().parents[1] / "resources"


@lru_cache
def load_json_resource(name: str) -> Any:
    path = (RESOURCE_ROOT / name).resolve()
    if not path.is_file() or RESOURCE_ROOT not in path.parents:
        raise FileNotFoundError(f"Resource not found: {name}")
    return json.loads(path.read_text(encoding="utf-8"))
