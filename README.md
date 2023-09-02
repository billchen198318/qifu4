# qífū-4
一個簡單的Springboot 3 後端, 與 Svelte/SvelteKit前端的 Admin WEB, base on JAVA & Spring / Spring-boot & Sevlte frontend

<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/doc/0002.png">
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


# qífū-4 frontend ( SvelteKit version )

This frontend build of SvelteKit. (folder is `frontend-k`)

## Installation

```bash
cd frontend-k
npm install

```

## Backend API env value

Update your backend API value in `.env`:

```text
VITE_API_URL="http://127.0.0.1:8088/api"
```

## Start a local server

```bash
npm run build
npm run preview
```


# qífū-4 frontend ( svelte with svelte-spa-router version)

This frontend build of svelte & svelte-spa-router. (folder is `frontend`)

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


