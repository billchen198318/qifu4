import { getAccessTokenCookie, getRefreshTokenCookie, checkUserHasLogined, checkHasPermission } from '../components/BaseHelper';

export default defineNuxtRouteMiddleware((to, from) => {
    addRouteMiddleware('auth', (to, from) => {
        let ac = getAccessTokenCookie();
        let rc = getRefreshTokenCookie();
        if ('/login' != to.path) {
            if (null == ac || '' == ac || null == rc || '' == rc) {
                return navigateTo('/login');
            }
            if ('/' != to.path && '' != to.path) {
                if (!checkUserHasLogined(null)) {
                    return navigateTo('/error'); // 請用正常方式操作選單.
                }
                if (!checkHasPermission(to.path,true)) {
                    return navigateTo('/nopermission');
                }
            }
        }
    });
});