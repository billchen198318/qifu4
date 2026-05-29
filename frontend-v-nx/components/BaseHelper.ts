import axios from "axios";
import { useBaseStore } from '../store/baseStore';
import type { User, MenuItem, Program } from '../types';

// 2026-05-23 add to prevent refresh token storm
let isRefreshing = false;
let failedQueue: any[] = [];
let interceptorsAttached = false;

const processQueue = (error: any, token: string | null = null) => {
  failedQueue.forEach(prom => {
    if (error) {
      prom.reject(error);
    } else {
      prom.resolve(token);
    }
  });
  failedQueue = [];
};

// GET COOKIE
export function getCookie(name: string): string {
  const c = useCookie(name);
  return (c.value as string) || '';
}

// SET COOKIE
export function setCookie(name: string, value: string | null, hour: number, _secure: boolean) {
  let s = hour * 60 * 60;
  const c = useCookie(name, { maxAge: s, secure: _secure, path: '/' });
  c.value = value;
}

// DELETE COOKIE
export function deleteCookie(name: string) {
  const c = useCookie(name);
  c.value = null;
}

export function setRefreshAndAccessTokenCookie(rfToken: string, accessToken: string) {
  const config = useRuntimeConfig();
  const urt = config.public.ckHeadName + '__urt_flag';
  const uat = config.public.ckHeadName + '__uat_flag';
  setCookie(urt, 'Y', 24, true);
  setCookie(uat, 'Y', 24, true);
}

export function getRefreshTokenCookie(): string {
  const config = useRuntimeConfig();
  return getCookie(config.public.ckHeadName + '__urt_flag');
}

export function getAccessTokenCookie(): string {
  const config = useRuntimeConfig();
  return getCookie(config.public.ckHeadName + '__uat_flag');
}

export function getCsrfTokenCookie(): string {
  let token = getCookie('XSRF-TOKEN');
  if (!token && typeof window !== 'undefined') {
    token = localStorage.getItem('XSRF-TOKEN-STORAGE') || '';
  }
  return token;
}

export function setCsrfTokenStorage(token: string) {
  if (token && typeof window !== 'undefined') {
    localStorage.setItem('XSRF-TOKEN-STORAGE', token);
  }
}

export function userLogoutClearCookie() {
  const config = useRuntimeConfig();
  axios.post(config.public.apiUrl + '/auth/logout', {}, { withCredentials: true });
  deleteCookie(config.public.ckHeadName + '__urt_flag');
  deleteCookie(config.public.ckHeadName + '__uat_flag');
  if (typeof window !== 'undefined') {
    localStorage.removeItem('XSRF-TOKEN-STORAGE');
  }
}

export function checkUserHasLogined(userData?: User): boolean {
  if (!userData) {
    userData = useBaseStore().user;
  }
  return !!(userData && userData.accessToken && userData.refreshToken);
}

export function checkHasRole(roleId: string): boolean {
  const baseStore = useBaseStore();
  if (baseStore.user.admin === 'Y') {
    return true;
  }
  return baseStore.user.roleList.some(r => r.role === roleId);
}

export function checkHasPermission(perm: string, urlCheck: boolean): boolean {
  const baseStore = useBaseStore();
  if (baseStore.user.admin === 'Y') {
    return true;
  }
  return baseStore.user.roleList.some(r => {
    if (r.role === 'admin' || r.role === '*') return true;
    return r.rolePermission?.some(p => {
      if (p.permType === 'SERVICE') return false;
      if (perm === p.permission) return true;
      if (urlCheck && perm.startsWith(p.permission)) return true;
      return false;
    });
  });
}

export function getProgItem(progId: string): Program | null {
  return useBaseStore().progList.find(p => p.progId === progId) || null;
}

export function getUrlPrefixFromProgItem(prog: Program | null): string {
  if (!prog) return '';
  let url = prog.url;
  if (url.startsWith('#') && url.length > 2) {
    url = url.substring(1);
  }
  return url;
}

export function escapeQifuHtmlMsg(msg: string): string {
  if (msg === undefined || null == msg) {
    return '';
  }
  return msg.replace(/<br\s*\/?>/gi, '\n');
}

