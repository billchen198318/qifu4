# qífū-4
Backend Admin WEB base on JAVA &amp; Spring / Spring-boot &amp; Sevlte frontend


# qífū-4 backend , build of JAVA / Springboot

This backend build of java with springboot 

## Installation
please use Eclipse import project folder `app` and `base`, `core`.

<br>mariadb import
```bash
mysql> create database qifu4;

cd doc
mysql qifu4 -u root -p < qifu4.sql
```

<br>database connection config file modify , `/app/resources/db1-config.properties`
```text
db1.datasource.jdbcUrl=jdbc:mariadb://localhost/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
```

<br><br><br>

# qífū-4 frontend , build of svelte

This frontend build of svelte.

## Installation

```bash
cd frontend
pnpm i

```

## Backend API env value

Update your backend API value in `.env`:

```text
API_ENDPOINT=http://127.0.0.1:8088/api
```

## Start a local server

```bash
npm run dev
```

## How to build

```
npm run build
```
