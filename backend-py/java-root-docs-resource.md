# Qifu4 Root Documentation Resource

Root-level Markdown files from `C:\home\qifu4\*.md`.

## Summary

| Type | Count |
| --- | ---: |
| Root Markdown | 8 |

### `ai-generator-code-template.md`

- Purpose: project documentation or operational notes.
- Heading count: 4
- Main headings: AI Code Generation Knowledge Base (Implemented Experience); 1. Backend Architecture (Spring Boot / MyBatis); 2. Frontend Architecture (Nuxt 3 / Vue 3); 3. Database & SQL
- Full path: `C:\home\qifu4\ai-generator-code-template.md`

````markdown
請讀取: GEMINI.md

需求說明:
1. 我需要一個產品管理程式
2. 欄位有:
	2-1. 產品no (unique key)
	2-2. 產品名稱
	2-3. 產品備註

程式規則需求說明:
我想在本專案中加一個程式
1. 程式目錄: TEST_PROG001D
2. 程式編號: 0001
3. 程式查詢: 需要 , 編號Q
4. 程式編輯: 需要 , 編號E
5. 程式修改: 需要 , 編號A
	
	程式代碼完整編號以查詢為例: 程式目錄+程式編號+程式查詢

6. 如果業務邏輯牽扯 "多個資料表" update/insert/delete 請建立 logic 然後控制 service, 如該業務邏輯只有單表操作請直接使用service即可不需要建立logic
7. 資料表名: TB_PRODUCT
8. 編輯時unique key欄位不允許修改(only ready): 是
9. 特殊需求(如明細檔功能):
無 

10. 是否產生sql ddl: 是
11. 是否產生本程式 TB_SYS_PROG 需要的資料: 是

強制限定規則:
1. 除非為底成架構, 要不然請把 service / mapper / dao / logic / controller 全都寫在 app 專案中
2. vue 程式請建立在 frontend-v-nx 專案中

以上請 AI CLI 你依據讀取後, 請分別用 Yes/No 詢問需詢問的項目問 user 是否依此操作

---
## AI Code Generation Knowledge Base (Implemented Experience)

### 1. Backend Architecture (Spring Boot / MyBatis)
- **Base Package**: `org.qifu.core` (Primary location for custom logic in `backend/app`).
- **Standard Components**:
    - **Entity**: Located in `org.qifu.core.entity`. Use `@EntityPK(name = "oid", autoUUID = true)` and `@EntityUK` for unique keys. Include `cuserid`, `cdate`, `uuserid`, `udate` with appropriate annotations (`@CreateUserField`, etc.).
    - **Mapper**: Interface in `org.qifu.core.mapper` (extends `IBaseMapper`). XML in `src/main/resources/org/qifu/core/mapper`.
    - **Service**: Interface in `org.qifu.core.service` (extends `IBaseService`), Implementation in `org.qifu.core.service.impl` (extends `BaseService`).
    - **Logic**: Interface in `org.qifu.core.logic`, Implementation in `org.qifu.core.logic.impl`. Used for cross-service transactions or complex business rules.
    - **Controller (API)**: Located in `org.qifu.core.api`. Extends `CoreApiSupport`. Use `@ControllerMethodAuthority(programId = "...", check = true)` for permission control.
- **Naming Convention**: 
    - Controller: `[PROG_ID]Controller.java` (e.g., `TEST_PROG001D0001Controller.java`).
    - Logic/Service: `[EntityName][Logic/Service]Service.java`.

### 2. Frontend Architecture (Nuxt 3 / Vue 3)
- **Directory**: `frontend-v-nx/pages/[PROG_ID]/`.
- **Standard File Structure**:
    - `index.vue`: Query page. Uses `Grid`, `GridPagination`, `Toolbar`, and `HiddenQueryFieldAlertInfo`.
    - `create.vue`: Create page.
    - `edit/[id].vue`: Edit page.
    - `config.ts`: Defines `PageConstants` (namespaces and Program IDs).
    - `QueryPageStore.ts`: Pinia store for managing query parameters and grid configuration.
- **Common Patterns**:
    - Use `useSwalLoading` for loading states.
    - Use `getAxiosInstance()` from `BaseHelper` for API calls.
    - Use `getGridConfig` to define columns and actions (edit/delete).
    - Authorization: `definePageMeta({ middleware: ['auth'] });`.