export function getFile2Base64(file: File): Promise<string> {
  return new Promise((resolve, reject) => {
    const reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onload = () => {
      let encoded = reader.result?.toString().replace(/^data:(.*,)?/, '') || '';
      if ((encoded.length % 4) > 0) {
        encoded += '='.repeat(4 - (encoded.length % 4));
      }
      resolve(encoded);
    };
    reader.onerror = error => reject(error);
  });
}

export function checkInvalid(field: string, checkFields: any): boolean {
  let invalid = false;
  for (let d in checkFields) {
    if (field == d && checkFields[d] !== undefined && checkFields[d] !== null) {
      invalid = true;
    }
  }
  return invalid;
}

export function invalidFeedback(field: string, checkFields: any): string {
  let feedback = '';
  for (let d in checkFields) {
    if (field == d && checkFields[d] !== undefined && checkFields[d] !== null) {
      feedback = checkFields[d];
    }
  }
  return feedback;
}

export function getProgItemUrlPrefix(progId: string): string {
  const item = getProgItem(progId);
  return getUrlPrefixFromProgItem(item);
}

export function getMainProgUrlPrefix(mainPageProgId: string): string {
  let url = '';
  const baseStore = useBaseStore();
  const menuData = baseStore.menuList;
  for (let p = 0; p < menuData.length; p++) {
    const fItem = menuData[p];
    for (let c in fItem.items) {
      const cItem = fItem.items[c];
      if (cItem.id == mainPageProgId) {
        url = cItem.url;
      }
    }
  }
  if (url.startsWith('#') && url.length > 2) {
    url = url.substring(1);
  }
  return url;
}

export function getAxiosInstance() {
  const config = useRuntimeConfig();
  axios.defaults.withCredentials = true;
  axios.defaults.xsrfCookieName = 'XSRF-TOKEN';
  axios.defaults.xsrfHeaderName = 'X-XSRF-TOKEN';

  if (interceptorsAttached) {
    return axios;
  }
  interceptorsAttached = true;

  axios.interceptors.request.use(async function (config) {
    const token = getCsrfTokenCookie();
    if (token) {
      config.headers['X-XSRF-TOKEN'] = token;
    }
    return config;
  }, function (error) {
    return Promise.reject(error);
  });

  axios.interceptors.response.use(function (response) {
    const token = response.headers['x-csrf-token'];
    if (token) {
      setCsrfTokenStorage(token);
    }
    return response;
  }, function (error) {
    if (error.response) {
      const status = error.response.status;
      const baseStore = useBaseStore();
      
      switch (status) {
        case 401:
          const refreshTokeUrl = config.public.apiUrl + '/auth/refreshNewToken';
          if (error.config.url.indexOf('/auth/refreshNewToken') > -1) {
            alert('請重新登入系統!');
            window.location.href = '/login';
            return error.response;
          }
          if (error.config.url !== refreshTokeUrl) {
            const originalRequest = error.config;
            if (isRefreshing) {
              return new Promise((resolve, reject) => {
                failedQueue.push({ resolve, reject });
              }).then(() => axios(originalRequest)).catch(err => Promise.reject(err));
            }
            isRefreshing = true;
            return new Promise((resolve, reject) => {
              axios.post(refreshTokeUrl, JSON.stringify({
                username: baseStore.user.id,
                accessToken: '',
                refreshToken: ''
              }))
              .then((response) => {
                if (!response.data) {
                  alert('請重新登入系統!');
                  window.location.href = '/login';
                  processQueue(new Error('no data'), null);
                  reject(response);
                } else {
                  processQueue(null, null);
                  resolve(axios(originalRequest));
                }
              })
              .catch((err) => {
                userLogoutClearCookie();
                alert(`${err.response?.status || 'Unknown'}: 作業逾時或無相關使用授權，請重新登入`);
                window.location.href = '/login';
                processQueue(err, null);
                reject(err);
              })
              .finally(() => {
                isRefreshing = false;
              });
            });
          }
          break;
        default:
          // Other errors can be handled here or in useApi
          break;
      }
    }
    return Promise.reject(error);
  });
  return axios;
}
