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
    description : 'Role管理，Permission配置作業.',
    methods     : {
        "back"      :   function() {
            goto( getUrlNoStartSign(getProgItem(PageConstants.QueryId).url) );
        }
        ,
        "refresh"   :   function() {
            loadData();
            btnClear();
        }
        ,
        "save"      :   function() {
            btnSave();
        } 
    }
}

var masterParam = {
    'oid'       :   $page.params.oid,
    'role'      :   ''
}

var formParam = {
    'role'          :   '',
    'permission'    :   '',
    'permType'      :   'CONTROLLER',
    'description'   :   ''
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
            formParam.role = masterParam.role;
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
			"role"	:   masterParam.role
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
    formParam.permType = 'CONTROLLER';
    formParam.permission = '';
    formParam.description = '';
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

</script>

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Toolbar args={toolbarParam}></Toolbar>
    </div>
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        Role編號:&nbsp;{masterParam.role}
    </div>
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup>
            <Label for="permission">Permission字串</Label>
            <Input type="text" id="permission" placeholder="輸入permission字串" feedback={invalidFeedback('permission', checkFields)} invalid={checkInvalid('permission', checkFields)} bind:value={formParam.permission} />
        </FormGroup>         
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        <FormGroup floating label="類別">
            <Input type="select" placeholder="請選取類別" bind:value={formParam.permType}>
                <option value="CONTROLLER">Controller / url</option>
                <option value="SERVICE">Service</option>
            </Input>            
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

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Table bordered hover>
            <thead>
                <tr>
                    <th style="background-color: #575757; color: whitesmoke;">#</th>
                    <th style="background-color: #575757; color: whitesmoke;">Permission字串</th>
                    <th style="background-color: #575757; color: whitesmoke;">類別</th>
                </tr>
            </thead>
            <tbody>
                {#each paramList as item}
                <tr>
                    <td>
                        <Button class="btn btn-warning btn-sm" on:click={delParamConfirm(item.oid)}><Icon name="trash"></Icon></Button>
                    </td>
                    <td>{item.permission}</td>
                    <td>{item.permType}</td>
                </tr>
                {/each}
            </tbody>
        </Table>
    </div>
</div>    

<SvelteToast></SvelteToast>
