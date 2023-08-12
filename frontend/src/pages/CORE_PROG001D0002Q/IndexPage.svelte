<script>
import Router from "svelte-spa-router";
import { getMainProgUrlPrefix, getNestedRoutesMap } from "../../components/BaseHelper.svelte";
import QueryPage from "./QueryPage.svelte";
import CreatePage from "./CreatePage.svelte";
import EditPage from "./EditPage.svelte";

const prefix = getMainProgUrlPrefix('CORE_PROG001D0002Q');
const routes = getNestedRoutesMap(QueryPage, CreatePage, EditPage);

</script>
<div>
    <Router {routes} {prefix} />
</div>