<script>
import Router from "svelte-spa-router";
import { getMainProgUrlPrefix, getNestedRoutesMap } from "../../components/BaseHelper.svelte";
import QueryPage from "./QueryPage.svelte";
import CreatePage from "./CreatePage.svelte";
import EditPage from "./EditPage.svelte";
import { PAGE_ID_Query } from "./config";

const prefix = getMainProgUrlPrefix(PAGE_ID_Query);
const routes = getNestedRoutesMap(QueryPage, CreatePage, EditPage);

</script>
<div>
    <Router {routes} {prefix} />
</div>