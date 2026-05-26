import { getCsrfTokenCookie, setCsrfTokenStorage } from '../components/BaseHelper'

export default defineNuxtPlugin((nuxtApp) => {
    // 注入全局的 fetch 攔截
    const customFetch = $fetch.create({
        onRequest({ request, options }) {
            const token = getCsrfTokenCookie();
            if (token) {
                // console.log(`[CSRF Plugin] Attaching token to ${request}:`, token);
                options.headers = options.headers || {};
                if (options.headers instanceof Headers) {
                    options.headers.set('X-XSRF-TOKEN', token);
                } else if (Array.isArray(options.headers)) {
                    options.headers.push(['X-XSRF-TOKEN', token]);
                } else {
                    options.headers['X-XSRF-TOKEN'] = token;
                }
            } else {
                console.warn(`[CSRF Plugin] No XSRF-TOKEN found for request to ${request}`);
            }
            options.credentials = 'include';
        },
        onResponse({ response }) {
            // 從 Response Header 嘗試取得 Token 並同步到 Storage
            const token = response.headers.get('X-CSRF-TOKEN');
            if (token) {
                setCsrfTokenStorage(token);
            }
        }
    });

    // 將攔截過的 fetch 重新掛載回全局
    globalThis.$fetch = customFetch;
    
    // 針對 Nuxt 內部的 useFetch
    nuxtApp.provide('fetch', customFetch);
});
