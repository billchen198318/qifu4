<script context="module">
    import axios from "axios";
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

    export function getAxiosInstance() {

      axios.defaults.headers = {
        'Content-Type' : 'application/json',
        'Authorization' : 'Bearer ' + getAccessTokenCookie()
      };

      // 全局設定 AJAX Request 攔截器 (interceptor)
      axios.interceptors.request.use(async function (config) {
        return config
      }, function (error) {
        return Promise.reject(error)
      });
      // 全局設定 AJAX Response 攔截器 (interceptor)
      axios.interceptors.response.use(function (response) {
        return response
      }, function (error) {
        if (error.response) {
          
          // server responded status code falls out of the range of 2xx
          switch (error.response.status) {
            case 400:
              {
                const { message } = error.response.data
                alert(`${error.response.status}: ${message || '資料錯誤'}。`)
              }

              break

            case 401:
              {
                // 當不是 refresh token 作業發生 401 才需要更新 access token 並重發
                // 如果是就略過此刷新 access token 作業，直接不處理(因為 catch 已經攔截處理更新失敗的情況了)
                const refreshTokeUrl = import.meta.env.VITE_API_URL + '/auth/refreshNewToken';
                if (error.config.url !== refreshTokeUrl) {
                  // 原始 request 資訊
                  const originalRequest = error.config

                  // 依據 refresh_token 刷新 access_token 並重發 request
                  return axios
                    .post(refreshTokeUrl, JSON.stringify({
                        username : userData.username,
                        accessToken : getAccessTokenCookie(),
                        refreshToken : getRefreshTokenCookie()
                      })
                    ) // refresh_toke is attached in cookie
                    .then((response) => {
                      // [更新 access_token 成功]

                      // 刷新 storage (其他呼叫 api 的地方都會從此處取得新 access_token)
                      setRefreshAndAccessTokenCookie(response.data.refreshToken, response.data.accessToken)

                      // 刷新原始 request 的 access_token
                      originalRequest.headers.Authorization = 'Bearer ' + response.data.accessToken

                      // 重送 request (with new access_token)
                      return axios(originalRequest)
                    })
                    .catch((err) => {
                      // [更新 access_token 失敗] ( e.g. refresh_token 過期無效)
                      userLogoutClearCookie();
                      alert(`${err.response.status}: 作業逾時或無相關使用授權，請重新登入`)
                      window.location.href = '/'
                      return Promise.reject(error)
                    })
                }
              }

              break

            case 404:
              alert(`${error.response.status}: 資料來源不存在`)
              break

            case 500:
              alert(`${error.response.status}: 內部系統發生錯誤`)
              break

            default:
              alert(`${error.response.status}: 系統維護中，造成您的不便，敬請見諒。`)

              break
          }
        } else {
          // Something happened in setting up the request that triggered an Error
          if (error.code === 'ECONNABORTED' && error.message && error.message.indexOf('timeout') !== -1) {
            // request time out will be here
            alert('網路連線逾時，請點「確認」鍵後繼續使用。')
          } else {
            // shutdonw api server
            alert('網路連線不穩定，請稍候再試')
          }
        }

        return Promise.reject(error)
      })    
      
      return axios;
    }

</script>