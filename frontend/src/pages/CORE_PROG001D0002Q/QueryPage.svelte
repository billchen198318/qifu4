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
import Grid, { getGridConfig, setConfigRow, setConfigPage, setConfigTotal } from "../../components/Grid.svelte";
import GridPagination from '../../components/GridPagination.svelte';
import { _gridConfig, _queryParam } from './QueryStateStore';

let toolbarParam = {
    id          : 'CORE_PROG001D0002Q',
    description : '程式管理.',
    methods     :  {
        "refresh"    :   function() {
            //btnClear();
        }
        ,
        "create"    :   function() {
            push( getProgItem('CORE_PROG001D0002A').url );
        }
    }
}


onMount(()=>{
	
});

onDestroy(()=>{

});

</script>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Toolbar args={toolbarParam}></Toolbar>
	</div>  
</div>

<SvelteToast/>
