<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { useRouter } from 'vue-router';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import bootstrap from 'bootstrap/dist/js/bootstrap';

import Toolbar from '@/components/Toolbar.vue';
import Grid from '@/components/Grid.vue';
import GridPagination from '@/components/GridPagination.vue';
import HiddenQueryFieldAlertInfo from '@/components/HiddenQueryFieldAlertInfo.vue';
import { PageConstants } from './config';
import { getGridConfig, setConfigRow, setConfigPage, setConfigTotal, resetConfigByOld } from '../../components/GridHelper';
import { useProg001d0005Store } from './QueryPageStore'; 
import { 
	getAccessTokenCookie,
	getAxiosInstance, 
	getProgItem, 
	getUrlPrefixFromProgItem 
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const queryPageStore = useProg001d0005Store();

const pageProgramId = ref(PageConstants.QueryId);
const dsList = ref<any[]>([]);
const qFieldShow = ref(true);
const previewParamList = ref<any[]>([]);
const previewReportId = ref('');
let myModal: any = null;

const tbRefresh = () => btnClear();
const tbCreate = () => router.push(PageConstants.frontendNamespace + '/create');
const tbQueryFieldShow = () => qFieldShow.value = !qFieldShow.value;

const btnClear = () => {
	queryPageStore.queryParam.reportId = '';
	dsList.value = [];
	clearGridConfig();
};

const changeQueryGridRow = (row: number) => {
	setConfigRow(queryPageStore.gridConfig, row);
	queryPageStore.gridConfig.page = 1;
	btnQuery();
};

const changePageSelect = (page: number) => {
	setConfigPage(queryPageStore.gridConfig, page);
	btnQuery();
};

const clearGridConfig = () => {
	setConfigRow(queryPageStore.gridConfig, import.meta.env.VITE_DEFAULT_ROW);
	setConfigPage(queryPageStore.gridConfig, 1);
	setConfigTotal(queryPageStore.gridConfig, 0);
};

const initQueryGridConfig = () => {
  	return getGridConfig(
		'oid',
		[
			{
				'method'  : (val: any) => { 
					const url = getUrlPrefixFromProgItem(getProgItem(PageConstants.EditId)) + '/' + val;
					router.push(url);
				},
				'icon'    : 'pen',
				'type'    : 'edit',
				'memo'    : 'Edit current item.',
				'class'	  : 'btn btn-info btn-sm'
			},
			{
				'method'  : (val: any) => { 
					const url = getUrlPrefixFromProgItem(getProgItem(PageConstants.SetParamId)) + '/' + val;
					router.push(url);
				},
				'icon'    : 'gear-fill',
				'type'    : 'customize',
				'memo'    : 'Set parameter.',
				'class'	  : 'btn btn-secondary btn-sm'
			},			
			{
				'method'  : async (val: any) => { 
					const item = dsList.value.find(n => n.oid === val);
					if (item) {
						previewReportId.value = item.reportId;
					}
					
					if (!previewReportId.value) {
						toast.error('資料錯誤,previewReportId');
						return;
					}
					
					try {
						const axiosInstance = getAxiosInstance();
						const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findSetParamPage', {
							"field": {
								"reportId"	: previewReportId.value
							},
							"pageOf": {
								"select"  : 1,
								"showRow" : 100
							}
						});
						
						if (response.data) {
							if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
								return;
							}
							previewParamList.value = response.data.value;
							myModal = new bootstrap.Modal(document.getElementById('exampleModal')!);
							myModal.show();							 
						} else {
							previewParamList.value = [];
							previewReportId.value = '';
						}
					} catch (e: any) {
						alert(e);
					}
				},
				'icon'    : 'file-pdf-fill',
				'type'    : 'customize',
				'memo'    : 'Preview test jasperreport.',
				'class'	  : 'btn btn-secondary btn-sm'
			},				
			{
				'method'  : (val: any) => { 
					Swal.fire({
						title: '刪除?',
						icon: 'question',
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
		],
		[
			{ label: '<i class="bi bi-hand-index-thumb"></i>', field: 'oid', labHtml: true },
			{ label: '報表Id', field: 'reportId' },
			{ label: '說明', field: 'description' }          
		]
	);
};

const btnQuery = async () => {
	Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
	Swal.showLoading();
	dsList.value = [];
	try {
		const axiosInstance = getAxiosInstance();
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findPage', {
			"field": {
				"reportId" : queryPageStore.queryParam.reportId
			},
			"pageOf": {
				"select"  : queryPageStore.gridConfig.page,
				"showRow" : queryPageStore.gridConfig.row
			}
		});
		Swal.close();
		if (response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
				clearGridConfig();
				toast.warning(response.data.message);
				return;
			}
			dsList.value = response.data.value;
			setConfigTotal(queryPageStore.gridConfig, response.data.pageOf.countSize);
		} else {
			toast.error('error, null');
			clearGridConfig();
		}
	} catch (e: any) {
		Swal.close();    
		clearGridConfig();
		alert(e);
	}
};

