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
    id          : 'CORE_PROG001D0001A',
    description : '站台測試用，新增資料作業.',
    methods     :  {
        "back"      :   function() {
            push( getProgItem('CORE_PROG001D0001Q').url );
        },
        "refresh"   :   function() {
            // clear inpur field
        }
        ,
        "save"      :   function() {
            
        } 
    }
}

var formParam = {
    'sysId'     :   '',
    'name'      :   ''
}

var checkFields = [
    {'sysId_test'    :   '編號錯誤'      },
    {'name_test'     :   '名稱不可以空白' }
];

onMount(()=>{

});

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