import { useRuntimeConfig } from '#app'
import { getCsrfTokenCookie, setCsrfTokenStorage, userLogoutClearCookie } from '../components/BaseHelper'
import { useBaseStore } from '../store/baseStore'

// 2026-06-01 add to prevent refresh token storm
let isRefreshing = false
let failedQueue: any[] = []

/**
 * Process the waiting requests in the queue
 * @param error If provided, all waiting requests will be rejected with this error
 * @param token Optional new token (not currently used for retry logic in this implementation)
 */
const processQueue = (error: any, token: string | null = null) => {
  failedQueue.forEach((prom) => {
    if (error) {
      // Mark the error as "already attempted refresh" to prevent infinite loops
      if (typeof error === 'object' && error !== null) {
        error.__isRefreshed = true
      }
      prom.reject(error)
    } else {
      prom.resolve(token)
    }
  })
  failedQueue = []
}

export const useApi = async (url: string, opts: any = {}) => {
  const config = useRuntimeConfig()
  const baseStore = useBaseStore()
  const apiUrl = config.public.apiUrl

  const defaultOpts = {
    baseURL: apiUrl,
    headers: {
      'Content-Type': 'application/json',
      'X-XSRF-TOKEN': getCsrfTokenCookie()
    },
    credentials: 'include',
    onRequest({ options }: any) {
      const token = getCsrfTokenCookie()
      if (token) {
        options.headers['X-XSRF-TOKEN'] = token
      }
    },
    onResponse({ response }: any) {
      const token = response.headers.get('X-CSRF-TOKEN')
      if (token) {
        setCsrfTokenStorage(token)
      }
    }
  }

  const mergedOpts = { ...defaultOpts, ...opts }

  try {
    return await $fetch(url, mergedOpts)
  } catch (error: any) {
    const status = error.response?.status
    const data = error.response?._data
    
    // Check if the URL should be excluded from refresh logic
    const isLoginPage = typeof window !== 'undefined' && window.location.pathname === '/login'
    const isExcluded = url.includes('/auth/signin') || 
                       url.includes('/auth/logout') || 
                       url.includes('/auth/validLogined') || 
                       url.includes('/auth/refreshNewToken') ||
                       isLoginPage

    // If 401 and not excluded and hasn't tried refreshing for this specific error instance
    if (status === 401 && !isExcluded && !error.__isRefreshed) {
      if (isRefreshing) {
        return new Promise((resolve, reject) => {
          failedQueue.push({ resolve, reject })
        })
        .then(() => $fetch(url, mergedOpts))
        .catch(err => {
          // If the retry fails, don't let it trigger another refresh cycle
          if (err && typeof err === 'object') err.__isRefreshed = true
          return Promise.reject(err)
        })
      }

      isRefreshing = true
      const refreshTokeUrl = '/auth/refreshNewToken'
      
      try {
        // Isolated refresh request to avoid 415 or other header-related issues
        await $fetch(refreshTokeUrl, {
          baseURL: apiUrl,
          method: 'POST',
          credentials: 'include',
          headers: {
            'Content-Type': 'application/json'
          },
          body: {
            accessToken: '',
            refreshToken: ''
          }
        })
        
        isRefreshing = false
        processQueue(null, null)
        
        // Retry the original request
        return await $fetch(url, mergedOpts)
      } catch (err: any) {
        isRefreshing = false
        processQueue(err, null)
        
        userLogoutClearCookie()
        if (typeof window !== 'undefined') {
          // Only the "leader" request shows the alert
          alert(`${err.response?.status || 'Unknown'}: 作業逾時或無相關使用授權，請重新登入`)
          window.location.href = '/login'
        }
        
        if (err && typeof err === 'object') err.__isRefreshed = true
        throw err
      }
    }

    // Handle other errors (Client-side only)
    if (status && typeof window !== 'undefined' && !error.__isRefreshed) {
      switch (status) {
        case 400:
          alert(`Error 400: ${data?.message || 'Invalid Request'}`)
          break
        case 401:
          // If it reached here, it's either excluded or refresh failed
          if (url.includes('/auth/refreshNewToken')) {
            alert('請重新登入系統!')
            window.location.href = '/login'
          } else if (url.includes('/auth/signin')) {
            // Login failed, don't alert here as login.vue handles it
          } else {
            // Other 401s that didn't go through refresh (or refresh failed)
            // Most will be redirected by the refresh catch block above
          }
          break
        case 404:
          alert('Error 404: Resource not found')
          break
        case 500:
          alert('Error 500: Internal Server Error')
          break
        default:
          alert(`Error ${status}: ${data?.message || 'Unexpected error'}`)
      }
    }
    throw error
  }
}
