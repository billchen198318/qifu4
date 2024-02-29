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
    description : '帳戶角色Role管理配置.',
    methods     : {
        "refresh"    :   function() {
            clearPage();
        }
    }
}

let formParam = {
	'oid'	:	''
};

let userList = [];
let userRoleList = [];
let userRoleEnableList = [];

function loadUserList() {
	userList = [];
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadUserList')
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }
            userList = response.data.value;            
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

function userChange(event) {
	userRoleList = [];
	userRoleEnableList = [];
    if (import.meta.env.VITE_PLEASE_SELECT_ID == event.target.value) {
        return;
    }
	formParam.oid = event.target.value;
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findUserRoleListByAccountOid', formParam)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }
            userRoleList = response.data.value.all;      
			userRoleEnableList = response.data.value.enable;      
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

function userRoleEnableChange(e, itemOid) {
	var checked = e.target.checked;
    var appendOid = '';
    for (var n in userRoleEnableList) {        
        appendOid += userRoleEnableList[n].oid + ',';
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
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/updateUserRole/' + formParam.oid + '/' + appendOid)
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
	for (var n in userRoleEnableList) {
		if (userRoleEnableList[n].oid == itemOid) {
			f = true;
		}
	}
	return f;
}

function clearPage() {
    userRoleList = [];
	userRoleEnableList = [];    
    formParam.oid = import.meta.env.VITE_PLEASE_SELECT_ID;
}

onMount(()=>{
	loadUserList();
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
            <Input type="select" bind:value={formParam.oid} on:change={userChange} >
                <option value={import.meta.env.VITE_PLEASE_SELECT_ID}>{import.meta.env.VITE_PLEASE_SELECT_LABEL}</option>
                {#each userList as item}
                <option value={item.oid}>{item.account}</option>
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
                {#each userRoleList as item}
                <tr>
                    <td style="background-color: #BCC6CC;">
                        <FormGroup>
                            <div class="form-check">
                            <Input type="checkbox" on:change={userRoleEnableChange(event, item.oid)} checked={checkItemChecked(item.oid)} />
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
