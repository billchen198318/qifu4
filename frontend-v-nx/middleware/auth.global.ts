import { 
    getAccessTokenCookie, 
    getRefreshTokenCookie, 
    checkUserHasLogined, 
    checkHasPermission, 
    userLogoutClearCookie, 
    setRefreshAndAccessTokenCookie } from '../components/BaseHelper';
import { useBaseStore } from '../store/baseStore';

export default defineNuxtRouteMiddleware((to, from) => {
    const baseStore = useBaseStore();
    addRouteMiddleware('auth', async (to, from) => {
        let ac = getAccessTokenCookie();
        let rc = getRefreshTokenCookie();
        if ('/login' != to.path) {
            if (null == ac || '' == ac || null == rc || '' == rc) {
                return navigateTo('/login');
            }
            let userData = baseStore.user;
            if (!checkUserHasLogined(userData)) { // try login from client token
                const uRes = await useFetch(import.meta.env.VITE_API_URL + '/auth/validLogined', {
                    method: 'POST', 
                    headers: { "Content-Type": "application/json" }, 
                    query: {}, 
                    body: JSON.stringify({ accessToken : ac, refreshToken : rc }),
                    watch: [],
                    onRequestError({ request, options, error }) {
                        userLogoutClearCookie();
                        baseStore.clearUserData();
                        return navigateTo('/login');
                    },
                    onResponse({ request, response, options }) {
                        let uData = response._data;
                        baseStore.setUserData(uData);
                        setRefreshAndAccessTokenCookie(uData.refreshToken, uData.accessToken);
                    },
                    onResponseError({ request, response, options }) {
                        userLogoutClearCookie();
                        baseStore.clearUserData();
                        return navigateTo('/login');                        
                    }
                });
                if (checkUserHasLogined(userData)) {
                    const mRest = await useFetch(import.meta.env.VITE_API_URL + '/menu/getMemuItemAndProgList', {
                        method: 'POST', 
                        headers: { 
                            "Content-Type": "application/json", 
                            'Authorization' : 'Bearer ' + getAccessTokenCookie()
                        }, 
                        query: {},
                        body: {},
                        watch: [],
                        onResponse({ request, response, options }) {
                            baseStore.menuList = response._data.value.menuList;
                            baseStore.progList = response._data.value.programList;
                        }
                    });
                }
            }
            if ('Y' != userData.login) {
                return navigateTo('/login');
            }             
            if ('/' != to.path && '' != to.path && '/nopermission' != to.path) {
                if (!checkHasPermission(to.path,true)) {
                    return navigateTo('/nopermission');
                }
            }           
        }
    });
});