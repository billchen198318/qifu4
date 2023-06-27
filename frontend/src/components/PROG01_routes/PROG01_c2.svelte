<script>
    import { link } from "svelte-spa-router";
    import { Icon } from 'sveltestrap';

    export let params = {};
    
</script>    

<a use:link={{href: "#/prog01", disabled: false}}>back!!</a>

<br>

<h2><Icon name="globe2" />&nbsp;C2</h2>

<p>
    route C2 pages.  OID: <b>{params.oid}</b>
</p>

