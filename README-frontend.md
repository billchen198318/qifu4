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
