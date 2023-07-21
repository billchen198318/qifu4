<script>
import { onMount } from 'svelte';    
import { getProgItem } from "../../components/BaseHelper.svelte";
let pageProg = null;

onMount(()=>{
    pageProg = getProgItem('CORE_PROG001D0001Q');
    if (null == pageProg) {
        window.location.href = '/';
    }
});

</script>
<div>
    Query
</div>