### 3. Database & SQL
- **Common Columns**: `OID` (char 36, PK), `CUSERID` (varchar 24), `CDATE` (datetime), `UUSERID` (varchar 24), `UDATE` (datetime).
- **System Registration**: Insert entries into `TB_SYS_PROG` for Folder, Query (Q), Create (A), and Edit (E).
    - Folder `URL`: `/`
    - Query `URL`: `#/PROG_ID`
    - Create `URL`: `#/PROG_ID/create`
    - Edit `URL`: `#/PROG_ID/edit` (Edit mode usually set to 'Y').
````

### `GEMINI.md`

- Purpose: project documentation or operational notes.
- Heading count: 6
- Main headings: 專案工程設計原則 (Project Engineering Design Principles); 1. 優先考慮可讀性與維護性 (Readability & Maintainability First); 2. 適度容忍重複 (Embrace Duplication over Over-Engineering); 3. 職責解耦而非元件複用 (Decoupling over Component Reuse); 4. 務實架構 (Pragmatic Architecture); 專案文件索引 (Project Documentation Index)
- Full path: `C:\home\qifu4\GEMINI.md`

````markdown
# 專案工程設計原則 (Project Engineering Design Principles)

本專案致力於實現清晰、可讀且易於維護的程式碼。在架構設計上，我們遵循以下務實原則：

## 1. 優先考慮可讀性與維護性 (Readability & Maintainability First)
清晰的職責劃分優於為了複用而強行進行的抽象設計。代碼的主要服務對象是閱讀它的開發者。

## 2. 適度容忍重複 (Embrace Duplication over Over-Engineering)
在複雜的業務領域（如保險業），為了避免過度設計，我們傾向於直接編寫明確的業務代碼。若「新增」與「批改」邏輯差異巨大，直接拆分為獨立的 Vue 元件（如 `Create.vue` 與 `Edit.vue`）是最佳實踐。我們不應為了減少重複代碼而犧牲可讀性與邏輯的獨立性。

## 3. 職責解耦而非元件複用 (Decoupling over Component Reuse)
我們更偏向於透過 Composable 或 Service Layer 複用核心業務邏輯，而不是透過複雜的 Props 或 `v-if` 條件來強行複用 UI 元件。

## 4. 務實架構 (Pragmatic Architecture)
開發時請始終問自己：「這個抽象化是否讓程式碼變得更難理解？」。如果答案是肯定的，請選擇最直接、最易於理解的實作方式。追求「好改、好維護」勝過追求「完美的抽象架構」。

---

# 專案文件索引 (Project Documentation Index)

本專案包含以下技術與架構說明文件，請在進行相關作業時參考：

- [README.md](./README.md): 專案總覽。
- [README-backend.md](./README-backend.md): 後端系統架構說明。
- [README-frontend.md](./README-frontend.md): 前端開發規範說明。
- [README-k3s.md](./README-k3s.md): K3s 基礎建設說明。
- [README-k3s-kube-vip.md](./README-k3s-kube-vip.md): K3s 與 Kube-VIP 高可用性整合。
- [README-mqtt.md](./README-mqtt.md): MQTT Broker 整合說明。
````

### `README-backend.md`

- Purpose: project documentation or operational notes.
- Heading count: 12
- Main headings: qífū-4 後端開發手冊 (Backend Development Guide); 1. 架構概述 (Architecture Overview); 核心模組; 2. 技術棧 (Technology Stack); 3. 安全性機制 (Security Mechanisms); 身份驗證 (Authentication); 刷新機制 (Token Refresh) - 2026/06/05 優化; 授權與攔截器 (Authorization & Interceptors); CSRF 防護; 4. 核心配置 (Key Configuration); 5. API 開發範例; Auth API
- Full path: `C:\home\qifu4\README-backend.md`

````markdown
# qífū-4 後端開發手冊 (Backend Development Guide)

本文件詳述 qífū-4 後端系統的架構設計、核心技術、安全性機制及開發指南。

## 1. 架構概述 (Architecture Overview)

qífū-4 後端基於 **Spring Boot 4.0.6** 構建，採用多模組 (Multi-module) Maven 結構，專注於提供高效能、高安全性的 RESTful API。採用 **Java 21** 虛擬執行緒 (Virtual Threads) 技術以獲得極致的併發能力。

### 核心模組
*   **core-app (`backend/app`)**: 主應用程式，包含 Controller、Config、API 定義及主要業務邏輯。
*   **core-base (`backend/base`)**: 基礎架構模組，定義 Constants、Exception、Message、以及通用的 Service/DAO 基礎介面。包含支援 JWT 與資料庫 Token 驗證的 `TokenStore` 體系。
*   **core-std (`backend/core`)**: 標準核心模組，包含與權限管理 (ACL)、系統代碼 (SysCode) 相關的實體類 (Entity) 與服務。

