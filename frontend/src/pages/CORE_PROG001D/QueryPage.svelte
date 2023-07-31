<script>
import { onMount } from 'svelte';    
import { getProgItem } from "../../components/BaseHelper.svelte";
import { push } from 'svelte-spa-router';
import Toolbar from "../../components/Toolbar.svelte";
import { 
    Form, FormGroup, Input, Label 
} from 'sveltestrap';
import Grid, { getGridConfig } from "../../components/Grid.svelte";
import GridPagination from '../../components/GridPagination.svelte';

let toolbarParam = {
    id          : 'CORE_PROG001D0001Q',
    description : 'Application site.',
    methods     :  {
        "refresh"    :   function() {
            test = '';
            dsList.splice(0);
            dsList = dsList; // 這很重要, 讓 svelte 知道 list 被變更了, 讓 child compoment 知道資料被更改了
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

  // test  
  setTimeout(function() {
    
    //dataList.splice(0);
    dsList.push({
      'oid'   : '3e0de6da-c76d-4550-901b-08cfd97d8cfb',
      'sysId' : 'OTH',
      'name'  : 'Other system',
      'host'  : '127.0.0.1:8088',
      'contextPath' : '/other',
      'local' : 'N'
    });
    dsList = dsList; // 這很重要, 讓 svelte 知道 list 被變更了, 讓 child compoment 知道資料被更改了

  },5000);

});

/*
$ : {
    alert('q');
}
*/
let gridConfig = getGridConfig(
  'oid'
  ,
  [
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
  ,
  [
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
);

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

    <GridPagination />
    <Grid config={gridConfig} bind:dataSource={dsList} />

    
</div>