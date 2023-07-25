<script>
import { onMount } from 'svelte';    
import { getProgItem } from "../../components/BaseHelper.svelte";
import { push } from 'svelte-spa-router';
import Toolbar from "../../components/Toolbar.svelte";
import { Form, FormGroup, FormText, Input, Label } from 'sveltestrap';

let toolbarParam = {
    id          : 'CORE_PROG001D0001Q',
    description : 'Application site.',
    methods     :  {
        "refresh"    :   function() {
            test = '';
        }
        ,
        "create"    :   function() {
            push( getProgItem('CORE_PROG001D0001A').url );
        }
        ,
        "save"      :   function() {
            test = 'save';     
        }
    }
}

let test = '';

onMount(()=>{

});

/*
$ : {
    alert('q');
}
*/

</script>

<div class="row">
    <Toolbar args={toolbarParam}></Toolbar>

    <div class="col-xs-12 col-md-12 col-lg-12">
        <Form>
            <FormGroup>
                <Label for="testInp">Test</Label>
                <Input
                type="text"
                name="testInp"
                id="testInp"
                placeholder="Please input name."     
                bind:value={test}     
                />
            </FormGroup>      
        </Form>
    </div>

</div>