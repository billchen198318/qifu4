# qífū-4 Frontend 開發手冊 (Nuxt 3)

本文件詳述 qífū-4 前端系統的架構、技術棧及開發規範，旨在引導開發者理解前端運作並協助 AI Agent 進行後續開發。

## 1. 系統架構

前端基於 **Nuxt 3** 框架開發，採用單頁面應用 (SPA) 模式 (`ssr: false`)。

*   **目錄結構**:
    *   `pages/`: 頁面路由。
    *   `components/`: 共用組件與 `BaseHelper.ts` 工具。
    *   `store/`: Pinia 狀態管理 (`baseStore.ts`)。
    *   `middleware/`: 路由中間件，包含全域權限檢查 (`auth.global.ts`)。
    *   `plugins/`: Nuxt 插件，如 Bootstrap 整合。
    *   `layouts/`: 頁面佈局。

## 2. 技術棧 (Tech Stack)

*   **Framework**: Nuxt 3.11.2, Vue 3.4.27
*   **State Management**: Pinia 2.1.7
*   **Styling**: Bootstrap 5.3.3, SCSS (api: modern-compiler)
*   **Icons**: Bootstrap Icons 1.11.3
*   **HTTP Client**: Axios 1.7.2 (搭配 Nuxt `useFetch` 使用)
*   **Charts**: ECharts 5.5.0, Vue-ECharts
*   **Editor**: ByteMD (Markdown 編輯器)
*   **UI Helpers**: SweetAlert2 (彈窗), Vue3-Toastify (通知)

## 3. 環境變數配置 (.env)

開發與生產環境需配置以下變數：
*   `VITE_API_URL`: 後端 API 入口路徑。
*   `VITE_CK_HEAD_NAME`: 用於特定業務的 Header 名稱。

## 4. 權限與身份驗證

### 4.1 全域中間件 (`auth.global.ts`)
系統在每次路由跳轉時會自動執行：
1.  檢查 Cookie 中的 `accessToken` 與 `refreshToken` 是否存在。
2.  若尚未登入，調用 `/api/auth/validLogined` 驗證 Token 合法性。
3.  驗證成功後，同步用戶資訊至 `baseStore` 並加載選單及程式清單 (`/api/menu/getMemuItemAndProgList`)。
4.  檢查用戶是否具備目標頁面的訪問權限。

### 4.2 Token 管理
*   使用 `BaseHelper.ts` 中的工具函數管理 Cookie。
*   自動處理 JWT 與 CSRF (`X-XSRF-TOKEN`) 的同步。

## 5. 開發規範

*   **組件化**: 複雜 UI 邏輯應封裝於 `components/` 中。
*   **狀態存取**: 全域用戶狀態與選單權限應統一由 `baseStore` 管理。
*   **API 呼叫**: 優先使用 Nuxt 的 `useFetch` 並配置正確的 `headers`（特別是 CSRF Token）。

## 6. 建置與運行

```bash
# 安裝依賴
npm install

# 本地開發模式 (Port: 8077)
npm run dev

# 生產環境建置
npm run build

# 預覽建置結果
npm run preview
```
