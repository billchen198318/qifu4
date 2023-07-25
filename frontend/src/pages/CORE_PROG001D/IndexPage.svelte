<script>
import Router from "svelte-spa-router";
import { getProgFolderUrlPrefix } from "../../components/BaseHelper.svelte";
import QueryPage from "./QueryPage.svelte";
import CreatePage from "./CreatePage.svelte";
import EditPage from "./EditPage.svelte";

//const prefix = '/prog001';
const prefix = getProgFolderUrlPrefix('CORE_PROG001D');
//alert('prefix=' + prefix);
const routes = new Map()
        .set("/", QueryPage)
        .set("/create", CreatePage)
        .set("/edit/:oid", EditPage)
        .set(/^\/(.*?)(\/(.*?))?/, QueryPage);
</script>
<div>
    <Router {routes} {prefix} />
</div>