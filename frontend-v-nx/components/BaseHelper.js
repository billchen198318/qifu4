import axios from "axios";
import { getBaseStore } from '../store/baseStore';

let _q4urt_var = import.meta.env.VITE_CK_HEAD_NAME + '__urt_flag';
let _q4uat_var = import.meta.env.VITE_CK_HEAD_NAME + '__uat_flag';

// 2026-05-23 add to prevent refresh token storm
let isRefreshing = false;
let failedQueue = [];
let interceptorsAttached = false;

const processQueue = (error, token = null) => {
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
export function getCookie(name) {
	let v = '';
	try {
		v = useCookie(name).value;
	} catch (e) {
		// fallback to document.cookie
		if (typeof document !== 'undefined') {
			let cookieName = name + "=";
			let decodedCookie = decodeURIComponent(document.cookie);
			let ca = decodedCookie.split(';');
			for(let i = 0; i < ca.length; i++) {
				let c = ca[i];
				while (c.charAt(0) == ' ') {
					c = c.substring(1);
				}
				if (c.indexOf(cookieName) == 0) {
					v = c.substring(cookieName.length, c.length);
					break;
				}
			}
		}
	}
	if (undefined == v || null == v) {
		v = '';
	}
	return v;
}

// SET COOKIE
export function setCookie(name, value, hour, _secure) {
	/*
	const d = new Date();
	d.setTime(d.getTime() + (hour*60*60*1000));
	let expires = "expires="+ d.toUTCString();
	if (secure) {
		document.cookie = name + "=" + value + ";" + expires + ";path=/; secure";
	} else {
		document.cookie = name + "=" + value + ";" + expires + ";path=/";
	}
	*/
	let s = hour*60*60; // 2026-05-23 fix unit to seconds for Nuxt 3 useCookie
	const c = useCookie(name, { maxAge : s, secure : _secure});
	c.value = value;
}

// DELETE COOKIE
export function deleteCookie(name) {
	//document.cookie = name+'=; Max-Age=-99999999;'; 
	const c = useCookie(name);
	c.value = null;
}

export function setRefreshAndAccessTokenCookie(rfToken, accessToken) {
	setCookie(_q4urt_var, 'Y', 24, true); // 2026-05-23 increase to 24 hours to match backend
	setCookie(_q4uat_var, 'Y', 24, true); // 2026-05-23 increase to 24 hours to match backend
}

export function getRefreshTokenCookie() {
	return getCookie(_q4urt_var);
}
    
export function getAccessTokenCookie() {
	return getCookie(_q4uat_var);
}

export function getCsrfTokenCookie() {
	let token = getCookie('XSRF-TOKEN');
	if (!token && typeof window !== 'undefined') {
		token = localStorage.getItem('XSRF-TOKEN-STORAGE') || '';
	}
	return token;
}

export function setCsrfTokenStorage(token) {
	if (token && typeof window !== 'undefined') {
		localStorage.setItem('XSRF-TOKEN-STORAGE', token);
	}
}

export function userLogoutClearCookie(){
	axios.post(import.meta.env.VITE_API_URL + '/auth/logout', {}, { withCredentials: true });
	deleteCookie(_q4urt_var);
	deleteCookie(_q4uat_var);
	if (typeof window !== 'undefined') {
		localStorage.removeItem('XSRF-TOKEN-STORAGE');
	}
}

export function checkUserHasLogined(userData) {
	if (null == userData) {
		userData = getBaseStore().user;
	}
	if (null != userData && !(userData.accessToken === undefined) && '' != userData.accessToken && !(userData.refreshToken === undefined) && '' != userData.refreshToken) {
		return true;
	}
	return false;
}

export function checkHasRole(roleId) {
	var hasRole = false;
	var userData = getBaseStore().user;
	if (null == userData) {
		return hasRole;
	}
	if ('Y' == userData.admin) {
		return true;
	}
	for (var r in userData.roleList) {
		if (roleId == r.role) {
			hasRole = true;
		}
	}
	return hasRole;
}

export function checkHasPermission(perm, urlCheck) {
	var hasPerm = false;
	var userData = getBaseStore().user;
	if (null == userData) {
		return hasPerm;
	}
	if ('Y' == userData.admin) {
		return true;
	}      
	for (var i in userData.roleList) {
		var r = userData.roleList[i];
		if ('admin' == r.role || '*' == r.role) {
			hasPerm = true;
		}
		for (var p in r.rolePermission) {
			var currItemObj = r.rolePermission[p];
			if ('SERVICE' == currItemObj.permType) {
				continue;
			}
			if (perm == currItemObj.permission) {
				hasPerm = true;
			}
			if (urlCheck) {
				if (perm.startsWith(currItemObj.permission)) {
					hasPerm = true;
				} 
			}
		}
	}
	return hasPerm;
}

export function getProgItem(progId) {
	var item = null;
	var progListData = getBaseStore().progList;
	for (var p = 0; p < progListData.length; p++) {
		var fItem = progListData[p];
		if (fItem.progId == progId) {
			item = fItem;
		}
	}
	return item;
}

export function getProgItemUrlPrefix(progId) {
	var url = '';
	var item = null;
	var progListData = getBaseStore().progList;
	for (var p = 0; p < progListData.length; p++) {
		var fItem = progListData[p];
		if (fItem.progId == progId) {
			item = fItem;
		}
	}
	return getUrlPrefixFromProgItem(item);
}

export function getUrlPrefixFromProgItem(prog) {
	if (null == prog) {
		return '';
	}
	var url = prog.url;
	if (url.startsWith('#') && url.length > 2) {
		url = url.substring(1, url.length);
	}
	return url;
}

export function getMainProgUrlPrefix(mainPageProgId) {
	var url = '';
	var menuData = getBaseStore().menuList;
	for (var p = 0; p < menuData.length; p++) {
		var fItem = menuData[p];
		for (var c in fItem.items) {
			var cItem = fItem.items[c];
			if (cItem.id == mainPageProgId) {
				url = cItem.url;
			}
		}
	}
	if (url.startsWith('#') && url.length > 2) {
		url = url.substring(1, url.length);
	}
	return url;
}

export function checkInvalid(field, checkFields) {
	var invalid = false;
	for (var d in checkFields) {
		if (field == d && !(undefined === checkFields[d]) && null != checkFields[d]) {
			invalid = true;
		}
	}
	return invalid;
}

export function invalidFeedback(field, checkFields) {
	var feedback = '';
	for (var d in checkFields) {
		if (field == d && !(undefined === checkFields[d]) && null != checkFields[d]) {
			feedback = checkFields[d];
		}
	}
	return feedback;
}

export function escapeQifuHtmlMsg(msg) {
	if (msg === undefined || null == msg) {
		return '';
	}
	return msg.replace(/<br\s*\/?>/gi, '\n');
}

export function getFile2Base64(file) {
	return new Promise((resolve, reject) => {
		const reader = new FileReader();
		reader.readAsDataURL(file);
		reader.onload = () => {
			let encoded = reader.result.toString().replace(/^data:(.*,)?/, '');
			if ((encoded.length % 4) > 0) {
				encoded += '='.repeat(4 - (encoded.length % 4));
			}
			resolve(encoded);
		};
		reader.onerror = error => reject(error);
	});
}

export function getAxiosInstance() {

	axios.defaults.withCredentials = true;
	axios.defaults.xsrfCookieName = 'XSRF-TOKEN';
	axios.defaults.xsrfHeaderName = 'X-XSRF-TOKEN';
	axios.defaults.headers = {
		'Content-Type' : 'application/json'
	};

	if (interceptorsAttached) {
		return axios;
	}
	interceptorsAttached = true;

	// 全局設定 AJAX Request 攔截器 (interceptor)
	axios.interceptors.request.use(async function (config) {
		const token = getCsrfTokenCookie();
		if (token) {
			config.headers['X-XSRF-TOKEN'] = token;
		}
		return config
	}, function (error) {
		return Promise.reject(error)
	});
	
	// 全局設定 AJAX Response 攔截器 (interceptor)
	axios.interceptors.response.use(function (response) {
		// Sync CSRF token from header to storage
		const token = response.headers['x-csrf-token'];
		if (token) {
			setCsrfTokenStorage(token);
		}
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

					if (error.config.url.indexOf('/auth/refreshNewToken') > -1) { // 2024-04-25 add
						alert('請重新登入系統!');
						window.location.href = '/';
						return error.response;
					}
					
					if (error.config.url !== refreshTokeUrl) {
						// 原始 request 資訊
						const originalRequest = error.config

						if (isRefreshing) {
							return new Promise(function(resolve, reject) {
								failedQueue.push({resolve, reject});
							}).then(() => {
								return axios(originalRequest);
							}).catch(err => {
								return Promise.reject(err);
							});
						}

						isRefreshing = true;

						// 依據 refresh_token 刷新 access_token 並重發 request
						return new Promise(function(resolve, reject) {
							axios.post(refreshTokeUrl, JSON.stringify({
								username : getBaseStore().user.id,
								accessToken : '',
								refreshToken : ''
							})) // refresh_toke is attached in cookie
							.then((response) => {
								if (undefined == response.data || null == response.data) { // 2024-04-25 add
									alert('請重新登入系統!');
									window.location.href = '/';
									// return response;
									processQueue(new Error('no data'), null);
									reject(response);
								} else {
									processQueue(null, null);
									resolve(axios(originalRequest));
								}
							})
							.catch((err) => {
								// [更新 access_token 失敗] ( e.g. refresh_token 過期無效)
								userLogoutClearCookie();
								alert(`${err.response.status}: 作業逾時或無相關使用授權，請重新登入`)
								window.location.href = '/'
								processQueue(err, null);
								reject(err);
							})
							.finally(() => {
								isRefreshing = false;
							});
						});
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
		
		return Promise.reject(error);
	});
	return axios;
}
