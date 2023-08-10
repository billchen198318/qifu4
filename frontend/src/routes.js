import { wrap } from 'svelte-spa-router/wrap'

import PROG001 from "./pages/CORE_PROG001D/IndexPage.svelte";

/* ------------------- 測試,之後要移除掉 ------------------- */
import PROG01 from "./pages/PROG01.svelte";
import About from "./pages/About.svelte"
import Prog01C1 from "./pages/PROG01_routes/PROG01_c1.svelte";
import Prog01C2 from "./pages/PROG01_routes/PROG01_c2.svelte";


export const routes = {  
  "/prog001"      : PROG001,
  "/prog001/*"    : PROG001,

  

  /* ------------------- 測試,之後要移除掉 ------------------- */
  "/prog01"   : wrap({
      component : PROG01,
      conditions: [
        async (detail) => {
          //console.log(detail);
          console.log("route>>>" + detail.route);
          /*
          if has auth >>> return true;
          else >>> return false;
          */
          return true;
        }
      ]
  }),
  "/about"    : About,

  "/prog01c1" : Prog01C1,

  //"/prog01/c2/:oid" : Prog01C2,
  // dynamically-imported module
  "/prog01/c2/:oid" : wrap({
      asyncComponent: () => import('./pages/PROG01_routes/PROG01_c2.svelte')
  }),

  
  "*"   : wrap({
    asyncComponent: () => import('./pages/NotFound.svelte')
  })

};