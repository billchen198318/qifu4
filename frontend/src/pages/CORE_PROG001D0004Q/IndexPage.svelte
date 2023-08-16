<script>
import Router from "svelte-spa-router";
import { getMainProgUrlPrefix, getNestedRoutesMap } from "../../components/BaseHelper.svelte";
import QueryPage from "./QueryPage.svelte";
import CreatePage from "./CreatePage.svelte";
import EditPage from "./EditPage.svelte";
import ParamPage from "./ParamPage.svelte";
import { PageConstants } from "./config";

const prefix = getMainProgUrlPrefix(PageConstants.QueryId);
const routes = getNestedRoutesMap(QueryPage, CreatePage, EditPage);

routes.set("/setparam", ParamPage);

</script>
<div>
    <Router {routes} {prefix} />
</div>