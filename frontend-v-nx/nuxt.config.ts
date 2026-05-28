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
      // 如果沒用到 reportUrl 就直接刪除這行
    }
  },

  devtools: { enabled: true },

  modules: [
    '@pinia/nuxt'
  ],

  devServer: {
    port: 8077,
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

  compatibilityDate: '2026-05-27'
})