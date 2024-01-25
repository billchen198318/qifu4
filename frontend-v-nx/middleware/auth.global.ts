import { getAccessTokenCookie, getRefreshTokenCookie, checkUserHasLogined } from '../components/BaseHelper';

export default defineNuxtRouteMiddleware((to, from) => {
    addRouteMiddleware('auth', (to, from) => {
        let ac = getAccessTokenCookie();
        let rc = getRefreshTokenCookie();
        if ('/login' != to.path) {
            if (null == ac || '' == ac || null == rc || '' == rc) {
                console.log('navigateTo login...');
                return navigateTo('/login');
            }
        }
    });
});