import { useRuntimeConfig, useCookie } from '#app'
import { getCsrfTokenCookie, setCsrfTokenStorage, userLogoutClearCookie } from '../components/BaseHelper'
import { useBaseStore } from '../store/baseStore'
import Swal from 'sweetalert2'

export const useApi = (url: string, opts: any = {}) => {
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
    onRequest({ request, options }: any) {
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
    },
    onResponseError({ response }: any) {
      const status = response.status
      const data = response._data

      switch (status) {
        case 400:
          Swal.fire('Error 400', data?.message || 'Invalid Request', 'error')
          break
        case 401:
          if (url.includes('/auth/refreshNewToken')) {
            Swal.fire('Session Expired', 'Please login again.', 'warning').then(() => {
              window.location.href = '/login'
            })
          } else {
            // Logic for token refresh could go here if handled globally
          }
          break
        case 404:
          Swal.fire('Error 404', 'Resource not found', 'error')
          break
        case 500:
          Swal.fire('Error 500', 'Internal Server Error', 'error')
          break
        default:
          Swal.fire('Error', `Unexpected error: ${status}`, 'error')
      }
    }
  }

  const mergedOpts = { ...defaultOpts, ...opts }
  return $fetch(url, mergedOpts)
}
