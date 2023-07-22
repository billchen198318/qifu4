<script>
import { Icon, Tooltip } from "sveltestrap";
import { onMount } from 'svelte';    
import { getProgItem } from "../components/BaseHelper.svelte";
export let progId = '';
export let description = '';
let pageProg = {};

onMount(()=>{        
    pageProg = getProgItem(progId);    
    if (null == pageProg) {
        window.location.href = '/';
    }
});

</script>

<div class="app-title" style="background: linear-gradient(to top, #f8f9fa, #ffffff); position: fixed; width: 103vw; overflow: hidden;">
	<div>
		<h1>{pageProg.name}</h1>

		<p>{description}</p>

		<div>		
			
			
			<Icon name="repeat" class="btn btn-light btn-sm" id="tb_repeat"/>
			<Tooltip target="tb_repeat" placement="bottom">刷新</Tooltip>
			&nbsp;

			<Icon name="plus-circle" class="btn btn-light btn-sm" id="tb_plus"/>
			<Tooltip target="tb_plus" placement="bottom">新增頁</Tooltip>
			&nbsp;

            <Icon name="save" class="btn btn-light btn-sm" id="tb_save"/>
			<Tooltip target="tb_save" placement="bottom">儲存/更新</Tooltip>
			&nbsp;

				
		</div>
	</div>    
	

        		
</div> 