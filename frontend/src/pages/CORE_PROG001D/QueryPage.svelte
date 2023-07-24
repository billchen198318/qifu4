<script>
import { onMount } from 'svelte';    
import { getProgItem } from "../../components/BaseHelper.svelte";
import Toolbar from "../../components/Toolbar.svelte";
import { Form, FormGroup, FormText, Input, Label } from 'sveltestrap';

let toolbar = {
    id          : 'CORE_PROG001D0001Q',
    description : 'Application site.',
    methods     :  {
        "refresh"    :   function() {
            test = 'refresh';
        }
        ,
        "create"    :   function() {
            test = 'create';
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

</script>
<div>
    <Toolbar args={toolbar}></Toolbar>

    <div class="col-xs-12 col-md-12 col-lg-12">
        <Form>
            <FormGroup>
                <Label for="testInp">Test</Label>
                <Input
                type="text"
                name="testInp"
                id="testInp"
                placeholder="Please input name."     
                value={test}     
                />
            </FormGroup>      
        </Form>
    </div>

</div>