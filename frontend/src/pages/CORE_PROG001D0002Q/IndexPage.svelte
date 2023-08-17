<script>
import Router from "svelte-spa-router";
import { wrap } from 'svelte-spa-router/wrap';
import { getMainProgUrlPrefix, getNestedRoutesMap } from "../../components/BaseHelper.svelte";
import { PageConstants } from "./config";

const prefix = getMainProgUrlPrefix(PageConstants.QueryId);
const routes = getNestedRoutesMap(
    wrap({ asyncComponent: () => import('./QueryPage.svelte') }), 
    wrap({ asyncComponent: () => import('./CreatePage.svelte') }), 
    wrap({ asyncComponent: () => import('./EditPage.svelte') })
);

</script>
<div>
    <Router {routes} {prefix} />
</div>