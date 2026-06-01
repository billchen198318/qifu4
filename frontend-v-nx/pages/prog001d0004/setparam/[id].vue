<script setup lang="ts">
import { ref, watch, onMounted } from 'vue';
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
	templateOid : route.params.id as string,
	templateId : '',
	title : ''
});
const formParam = ref({
	templateId : '',
	isTitle : 'N',
	isTitleVar : false,
	templateVar : '',
	objectVar : ''
});
const paramList = ref<any[]>([]);

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.isTitle = 'N';
	formParam.value.isTitleVar = false;
	formParam.value.templateVar = '';
	formParam.value.objectVar = '';
};

watch(() => formParam.value.isTitleVar, (newVal) => {
	formParam.value.isTitle = newVal ? 'Y' : 'N';
});

const loadData = async () => {
    showLoading() 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', { 'oid' : masterParam.value.templateOid });
        hideLoading()
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
                return;
            }
            masterParam.value = response.data.value;
			masterParam.value.templateOid = route.params.id as string;
            formParam.value.templateId = masterParam.value.templateId;
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
				"templateId"	: masterParam.value.templateId
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
        	description="Freemarker 樣板管理，配置參數作業." 
        	marginBottom="Y"
        	refreshFlag="Y"
        	@refreshMethod="loadData"
        	backFlag="Y"
        	@backMethod="btnBack"
        	saveFlag="Y"
        	@saveMethod="btnSave"
    	/>		
	</div>
</div>

<div class="row">
    <div class="col-xs-6 col-md-6 col-lg-6">
        樣板編號:&nbsp;{{masterParam.templateId}}
    </div>
    <div class="col-xs-6 col-md-6 col-lg-6">
        樣板標題:&nbsp;{{masterParam.title}}
    </div>    
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="templateVar" class="form-label">樣板變數</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('templateVar', checkFields) ? 'is-invalid' : '']" 
			id="templateVar" 
			placeholder="輸入樣板變數" 
			v-model="formParam.templateVar"
		>
		<div v-if="checkInvalid('templateVar', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('templateVar', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="objectVar" class="form-label">物件變數</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('objectVar', checkFields) ? 'is-invalid' : '']" 
			id="objectVar" 
			placeholder="輸入物件變數" 
			v-model="formParam.objectVar"
		>
		<div v-if="checkInvalid('objectVar', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('objectVar', checkFields) }}</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<div class="form-check form-switch">
			<input class="form-check-input" type="checkbox" role="switch" id="isTitle" v-model="formParam.isTitleVar">
			<label class="form-check-label" for="isTitle">是否標題用</label>
		</div>		
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
                    <th style="background-color: #575757; color: whitesmoke;">樣板變數</th>
                    <th style="background-color: #575757; color: whitesmoke;">物件變數</th>
                    <th style="background-color: #575757; color: whitesmoke;">是否標題用</th>
                </tr>
            </thead>
			<tbody>
				<tr v-for="item in paramList" :key="item.oid">
                    <td>
                        <button class="btn btn-warning btn-sm" @click="delParamConfirm(item.oid)"><i class="bi bi-trash"></i></button>
                    </td>
                    <td>{{item.templateVar}}</td>
                    <td>{{item.objectVar}}</td>
                    <td>{{item.isTitle}}</td>
				</tr>	
			</tbody>
		</table>		
	</div>
</div>
</template>
