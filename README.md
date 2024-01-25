# qífū-4
一個簡單的 springboot 後端, 與 Svelte / SvelteKit / Vue 前端的範例. A simple Admin WEB, based on Java with springboot backend, Svelte (SvelteKit) and Vue frontend example.

<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0002.png">



## Installation backend, 後端安裝配置
please use Eclipse import project folder `backend/app` and `backend/base`, `backend/core`.

<br>mariadb import
```bash
mysql> create database qifu4;

cd backend\doc
mysql qifu4 -u root -p < qifu4.sql
```

<br>database connection config file modify , `/app/resources/db1-config.properties`
```text
db1.datasource.jdbcUrl=jdbc:mariadb://localhost/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
db1.datasource.username=mariadb-account
db1.datasource.password=mariadb-password
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


<br><br><br>


# qífū-4 frontend ( Vue version )

This frontend build of VUE. (folder is `frontend-v`)

## Installation

```bash
cd frontend-v
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
npm run dev
```

<br><br><br>


# qífū-4 frontend ( Vue with Nuxt3 version )

This frontend build of VUE. (folder is `frontend-v-nx`)

## Installation

```bash
cd frontend-v-nx
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
npm run dev
```
