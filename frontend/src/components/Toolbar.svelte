<script>
import { Icon } from "sveltestrap";
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
			
			<Icon name="plus-circle" />
			&nbsp;

            <Icon name="save2-fill" />
			&nbsp;

				
		</div>
	</div>    
	
        <ul class="app-breadcrumb breadcrumb">
          <li class="breadcrumb-item" title="{pageProg.name}"><font color="#6c757d">{pageProg.id}</font>&nbsp;&nbsp;&nbsp;</li>
        </ul>
        		
</div> 