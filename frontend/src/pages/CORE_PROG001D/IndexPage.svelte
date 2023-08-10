<script>
import Router from "svelte-spa-router";
import { getProgFolderUrlPrefix, getNestedRoutesMap } from "../../components/BaseHelper.svelte";
import QueryPage from "./QueryPage.svelte";
import CreatePage from "./CreatePage.svelte";
import EditPage from "./EditPage.svelte";

const prefix = getProgFolderUrlPrefix('CORE_PROG001D');
const routes = getNestedRoutesMap(QueryPage, CreatePage, EditPage);

</script>
<div>
    <Router {routes} {prefix} />
</div>