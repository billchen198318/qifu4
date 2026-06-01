<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { useRouter } from 'vue-router';
import { toast } from 'vue3-toastify';
import { useSwalLoading } from '@/composables/useSwalLoading';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import Grid from '@/components/Grid.vue';
import GridPagination from '@/components/GridPagination.vue';
import HiddenQueryFieldAlertInfo from '@/components/HiddenQueryFieldAlertInfo.vue';
import { PageConstants } from './config';
import { getGridConfig, setConfigRow, setConfigPage, setConfigTotal, resetConfigByOld } from '../../components/GridHelper';
import { useProg001d0002Store } from './QueryPageStore'; 
import { 
	getAxiosInstance, 
	getProgItem, 
	getUrlPrefixFromProgItem 
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const queryPageStore = useProg001d0002Store();

const { showLoading, hideLoading, confirmFire } = useSwalLoading();

const pageProgramId = ref(PageConstants.QueryId);
const dsList = ref<any[]>([]);
const qFieldShow = ref(true);

const tbRefresh = () => btnClear();
const tbCreate = () => router.push(PageConstants.frontendNamespace + '/create');
const tbQueryFieldShow = () => qFieldShow.value = !qFieldShow.value;

const btnClear = () => {
	queryPageStore.queryParam.name = '';
	queryPageStore.queryParam.progId = '';
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
					confirmFire('刪除?', delItem, val);           
				},
				'icon'    : 'trash',
				'type'    : 'delete',
				'memo'    : 'Delete current item.',
				'class'	  : 'btn btn-danger btn-sm'
			}     
		],
		[
			{ label: '<i class="bi bi-hand-index-thumb"></i>', field: 'oid', labHtml: true, labTextAlign: 'center' },
			{ label: '程式編號', field: 'progId' },
			{ label: '程式名稱', field: 'name' },
			{ label: 'Url', field: 'url' },
			{ label: '主系統', field: 'progSystem' },
			{ 
				label: '類別', 
				field: 'itemType', 
				colHtml: true, 
				colMethod: (val: any) => val === 'FOLDER' ? `<b>${val}</b>` : val 
			},            
			{ label: '編輯頁', field: 'editMode', textAlign: 'center' },            
			{ 
				label: 'Icon', 
				field: 'fontIconClassId', 
				colHtml: true, 
				colMethod: (val: any) => `<i class="bi bi-${val}"></i>`,
				textAlign: 'center' 
			},            
			{ label: 'Dialog', field: 'isDialog', textAlign: 'center' }            
		] 
	);
};

const btnQuery = async () => {
	showLoading()
	dsList.value = [];
	try {
		const axiosInstance = getAxiosInstance();
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findPage', {
			"field": {
				"progId"    : queryPageStore.queryParam.progId,
				"nameLike"  : queryPageStore.queryParam.name
			},
			"pageOf": {
				"select"  : queryPageStore.gridConfig.page,
				"showRow" : queryPageStore.gridConfig.row
			}
		});
		hideLoading()
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
		hideLoading()    
		clearGridConfig();
		alert(e);
	}
};

const delItem = async (oid: string) => {
	showLoading()  
	try {
		const axiosInstance = getAxiosInstance();  
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/delete', { "oid": oid });
		hideLoading()
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
		hideLoading()    
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
        description="程式管理." 
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
			<input type="text" class="form-control" id="progId" placeholder="輸入程式編號" v-model="queryPageStore.queryParam.progId">
			<label for="progId">程式編號</label>
    	</div>
  	</div>
  	<div class="col-xs-6 col-md-6 col-lg-6">
    	<div class="form-group form-floating">
			<input type="text" class="form-control" id="name" placeholder="輸入程式名稱" v-model="queryPageStore.queryParam.name">
			<label for="name">程式名稱</label>
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
