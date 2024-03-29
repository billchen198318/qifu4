<script>
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import Grid from '@/components/Grid.vue';
import GridPagination from '@/components/GridPagination.vue';
import { PageConstants } from './config';
import { getGridConfig, setConfigRow, setConfigPage, setConfigTotal, resetConfigByOld } from '../../components/GridHelper';
import { useProg004d0002Store } from './QueryPageStore'; 
import { 
    escapeQifuHtmlMsg,
	getAxiosInstance, 
	getProgItem, 
	getUrlPrefixFromProgItem 
} from '../../components/BaseHelper';

export default {
	components: { Toolbar, Grid, GridPagination },
	setup() { 
		const queryPageStore = useProg004d0002Store();
		return {
			queryPageStore
		}
	},
	data() {
		return {         
			pageProgramId : PageConstants.QueryId,
            dsList : []
		}
	},
	methods: { 
		tbRefresh : function() {
			this.btnClear();
		},
		initQueryGridConfig : _initQueryGridConfig,
		btnQuery : _btnQuery,        
		btnClear : function() {
			this.queryPageStore.queryParam.userId = '';
            this.dsList = [];
			this.clearGridConfig();
		},
		changeQueryGridRow : function(row) {
			setConfigRow(this.queryPageStore.gridConfig, row);
			this.queryPageStore.gridConfig.page = 1;
			this.btnQuery();
		},
		changePageSelect : function(page) {
			setConfigPage(this.queryPageStore.gridConfig, page);
			this.btnQuery();
		},
		clearGridConfig : function() {
			setConfigRow(this.queryPageStore.gridConfig, import.meta.env.VITE_DEFAULT_ROW);
			setConfigPage(this.queryPageStore.gridConfig, 1);
			setConfigTotal(this.queryPageStore.gridConfig, 0);
		},        
        delItem : _delItem,
        btnDeleteAll : function() {
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
                    this.deleteAllLog();
                }
            });            
        }
	},
	created() {
		let newGridConfig = this.initQueryGridConfig();
		let oldGridConfig = this.queryPageStore.gridConfig;
		if ( !(undefined === this.queryPageStore.gridConfig.column) ) {
			resetConfigByOld(newGridConfig, oldGridConfig);
		}
		this.queryPageStore.gridConfig = newGridConfig;		
	},
	mounted() { 
        if (this.queryPageStore.gridConfig.total > 0) {
            this.btnQuery();
        }
	}
}

function _initQueryGridConfig() {
	var that = this;
	var thatRouter = this.$router;
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
							that.delItem(val);
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
				'label' : '帳戶',
				'field' : 'userId'
			}
			,
			{
				'label' : 'Token',
				'field' : 'tokenShort'
			}
			,
			{
				'label' : '到期時間',
				'field' : 'expiresDateString'
			}
		]
	);
}

function _btnQuery() {
	Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
	Swal.showLoading();
	this.dsList = [];
	var axiosInstance = getAxiosInstance();
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findPage', {
		"field": {
			"userId"  : this.queryPageStore.queryParam.userId,
		}
		,
		"pageOf": {
			"select"  : this.queryPageStore.gridConfig.page,
			"showRow" : this.queryPageStore.gridConfig.row
		}
	})
	.then(response => {
		Swal.hideLoading();
		Swal.close();
		if (null != response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
				this.clearGridConfig();
				toast.warning(response.data.message);
				return;
			}
			this.dsList = response.data.value;
			setConfigTotal(this.queryPageStore.gridConfig, response.data.pageOf.countSize);
		} else {
			toast.error('error, null');
			this.clearGridConfig();
		}
	})
	.catch(e => {
		Swal.hideLoading();
		Swal.close();    
		this.clearGridConfig();
		alert(e);
	});
}

function _delItem(oid) {
	Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
	Swal.showLoading();  
	var axiosInstance = getAxiosInstance();  
	axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/delete', {"oid": oid})
	.then(response => {
		Swal.hideLoading();
		Swal.close();
		if (null != response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG == response.data.success) {
				toast.success(response.data.message);
			} else {        
				toast.warning(response.data.message);
			} 
			this.btnQuery();
		} else {
			toast.error('error, null');
			this.clearGridConfig();
		}
	})
	.catch(e => {
		Swal.hideLoading();
		Swal.close();    
		this.btnQuery();
		alert(e);
	});
}

</script>

<template>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    <Toolbar 
        :progId="this.pageProgramId" 
        description="操作紀錄檢視." 
        marginBottom="Y"
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
        backFlag="N"
        @backMethod="null"
        createFlag="N"
        @createMethod="null"
        saveFlag="N"
        @saveMethod="null"
    ></Toolbar>
  </div>
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<div class="form-group">
			<label for="userId">帳戶</label>
			<input type="text" class="form-control" id="userId" placeholder="輸入帳戶" v-model="this.queryPageStore.queryParam.userId">
    	</div>	
	</div>
</div>
<div class="row">
  	<div class="col-xs-12 col-md-12 col-lg-12">
    	<button type="button" class="btn btn-primary" v-on:click="btnQuery"><i class="'bi bi-search"></i>&nbsp;查詢</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" v-on:click="btnClear"><i class="'bi bi-eraser"></i>&nbsp;清除</button>
  	</div>
</div>  
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">&nbsp;</div>
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<GridPagination :progId="this.pageProgramId" :gridConfig="this.queryPageStore.gridConfig" :changePageSelectMethod="this.changePageSelect" :changeGridConfigRowMethod="this.changeQueryGridRow"></GridPagination>
		<Grid :progId="this.pageProgramId" :dataSource="this.dsList" :config="this.queryPageStore.gridConfig" ></Grid>
	</div>
</div>  

</template>
