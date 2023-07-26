<script>
    import { Button } from 'sveltestrap';    
    import { toast, SvelteToast } from '@zerodevx/svelte-toast'   
    
    export let params = {}
    
</script>
<p>You shy person, giving us a first name only!</p>
<p>First: {params.first}</p>
<Button on:click={() => toast.push('Hello world!')}>SHOW TOAST</Button>
<SvelteToast/>