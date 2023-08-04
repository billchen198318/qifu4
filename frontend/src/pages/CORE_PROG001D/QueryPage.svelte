<script>
import { onMount } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
    Form, FormGroup, Input, Label, Button, Icon
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import { getProgItem, getAxiosInstance } from "../../components/BaseHelper.svelte";
import Toolbar from "../../components/Toolbar.svelte";
import Grid, { getGridConfig, setConfigRow, setConfigPage, setConfigTotal } from "../../components/Grid.svelte";
import GridPagination from '../../components/GridPagination.svelte';

let toolbarParam = {
    id          : 'CORE_PROG001D0001Q',
    description : '站台測試用.',
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

});

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
      'field' : 'isLocal'
    }
  ]    
);

let dsList = [];

function changeQueryGridRow(row) {
  setConfigRow(gridConfig, row);
  gridConfig.page = 1;
  gridConfig = gridConfig; // 讓 svelte child compomenet 知道 gridConfig被修改了
  btnQuery();
}

function changePageSelect(page) {
  setConfigPage(gridConfig, page);
  gridConfig = gridConfig; // 讓 svelte child compomenet 知道 gridConfig被修改了
  // call query event
  alert('page>>' + page);
}

function btnQuery() {
  dsList = [];
  dsList = dsList;
  var axiosInstance = getAxiosInstance();
  axiosInstance.post(import.meta.env.VITE_API_URL + '/prog001/findPage', {
    "field": {
      "sysId" : queryParam.sysId,
      "name"  : queryParam.name
    },
    "pageOf": {
      "select"  : gridConfig.page,
      "showRow" : gridConfig.row
    }
  })
  .then(response => {
    if (null != response && null != response.data && null != response.data.value) {
      if ('Y' != response.data.success) {
        toast.push(response.data.message);
        return;
      }
      dsList = response.data.value;
      setConfigTotal(gridConfig, response.data.pageOf.countSize);
      gridConfig = gridConfig; // 讓 GridPagination 知道 gridConfig 被更動了
    } else {
      toast.push('error, null');
    }
  })
  .catch(e => {
    alert(e);
  });
}

function btnClear() {
  setConfigRow(gridConfig, import.meta.env.VITE_DEFAULT_ROW);
  gridConfig = gridConfig; // 讓 GridPagination 知道 gridConfig 被更動了
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
  <GridPagination changeGridConfigRowMethod={changeQueryGridRow} changePageSelectMethod={changePageSelect} gridConfig={gridConfig} bind:dataSource={dsList} />
  <Grid config={gridConfig} bind:dataSource={dsList} />
</div>

<SvelteToast/>
