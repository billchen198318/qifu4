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
    description : 'Role管理，新增資料作業.',
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
    'role'          :   '',
    'description'   :   ''
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
    formParam.role = '';
    formParam.description = '';
}

</script>

<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <Toolbar args={toolbarParam}></Toolbar>
    </div>
</div>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <FormGroup>
            <Label for="role">Role編號</Label>
            <Input type="text" id="role" placeholder="Role編號" feedback={invalidFeedback('progId', checkFields)} invalid={checkInvalid('role', checkFields)} bind:value={formParam.role} />
        </FormGroup>         
    </div>
    <div class="col-xs-12 col-md-12 col-lg-12">
        <FormGroup>
            <Label for="description">說明</Label>
            <Input type="textarea" id="description" row="3" col="25" bind:value={formParam.description} />
        </FormGroup> 
    </div>    
</div>

<SvelteToast></SvelteToast>
