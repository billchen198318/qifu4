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
    id          : PageConstants.EditId,
    description : '程式管理，修改資料作業.',
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

var formParam = {
    'oid'               :   params.oid,
    'progId'            :   '',
    'name'              :   '',
    'url'               :   '',
    'editModeVar'       :   false,
    'isDialogVar'       :   false,
    'editMode'          :   'N',
    'isDialog'          :   'N',    
    'dialogW'           :   '0',
    'dialogH'           :   '0',
    'progSystem'        :   'CORE',
    'itemType'          :   'ITEM',
    'fontIconClassId'   :   'globe2',
    'icon'              :   'SYSTEM'
}

var checkFields = new Object();

onMount(()=>{
    loadData();
});

function loadData() {
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', {'oid' : formParam.oid})
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                push( getProgItem(PageConstants.QueryId).url );
                return;
            }
            formParam = response.data.value;
            formParam.editModeVar = false;
            formParam.isDialogVar = false;
            if ('Y' == formParam.editMode) {
                formParam.editModeVar = true;
            }
            if ('Y' == formParam.isDialog) {
                formParam.isDialogVar = true;
            }
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

function btnUpdate() {
    checkFields = new Object();
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading();      
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/update', formParam)
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
    //formParam.progId = '';
    formParam.name = '';
    formParam.url = '';
    formParam.editModeVar = false;
    formParam.isDialogVar = false;
    formParam.editMode = 'N';
    formParam.isDialog = 'N';
    formParam.dialogW = '0';
    formParam.dialogH = '0';
    formParam.progSystem = 'CORE';
    formParam.itemType = 'ITEM';
    formParam.fontIconClassId = 'globe2';
    formParam.icon = 'SYSTEM';
}

$ : {
    if (formParam.editModeVar) {
        formParam.editMode = 'Y';
    } else {
        formParam.editMode = 'N';
    }

    if (formParam.isDialogVar) {
        formParam.isDialog = 'Y';
    } else {
        formParam.isDialog = 'N';
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
        <FormGroup>
            <Label for="progId">程式編號</Label>
            <Input type="text" id="progId" placeholder="輸入程式編號" feedback={invalidFeedback('progId', checkFields)} invalid={checkInvalid('progId', checkFields)} bind:value={formParam.progId} />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="name">程式名稱</Label>
            <Input type="text" id="name" placeholder="輸入名稱" feedback={invalidFeedback('name', checkFields)} invalid={checkInvalid('name', checkFields)} bind:value={formParam.name} />
        </FormGroup> 
    </div>    
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <FormGroup>
            <Label for="url">Url</Label>
            <Input type="text" id="url" placeholder="輸入Url" feedback={invalidFeedback('url', checkFields)} invalid={checkInvalid('url', checkFields)} bind:value={formParam.url} />            
        </FormGroup>
    </div>
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Input id="editMode" type="switch" label="編輯頁" bind:checked={formParam.editModeVar} />            
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Input id="isDialog" type="switch" label="Dialog模式" bind:checked={formParam.isDialogVar} />
        </FormGroup> 
    </div>    
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="dialogW">Dialog寬</Label>
            <Input type="number" id="dialogW" placeholder="Dialog width" feedback={invalidFeedback('dialogW', checkFields)} invalid={checkInvalid('dialogW', checkFields)} bind:value={formParam.dialogW} />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="dialogH">Dialog高</Label>
            <Input type="number" id="dialogH" placeholder="Dialog height" feedback={invalidFeedback('dialogH', checkFields)} invalid={checkInvalid('dialogH', checkFields)} bind:value={formParam.dialogH} />
        </FormGroup> 
    </div>    
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <FormGroup floating label="類別">
                <Input type="select" placeholder="請選取類別" bind:value={formParam.itemType}>
                    <option value="ITEM">ITEM-頁面</option>
                    <option value="FOLDER">FOLDER-目錄</option>
                </Input>
              </FormGroup>
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="fontIconClassId">Icon class</Label>
            <Input type="text" id="fontIconClassId" placeholder="Icon class" feedback={invalidFeedback('fontIconClassId', checkFields)} invalid={checkInvalid('fontIconClassId', checkFields)} bind:value={formParam.fontIconClassId} />
        </FormGroup> 
    </div>    
</div>

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Button color="primary" on:click={btnUpdate}><Icon name="save"/>&nbsp;儲存</Button>
        &nbsp;
        <Button color="primary" on:click={btnClear}><Icon name="eraser"/>&nbsp;清除</Button>
    </div>
</div>    

<SvelteToast></SvelteToast>