## 2. 技術棧 (Technology Stack)

*   **Runtime**: Java 21。
*   **Web Server**: Undertow (替代預設的 Tomcat，提供更佳的效能與記憶體管理)。
*   **Persistence**: MyBatis (半自動 ORM，靈活控制 SQL)。
*   **Database**: MariaDB (支援 MySQL 協定)。
*   **Security**: Spring Security 6+。
*   **API Documentation**: SpringDoc OpenAPI (Swagger UI)。
*   **Web Services**: Apache CXF 4.1.x (支援 JAX-WS 與 JAX-RS)。
*   **Reporting**: JasperReports (PDF/Excel 報表生成)。
*   **Cache**: Spring Cache + Redis。

## 3. 安全性機制 (Security Mechanisms)

系統採用無狀態 (Stateless) 的安全性架構，結合 JWT 與 HttpOnly Cookie。

### 身份驗證 (Authentication)
1.  **JWT 與 Cookie**: 登入成功後，後端生成 Access Token 與 Refresh Token。
2.  **HttpOnly Cookie**: Token **不返回**給前端 JS，而是透過 `Set-Cookie` 存入瀏覽器的 HttpOnly Cookie (`QIFU4VNX__uat` 與 `QIFU4VNX__urt`)。這能有效防止 XSS 攻擊竊取 Token。
3.  **前端旗標**: `AuthController` 返回 `accessToken: "Y"` 給前端，僅作為登入狀態旗標。

### 刷新機制 (Token Refresh) - 2026/06/05 優化
*   **自動化身分識別**: 當 Access Token Cookie 因逾時消失或失效時，前端會發起 `/refreshNewToken` 請求。
*   **自主識別**: 後端不再強制要求同時帶入 Access Token 與 Refresh Token。只要 `QIFU4VNX__urt` (Refresh Token) 在有效期內且存在於資料庫中，後端會自動根據 Token 反查 `USER_ID` 並核發新的 JWT。
*   **安全性**: 採用 Refresh Token Rotation (輪轉) 機制，每次刷新都會產生新的 `urt` 並使舊的失效。

### 授權與攔截器 (Authorization & Interceptors)
*   **ControllerAuthorityCheckInterceptor**: 攔截 `/api/**` 請求，根據使用者的 Role 與 Permission 檢查是否有權存取特定功能 (PROG ID)。
*   **UserBuilderInterceptor**: 初始化當前請求的使用者上下文 (ThreadLocal)，方便在 Service 層獲取使用者資訊。
*   **MDC4UserBuildInterceptor**: 將使用者 ID 注入 Log4j2 MDC，使日誌輸出包含操作者資訊。

### CSRF 防護
*   **SPA 支援**: 使用 `CookieCsrfTokenRepository` 並配合 `SpaCsrfTokenRequestHandler`。
*   **CSRF Token**: 前端需從 Cookie 中讀取 `XSRF-TOKEN` 並在請求標頭中帶上 `X-XSRF-TOKEN`。

## 4. 核心配置 (Key Configuration)

*   **資料庫配置**: 位於 `backend/app/src/main/resources/db1-config.properties`。
*   **MyBatis 配置**: `MyBatisConfig.java` 自動掃描 `org.qifu.core.mapper`。
*   **CORS 配置**: 在 `WebConfig.java` 中定義，允許跨域請求並暴露 `X-CSRF-TOKEN`。

## 5. API 開發範例

控制器位於 `org.qifu.core.api`。開發新功能時請遵循以下命名規範：
*   **命名**: `PROG[編號]Controller.java` (例如 `PROG001D0001Controller.java`)。
*   **路徑**: 統一掛載在 `/api/` 下。

### Auth API
*   `POST /api/auth/signin`: 使用者登入。
*   `POST /api/auth/validLogined`: 驗證登入狀態 (檢查 Cookie 內的 Token)。
*   `POST /api/auth/refreshNewToken`: 刷新 Access Token。
*   `POST /api/auth/logout`: 登出並清除 Cookie。

---
*更多細節請參考原始碼中的 `README.md` 或諮詢系統架構師。*
````

### `README-frontend.md`

