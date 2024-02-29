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
    description : '操作紀錄檢視.',
    methods     : {
        "refresh"    :   function() {
            btnClear();
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
		'user' : '',
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
				'label' : '系統代號',
				'field' : 'sysId'
			}
			,
			{
				'label' : '帳戶',
				'field' : 'user'
			}
			,			
			{
				'label' : 'Event',
				'field' : 'executeEvent'
			}
			,
			{
				'label' : '允許否',
				'field' : 'isPermit'
			}
			,
			{
				'label' : '時間',
				'field' : 'cdateString'
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
			"user"    : queryParam.user,
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
	queryParam.user = '';
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

function btnDeleteAll() {
	Swal.fire({
		title: '刪除全部紀錄?',
		icon: 'question',
		iconHtml: '?',
		confirmButtonText: 'Yes',
		cancelButtonText: 'No',
		showCancelButton: true,
		showCloseButton: true
	}).then((result) => {
		if (result.isConfirmed) {
			deleteAllLog();
		}
	});
}

function deleteAllLog() {
	Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
	Swal.showLoading();  
	var axiosInstance = getAxiosInstance();  
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/deleteAll')
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
    <div class="col-xs-12 col-md-12 col-lg-12">
		<FormGroup>
			<Label for="user">帳戶</Label>
			<Input type="text" id="user" placeholder="輸入帳戶" bind:value={queryParam.user} />
		</FormGroup>
    </div>
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Button color="primary" on:click={btnQuery}><Icon name="search"/>&nbsp;查詢</Button>
		&nbsp;
		<Button color="primary" on:click={btnClear}><Icon name="eraser"/>&nbsp;清除</Button>
		&nbsp;
		&nbsp;
		<Button color="warning" on:click={btnDeleteAll}><Icon name="eraser"/>&nbsp;刪除全部紀錄</Button>
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
