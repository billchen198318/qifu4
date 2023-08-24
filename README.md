# qífū-4
一個簡單的Springboot 3 後端, 與 Svelte前端的 Admin WEB, base on JAVA & Spring / Spring-boot & Sevlte frontend

<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/doc/0001.png">



## Installation backend, 後端安裝配置
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
VITE_API_URL="http://127.0.0.1:8088/api"
```

## Start a local server

```bash
npm run dev
```

## How to build

```
npm run build
```