- Purpose: project documentation or operational notes.
- Heading count: 15
- Main headings: qífū-4 前端開發手冊 (Frontend Development Guide); 1. 架構概述 (Architecture Overview); 主要技術; 2. 身份驗證與安全性 (Auth & Security); 路由中間件 (`middleware/auth.ts`); CSRF 防護; API 呼叫與攔截 (`composables/useApi.ts`); 3. 目錄結構 (Directory Structure); 4. 開發規範 (Development Guide); 環境變數; 常用指令; 安裝依賴
- Full path: `C:\home\qifu4\README-frontend.md`

````markdown
# qífū-4 前端開發手冊 (Frontend Development Guide)

本文件詳述 qífū-4 前端系統的架構設計、狀態管理、權限控制及開發指引。

## 1. 架構概述 (Architecture Overview)

前端基於 **Nuxt 3** 框架構建，設定為 **SPA 模式** (ssr: false)，並全面採用 **TypeScript** 與 **Composition API (`<script setup>`)** 進行開發。

### 主要技術
*   **Framework**: Nuxt 3 (Vue 3 + Vite)。
*   **Language**: TypeScript (嚴格型別定義)。
*   **State Management**: Pinia (使用 `baseStore` 並定義 Interface 確保型別安全)。
*   **Styling**: Bootstrap 5 (透過 `useBootstrap.client.ts` 插件載入) 與 Bootstrap Icons。
*   **HTTP Client**: 統一使用自定義的 `useApi` Composable (基於 Nuxt `ohmyfetch` / `$fetch`)。

## 2. 身份驗證與安全性 (Auth & Security)

系統與後端配合，採用高度安全的 HttpOnly Cookie 方案。

### 路由中間件 (`middleware/auth.ts`)
*   **具名中間件**: 頁面透過 `definePageMeta({ middleware: ['auth'] })` 引用。
*   **自動續期**: 如果 Store 為空但存在 Token，會自動呼叫 `/auth/validLogined` 還原狀態。
*   **選單加載**: 登入成功後自動抓取 `menuList` 與 `progList`，確保 UI 同步。
*   **權限校驗**: 透過 `checkHasPermission` 檢查使用者路徑權限。

### CSRF 防護
*   透過 `plugins/csrf.client.ts` 自動處理 Token 同步。
*   在 `useApi` 中已封裝自動在 Header 帶入 `X-XSRF-TOKEN`。

### API 呼叫與攔截 (`composables/useApi.ts`)
*   **統一入口**: 取代分散的 `fetch`, `axios` 或 `useFetch`。
*   **全域攔截**: 內建 401 (自動重新登入)、400、404、500 等錯誤代碼的 `Swal` 提示。
*   **型別支援**: 支援傳入泛型以獲得完整的 Response 型別提示。

## 3. 目錄結構 (Directory Structure)

*   `pages/`: 頁面組件，採用 `<script setup lang="ts">` 寫法。
*   `components/`: 通用 UI 組件。
    *   `BaseHelper.ts`: 核心工具函數（Cookie、權限、路徑處理等）。
    *   `GridHelper.ts`: 提供表格配置與分頁輔助函式。
    *   `Grid.vue` / `GridPagination.vue`: 現代化的表格與分頁組件。
*   `store/`: Pinia Store 定義（`baseStore.ts`）。
*   `types/`: 全域 TypeScript 介面定義（`index.ts`）。
*   `composables/`: 自定義組合式函式（如 `useApi.ts`）。

## 4. 開發規範 (Development Guide)

### 環境變數
編輯 `.env` 檔案配置：
```text
VITE_API_URL=https://your-api-domain/api
VITE_CK_HEAD_NAME=QIFU4VNX
```

### 常用指令
```bash
# 安裝依賴
npm install

# 啟動開發環境 (預設 8077 port)
npm run dev

# 專案打包
npm run build
```

### 呼叫 API 範例 (推薦方式)
```typescript
// 在 <script setup> 中
const response = await useApi<any>('/your-feature/query', {
  method: 'POST',
  body: { id: 'test' }
});
```

---
*本系統已完成 2026-05-29 優化工程，代碼全面轉向 TypeScript 與 Composition API，具有極高的維護性。*
````

### `README-k3s-kube-vip.md`

