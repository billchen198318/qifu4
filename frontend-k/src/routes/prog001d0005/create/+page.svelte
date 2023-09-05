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
    invalidFeedback, checkInvalid,
    getFile2Base64
} from "../../../components/BaseHelper.svelte";
import Toolbar from "../../../components/Toolbar.svelte";
import { PageConstants } from '../config';

let toolbarParam = {
    id          : PageConstants.CreateId,
    description : 'Jasperreport resources管理，新增資料作業.',
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

let files, input;
let currFileBase64Content;
var formParam = {
    'reportId'      :   '',
    'description'   :   '',
    'isCompile'     :   'N',
    'compile'       :   false,
    'uploadBase64'  :   '',
    'file'          :   ''
}

$ : {
    if (formParam.compile) {
        formParam.isCompile = 'Y';
    } else {
        formParam.isCompile = 'N';
    }

    if (files != null && files.length > 0) {
        if (files[0].size > 1 && files[0].size <= import.meta.env.VITE_UPLOAD_MAX_SIZE ) {
            getFile2Base64(files[0]).then(c => { 
                currFileBase64Content = c;
            }).catch(e => { 
                currFileBase64Content = ''; 
            });            
        }
    }
}

var checkFields = new Object();

onMount(()=>{
    
});

onDestroy(()=>{
	toast.pop(0);
});

function btnSave() {
    checkFields = new Object();
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading();      
    formParam.uploadBase64 = currFileBase64Content;
    if (files != null && files.length > 0) {
        if (files[0].size < 1 || files[0].size > import.meta.env.VITE_UPLOAD_MAX_SIZE ) {
            Swal.hideLoading();
            Swal.close();           
            toast.push('檔案大小超過規範', getToastWarningTheme());    
            return;
        }
        if (!files[0].name.toLowerCase().endsWith('.zip')) {
            Swal.hideLoading();
            Swal.close();           
            toast.push('只允許上傳zip檔案', getToastWarningTheme());               
            return;
        }
        formParam.file = files[0].name;
    }
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
    formParam.reportId = '';
    formParam.description = '';
    formParam.compile = false;
    formParam.isCompile = 'N';
    formParam.file = '';
    currFileBase64Content = '';
    input.value = '';
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
            <Label for="reportId">報表編號</Label>
            <Input type="text" id="reportId" placeholder="輸入報表編號" feedback={invalidFeedback('templateId', checkFields)} invalid={checkInvalid('reportId', checkFields)} bind:value={formParam.reportId} />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="jasperZipFile">jasperreport資源zip壓縮檔</Label>
            <input type="file" class="form-control" id="jasperZipFile" bind:files bind:this={input} feedback={invalidFeedback('file', checkFields)} invalid={checkInvalid('file', checkFields)} />
        </FormGroup>
    </div>    
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <FormGroup>
            <Input id="compile" type="switch" label="編譯jrxml" bind:checked={formParam.compile} />            
        </FormGroup>         
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
