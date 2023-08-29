import {
	wrap
} from 'svelte-spa-router/wrap'

export const routes = {
	"/prog001d0001"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0001/IndexPage.svelte')
	}),
	"/prog001d0001/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0001/IndexPage.svelte')
	}),
	"/prog001d0002"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0002/IndexPage.svelte')
	}),
	"/prog001d0002/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0002/IndexPage.svelte')
	}),	
	"/prog001d0003"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0003/IndexPage.svelte')
	}),	
	"/prog001d0004"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0004/IndexPage.svelte')
	}),
	"/prog001d0004/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0004/IndexPage.svelte')
	}),		
	"/prog001d0005"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0005/IndexPage.svelte')
	}),			
	"/prog001d0005/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG001D0005/IndexPage.svelte')
	}),
	"/prog002d0001"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG002D0001/IndexPage.svelte')
	}),			
	"/prog002d0001/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG002D0001/IndexPage.svelte')
	}),	
	"/prog002d0002"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG002D0002/IndexPage.svelte')
	}),
	"/prog002d0002/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG002D0002/IndexPage.svelte')
	}),	
	"/prog002d0003"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG002D0003/IndexPage.svelte')
	}),
	"/prog002d0003/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG002D0003/IndexPage.svelte')
	}),		
	"/prog004d0001"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG004D0001/IndexPage.svelte')
	}),
	"/prog004d0001/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG004D0001/IndexPage.svelte')
	}),	
	"/prog004d0002"		: wrap({
		asyncComponent: () => import('./pages/CORE_PROG004D0002/IndexPage.svelte')
	}),
	"/prog004d0002/*"	: wrap({
		asyncComponent: () => import('./pages/CORE_PROG004D0002/IndexPage.svelte')
	}),						
	"/nopermission"		: wrap({
		asyncComponent: () => import('./pages/NoPermission.svelte')
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