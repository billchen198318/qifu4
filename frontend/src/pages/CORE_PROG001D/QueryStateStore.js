import { writable } from 'svelte/store';

export const _queryState = writable({ page : 1, row : 10 });
export const _queryParam = writable({});
