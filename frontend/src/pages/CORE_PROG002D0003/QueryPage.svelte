<script>
import { onMount, onDestroy } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
	FormGroup, Input, Label, Button, Icon, Table
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme, getToastSuccessTheme
} from "../../components/BaseHelper.svelte";
import Toolbar from "../../components/Toolbar.svelte";
import { PageConstants } from './config';

let toolbarParam = {
    id          : PageConstants.QueryId,
    description : '選單Role管理配置.',
    methods     : {
        "refresh"    :   function() {
            clearPage();
        }
    }
}

let formParam = {
	'oid'	:	''
};

let progList = [];
let progRoleList = [];
let progRoleEnableList = [];

function loadProgramList() {
    var currSysId = 'CORE';
	progList = [];
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findProgramFolderMenuItem/' + currSysId)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }
            progList = response.data.value;            
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

function progChange(event) {
	progRoleList = [];
    progRoleEnableList = [];
    if (import.meta.env.VITE_PLEASE_SELECT_ID == event.target.value) {
        return;
    }
	formParam.oid = event.target.value;
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findMenuProgramRoleList', formParam)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }
            progRoleList = response.data.value.all;
            progRoleEnableList = response.data.value.enable;
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

function progRoleEnableChange(e, itemOid) {
	var checked = e.target.checked;
    var appendOid = '';
    for (var n in progRoleEnableList) {        
        appendOid += progRoleEnableList[n].oid + ',';
    }
    if (checked) {
        appendOid += itemOid + ',';
    } else {
        appendOid = appendOid.replaceAll(itemOid+',', '');
    }
	if ('' == appendOid) {
		appendOid = ',';
	}
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/updateMenuRole/' + formParam.oid + '/' + appendOid)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                clearPage();
            }            
        } else {
            toast.push('error, null', getToastErrorTheme());
            clearPage();
        }        
    })
    .catch(e => {
        Swal.hideLoading();
        Swal.close();        
        alert(e);        
        clearPage();
    });	
}

function checkItemChecked(itemOid) {
	var f = false;
	for (var n in progRoleEnableList) {
		if (progRoleEnableList[n].oid == itemOid) {
			f = true;
		}
	}
	return f;
}

function clearPage() {
    progRoleList = [];
    progRoleEnableList = [];
    formParam.oid = import.meta.env.VITE_PLEASE_SELECT_ID;
}

onMount(()=>{
	loadProgramList();
});

onDestroy(()=>{
	toast.pop(0);
});

</script>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Toolbar args={toolbarParam}></Toolbar>
	</div>  
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <FormGroup>            
            <Input type="select" bind:value={formParam.oid} on:change={progChange} >
                <option value={import.meta.env.VITE_PLEASE_SELECT_ID}>{import.meta.env.VITE_PLEASE_SELECT_LABEL}</option>
                {#each progList as item}
                <option value={item.oid}>{item.name}</option>
                {/each}
            </Input>
        </FormGroup>  
    </div>
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">

        <Table bordered hover>
            <thead>
                <tr>
                    <th style="background-color: #575757; color: whitesmoke;">#</th>
                    <th style="background-color: #575757; color: whitesmoke;">Role代號</th>
                </tr>
            </thead>
            <tbody>
                {#each progRoleList as item}
                <tr>
                    <td>
                        <FormGroup>
                            <div class="form-check">
                            <Input type="checkbox" on:change={progRoleEnableChange(event, item.oid)} checked={checkItemChecked(item.oid)} />
                            </div>
                        </FormGroup>
                    </td>
                    <td>{item.role}</td>
                </tr>
                {/each}
            </tbody>
        </Table>

    </div>
</div>

<SvelteToast/>
