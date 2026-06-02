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