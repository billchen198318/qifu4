<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { useRouter, useRoute } from 'vue-router';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import { useSwalLoading } from '@/composables/useSwalLoading';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from '../config';
import { 
	getAxiosInstance, 
	invalidFeedback,
	checkInvalid,
	escapeQifuHtmlMsg,
	getProgItem, 
	getUrlPrefixFromProgItem 		
} from '../../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const route = useRoute();

const { showLoading, hideLoading } = useSwalLoading();

const pageProgramId = ref(PageConstants.SetParamId);
const checkFields = ref<any>({});
const masterParam = ref({
	oid : route.params.id as string,
	reportId : '',
});
const formParam = ref({
	reportId : '',
	urlParam : '',
	rptParam : ''
});
const paramList = ref<any[]>([]);

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.urlParam = '';
	formParam.value.rptParam = '';
};

const tbRefresh = () => {
	loadData();
	btnClear();
};

const loadData = async () => {
    showLoading() 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', { 'oid' : masterParam.value.oid });
        hideLoading()
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
                return;
            }
			masterParam.value = response.data.value;
			masterParam.value.oid = route.params.id as string;
			formParam.value.reportId = masterParam.value.reportId;
			queryParamList();
        } else {
            toast.error('error, null');
            router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
        }
    } catch (e: any) {
        hideLoading()        
        alert(e);
        router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
    }         
};

const queryParamList = async () => {
    paramList.value = [];
	try {
		const axiosInstance = getAxiosInstance();
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findSetParamPage', {
			"field": {
				"reportId"	: masterParam.value.reportId
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
			paramList.value = response.data.value;   
		} else {
			toast.error('error, null');
		}
	} catch (e: any) {
		alert(e);
	}
};

const btnSave = async () => {
    checkFields.value = {};
    showLoading()      
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/saveSetParam', formParam.value);
        hideLoading()
        if (response.data) {
            checkFields.value = response.data.checkFields || {};
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(escapeQifuHtmlMsg(response.data.message));
            } else {
                toast.success(response.data.message);
                btnClear();
            }            
        } else {
            toast.error('error, null');
        }
        queryParamList();
    } catch (e: any) {
        hideLoading()        
        alert(e);
    }
};

const delParam = async (oid: string) => {
	showLoading()  
	try {
		const axiosInstance = getAxiosInstance();  
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/deleteSetParam', { "oid": oid });
		hideLoading()
		if (response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG == response.data.success) {
				toast.success(response.data.message);
			} else {        
				toast.warning(response.data.message);
			}      
			queryParamList();
		} else {
			toast.error('error, null');
			queryParamList();
		}
	} catch (e: any) {
		hideLoading()    
		queryParamList();
		alert(e);
	} 
};

const delParamConfirm = (oid: string) => {
	Swal.fire({
		title: '刪除?',
		icon: 'question',
		confirmButtonText: 'Yes',
		cancelButtonText: 'No',
		showCancelButton: true,
		showCloseButton: true
	}).then((result) => {
		if (result.isConfirmed) {
			delParam(oid);
		}
	});  
};

onMounted(() => {
	loadData();
});
</script>

<template>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Toolbar 
			:progId="pageProgramId" 
        	description="Jasperreport resources管理，參數配置作業." 
        	refreshFlag="Y"
        	@refreshMethod="tbRefresh"
        	backFlag="Y"
        	@backMethod="btnBack"
        	saveFlag="Y"
        	@saveMethod="btnSave"
    	/>		
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		Jasperreport報表編號:&nbsp;{{masterParam.reportId}}
	</div>   
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="urlParam" class="form-label">Url參數</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('urlParam', checkFields) ? 'is-invalid' : '']" 
			id="urlParam" 
			placeholder="輸入Url參數" 
			v-model="formParam.urlParam"
		>
		<div v-if="checkInvalid('urlParam', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('urlParam', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="rptParam" class="form-label">Jasperreport參數</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('rptParam', checkFields) ? 'is-invalid' : '']" 
			id="rptParam" 
			placeholder="輸入物件變數" 
			v-model="formParam.rptParam"
		>
		<div v-if="checkInvalid('rptParam', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('rptParam', checkFields) }}</div>
	</div>
</div>

<p style="margin-bottom: 5px"></p>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
    	<button type="button" class="btn btn-primary" @click="btnSave"><i class="bi bi-save"></i>&nbsp;儲存</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" @click="btnClear"><i class="bi bi-eraser"></i>&nbsp;清除</button>		
	</div>
</div>

<div class="row">
	&nbsp;
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th style="background-color: #575757; color: whitesmoke;"><i class="bi bi-hand-index-thumb"></i></th>
                    <th style="background-color: #575757; color: whitesmoke;">Url參數</th>
                    <th style="background-color: #575757; color: whitesmoke;">Jasperreport參數</th>
                </tr>
            </thead>
			<tbody>
				<tr v-for="item in paramList" :key="item.oid">
                    <td>
                        <button class="btn btn-warning btn-sm" @click="delParamConfirm(item.oid)"><i class="bi bi-trash"></i></button>
                    </td>
                    <td>{{item.urlParam}}</td>
                    <td>{{item.rptParam}}</td>
				</tr>	
			</tbody>
		</table>		
	</div>
</div>
</template>
