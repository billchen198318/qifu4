// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  ssr: false,

  // 1. 修正資源路徑，解決 JS 檔案抓不到 (404) 的問題
  app: {
    baseURL: '/',
    buildAssetsDir: '/_nuxt/',
  },

  // 2. 只保留你程式碼中真正會用到的環境變數
  runtimeConfig: {
    public: {
      apiUrl: process.env.VITE_API_URL,
      ckHeadName: process.env.VITE_CK_HEAD_NAME,
    }
  },

  devtools: { 
    enabled: import.meta.dev 
  },

  modules: [
    '@pinia/nuxt'
  ],

  // 🛡️ 加固開發伺服器，鎖定本機回環位址，杜絕區域網路內對 Vite 漏洞的掃描
  devServer: {
    port: 8077,
    host: '127.0.0.1',
  },

  vite: {
    css: {
      preprocessorOptions: {
        scss: {
          api: 'modern-compiler'
        }
      }
    }
  },

  // 🛡️ 修正：直接給予布林值，確保 Nitro 引擎完美關閉所有用戶端原始碼映射 (Sourcemap)
  sourcemap: false,

  compatibilityDate: '2026-05-27'
})
