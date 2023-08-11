import { wrap } from 'svelte-spa-router/wrap'
import PROG001 from "./pages/CORE_PROG001D/IndexPage.svelte";
import About from "./pages/About.svelte"

export const routes = {  
  "/prog001"    : PROG001,
  "/prog001/*"  : PROG001,
  "/about"      : About,
  "*"           : wrap({
    asyncComponent: () => import('./pages/NotFound.svelte')
  })
};
