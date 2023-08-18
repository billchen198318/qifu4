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
import { PageConstants } from './config';

let toolbarParam = {
    id          : PageConstants.SetParamId,
    description : 'Freemarker 樣板管理，配置參數作業.',
    methods     : {
        "back"      :   function() {
            push( getProgItem(PageConstants.QueryId).url );
        }
        ,
        "refresh"   :   function() {
            loadData();
        }
        ,
        "save"      :   function() {
            btnUpdate();
        } 
    }
}

export let params = {};

var masterParam = {
    'templateOid'   :   params.oid,
    'templateId'    :   '',
    'title'         :   ''
}

var formParam = {
    'templateId'    :   '',
    'isTitle'       :   'N',
    'isTitleVar'    :   false,
    'templateVar'   :   '',
    'objectVar'     :   ''
}

var paramList = [];

var checkFields = new Object();

onMount(()=>{
    loadData();
});

function loadData() {
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', {'oid' : params.oid})
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                push( getProgItem(PageConstants.QueryId).url );
                return;
            }
            masterParam = response.data.value;
            formParam.templateId = masterParam.templateId;
            queryParamList();
        } else {
            toast.push('error, null', getToastErrorTheme());
            push( getProgItem(PageConstants.QueryId).url );
        }
    })
    .catch(e => {
        Swal.hideLoading();
        Swal.close();        
        alert(e);
        push( getProgItem(PageConstants.QueryId).url );
    });
}

function queryParamList() {
    paramList = [];
    
}

function btnUpdate() {

}

$ : {
    if (formParam.isTitleVar) {
        formParam.isTitle = 'Y';
    } else {
        formParam.isTitle = 'N';
    }
}

</script>

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Toolbar args={toolbarParam}></Toolbar>
    </div>
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        樣板編號:&nbsp;{masterParam.templateId}
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        樣板標題:&nbsp;{masterParam.title}
    </div>    
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="templateVar">樣板變數</Label>
            <Input type="text" id="templateVar" placeholder="輸入樣板變數" feedback={invalidFeedback('templateVar', checkFields)} invalid={checkInvalid('templateVar', checkFields)} bind:value={formParam.templateVar} />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="objectVar">物件變數</Label>
            <Input type="text" id="objectVar" placeholder="輸入物件變數" feedback={invalidFeedback('objectVar', checkFields)} invalid={checkInvalid('objectVar', checkFields)} bind:value={formParam.objectVar} />
        </FormGroup>          
    </div>    
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Input id="isTitle" type="switch" label="是否標題用" bind:checked={formParam.isTitleVar} />
    </div>
</div>

<SvelteToast></SvelteToast>
