<script>
import { onMount, onDestroy } from 'svelte';    
import { goto } from '$app/navigation';
import { 
    FormGroup, Input, Label, Button, Icon
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme, getToastSuccessTheme, getUrlNoStartSign,
    invalidFeedback, checkInvalid
} from "../../../components/BaseHelper.svelte";
import Toolbar from "../../../components/Toolbar.svelte";
import { PageConstants } from '../config';

let toolbarParam = {
    id          : PageConstants.CreateId,
    description : '站台測試用，新增資料作業.',
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
    'sysId'         :   '',
    'name'          :   '',
    'host'          :   '',
    'contextPath'   :   '',
    'isLocal'       :   'N',
    'icon'          :   'SYSTEM'
}

var checkFields = new Object();

onMount(()=>{

});

onDestroy(()=> {
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
    formParam.sysId = '';
    formParam.name = '';
    formParam.host = '';
    formParam.contextPath = '';
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
            <Label for="sysId">編號</Label>
            <Input
            type="text"
            id="sysId"
            placeholder="輸入編號"     
            feedback={invalidFeedback('sysId', checkFields)}
            invalid={checkInvalid('sysId', checkFields)}
            bind:value={formParam.sysId}     
            />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="name">名稱</Label>
            <Input
            type="text"
            id="name"
            placeholder="輸入名稱"     
            feedback={invalidFeedback('name', checkFields)}
            invalid={checkInvalid('name', checkFields)}
            bind:value={formParam.name}     
            />
        </FormGroup> 
    </div>    
</div>        
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="host">Host</Label>
            <Input
            type="text"
            id="host"
            placeholder="輸入Host"     
            feedback={invalidFeedback('host', checkFields)}
            invalid={checkInvalid('host', checkFields)}
            bind:value={formParam.host}     
            />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="name">Context path</Label>
            <Input
            type="text"
            id="contextPath"
            placeholder="輸入Context path"     
            feedback={invalidFeedback('contextPath', checkFields)}
            invalid={checkInvalid('contextPath', checkFields)}
            bind:value={formParam.contextPath}     
            />
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