- Purpose: project documentation or operational notes.
- Heading count: 24
- Main headings: K3s HA Cluster 部署指南 (kube-vip + Traefik); 1. 環境說明; STEP 1 — 主機前置設定 (三台皆須執行); 1. 安裝必要套件; 2. 關閉 Swap; 3. 開啟核心參數; STEP 2 — 初始化 K3s HA 叢集; 2-1 初始化 Node1 (Seed); 2-2 啟動 Bootstrap VIP (Node1); 2-3 加入 Node2 與 Node3; 取得 TOKEN (在 node1); 在 Node2/3 執行 (替換 <TOKEN>)
- Full path: `C:\home\qifu4\README-k3s-kube-vip.md`

````markdown
# K3s HA Cluster 部署指南 (kube-vip + Traefik)

本指南介紹如何使用 kube-vip、K3s 內嵌 etcd HA、Traefik Ingress 建立高可用 (HA) 叢集。所有 Manifest 檔案均存放於 `k3s-project/` 目錄。

## 1. 環境說明

| 節點名稱 | IP 地址 | 角色 |
| :--- | :--- | :--- |
| **node1** | 192.168.10.1 | control-plane + worker (Seed) |
| **node2** | 192.168.10.2 | control-plane + worker |
| **node3** | 192.168.10.3 | control-plane + worker |

*   **Virtual IP (VIP)**: `192.168.10.200` (由 kube-vip 管理)
*   **Private Registry**: `192.168.10.99:5000`
*   **網路卡名稱**: `enp0s8`

---

## STEP 1 — 主機前置設定 (三台皆須執行)

```bash
# 1. 安裝必要套件
sudo apt update && sudo apt install -y curl vim wget net-tools ca-certificates gnupg lsof

# 2. 關閉 Swap
sudo swapoff -a && sudo sed -i '/swap/d' /etc/fstab

# 3. 開啟核心參數
cat <<EOF | sudo tee /etc/modules-load.d/k8s.conf
overlay
br_netfilter
EOF
sudo modprobe overlay && sudo modprobe br_netfilter

cat <<EOF | sudo tee /etc/sysctl.d/k8s.conf
net.bridge.bridge-nf-call-iptables=1
net.ipv4.ip_forward=1
net.bridge.bridge-nf-call-ip6tables=1
EOF
sudo sysctl --system
```

---

## STEP 2 — 初始化 K3s HA 叢集

### 2-1 初始化 Node1 (Seed)
```bash
curl -sfL https://get.k3s.io | sh -s - server \
  --cluster-init \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.1 \
  --write-kubeconfig-mode 644
```

### 2-2 啟動 Bootstrap VIP (Node1)
為了讓其他節點能連上 VIP 加入叢集，先手動建立 Static Pod：
```bash
sudo mkdir -p /var/lib/rancher/k3s/agent/pod-manifests
sudo cp k3s-project/kube-vip-static.yaml /var/lib/rancher/k3s/agent/pod-manifests/kube-vip.yaml
```

### 2-3 加入 Node2 與 Node3
取得 Token 後在 Node2/3 執行：
```bash
# 取得 TOKEN (在 node1)
sudo cat /var/lib/rancher/k3s/server/node-token

# 在 Node2/3 執行 (替換 <TOKEN>)
curl -sfL https://get.k3s.io | K3S_TOKEN=<TOKEN> sh -s - server \
  --server https://192.168.10.200:6443 \
  --tls-san 192.168.10.200 \
  --write-kubeconfig-mode 644
```

---

## STEP 3 — 升級 kube-vip 為正式 HA (DaemonSet)

當三台節點都加入後，將 VIP 管理權轉交給 DaemonSet。

```bash
# 1. 安裝 RBAC
kubectl apply -f https://kube-vip.io/manifests/rbac.yaml

# 2. 部署 DaemonSet
kubectl apply -f k3s-project/kube-vip-ds.yaml

# 3. 移除 Node1 的 Static Pod (等 10 秒後)
sudo rm -f /var/lib/rancher/k3s/agent/pod-manifests/kube-vip.yaml
```

---

## STEP 4 — 私有倉庫與環境配置 (三台皆須執行)

1.  **Registry 設定**: 編輯 `/etc/rancher/k3s/registries.yaml`
    ```yaml
    mirrors:
      "192.168.10.99:5000":
        endpoint: ["http://192.168.10.99:5000"]
    ```
2.  **重啟服務**: `sudo systemctl restart k3s`
3.  **建立 Namespace**: `kubectl create namespace qifu4`
4.  **建立 TLS Secret**:
    ```bash
    openssl req -x509 -nodes -days 3650 -newkey rsa:2048 \
      -keyout tls.key -out tls.crt -subj "/CN=192.168.10.200"
    kubectl create secret tls qifu4-tls --cert=tls.crt --key=tls.key -n qifu4
    ```

