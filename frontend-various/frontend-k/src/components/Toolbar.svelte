<script>
import { Icon, Tooltip } from "sveltestrap";
import { onMount } from 'svelte';    
import { getProgItem } from "../components/BaseHelper.svelte";

export let args = {};

let pageProg = {};


onMount(()=>{        
    pageProg = getProgItem(args.id);    
    if (null == pageProg) {
        //window.location.href = '/';
		pageProg = {
			'name'	:	'unknown',
			'fontIconClassId'	:	'globe2'
		};
    }
});

</script>

<div class="app-title" style="background: linear-gradient(to top, #f8f9fa, #ffffff); width: 103vw; overflow: hidden;">
	<div>
		<h1 style="color: #003366;"><Icon name={pageProg.fontIconClassId}/>&nbsp;{pageProg.name}</h1>

		<p style="color: #333300;">{args.description}</p>

		<div>		

		{#if null != args.methods && (typeof args.methods.back === 'function') }	
			<Icon name="arrow-left-square" class="btn btn-secondary btn-sm" id="tb_back" onclick={args.methods.back} />
			<Tooltip target="tb_back" placement="bottom">上一頁</Tooltip>
			&nbsp;
		{/if}				

		{#if null != args.methods && (typeof args.methods.refresh === 'function') }	
			<Icon name="repeat" class="btn btn-secondary btn-sm" id="tb_repeat" onclick={args.methods.refresh} />
			<Tooltip target="tb_repeat" placement="bottom">刷新</Tooltip>
			&nbsp;
		{/if}	

		{#if null != args.methods && (typeof args.methods.create === 'function') }
			<Icon name="plus-circle" class="btn btn-secondary btn-sm" id="tb_plus" onclick={args.methods.create} />
			<Tooltip target="tb_plus" placement="bottom">新增頁</Tooltip>
			&nbsp;
		{/if}	

		{#if null != args.methods && (typeof args.methods.save === 'function') }
            <Icon name="save" class="btn btn-secondary btn-sm" id="tb_save" onclick={args.methods.save} />
			<Tooltip target="tb_save" placement="bottom">儲存/更新</Tooltip>
			&nbsp;
		{/if}	
				
		</div>
	</div>    
	

        		
</div> 

{#if (undefined === args.marginBottom) || null == args.marginBottom || args.marginBottom }
<p style="margin-bottom: 5px"></p>
{/if}
