<script>
import { onMount, onDestroy } from 'svelte';    
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
    description : '選單配置.',
    methods     : {
        "refresh"    :   function() {
            clearPage();
        }
    }
}

let queryParam = {
    'folderOid' :   import.meta.env.VITE_PLEASE_SELECT_ID
};

let folderList = [];
let itemAllList = [];
let itemEnableList = [];

function loadProgramFolder() {
    folderList = [];
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadProgramFolder')
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }
            folderList = response.data.value;            
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

const programFolderChange = (event) => {
    itemAllList = [];
    itemEnableList = [];    
    if (import.meta.env.VITE_PLEASE_SELECT_ID == event.target.value) {
        return;
    }
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadProgramEnableAndAllList/' + event.target.value)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                return;
            }
            itemAllList = response.data.value.all;
            itemEnableList = response.data.value.enable;
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

function programItemEnableChange(e, itemOid) {
    var checked = e.target.checked;
    var appendOid = '';
    for (var n in itemEnableList) {        
        appendOid += itemEnableList[n].oid + ',';
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
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/updateMenu/' + queryParam.folderOid + '/' + appendOid)
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

function checkItemDisable(itemOid) {
    var f = false;
    for (var n in itemAllList) {
        if (itemAllList[n].oid == itemOid && itemAllList[n].itemType == 'FOLDER') {
            f = true;
        }
    }
    return f;    
}

function checkItemChecked(itemOid) {
    var f = false;
    for (var n in itemEnableList) {
        if (itemEnableList[n].oid == itemOid) {
            f = true;
        }
    }
    return f;
}

function clearPage() {
    itemAllList = [];
    itemEnableList = [];    
    queryParam.folderOid = import.meta.env.VITE_PLEASE_SELECT_ID;
}

onMount(()=>{
	loadProgramFolder();
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
            <Input type="select" bind:value={queryParam.folderOid} on:change={programFolderChange} >
                <option value={import.meta.env.VITE_PLEASE_SELECT_ID}>{import.meta.env.VITE_PLEASE_SELECT_LABEL}</option>
                {#each folderList as item}
                <option value={item.oid}>{item.progId} - {item.name}</option>
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
                    <th style="background-color: #575757; color: whitesmoke;">頁面程式代號</th>
                    <th style="background-color: #575757; color: whitesmoke;">頁面程式名稱</th>
                </tr>
            </thead>
            <tbody>
                {#each itemAllList as item}
                    {#if item.itemType != 'FOLDER'}
                <tr>
                    <td style="background-color: #BCC6CC;">
                        <FormGroup>
                            <div class="form-check">
                            <Input type="checkbox" on:change={programItemEnableChange(event, item.oid)} checked={checkItemChecked(item.oid)} disabled={checkItemDisable(item.oid)} />
                            </div>
                        </FormGroup>
                    </td>
                    <td>{item.progId}</td>
                    <td><Icon name={item.fontIconClassId} />&nbsp;{item.name}</td>
                </tr>
                    {/if}
                {/each}
            </tbody>
        </Table>

    </div>
</div>

<SvelteToast/>
