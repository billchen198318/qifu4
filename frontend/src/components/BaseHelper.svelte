<script context="module">
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
        setCookie('_qifu4_user_refresh_token', rfToken, 4, true);
        setCookie('_qifu4_user_access_token', accessToken, 4, true);
    }

    export function getRefreshTokenCookie() {
        return getCookie('_qifu4_user_refresh_token');
    }
    
    export function getAccessTokenCookie() {
        return getCookie('_qifu4_user_access_token');
    }

    export function userLogoutClearCookie(){
        deleteCookie('_qifu4_user_refresh_token');
        deleteCookie('_qifu4_user_access_token');
    }

    export function checkUserHasLogined(userData) {
        if (null != userData && !(userData.accessToken === undefined) && '' != userData.accessToken && !(userData.refreshToken === undefined) && '' != userData.refreshToken) {
            return true;
        }
        return false;
    }

</script>