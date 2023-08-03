<script>
import { onMount } from 'svelte';    
import { getProgItem } from "../../components/BaseHelper.svelte";
import { push } from 'svelte-spa-router';
import Toolbar from "../../components/Toolbar.svelte";
import { 
    Form, FormGroup, Input, Label, Button, Icon

} from 'sveltestrap';
import Grid, { getGridConfig, setConfigRow } from "../../components/Grid.svelte";
import GridPagination from '../../components/GridPagination.svelte';

let toolbarParam = {
    id          : 'CORE_PROG001D0001Q',
    description : 'Application site.',
    methods     :  {
        "refresh"    :   function() {
            queryParam.name = '';
            queryParam.sysId = '';
            dsList.splice(0);
            dsList = dsList; // 這很重要, 讓 svelte 知道 list 被變更了, 讓 child compoment 知道資料被更改了
        }
        ,
        "create"    :   function() {
            push( getProgItem('CORE_PROG001D0001A').url );
        }
        ,
        "save"      :   function() {
            queryParam.name = 'save';     
        }
    }
}

var queryParam = {
  'sysId' : '',
  'name'  : ''
}

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
        'method'  : function(val) { queryParam.sysId = 'edit->' + val; queryParam = queryParam; },
        'icon'    : 'pen',
        'type'    : 'edit',
        'memo'    : 'Edit current item.'
      },
      {
        'method'  : function(val) { queryParam.name = 'trash->' + val; queryParam = queryParam; },
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

function resetQueryGridRow(row) {
  setConfigRow(gridConfig, row);
  gridConfig = gridConfig; // 讓 svelte child compomenet 知道 gridConfig被修改了
  // call query event
}

function btnQuery() {
  alert('test');
}

function btnClear() {
  setConfigRow(gridConfig, import.meta.env.VITE_DEFAULT_ROW);
  gridConfig = gridConfig;
  queryParam.name = '';
  queryParam.sysId = '';
  dsList = [];
}

</script>

<div class="row">
    <Toolbar args={toolbarParam}></Toolbar>

    <div class="col-xs-6 col-md-6 col-lg-6">
        <Form>
            <FormGroup>
                <Label for="sysId">編號</Label>
                <Input
                type="text"
                id="sysId"
                placeholder="輸入編號"     
                bind:value={queryParam.sysId}     
                />
            </FormGroup>      
        </Form>
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
      <Form>
          <FormGroup>
              <Label for="name">名稱</Label>
              <Input
              type="text"
              id="name"
              placeholder="輸入名稱"     
              bind:value={queryParam.name}     
              />
          </FormGroup>      
      </Form>
  </div>
</div>
<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
      <Button color="primary" on:click={btnQuery}><Icon name="search"/>&nbsp;查詢</Button>
      &nbsp;
      <Button color="primary" on:click={btnClear}><Icon name="eraser"/>&nbsp;清除</Button>
  </div>  
</div>
<div class="row">
  &nbsp;
</div>
<div class="row">
  <GridPagination changeGridConfigRowMethod={resetQueryGridRow} gridConfig={gridConfig} bind:dataSource={dsList}/>
  <Grid config={gridConfig} bind:dataSource={dsList} />
</div>