---

## STEP 5 — 部署 QIFU4 應用程式

依序執行以下指令部署所有資源：

```bash
cd k3s-project/

# 1. 部署 Middleware (CORS)
kubectl apply -f cors-middleware.yaml

# 2. 部署 Middleware (gzip)
kubectl apply -f gzip-middleware.yaml

# 3. 部署 Backend (Deployment + Service)
kubectl apply -f backend-deployment.yaml
kubectl apply -f backend-service.yaml

# 4. 部署 Frontend (Deployment + Service)
kubectl apply -f frontend-deployment.yaml
kubectl apply -f frontend-service.yaml

# 5. 部署 Ingress (Route)
kubectl apply -f ingress.yaml
```

---

## STEP 6 — 驗證與 HA 測試

1.  **狀態檢查**:
    *   `kubectl get nodes` (應看到 3 台 Ready)
    *   `kubectl get pods -n qifu4 -o wide` (Pod 應均勻分散)
2.  **訪問測試**: 瀏覽器打開 `https://192.168.10.200`
3.  **Failover 測試**:
    *   關閉目前持有 VIP 的節點 (`sudo shutdown -h now`)。
    *   觀察 `ping 192.168.10.200` 是否自動恢復。
    *   確認網站與 API 依然正常運作。
````

### `README-k3s.md`

- Purpose: project documentation or operational notes.
- Heading count: 13
- Main headings: qífū-4 K3s 部署手冊 (K3s Deployment Guide); 1. 叢集架構 (Cluster Architecture); 節點資訊; 2. K3s 集群初始化 (Cluster Initialization); 第一步：初始化 Node 1 (Cluster Init); 第二步：加入 Node 2 與 Node 3; 3. 私有倉庫配置 (Private Registry); 4. 應用程式部署 (Application Deployment); HA 策略; Ingress 與網路流量; 部署指令; 在 Node 1 執行
- Full path: `C:\home\qifu4\README-k3s.md`

````markdown
# qífū-4 K3s 部署手冊 (K3s Deployment Guide)

本文件詳述 qífū-4 系統在 K3s 高可用環境下的建置與部署流程。

## 1. 叢集架構 (Cluster Architecture)

本部署採用 **3 節點 Master HA (Embedded etcd)** 架構，並結合 **Keepalived** 提供 VIP。

### 節點資訊
*   **VIP**: `192.168.10.200` (對外統一口徑)
*   **Node 1**: `192.168.10.1` (Master/Worker, Keepalived Master)
*   **Node 2**: `192.168.10.2` (Master/Worker, Keepalived Backup)
*   **Node 3**: `192.168.10.3` (Master/Worker, Keepalived Backup)
*   **Private Registry**: `192.168.10.99:5000`

## 2. K3s 集群初始化 (Cluster Initialization)

### 第一步：初始化 Node 1 (Cluster Init)
```bash
curl -sfL https://get.k3s.io | sh -s - server \
  --cluster-init \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.1
```

### 第二步：加入 Node 2 與 Node 3
獲取 Node 1 的 Token：`cat /var/lib/rancher/k3s/server/node-token`。
在 Node 2/3 執行：
```bash
curl -sfL https://get.k3s.io | K3S_TOKEN=<TOKEN> sh -s - server \
  --server https://192.168.10.200:6443 \
  --tls-san 192.168.10.200 \
  --node-ip 192.168.10.[ID]
```

## 3. 私有倉庫配置 (Private Registry)

在三台機器上編輯 `/etc/rancher/k3s/registries.yaml`：
```yaml
mirrors:
  "192.168.10.99:5000":
    endpoint:
      - "http://192.168.10.99:5000"
```
完成後重啟 K3s：`sudo systemctl restart k3s`。

## 4. 應用程式部署 (Application Deployment)

應用程式運行於 `qifu4` namespace。

### HA 策略
*   **Replicas**: 前後端各部署 3 個副本。
*   **Anti-Affinity**: 使用 `podAntiAffinity` 確保副本分散在不同實體節點上，達成真正的硬體級高可用。

### Ingress 與網路流量
*   **Ingress Controller**: 使用 k3s 內建的 Traefik。
*   **HTTPS**: 配置 `qifu4-tls` Secret (Self-signed 證書)。
*   **Middlewares**: 透過 Traefik `Middleware` CRD 處理 CORS 問題。
*   **路徑分流**:
    *   `/` → `qifu4-frontend-service` (Port 8077)
    *   `/api` → `qifu4-backend-service` (Port 8088)

