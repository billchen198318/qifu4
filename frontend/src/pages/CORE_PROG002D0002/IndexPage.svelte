<script>
import Router from "svelte-spa-router";
import { wrap } from 'svelte-spa-router/wrap';
import { getMainProgUrlPrefix, getNestedRoutesMap, getProgItem } from "../../components/BaseHelper.svelte";
import { PageConstants } from "./config";

const prefix = getMainProgUrlPrefix(PageConstants.QueryId);
const routes = getNestedRoutesMap(
    wrap({ asyncComponent: () => import('./QueryPage.svelte') }), 
    null,
    null
);

</script>
<div>
    <Router {routes} {prefix} />
</div>