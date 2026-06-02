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