### 部署指令
```bash
# 在 Node 1 執行
kubectl create namespace qifu4
kubectl apply -f k3s-project/
```

## 5. 運維監控 (Operations)

*   **檢查狀態**: `kubectl get pods -n qifu4 -o wide`
*   **滾動更新**: 更新 Deployment YAML 中的 Image Tag 後重新 Apply，K8s 會自動執行無中斷更新。
*   **容錯測試**: 關閉任一 Master 節點，VIP 應自動漂移，且網站服務應保持正常。

---
*詳細 YAML 配置請參考專案根目錄下的 `k3s-project/` 資料夾。*
````

### `README-mqtt.md`

- Purpose: project documentation or operational notes.
- Heading count: 9
- Main headings: MQTT Broker 整合說明 (MQTT Broker Integration); 🛠️ 技術架構 (Technical Architecture); ⚙️ 核心配置 (Core Configuration); 是否啟用 MQTT Broker; 監聽位址與埠號; 持久化設定 (RocksDB); 安全性設定; 🔐 帳戶管理 (User Accounts); 🚀 啟動與關閉 (Startup & Shutdown)
- Full path: `C:\home\qifu4\README-mqtt.md`

````markdown
# MQTT Broker 整合說明 (MQTT Broker Integration)

本系統整合了內嵌式的 Moquette MQTT Broker，提供輕量級且高效的訊息傳遞功能。

## 🛠️ 技術架構 (Technical Architecture)

