<script>
    import { link } from "svelte-spa-router";
    import { Icon } from 'sveltestrap';
</script>    

<a use:link={{href: "#/prog01", disabled: false}}>back!!</a>

<br>

<h2><Icon name="globe2" />&nbsp;C1</h2>

<p>
    This sample shows how to set up the router with minimum functionality. <br/>
    The route definition object contains a number of routes (including some with parameters and a catch-all at the end).<br/>
    The links below allow navigating between pages.
</p>

<p>This is the Home component, which contains markup only.</p>

<p><em>Hint:</em> Try navigating with the links below, then use your browser's back and forward buttons.</p>
