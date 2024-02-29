<script>
import Router from "svelte-spa-router";
import { wrap } from 'svelte-spa-router/wrap';
import { getMainProgUrlPrefix, getNestedRoutesMap, getProgItem } from "../../components/BaseHelper.svelte";
import { PageConstants } from "./config";

let _setParamUrl = getProgItem(PageConstants.SetParamId).url;
if (_setParamUrl.indexOf('/') > -1 && _setParamUrl.startsWith('#')) {
    let _setParamUrlNs = _setParamUrl.split('/');
    _setParamUrl = '/' + _setParamUrlNs[_setParamUrlNs.length-1] + '/:oid';
}

const prefix = getMainProgUrlPrefix(PageConstants.QueryId);
const routes = getNestedRoutesMap(
    wrap({ asyncComponent: () => import('./QueryPage.svelte') }), 
    wrap({ asyncComponent: () => import('./CreatePage.svelte') }), 
    wrap({ asyncComponent: () => import('./EditPage.svelte') }),
    [
        {
            'url'   :   _setParamUrl,
            'page'  :   wrap({ asyncComponent: () => import('./ParamPage.svelte') })
        }
    ]
);

</script>
<div>
    <Router {routes} {prefix} />
</div>
