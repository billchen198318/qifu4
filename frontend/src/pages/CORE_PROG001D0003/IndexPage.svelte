<script>
    import Router from "svelte-spa-router";
    import { getMainProgUrlPrefix, getNestedRoutesMap } from "../../components/BaseHelper.svelte";
    import QueryPage from "./QueryPage.svelte";
    import { PageConstants } from "./config";
    
    const prefix = getMainProgUrlPrefix(PageConstants.QueryId);
    const routes = getNestedRoutesMap(QueryPage, null, null);
    
    </script>
    <div>
        <Router {routes} {prefix} />
    </div>