import {
	wrap
} from 'svelte-spa-router/wrap'

export const routes = {
	"/prog001": wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0001Q/IndexPage.svelte')
	}),
	"/prog001/*": wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0001Q/IndexPage.svelte')
	}),
	"/prog002": wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0002Q/IndexPage.svelte')
	}),
	"/prog002/*": wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0002Q/IndexPage.svelte')
	}),	
	"/about": wrap({
		asyncComponent: () => import('./pages/About.svelte')
	}),
	"/": wrap({
		asyncComponent: () => import('./pages/About.svelte')
	}),
	"*": wrap({
		asyncComponent: () => import('./pages/NotFound.svelte')
	})
};