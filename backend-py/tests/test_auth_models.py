from sqlalchemy import UniqueConstraint

from app.db.base import Base, import_all_models


def test_auth_tables_are_registered() -> None:
    import_all_models()

    assert {
        "tb_account",
        "tb_role",
        "tb_role_permission",
        "tb_sys_code",
        "tb_sys_event_log",
        "tb_sys_login_log",
        "tb_sys",
        "tb_sys_menu",
        "tb_sys_menu_role",
        "tb_sys_prog",
        "tb_sys_token",
        "tb_user_role",
    }.issubset(Base.metadata.tables.keys())


def test_tb_account_matches_sql_shape() -> None:
    import_all_models()
    table = Base.metadata.tables["tb_account"]

    assert table.c.OID.primary_key
    assert table.c.OID.type.length == 36
    assert table.c.ACCOUNT.type.length == 24
    assert table.c.PASSWORD.type.length == 255
    assert table.c.ON_JOB.default.arg == "Y"


def test_role_permission_unique_key_matches_sql() -> None:
    import_all_models()
    table = Base.metadata.tables["tb_role_permission"]

    unique_columns = {
        tuple(column.name for column in constraint.columns)
        for constraint in table.constraints
        if isinstance(constraint, UniqueConstraint)
    }

    assert ("ROLE", "PERMISSION") in unique_columns


def test_sys_token_indexes_match_sql() -> None:
    import_all_models()
    table = Base.metadata.tables["tb_sys_token"]
    index_columns = {index.name: tuple(column.name for column in index.columns) for index in table.indexes}

    assert index_columns["IDX_1"] == ("USER_ID",)
    assert index_columns["IDX_2"] == ("TOKEN",)
