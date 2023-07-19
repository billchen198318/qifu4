<script context="module">
    import { _user } from '../store/userStore.js';

    let userData;
	_user.subscribe(value => {
		userData = value;
    });


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

    export function authMiddleware(request) {
        const access_token = getAccessTokenCookie();
        request.headers.set('Authorization', `Bearer ${access_token}`);
        return request;
    }    

    export function tokenRefreshMiddleware(response) {
        var refreshTokenFlag = false;
        if (response.status === 401) {
            refreshTokenFlag = true;
        }
        const access_token = getAccessTokenCookie();
        const refresh_token = getRefreshTokenCookie();
        if (response.status === 200) {            
            if (null != access_token && '' != access_token) {
                var res = response.json();
                if ('login' in res) {
                    if ('Y' != res.login) {
                        refreshTokenFlag = true;
                    }
                }
                if ('isAuthorize' in res) {
                    if ('Y' != res.isAuthorize) {
                        refreshTokenFlag = true;
                    }
                }
            }
        }
        if (refreshTokenFlag) {
            return fetch(import.meta.env.VITE_API_URL + '/auth/refreshNewToken', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    'accessToken'  :   access_token,
                    'refreshToken' :   refresh_token,
                    'username'     :   userData.username
                })
            }).then(response => {
                if (response.ok) {
                    return response.json();
                }
                throw new Error('Refresh Token failed');                
            }).then(data => {                       
                if ('username' in data) {
                    _user.update(state => ({...state, accessToken : data.accessToken}));
                    _user.update(state => ({...state, refreshToken : data.refreshToken}));
                    setRefreshAndAccessTokenCookie(data.refreshToken, data.accessToken);
                    return Promise.resolve('refreshed');
                } else {
                    return Promise.reject(data);
                }
            }).catch(error => {
                userLogoutClearCookie();
                return Promise.reject(error);
            });     
        }
        return Promise.resolve('ok');
    }



    /*
function authMiddleware(request) {
  const access_token = localStorage.getItem('access_token');
  if (access_token) {
    request.headers.set('Authorization', `Bearer ${access_token}`);
  }
  return request;
}

function tokenRefreshMiddleware(response) {
  if (response.status === 401) {
    const refreshToken = localStorage.getItem('refresh_token');
    return fetch('/api/refresh_token', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ refreshToken })
    }).then(response => {
      if (response.ok) {
        return response.json();
      }
      throw new Error('Refresh Token failed');
    }).then(data => {
      localStorage.setItem('access_token', data.access_token);
      localStorage.setItem('refresh_token', data.refresh_token);
      return Promise.resolve('refreshed');
    }).catch(error => {
      localStorage.removeItem('access_token');
      localStorage.removeItem('refresh_token');
      return Promise.reject(error);
    });
  }
  return Promise.resolve('ok');
}

fetch('/api/user', {
  method: 'GET',
  headers: {
    'Content-Type': 'application/json'
  },
  middleware: [authMiddleware, tokenRefreshMiddleware]
}).then(response => {
  console.log(response);
}).catch(error => {
  console.error(error);
});
    */


</script>