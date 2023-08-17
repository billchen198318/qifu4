<script>
import Router from "svelte-spa-router";
import { getMainProgUrlPrefix, getNestedRoutesMap, getProgItem } from "../../components/BaseHelper.svelte";
import QueryPage from "./QueryPage.svelte";
import CreatePage from "./CreatePage.svelte";
import EditPage from "./EditPage.svelte";
import ParamPage from "./ParamPage.svelte";
import { PageConstants } from "./config";

const prefix = getMainProgUrlPrefix(PageConstants.QueryId);
const routes = getNestedRoutesMap(QueryPage, CreatePage, EditPage);

let _setParamUrl = getProgItem(PageConstants.SetParamId).url;
if (_setParamUrl.indexOf('/') > -1 && _setParamUrl.startsWith('#')) {
    let _setParamUrlNs = _setParamUrl.split('/');
    routes.set('/' + _setParamUrlNs[_setParamUrlNs.length-1] + '/:oid', ParamPage);
}

</script>
<div>
    <Router {routes} {prefix} />
</div>