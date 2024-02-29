import { dev } from '$app/environment';
import { error } from '@sveltejs/kit';
export const csr = true;

export function load({ params }) {
  if (params.oid != null) {
    return {
      'oid' : params.oid
    };
  }
  throw error(404, 'Not found parameter!');
}