<script context="module">
    let _q4urt_var = import.meta.env.VITE_CK_HEAD_NAME + '_qifu4_urt';
    let _q4uat_var = import.meta.env.VITE_CK_HEAD_NAME + '_qifu4_uat';

    // GET COOKIE
    export function getCookie(name) {
        let cookieName = name + "=";
        let decodedCookie = decodeURIComponent(document.cookie);
        let ca = decodedCookie.split(';');
        for(let i = 0; i < ca.length; i++) {
            let c = ca[i];
            while (c.charAt(0) == ' ') {
                c = c.substring(1);
            }
            if (c.indexOf(cookieName) == 0) {
                return c.substring(cookieName.length, c.length);
            }
        }
        return "";
    }

    // SET COOKIE
    export function setCookie(name, value, hour, secure) {
        const d = new Date();
        //d.setTime(d.getTime() + (exdays*24*60*60*1000));
        d.setTime(d.getTime() + (hour*60*60*1000));
        let expires = "expires="+ d.toUTCString();
        if (secure) {
            document.cookie = name + "=" + value + ";" + expires + ";path=/; secure";
        } else {
            document.cookie = name + "=" + value + ";" + expires + ";path=/";
        }
    }

    // DELETE COOKIE
    export function deleteCookie(name) {
        document.cookie = name+'=; Max-Age=-99999999;'; 
    }

    export function setRefreshAndAccessTokenCookie(rfToken, accessToken) {
        setCookie(_q4urt_var, rfToken, 4, true);
        setCookie(_q4uat_var, accessToken, 4, true);
    }

    export function getRefreshTokenCookie() {
        return getCookie(_q4urt_var);
    }
    
    export function getAccessTokenCookie() {
        return getCookie(_q4uat_var);
    }

    export function userLogoutClearCookie(){
        deleteCookie(_q4urt_var);
        deleteCookie(_q4uat_var);
    }

    export function checkUserHasLogined(userData) {
        if (null != userData && !(userData.accessToken === undefined) && '' != userData.accessToken && !(userData.refreshToken === undefined) && '' != userData.refreshToken) {
            return true;
        }
        return false;
    }
    
</script>