const delItem = async (oid: string) => {
	Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
	Swal.showLoading();  
	try {
		const axiosInstance = getAxiosInstance();  
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/delete', { "oid": oid });
		Swal.close();
		if (response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG == response.data.success) {
				toast.success(response.data.message);
			} else {        
				toast.warning(response.data.message);
			} 
			btnQuery();
		} else {
			toast.error('error, null');
			clearGridConfig();
		}
	} catch (e: any) {
		Swal.close();    
		btnQuery();
		alert(e);
	}
};

const previewPdf = () => {
	let urlArgs = '?jreportId=' + previewReportId.value;
	const inputs = document.getElementsByTagName('input');
	for (let i = 0; i < inputs.length; ++i) {
		if (inputs[i].id.indexOf('urlParam_') > -1) {
			const pname = inputs[i].id.replaceAll('urlParam_','');
			urlArgs += '&' + pname + '=' + inputs[i].value;
		}
	}	
	urlArgs += '&qifutoken=' + getAccessTokenCookie();
	myModal.hide();
	window.open(import.meta.env.VITE_JASPERREPORT_COMMON_URL + urlArgs, "_blank");
};

onMounted(() => {
	const newGridConfig = initQueryGridConfig();
	if (queryPageStore.gridConfig.column) {
		resetConfigByOld(newGridConfig, queryPageStore.gridConfig);
	}
	queryPageStore.gridConfig = newGridConfig;
	
	if (queryPageStore.gridConfig.total > 0) {
		btnQuery();
	}
});
</script>

<template>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    <Toolbar 
        :progId="pageProgramId" 
        description="Jasperreport resources管理." 
        marginBottom="Y"
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
        createFlag="Y"
        @createMethod="tbCreate"
		queryFieldShowSwitchFlag="Y"
		@queryFieldShowSwitcMethod="tbQueryFieldShow"		
    />
  </div>
</div>

<HiddenQueryFieldAlertInfo :dataSource="dsList" :queryFieldShowFlag="qFieldShow" />

<div class="row" v-show="qFieldShow">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<div class="form-group form-floating">
			<input type="text" class="form-control" id="reportId" placeholder="輸入報表編號" v-model="queryPageStore.queryParam.reportId">
			<label for="reportId">報表編號</label>
    	</div>
  	</div>
</div>

<p v-show="qFieldShow" style="margin-bottom: 5px"></p>

<div class="row" v-show="qFieldShow">
  	<div class="col-xs-12 col-md-12 col-lg-12">
    	<button type="button" class="btn btn-primary" @click="btnQuery"><i class="bi bi-search"></i>&nbsp;查詢</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" @click="btnClear"><i class="bi bi-eraser"></i>&nbsp;清除</button>
  	</div>
</div>  

<div v-show="qFieldShow" class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">&nbsp;</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<GridPagination 
			:progId="pageProgramId" 
			:gridConfig="queryPageStore.gridConfig" 
			:changePageSelectMethod="changePageSelect" 
			:changeGridConfigRowMethod="changeQueryGridRow" 
		/>
		<Grid :progId="pageProgramId" :dataSource="dsList" :config="queryPageStore.gridConfig" />
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
				<table class="table table-hover table-bordered">
					<thead>
						<tr>
							<th style="background-color: #575757; color: whitesmoke;">Url參數</th>
							<th style="background-color: #575757; color: whitesmoke;">參數值</th>
						</tr>
					</thead>
					<tbody>
						<tr v-for="item in previewParamList" :key="item.oid">
							<td>{{item.urlParam}}</td>
							<td><input type='text' class="form-control" :id="'urlParam_' + item.urlParam" /></td>
						</tr>
					</tbody>
				</table>				
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" @click="previewPdf">OK</button>
			</div>
		</div>
	</div>
</div>

</template>
