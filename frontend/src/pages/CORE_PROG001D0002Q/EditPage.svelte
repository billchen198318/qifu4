<script>
import { onMount } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
    FormGroup, Input, Label, Button, Icon
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme, getToastSuccessTheme,
    invalidFeedback, checkInvalid
} from "../../components/BaseHelper.svelte";
import Toolbar from "../../components/Toolbar.svelte";
import { EVENT_NAMESPACE, PAGE_ID_Query, PAGE_ID_Create, PAGE_ID_Edit } from './config';

let toolbarParam = {
    id          : PAGE_ID_Edit,
    description : '程式管理，修改資料作業.',
    methods     : {
        "back"      :   function() {
            push( getProgItem(PAGE_ID_Query).url );
        }
        ,
        "refresh"   :   function() {
            //loadData();
        }
        ,
        "save"      :   function() {
            //btnUpdate();
        } 
    }
}

export let params = {};


</script>

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Toolbar args={toolbarParam}></Toolbar>
    </div>
</div>

<SvelteToast></SvelteToast>
