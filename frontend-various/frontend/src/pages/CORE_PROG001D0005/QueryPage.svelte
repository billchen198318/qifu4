<script>
import { onMount, onDestroy } from 'svelte';    
import { push } from 'svelte-spa-router';
import { 
	FormGroup, Input, Label, Button, Icon, Table
} from 'sveltestrap';
import { toast, SvelteToast } from '@zerodevx/svelte-toast';
import Swal from 'sweetalert2';
import bootstrap from 'bootstrap/dist/js/bootstrap.bundle';
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
    description : 'Jasperreport resources管理.',
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
		'reportId'		: ''
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

let myModal;
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
					for (var n in dsList) {
						if (dsList[n].oid == val) {
							previewReportId = dsList[n].reportId;
						}
					}		
					var axiosInstance = getAxiosInstance();
					axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findSetParamPage', {
						"field": {
							"reportId"	: previewReportId
						}
						,
						"pageOf": {
							"select"  : 1,
							"showRow" : 100
						}
					})
					.then(response => {
						if (null != response.data) {
							if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
								return;
							}
							previewParamList = response.data.value;  
							// sveltestrap Modal 無法正常運作顯示, 改用 bootstrap
							myModal = new bootstrap.Modal(document.getElementById('exampleModal'));
							myModal.show();							 
						} else {
							previewParamList = [];
							previewReportId = '';
						}
					})
					.catch(e => {
						alert(e);
					});
				},
				'icon'    : 'file-pdf-fill',
				'type'    : 'customize',
				'memo'    : 'Preview test jasperreport.',
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
				'label' : '報表Id',
				'field' : 'reportId'
			}
			,
			{
				'label' : '說明',
				'field' : 'description'
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
			"reportId"	: queryParam.reportId
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
	queryParam.reportId = '';
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

let previewParamList = [];
let previewReportId = '';
function previewPdf() {
	var urlArgs = '?jreportId=' + previewReportId;
	var inputs = document.getElementsByTagName('input');
	for (var i = 0; i < inputs.length; ++i) {
		if (inputs[i].id.indexOf('urlParam_') > -1) {
			var pname = inputs[i].id.replaceAll('urlParam_','');
			urlArgs += '&' + pname + '=' + inputs[i].value;
		}
	}	
	myModal.hide();
	window.open(import.meta.env.VITE_JASPERREPORT_COMMON_URL + urlArgs, "_blank");
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
			<Label for="reportId">報表編號</Label>
			<Input type="text" id="reportId" placeholder="輸入報表編號" bind:value={queryParam.reportId} />
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

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h1 class="modal-title fs-5" id="exampleModalLabel">預覽測試jasperreport產出</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<Table bordered hover>
					<thead>
						<tr>
							<th style="background-color: #575757; color: whitesmoke;">Url參數</th>
							<th style="background-color: #575757; color: whitesmoke;">參數值</th>
						</tr>
					</thead>
					<tbody>
						{#each previewParamList as item}
						<tr>
							<td>{item.urlParam}</td>
							<td><input type='text' id={'urlParam_' + item.urlParam} /></td>
						</tr>
						{/each}
					</tbody>
				</Table>				
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" on:click={previewPdf}>OK</button>
			</div>
		</div>
	</div>
</div>

<SvelteToast/>
