<script>
    import { push } from "svelte-spa-router";
    import { Button } from 'sveltestrap';
</script>

<div>
    <h2>Nested routers</h2>
    <Button color='primary' on:click={() => push('/name/Joe/Tern')}>Full</Button> &nbsp;
    <Button color='primary' on:click={() => push('/name/Kie')}>Short</Button> &nbsp;
  
</div>