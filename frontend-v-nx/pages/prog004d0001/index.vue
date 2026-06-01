<script setup lang="ts">
import { ref, onMounted } from 'vue';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';
import { useSwalLoading } from '@/composables/useSwalLoading';

import Toolbar from '@/components/Toolbar.vue';
import Grid from '@/components/Grid.vue';
import GridPagination from '@/components/GridPagination.vue';
import HiddenQueryFieldAlertInfo from '@/components/HiddenQueryFieldAlertInfo.vue';
import { PageConstants } from './config';
import { getGridConfig, setConfigRow, setConfigPage, setConfigTotal, resetConfigByOld } from '../../components/GridHelper';
import { useProg004d0001Store } from './QueryPageStore'; 
import { 
	getAxiosInstance
} from '../../components/BaseHelper';

definePageMeta({ middleware : ['auth'] });

const queryPageStore = useProg004d0001Store();
const { showLoading, hideLoading } = useSwalLoading();

const pageProgramId = ref(PageConstants.QueryId);
const dsList = ref<any[]>([]);
const qFieldShow = ref(true);

const tbRefresh = () => btnClear();
const tbQueryFieldShow = () => qFieldShow.value = !qFieldShow.value;

const btnClear = () => {
	queryPageStore.queryParam.user = '';
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
			{ label: '系統代號', field: 'sysId' },
			{ label: '帳戶', field: 'user' },			
			{ label: 'Event', field: 'executeEvent' },
			{ label: '允許否', field: 'isPermit' },
			{ label: '時間', field: 'cdateString' },
			{ label: '<i class="bi bi-hand-index-thumb"></i>', field: 'oid', labHtml: true }		
		]  
	);
};

const btnQuery = async () => {
	showLoading();
	dsList.value = [];
	try {
		const axiosInstance = getAxiosInstance();
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findPage', {
			"field": {
				"user"  : queryPageStore.queryParam.user,
			},
			"pageOf": {
				"select"  : queryPageStore.gridConfig.page,
				"showRow" : queryPageStore.gridConfig.row
			}
		});
		hideLoading();
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
		hideLoading();    
		clearGridConfig();
		alert(e);
	}
};

const delItem = async (oid: string) => {
	showLoading();
	try {
		const axiosInstance = getAxiosInstance();  
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/delete', { "oid": oid });
		hideLoading();
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
		hideLoading();    
		btnQuery();
		alert(e);
	}
};

const deleteAllLog = async () => {
	showLoading();
	try {
		const axiosInstance = getAxiosInstance();  
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/deleteAll');
		hideLoading();
		if (response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG == response.data.success) {
				toast.success(response.data.message);
			} else {        
				toast.warning(response.data.message);
			}      
			btnQuery();
		} else {
			toast.error('error, null');
			btnQuery();
		}
	} catch (e: any) {
		hideLoading();    
		btnQuery();
		alert(e);
	}  		
};

const btnDeleteAll = () => {
    Swal.fire({
        title: '刪除全部紀錄?',
        icon: 'question',
        confirmButtonText: 'Yes',
        cancelButtonText: 'No',
        showCancelButton: true,
        showCloseButton: true
    }).then((result) => {
        if (result.isConfirmed) {
            deleteAllLog();
        }
    });            
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
        description="操作紀錄檢視." 
        marginBottom="Y"
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
		queryFieldShowSwitchFlag="Y"
		@queryFieldShowSwitcMethod="tbQueryFieldShow"			
    />
  </div>
</div>

<HiddenQueryFieldAlertInfo :dataSource="dsList" :queryFieldShowFlag="qFieldShow" />

<div class="row" v-show="qFieldShow">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<div class="form-group form-floating">
			<input type="text" class="form-control" id="user" placeholder="輸入帳戶" v-model="queryPageStore.queryParam.user">
			<label for="user">帳戶</label>
    	</div>	
	</div>
</div>

<p v-show="qFieldShow" style="margin-bottom: 5px"></p>

<div class="row" v-show="qFieldShow">
  	<div class="col-xs-12 col-md-12 col-lg-12">
    	<button type="button" class="btn btn-primary" @click="btnQuery"><i class="bi bi-search"></i>&nbsp;查詢</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" @click="btnClear"><i class="bi bi-eraser"></i>&nbsp;清除</button>
        &nbsp;
        &nbsp;
        <button type="button" class="btn btn-warning" @click="btnDeleteAll"><i class="bi bi-trash"></i>&nbsp;刪除全部紀錄</button>
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
