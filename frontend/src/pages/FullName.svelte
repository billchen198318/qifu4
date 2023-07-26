<script>
    import { Button } from 'sveltestrap';    
    import { toast, SvelteToast } from '@zerodevx/svelte-toast'    

    export let params = {};
    
</script>

<p>You gave us both a first name and last name!</p>
<p>First: {params.first}</p>
<p>Last: {params.last}</p>
<Button on:click={() => toast.push('你他媽真是個天才!')}>SHOW TOAST</Button>
<SvelteToast/>