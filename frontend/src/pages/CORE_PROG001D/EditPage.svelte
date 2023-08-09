<script>
import { onMount } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
    Form, FormGroup, Input, Label, Button, Icon
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme,
    invalidFeedback, checkInvalid
} from "../../components/BaseHelper.svelte";
import Toolbar from "../../components/Toolbar.svelte";

let toolbarParam = {
    id          : 'CORE_PROG001D0001E',
    description : '站台測試用，修改資料作業.',
    methods     :  {
        "back"      :   function() {
            push( getProgItem('CORE_PROG001D0001Q').url );
        },
        "refresh"   :   function() {
            //btnClear();
        }
        ,
        "save"      :   function() {
            //btnUpdate();
        } 
    }
}

export let params = {};

var formParam = {
    'oid'           :   params.oid,
    'sysId'         :   '',
    'name'          :   '',
    'host'          :   '',
    'contextPath'   :   '',
    'isLocal'       :   'N',
    'icon'          :   'SYSTEM'
}

var checkFields = new Object();

onMount(()=>{

    alert(formParam.oid);

});

function btnUpdate() {

}

function btnClear() {

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
        <Button color="primary" on:click={btnUpdate}><Icon name="save"/>&nbsp;儲存</Button>
        &nbsp;
        <Button color="primary" on:click={btnClear}><Icon name="eraser"/>&nbsp;清除</Button>
    </div>
</div>    

<SvelteToast></SvelteToast>
