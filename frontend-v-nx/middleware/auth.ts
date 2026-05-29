import { 
    getAccessTokenCookie, 
    getRefreshTokenCookie, 
    checkUserHasLogined, 
    checkHasPermission, 
    userLogoutClearCookie, 
    setRefreshAndAccessTokenCookie } from '../components/BaseHelper';
import { useBaseStore } from '../store/baseStore';

export default defineNuxtRouteMiddleware(async (to, from) => {
    const baseStore = useBaseStore();
    const loginPageUrl = '/login';
    const noPermissionUrl = '/nopermission';
    const notCheckPermUrls = ['', '/', '/nopermission', '/login', '/about', '/error'];

    // 如果是登入頁，直接跳過
    if (to.path === loginPageUrl) return;

    const ac = getAccessTokenCookie();
    const rc = getRefreshTokenCookie();

    // 缺少 Token，導向登入頁
    if (!ac || !rc) {
        return navigateTo(loginPageUrl);
    }

    // 1. 如果有 Token 但 Store 中無使用者資訊，嘗試自動登入
    if (!checkUserHasLogined(baseStore.user)) {
        try {
            const uData: any = await useApi('/auth/validLogined', {
                method: 'POST',
                body: { accessToken: ac, refreshToken: rc }
            });
            
            if (uData) {
                baseStore.setUserData(uData);
                setRefreshAndAccessTokenCookie(uData.refreshToken, uData.accessToken);
            }
        } catch (error) {
            console.error('Auto login failed:', error);
            userLogoutClearCookie();
            baseStore.clearUserData();
            return navigateTo(loginPageUrl);
        }
    }

    // 2. 確保使用者已登入且有選單資料
    if (baseStore.isLoggedIn && baseStore.menuList.length === 0) {
        try {
            const mData: any = await useApi('/menu/getMemuItemAndProgList', {
                method: 'POST'
            });
            
            if (mData && mData.value) {
                baseStore.setMenuList(mData.value.menuList);
                baseStore.setProgList(mData.value.programList);
            }
        } catch (error) {
            console.error('Fetch menu failed:', error);
        }
    }

    // 3. 最終檢查登入狀態
    if (!baseStore.isLoggedIn || !getAccessTokenCookie() || !getRefreshTokenCookie()) {
        return navigateTo(loginPageUrl);
    }

    // 權限檢查
    const needChkPerm = !notCheckPermUrls.includes(to.path);
    if (needChkPerm && !checkHasPermission(to.path, true)) {
        return navigateTo(noPermissionUrl);
    }
});
