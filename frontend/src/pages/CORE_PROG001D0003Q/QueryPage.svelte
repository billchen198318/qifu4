<script>
import { onMount, onDestroy } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
	FormGroup, Input, Label, Button, Icon
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
            loadProgramFolder();
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
                push( getProgItem(PageConstants.QueryId).url );
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

function programFolderChange() {
    itemAllList = [];
    itemEnableList = [];    
    if (import.meta.env.VITE_PLEASE_SELECT_ID == queryParam.folderOid) {
        return;
    }
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading(); 
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadProgramEnableAndAllList/' + queryParam.folderOid)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.push(response.data.message, getToastWarningTheme());
                push( getProgItem(PageConstants.QueryId).url );
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

onMount(()=>{
	loadProgramFolder();
});

onDestroy(()=>{

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
            <Input type="select" bind:value={queryParam.folderOid} on:change={programFolderChange}>
                <option value={import.meta.env.VITE_PLEASE_SELECT_ID}>{import.meta.env.VITE_PLEASE_SELECT_LABEL}</option>
                {#each folderList as item}
                <option value={item.oid}>{item.progId} - {item.name}</option>
                {/each}
            </Input>
        </FormGroup>         
    </div>
</div>


<SvelteToast/>
