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
import { useProg002d0001Store } from './QueryPageStore'; 
import { 
  escapeQifuHtmlMsg,
	getAxiosInstance, 
	getProgItem, 
	getUrlPrefixFromProgItem 
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const queryPageStore = useProg002d0001Store();

const pageProgramId = ref(PageConstants.QueryId);
const dsList = ref<any[]>([]);
const qFieldShow = ref(true);
const refRoleId = ref('');
const refRoleOid = ref('');
const copyRoleId = ref('');
let myModal: any = null;

const tbRefresh = () => btnClear();
const tbCreate = () => router.push(PageConstants.frontendNamespace + '/create');
const tbQueryFieldShow = () => qFieldShow.value = !qFieldShow.value;

const btnClear = () => {
	refRoleId.value = '';
	refRoleOid.value = '';
	copyRoleId.value = '';
	queryPageStore.queryParam.role = '';
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
				'method'  : (val: any) => { 
					refRoleId.value = '';
					refRoleOid.value = '';
					const item = dsList.value.find(n => n.oid === val);
					if (item) {
						refRoleOid.value = val;
						refRoleId.value = item.role;
					}
					myModal = new bootstrap.Modal(document.getElementById('exampleModal')!);
					myModal.show();	
				},
				'icon'    : 'layers',
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
			{ label: 'Role編號', field: 'role' },
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
				"role" : queryPageStore.queryParam.role
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

const copyRole = async () => {
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading();      
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/roleCopySaveJson', {
            'fromRoleOid'	: refRoleOid.value,
            'role' 			: copyRoleId.value,
            'description'	: 'copy of ' + refRoleId.value
        });
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(escapeQifuHtmlMsg(response.data.message));
                return;
            }            
            toast.success(response.data.message);   
            if (myModal) myModal.hide();
			btnQuery();
			refRoleOid.value = '';
			refRoleId.value = '';
			copyRoleId.value = '';
        } else {
            toast.error('error, null');
        }
    } catch (e: any) {
        Swal.close();        
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
        description="Role管理." 
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
			<input type="text" class="form-control" id="role" placeholder="輸入Role編號" v-model="queryPageStore.queryParam.role">
			<label for="role">Role編號</label>
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
				<h1 class="modal-title fs-5" id="exampleModalLabel">複製Role</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label for="copyRoleId">Role編號，複製來源:&nbsp;{{refRoleId}}</label>
					<input type="text" class="form-control" id="copyRoleId" v-model="copyRoleId">					
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" @click="copyRole">OK</button>
			</div>
		</div>
	</div>
</div>

</template>