- **MQTT Broker**: [Moquette Broker](https://github.com/moquette-io/moquette) (v0.17)
- **Persistence**: [RocksDB](https://rocksdb.org/) (用於訊息與對話狀態持久化)
- **Client Library**: [Eclipse Paho](https://www.eclipse.org/paho/) (v1.2.5)

## ⚙️ 核心配置 (Core Configuration)

MQTT 的相關設定位於 `backend/app/src/main/resources/appConfig.properties`：

```properties
# 是否啟用 MQTT Broker
mqttbroker.enable=true

# 監聽位址與埠號
mqttbroker.host=127.0.0.1
mqttbroker.port=1883

# 持久化設定 (RocksDB)
mqttbroker.enablePersistence=true
mqttbroker.storePath=/var/mqtt-data/rocksdb_store

# 安全性設定
mqttbroker.allowAnonymous=false
mqttbroker.tempPasswordFile=/var/mqtt-data/password.properties
```

## 🔐 帳戶管理 (User Accounts)

系統會在啟動時讀取 `backend/app/src/main/resources/mqtt-user.json` 並自動產生 Moquette 格式的加密密碼檔。

**預設帳戶資料：**

| 帳號 (Account) | 密碼 (Password) |
| :--- | :--- |
| `admin` | `password123` |
| `brokerusr` | `P@ssw0rd` |

> ⚠️ **注意**：生產環境部署前，請務必修改 `mqtt-user.json` 中的預設密碼。

## 🚀 啟動與關閉 (Startup & Shutdown)

- **啟動**：當 Spring Boot 應用程式啟動且 `mqttbroker.enable=true` 時，`MqttBrokerConfig` 會自動初始化並啟動 Broker。
- **關閉**：當 Spring 容器關閉時，系統會觸發 `@PreDestroy` 鉤子，安全地停止 Broker 並刪除暫存的加密密碼檔。
````

### `README.md`

- Purpose: project documentation or operational notes.
- Heading count: 7
- Main headings: qífū-4; 📚 系統文件 (Documentation); 🛠️ 安裝與初始化 (Installation); 1. 數據庫匯入 (MariaDB Import); 2. 後端開發環境; 3. 前端開發環境; 🚀 生產環境部署參考 (Production Deployment Reference)
- Full path: `C:\home\qifu4\README.md`

````markdown
# qífū-4
一個簡單的 springboot 後端, 與 Nuxt 3 (Vue) 前端的範例. A simple Admin WEB, based on Java with springboot backend, and Nuxt 3 frontend example.

<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0001.png">
<br>
<img src="https://raw.githubusercontent.com/billchen198318/qifu4/main/backend/doc/0002.png">

## 📚 系統文件 (Documentation)

本專案已根據功能與層次拆分為多份詳細手冊，請點擊連結查看詳細內容：

*   [**後端開發手冊 (Backend Guide)**](./README-backend.md): 包含 Spring Boot 4.0.6 架構、MyBatis 配置、JWT/Cookie 安全性機制及 API 規範。
*   [**前端開發手冊 (Frontend Guide)**](./README-frontend.md): 包含 Nuxt 3 專案結構、Pinia 狀態管理、Axios 自動續期攔截器及權限控制。
*   [**K3s 部署手冊 (K3s Deployment Keepalived-VIP)**](./README-k3s.md): 包含 K3s HA 集群建立、Keepalived VIP 配置、Traefik Ingress 路由及私有倉庫設定。
*   [**K3s 部署手冊 (K3s Deployment Kube-VIP 推薦)**](./README-k3s-kube-vip.md): 使用 kube-vip 內嵌管理 VIP，安裝更簡單、與 K8s 整合度更高。
*   [**MQTT Broker 整合說明 (MQTT Broker Integration)**](./README-mqtt.md): 包含內嵌式 Moquette Broker 配置、RocksDB 持久化及帳密驗證機制。

---

## 🛠️ 安裝與初始化 (Installation)

### 1. 數據庫匯入 (MariaDB Import)

<br>mariadb import
```bash
mysql> create database qifu4;

cd backend/doc
mysql qifu4 -u root -p < qifu4.sql
```

<br>database connection config file modify , `backend/app/src/main/resources/db1-config.properties`
```text
db1.datasource.jdbcUrl=jdbc:mariadb://localhost/qifu4?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
db1.datasource.username=mariadb-account
db1.datasource.password=mariadb-password
```

The database password can also be stored as a Jasypt `ENC(...)` value. Use
`backend/app/src/test/java/org/qifu/test/DatabasePasswordJasyptTest.java` to
generate it:

1. In `testEncryptAndDecryptDatabasePassword()`, change `rawPassword` to the
   actual database password.
2. Change `encryptorPassword` to the Jasypt key used by the application. For a
   local environment using the default configuration, use
   `qifu4-dev-jasypt-key`.
3. Set a breakpoint after `encryptedPropertyValue` is assigned, then run the
   method as a JUnit test in Debug mode.
4. Copy `encryptedPropertyValue` from the Eclipse Variables view into
   `backend/app/src/main/resources/db1-config.properties`:

```text
db1.datasource.password=ENC(...)
```

Alternatively, generate the encrypted password directly with the Jasypt 1.9.3
CLI. Put `jasypt-1.9.3.jar` in the current directory, then run the following
command in PowerShell and replace the database password and Jasypt key as needed:

```powershell
java -cp "jasypt-1.9.3.jar" `
  org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI `
  input="mariadb-password" `
  password="qifu4-dev-jasypt-key" `
  algorithm="PBEWithMD5AndDES" `
  ivGeneratorClassName="org.jasypt.iv.NoIvGenerator" `
  verbose=false
```

The CLI prints only the encrypted value. Wrap the output with `ENC(...)` before
putting it in `db1-config.properties`:

```text
db1.datasource.password=ENC(the-encrypted-value-printed-by-the-cli)
```

The `encryptorPassword` value must exactly match `JASYPT_ENCRYPTOR_PASSWORD`.
If that environment variable is not set, the local default in
`application.properties` is `qifu4-dev-jasypt-key`. Production should set its
own `JASYPT_ENCRYPTOR_PASSWORD` and generate the `ENC(...)` value with the same
key. Otherwise, application startup will fail while binding
`db1.datasource.password`.

### 2. 後端開發環境
請使用 Eclipse 或 IntelliJ IDEA 匯入 `backend/app`、`backend/base` 與 `backend/core` 模組。
*   **JDK 版本**: 17+
*   **核心配置**: 詳見 [後端開發手冊](./README-backend.md)。

### 3. 前端開發環境
```bash
cd frontend-v-nx
npm install
npm run dev
```
*   **Node.js 版本**: 18+
*   **詳細說明**: 詳見 [前端開發手冊](./README-frontend.md)。
*   **登入測試帳號密碼**: admin / admin99。

---

## 🚀 生產環境部署參考 (Production Deployment Reference)
本專案提供基於 K3s 高可用架構的部署參考（包含 VIP `192.168.10.200`、Traefik Ingress 等範例），詳情請參閱相關手冊：
*   [**K3s + kube-vip 部署範例 (推薦)**](./README-k3s-kube-vip.md)
*   [**K3s + Keepalived 部署範例**](./README-k3s.md)

````

