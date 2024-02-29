<script>
import { onMount, onDestroy } from 'svelte';    
import { goto } from '$app/navigation';
import { page } from '$app/stores';
import { 
    FormGroup, Input, Label, Button, Icon, Table
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme, getToastSuccessTheme, getUrlNoStartSign,
    invalidFeedback, checkInvalid
} from "../../../../components/BaseHelper.svelte";
import Toolbar from "../../../../components/Toolbar.svelte";
import { PageConstants } from '../../config';

let toolbarParam = {
    id          : PageConstants.SetParamId,
    description : 'Freemarker 樣板管理，配置參數作業.',
    methods     : {
        "back"      :   function() {
            goto( getUrlNoStartSign(getProgItem(PageConstants.QueryId).url) );
        }
        ,
        "refresh"   :   function() {
            loadData();
        }
        ,
        "save"      :   function() {
            btnSave();
        } 
    }
}

var masterParam = {
    'templateOid'   :   $page.params.oid,
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

onDestroy(()=>{
	toast.pop(0);
});

function loadData() {
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', {'oid' : $page.params.oid})
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                goto( getUrlNoStartSign(getProgItem(PageConstants.QueryId).url) );
                return;
            }
            masterParam = response.data.value;
            formParam.templateId = masterParam.templateId;
            queryParamList();
        } else {
            toast.push('error, null', getToastErrorTheme());
            goto( getUrlNoStartSign(getProgItem(PageConstants.QueryId).url) );
        }
    })
    .catch(e => {
        Swal.hideLoading();
        Swal.close();        
        alert(e);
        goto( getUrlNoStartSign(getProgItem(PageConstants.QueryId).url) );
    });
}

function queryParamList() {
    paramList = [];
	var axiosInstance = getAxiosInstance();
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findSetParamPage', {
		"field": {
			"templateId"	: masterParam.templateId
		}
		,
		"pageOf": {
			"select"  : 1,
			"showRow" : 100
		}
	})
	.then(response => {
		if (null != response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
				return;
			}
			paramList = response.data.value;   
		} else {
			toast.push('error, null', getToastErrorTheme());
		}
	})
	.catch(e => {
		alert(e);
	});
}

function btnSave() {
    checkFields = new Object();
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading();      
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/saveSetParam', formParam)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            checkFields = response.data.checkFields;
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
            } else {
                toast.push(response.data.message, getToastSuccessTheme());
                btnClear();
            }            
        } else {
            toast.push('error, null', getToastErrorTheme());
        }
        queryParamList();        
    })
    .catch(e => {
        Swal.hideLoading();
        Swal.close();        
        alert(e);
    }); 
}

function btnClear() {
    checkFields = new Object();
    formParam.isTitle = '';
    formParam.isTitleVar = false;
    formParam.templateVar = '';
    formParam.objectVar = '';
}

function delParamConfirm(oid) {
    Swal.fire({
        title: '刪除?',
        icon: 'question',
        iconHtml: '?',
        confirmButtonText: 'Yes',
        cancelButtonText: 'No',
        showCancelButton: true,
        showCloseButton: true
    }).then((result) => {
        if (result.isConfirmed) {
            delParam(oid);
        }
    });      
}

function delParam(oid) {
	Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
	Swal.showLoading();  
	var axiosInstance = getAxiosInstance();  
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/deleteSetParam', {"oid": oid})
	.then(response => {
		Swal.hideLoading();
		Swal.close();
		if (null != response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG == response.data.success) {
				toast.push(response.data.message, getToastSuccessTheme());
			} else {        
				toast.push(response.data.message, getToastWarningTheme());
			}      
			queryParamList();
		} else {
			toast.push('error, null', getToastErrorTheme());
			queryParamList();
		}
	})
	.catch(e => {
		Swal.hideLoading();
		Swal.close();    
		queryParamList();
		alert(e);
	}); 
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
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Button color="primary" on:click={btnSave}><Icon name="save"/>&nbsp;儲存</Button>
        &nbsp;
        <Button color="primary" on:click={btnClear}><Icon name="eraser"/>&nbsp;清除</Button>
    </div>
</div> 

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Table bordered hover>
            <thead>
                <tr>
                    <th style="background-color: #575757; color: whitesmoke;">#</th>
                    <th style="background-color: #575757; color: whitesmoke;">樣板變數</th>
                    <th style="background-color: #575757; color: whitesmoke;">物件變數</th>
                    <th style="background-color: #575757; color: whitesmoke;">是否標題用</th>
                </tr>
            </thead>
            <tbody>
                {#each paramList as item}
                <tr>
                    <td>
                        <Button class="btn btn-warning btn-sm" on:click={delParamConfirm(item.oid)}><Icon name="trash"></Icon></Button>
                    </td>
                    <td>{item.templateVar}</td>
                    <td>{item.objectVar}</td>
                    <td>{item.isTitle}</td>
                </tr>
                {/each}
            </tbody>
        </Table>
    </div>
</div>    

<SvelteToast></SvelteToast>
