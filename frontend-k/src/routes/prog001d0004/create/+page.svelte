<script>
import { onMount, onDestroy } from 'svelte';    
import { goto } from '$app/navigation';
import { 
    FormGroup, Input, Label, Button, Icon
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import Editor from '../../../../node_modules/bytemd/svelte/editor.svelte';
import 'bytemd/dist/index.css';
import importHtml from '@bytemd/plugin-import-html';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme, getToastSuccessTheme, getUrlNoStartSign,
    invalidFeedback, checkInvalid
} from "../../../components/BaseHelper.svelte";
import Toolbar from "../../../components/Toolbar.svelte";
import { PageConstants } from '../config';

let toolbarParam = {
    id          : PageConstants.CreateId,
    description : 'Freemarker 樣板管理，新增資料作業.',
    methods     : {
        "back"      :   function() {
            goto( getUrlNoStartSign(getProgItem(PageConstants.QueryId).url) );
        }
        ,
        "refresh"   :   function() {
            btnClear();
        }
        ,
        "save"      :   function() {
            btnSave();
        } 
    }
}

var formParam = {
    'templateId'    :   '',
    'title'         :   '',
    'message'       :   '',
    'description'   :   ''
}

var checkFields = new Object();

const plugins = [ importHtml() ];

function handleChange(e) {
    formParam.message = e.detail.value;
}

onMount(()=>{
    
});

onDestroy(()=>{
	toast.pop(0);
});

function btnSave() {
    checkFields = new Object();
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading();      
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/save', formParam)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            checkFields = response.data.checkFields;
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }            
            toast.push(response.data.message, getToastSuccessTheme());   
            btnClear();
        } else {
            toast.push('error, null', getToastErrorTheme());
        }
    })
    .catch(e => {
        Swal.hideLoading();
        Swal.close();        
        alert(e);
    }); 
}

function btnClear() {
    checkFields = new Object();
    formParam.templateId = '';
    formParam.title = '';
    formParam.message = '';
    formParam.description = '';
}

</script>

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Toolbar args={toolbarParam}></Toolbar>
    </div>
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="templateId">樣板編號</Label>
            <Input type="text" id="templateId" placeholder="輸入樣板編號" feedback={invalidFeedback('templateId', checkFields)} invalid={checkInvalid('templateId', checkFields)} bind:value={formParam.templateId} />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="title">樣板標題</Label>
            <Input type="text" id="title" placeholder="輸入樣板標題" feedback={invalidFeedback('title', checkFields)} invalid={checkInvalid('title', checkFields)} bind:value={formParam.title} />
        </FormGroup> 
    </div>    
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Editor value={formParam.message} {plugins} on:change={handleChange} />        
    </div>
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <FormGroup>
            <Label for="description">說明</Label>
            <Input type="textarea" id="description" row="3" col="25" bind:value={formParam.description} />            
        </FormGroup>
    </div>
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Button color="primary" on:click={btnSave}><Icon name="save"/>&nbsp;儲存</Button>
        &nbsp;
        <Button color="primary" on:click={btnClear}><Icon name="eraser"/>&nbsp;清除</Button>
    </div>
</div>    

<SvelteToast></SvelteToast>
