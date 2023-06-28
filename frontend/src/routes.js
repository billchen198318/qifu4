import { wrap } from 'svelte-spa-router/wrap'

import PROG01 from "./components/PROG01.svelte";
import About from "./components/About.svelte"
import Prog01C1 from "./components/PROG01_routes/PROG01_c1.svelte";
import Prog01C2 from "./components/PROG01_routes/PROG01_c2.svelte";


export const routes = {  
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
      asyncComponent: () => import('./components/PROG01_routes/PROG01_c2.svelte')
  }),
  
  "*"   : wrap({
    asyncComponent: () => import('./components/NotFound.svelte')
  })

};