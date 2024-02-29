<script>
import { onMount, onDestroy } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
	FormGroup, Input, Label, Button, Icon
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import { 
    getProgItem, getAxiosInstance, 
    getToastDefaultTheme, getToastErrorTheme, getToastWarningTheme, getToastSuccessTheme
} from "../../components/BaseHelper.svelte";
import Toolbar from "../../components/Toolbar.svelte";
import Grid, { getGridConfig, setConfigRow, setConfigPage, setConfigTotal } from "../../components/Grid.svelte";
import GridPagination from '../../components/GridPagination.svelte';
import { _gridConfig, _queryParam } from './QueryStateStore';
import { PageConstants } from './config';

let toolbarParam = {
    id          : PageConstants.QueryId,
    description : 'Freemarker 樣板管理.',
    methods     : {
        "refresh"    :   function() {
            btnClear();
        }
        ,
        "create"    :   function() {
            push( getProgItem(PageConstants.CreateId).url );
        }
    }
}

/* ------------------- query page state ------------------- */
let queryParam = { };
let gridConfig = { };
_queryParam.subscribe(value => {
	queryParam = value;
});
_gridConfig.subscribe(value => {
	gridConfig = value;
});
/* -------------------------------------------------------- */

if (Object.keys(queryParam).length == 0) {
	queryParam = {
		'templateId'	: '',
		'title'  		: ''
	}
}
if (Object.keys(gridConfig).length == 0) {
    gridConfig = initQueryGridConfig();
} else {
	let befPage = gridConfig.page;
	let befTotal = gridConfig.total;
	let befRow = gridConfig.row;
	gridConfig = { };
	gridConfig = initQueryGridConfig();
	setConfigPage(gridConfig, befPage);
	setConfigTotal(gridConfig, befTotal);
	setConfigRow(gridConfig, befRow);
}

function setQueryPageState(gridConfig, queryParam) {
	_gridConfig.update((value) => { return gridConfig;});
	_queryParam.update((value) => { return queryParam;});
}

function initQueryGridConfig() {
    return getGridConfig(
		'oid'
		,
		[
			{
				'method'  : function(val) { 
					var url = getProgItem(PageConstants.EditId).url + '/' + val;
					push( url );
				},
				'icon'    : 'pen',
				'type'    : 'edit',
				'memo'    : 'Edit current item.',
				'class'	  : 'btn btn-info btn-sm'
			}
			,
			{
				'method'  : function(val) { 
					var url = getProgItem(PageConstants.SetParamId).url + '/' + val;
					push( url );
				},
				'icon'    : 'gear-fill',
				'type'    : 'customize',
				'memo'    : 'Set parameter.',
				'class'	  : 'btn btn-secondary btn-sm'
			}
			,			
			{
				'method'  : function(val) { 
					Swal.fire({
						title: '刪除?',
						icon: 'question',
						iconHtml: '?',
						confirmButtonText: 'Yes',
						cancelButtonText: 'No',
						showCancelButton: true,
						showCloseButton: true
					}).then((result) => {
						if (result.isConfirmed) {
							delItem(val);
						}
					});            
				},
				'icon'    : 'trash',
				'type'    : 'delete',
				'memo'    : 'Delete current item.',
				'class'	  : 'btn btn-danger btn-sm'
			}     
		]
		,
		[
			{
				'label' : '#',
				'field' : 'oid'
			}
			,
			{
				'label' : '樣板編號',
				'field' : 'templateId'
			}
			,
			{
				'label' : 'Title標題',
				'field' : 'title'
			}          
		]    
	);
}

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
	btnQuery();
}

function btnQuery() {
	Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
	Swal.showLoading();
	
	dsList = [];
	dsList = dsList;
	var axiosInstance = getAxiosInstance();
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findPage', {
		"field": {
			"templateId"	: queryParam.templateId,
			"titleLike"		: queryParam.title
		}
		,
		"pageOf": {
			"select"  : gridConfig.page,
			"showRow" : gridConfig.row
		}
	})
	.then(response => {
		Swal.hideLoading();
		Swal.close();
		if (null != response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
				clearGridConfig();
				toast.push(response.data.message, getToastWarningTheme());
				return;
			}
			dsList = response.data.value;
			setConfigTotal(gridConfig, response.data.pageOf.countSize);
			gridConfig = gridConfig; // 讓 GridPagination 知道 gridConfig 被更動了
			setQueryPageState(gridConfig, queryParam);      
		} else {
			toast.push('error, null', getToastErrorTheme());
			clearGridConfig();
		}
	})
	.catch(e => {
		Swal.hideLoading();
		Swal.close();    
		clearGridConfig();
		alert(e);
	});
}

function clearGridConfig() {
	setConfigRow(gridConfig, import.meta.env.VITE_DEFAULT_ROW);
	setConfigPage(gridConfig, 1);
	setConfigTotal(gridConfig, 0);
	gridConfig = gridConfig; // 讓 GridPagination 知道 gridConfig 被更動了
}

function btnClear() {
	clearGridConfig();  
	queryParam.templateId = '';
	queryParam.title = '';
	dsList = [];
}

function delItem(oid) {
	Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
	Swal.showLoading();  
	var axiosInstance = getAxiosInstance();  
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/delete', {"oid": oid})
	.then(response => {
		Swal.hideLoading();
		Swal.close();
		if (null != response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG == response.data.success) {
				toast.push(response.data.message, getToastSuccessTheme());
			} else {        
				toast.push(response.data.message, getToastWarningTheme());
			}      
			btnQuery();
		} else {
			toast.push('error, null', getToastErrorTheme());
			clearGridConfig();
		}
	})
	.catch(e => {
		Swal.hideLoading();
		Swal.close();    
		btnQuery();
		alert(e);
	});  
}

onMount(()=>{
	btnQuery();
});

onDestroy(()=>{
	toast.pop(0);
});

</script>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Toolbar args={toolbarParam}></Toolbar>
	</div>  
</div>
<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
		<FormGroup>
			<Label for="templateId">樣板編號</Label>
			<Input type="text" id="templateId" placeholder="輸入樣板編號" bind:value={queryParam.templateId} />
		</FormGroup>
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
		<FormGroup>
			<Label for="title">樣板標題</Label>
			<Input type="text" id="title" placeholder="輸入樣板標題" bind:value={queryParam.title} />
		</FormGroup>
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
	<div class="col-xs-12 col-md-12 col-lg-12">&nbsp;</div>
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<GridPagination changeGridConfigRowMethod={changeQueryGridRow} changePageSelectMethod={changePageSelect} gridConfig={gridConfig} />
		<Grid config={gridConfig} bind:dataSource={dsList} />  
	</div>
</div>

<SvelteToast/>
