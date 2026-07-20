@echo off
setlocal

cd /d "%~dp0"

if not exist ".venv\Scripts\python.exe" (
    echo [INFO] Creating Python virtual environment...
    py -m venv .venv
    if errorlevel 1 goto :error
)

echo [INFO] Updating pip...
".venv\Scripts\python.exe" -m pip install --upgrade pip
if errorlevel 1 goto :error

echo [INFO] Installing project modules...
".venv\Scripts\python.exe" -m pip install -e ".[test]"
if errorlevel 1 goto :error

echo [OK] Python environment initialized successfully.
exit /b 0

:error
echo [ERROR] Python environment initialization failed.
exit /b 1
