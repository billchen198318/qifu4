<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { useRouter } from 'vue-router';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import Grid from '@/components/Grid.vue';
import GridPagination from '@/components/GridPagination.vue';
import HiddenQueryFieldAlertInfo from '@/components/HiddenQueryFieldAlertInfo.vue';
import { PageConstants } from './config';
import { getGridConfig, setConfigRow, setConfigPage, setConfigTotal, resetConfigByOld } from '../../components/GridHelper';
import { useProg001d0001Store } from './QueryPageStore'; 
import { 
	getAxiosInstance, 
	getProgItem, 
	getUrlPrefixFromProgItem 
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const queryPageStore = useProg001d0001Store();

const pageProgramId = ref(PageConstants.QueryId);
const dsList = ref<any[]>([]);
const qFieldShow = ref(true);

const tbRefresh = () => btnClear();
const tbCreate = () => router.push(PageConstants.frontendNamespace + '/create');
const tbQueryFieldShow = () => qFieldShow.value = !qFieldShow.value;

const btnClear = () => {
	queryPageStore.queryParam.name = '';
	queryPageStore.queryParam.sysId = '';
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
			{ label: 'Id', field: 'sysId' },
			{ label: 'Name', field: 'name' },
			{ label: 'Host', field: 'host' },
			{ label: 'Context Path', field: 'contextPath' },
			{ label: 'Local', field: 'isLocal' }
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
				"sysId"     : queryPageStore.queryParam.sysId,
				"nameLike"  : queryPageStore.queryParam.name
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
        description="站台測試用." 
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
	<div class="col-xs-6 col-md-6 col-lg-6">
		<div class="form-group form-floating">
			<input type="text" class="form-control" id="sysId" placeholder="輸入編號" v-model="queryPageStore.queryParam.sysId">
			<label for="sysId">編號</label>
    	</div>
  	</div>
  	<div class="col-xs-6 col-md-6 col-lg-6">
    	<div class="form-group form-floating">
			<input type="text" class="form-control" id="name" placeholder="輸入名稱" v-model="queryPageStore.queryParam.name">
			<label for="name">名稱</label>
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

</template>