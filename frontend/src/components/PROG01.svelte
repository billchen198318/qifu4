<script>
import { link } from "svelte-spa-router";
import { push, pop, replace } from 'svelte-spa-router'
import { Icon } from 'sveltestrap';
import { Button } from 'sveltestrap';
import {
    Card,
    CardBody,
    CardFooter,
    CardHeader,
    CardSubtitle,
    CardText,
    CardTitle
  } from 'sveltestrap';

import Router from 'svelte-spa-router'
import FullName from './FullName.svelte'
import ShortName from './ShortName.svelte'  

const colors = [
    'primary',
    'secondary',
    'success',
    'danger',
    'warning',
    'info',
    'light',
    'dark'
  ];

const prefix = '/prog01';
const routes = new Map()
    .set("/", FullName)
    .set("/:first/:last", FullName)
    .set("/:first", ShortName);

/*
  
const routes = new Map()
    .set("/", List)
    // .set("/:ID", Show)
    // .set("/:ID/*", Show);
    .set(/^\/(.*?)(\/(.*?))?/, Show);

*/

</script>
<div>
    PROG01
    <br>
    TEST <Icon name="globe2" />

    <br>

{#each colors as color}
      <Button {color}>{color}</Button> &nbsp;
{/each}

<br><br>

<Card class="mb-3">
    <CardHeader>
      <CardTitle>Card title</CardTitle>
    </CardHeader>
    <CardBody>
      <CardSubtitle>Card subtitle</CardSubtitle>
      <CardText>
        Some quick example text to build on the card title and make up the bulk of
        the card's content.
      </CardText>
      <Button>Button</Button>
    </CardBody>
    <CardFooter>Footer</CardFooter>
</Card>


<br><br>

<div>
  <h2>Basic routing</h2>
  <ul>
    <!--
    <a use:link={{href: "#/prog01c1", disabled: false}}>C1</a>
    -->
    <Button color='primary' on:click={() => push('/prog01c1')}>Go C1</Button> &nbsp;

    <!--
    <a use:link={{href: "#/prog01c2", disabled: false}}>Go C2</a>
    -->
    <Button color='primary' on:click={() => push('/prog01/c2/02ab1f1e-f524-11ed-9ea9-09c68b131648')}>Go C2</Button> &nbsp;

    <Button color='primary' on:click={() => push('/prog01/c2/0000')}>Test replace in onloading fn</Button> &nbsp;

  </ul>    
  
</div>

<br>

<div>
  <h2>Nested routers</h2>
  <Button color='primary' on:click={() => push('#/prog01/Joe/Tern')}>Full</Button> &nbsp;
  <Button color='primary' on:click={() => push('#/prog01/Kie')}>Short</Button> &nbsp;

  <Router {routes} {prefix} />
</div>

<br><br>

</div>    