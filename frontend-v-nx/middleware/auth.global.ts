import { checkHasPermission, checkHasRole, checkUserHasLogined } from '../components/BaseHelper';

export default defineNuxtRouteMiddleware((to, from) => {
    addRouteMiddleware('auth', (to, from) => {
        if (!checkUserHasLogined(null)) {
            console.log('navigateTo login...');
            return navigateTo('/login');
        }
    });
});