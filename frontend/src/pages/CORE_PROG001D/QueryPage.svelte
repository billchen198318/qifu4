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
import Grid from "../../components/Grid.svelte";

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

let gridConfig = {
  row : 30,
  theadColor : {
    'backgroundColor' : '#1a1a1a',
    'color'           : 'whitesmoke'
  },
  keyFieldFormatter : {
    'field' : 'oid',
    'showTooltip' : false,
    'item'  : [
      {
        'method'  : function(val) { test = 'edit->' + val; },
        'icon'    : 'pen',
        'type'    : 'edit',
        'memo'    : 'Edit current item.'
      },
      {
        'method'  : function(val) { test = 'trash->' + val; },
        'icon'    : 'trash',
        'type'    : 'delete',
        'memo'    : 'Delete current item.'
      },      
    ]
  },
  column : [
    {
      'label' : '#',
      'field' : 'oid'
    },
    {
      'label' : 'Id',
      'field' : 'sysId'
    },
    {
      'label' : 'Name',
      'field' : 'name'
    },
    {
      'label' : 'Host',
      'field' : 'host'
    },
    {
      'label' : 'Context Path',
      'field' : 'contextPath'
    },
    {
      'label' : 'Local',
      'field' : 'local'
    }
  ]
};

let dsList = [
  {
    'oid'   : '000',
    'sysId' : 'CORE',
    'name'  : 'Core',
    'host'  : '127.0.0.1:8088',
    'contextPath' : '/cs',
    'local' : 'Y'
  },
  {
    'oid'   : '111',
    'sysId' : 'BB',
    'name'  : 'b',
    'host'  : '127.0.0.1:8088',
    'contextPath' : '/bb',
    'local' : 'N'
  },
  {
    'oid'   : '222',
    'sysId' : 'ccc',
    'name'  : 'c',
    'host'  : '127.0.0.1:8088',
    'contextPath' : '/cc',
    'local' : 'N'
  }  
];

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

    <Grid config={gridConfig} dataSource={dsList} />
  
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