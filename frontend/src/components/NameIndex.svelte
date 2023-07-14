<script>
    import Router, { push } from "svelte-spa-router";
    import FullName from "./FullName.svelte";
    import ShortName from "./ShortName.svelte";
    import NameList from "./NameList.svelte";
  
    export let params;
  
    const prefix = "/name";
  
    const routes = new Map()
        .set("/", NameList)
        .set("/:first/:last", FullName)
        .set("/:first", ShortName)
        .set(/^\/(.*?)(\/(.*?))?/, FullName);

  </script>
  
  <!-- I've other things here -->
  Name Index<br>
  <div>
    <Router {routes} {prefix} />
  </div>