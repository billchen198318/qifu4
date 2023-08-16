import {
	wrap
} from 'svelte-spa-router/wrap'

export const routes = {
	"/prog001d0001"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0001Q/IndexPage.svelte')
	}),
	"/prog001d0001/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0001Q/IndexPage.svelte')
	}),
	"/prog001d0002"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0002Q/IndexPage.svelte')
	}),
	"/prog001d0002/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0002Q/IndexPage.svelte')
	}),	
	"/prog001d0003"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0003Q/IndexPage.svelte')
	}),	
	"/prog001d0004"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0004Q/IndexPage.svelte')
	}),
	"/prog001d0004/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0004Q/IndexPage.svelte')
	}),		
	"/about"			: wrap({
		asyncComponent: () => import('./pages/About.svelte')
	}),
	"/"					: wrap({
		asyncComponent: () => import('./pages/About.svelte')
	}),
	"*"					: wrap({
		asyncComponent: () => import('./pages/NotFound.svelte')
	})
};