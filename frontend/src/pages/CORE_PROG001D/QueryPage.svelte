<script>
import { onMount } from 'svelte';    
import { getProgItem } from "../../components/BaseHelper.svelte";
import { push } from 'svelte-spa-router';
import Toolbar from "../../components/Toolbar.svelte";
import { 
    Form, FormGroup, FormText, Input, Label,
    Pagination, PaginationItem, PaginationLink,
    Table 
} from 'sveltestrap';

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

    <div class="col-xs-12 col-md-12 col-lg-12">
        <Table bordered hover>
            <thead style="background-color:silver;">
            <tr>
                <th>#</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                </tr>
            </tbody>
        </Table>
      
    </div>

    <Pagination ariaLabel="Page navigation example">
        <PaginationItem disabled>
          <PaginationLink first href="#" />
        </PaginationItem>
        <PaginationItem disabled>
          <PaginationLink previous href="#" />
        </PaginationItem>
        <PaginationItem active>
          <PaginationLink href="#">1</PaginationLink>
        </PaginationItem>
        <PaginationItem>
          <PaginationLink href="#">2</PaginationLink>
        </PaginationItem>
        <PaginationItem>
          <PaginationLink href="#">3</PaginationLink>
        </PaginationItem>
        <PaginationItem>
          <PaginationLink href="#">4</PaginationLink>
        </PaginationItem>
        <PaginationItem>
          <PaginationLink href="#">5</PaginationLink>
        </PaginationItem>
        <PaginationItem>
          <PaginationLink next href="#" />
        </PaginationItem>
        <PaginationItem>
          <PaginationLink last href="#" />
        </PaginationItem>
      </Pagination>


</div>