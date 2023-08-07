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
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme 
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

}

onMount(()=>{

});

</script>

<div class="row">
    <Toolbar args={toolbarParam}></Toolbar>

    <h5>create-page</h5>

</div>
