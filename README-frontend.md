# qífū-4 前端開發手冊 (Frontend Development Guide)

本文件詳述 qífū-4 前端系統的架構設計、狀態管理、權限控制及開發指引。

## 1. 架構概述 (Architecture Overview)

前端基於 **Nuxt 3** 框架構建，設定為 **SPA 模式** (ssr: false)。

### 主要技術
*   **Framework**: Nuxt 3 (Vue 3 + Vite)。
*   **State Management**: Pinia (使用 `baseStore` 管理使用者資訊、選單與程式清單)。
*   **Styling**: Bootstrap 5 (透過 `useBootstrap.client.ts` 插件載入)。
*   **HTTP Client**: `useFetch` (Nuxt 內建) 與 `Axios` (用於特定攔截器邏輯)。

## 2. 身份驗證與安全性 (Auth & Security)

系統與後端配合，採用高度安全的 HttpOnly Cookie 方案。

### 全域路由中間件 (`middleware/auth.global.ts`)
*   **登入檢查**: 每次跳轉頁面時，中間件會檢查 `baseStore` 中的登入狀態。
*   **自動續期**: 如果 Store 為空但 Cookie 中存在 Token 旗標，會自動呼叫 `/api/auth/validLogined` 進行後端驗證並還原使用者狀態。
*   **權限校驗**: 呼叫 `checkHasPermission` 檢查使用者是否有權進入該路徑。

### CSRF 防護
*   前端需從 `XSRF-TOKEN` Cookie 中讀取 Token。
*   在 API 呼叫時，必須在 Header 中帶入 `X-XSRF-TOKEN`。

### Axios 攔截器 (`BaseHelper.js`)
*   **401 處理**: 當 Access Token 過期（API 返回 401）時，攔截器會自動調用 `refreshNewToken` 接口。
*   **無感刷新**: 刷新成功後，會自動重發先前失敗的請求，使用者無需手動重新登入。

## 3. 目錄結構 (Directory Structure)

*   `pages/`: 頁面組件，對應路由架構。
*   `components/`: 通用 UI 組件。
    *   `BaseHelper.js`: 核心工具函數，包含 Cookie 處理、權限檢查、Axios 實例等。
    *   `Grid.vue` / `GridPagination.vue`: 統一的表格與分頁組件。
*   `store/`: Pinia Store 定義。
*   `layouts/`: 頁面佈局 (如 `default.vue`)。

## 4. 開發規範 (Development Guide)

### 環境變數
編輯 `.env` 檔案配置 API 地址：
```text
VITE_API_URL=https://192.168.10.200/api
VITE_CK_HEAD_NAME=QIFU4VNX
```

### 常用指令
```bash
# 安裝依賴
npm install

# 啟動開發環境 (預設 8077 port)
npm run dev

# 專案打包 (輸出至 .output 夾)
npm run build
```

### 呼叫 API 範例
建議使用 `BaseHelper.js` 中的 `getAxiosInstance()` 以確保攔截器與 CSRF 邏輯正常運作。
```javascript
import { getAxiosInstance } from '~/components/BaseHelper';

const api = getAxiosInstance();
const res = await api.post('/api/your-feature/query', data);
```

---
*本系統專為 AI Agent 輔助開發優化，代碼結構清晰且模組化。*
