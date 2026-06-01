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
	role : '',
});
const formParam = ref({
	role : '',
	permission : '',
	permType : 'CONTROLLER',
	description : ''
});
const paramList = ref<any[]>([]);

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.permType = 'CONTROLLER';
	formParam.value.permission = '';
	formParam.value.description = '';
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
			formParam.value.role = masterParam.value.role;
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
				"role"	: masterParam.value.role
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
        	description="Role管理，Permission配置作業." 
        	marginBottom="Y"
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
		Role編號:&nbsp;{{masterParam.role}}
	</div>   
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="permission" class="form-label">Permission字串</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('permission', checkFields) ? 'is-invalid' : '']" 
			id="permission" 
			placeholder="輸入Permission字串" 
			v-model="formParam.permission"
		>
		<div v-if="checkInvalid('permission', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('permission', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="permType" class="form-label">類別</label>
		<select class="form-select" id="permType" v-model="formParam.permType">
			<option value="VIEW">View page / url</option>
			<option value="CONTROLLER">Controller / url</option>
            <option value="SERVICE">Service</option>
		</select>
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
                    <th style="background-color: #575757; color: whitesmoke;">Permission字串</th>
                    <th style="background-color: #575757; color: whitesmoke;">類別</th>
                </tr>
            </thead>
			<tbody>
				<tr v-for="item in paramList" :key="item.oid">
                    <td>
                        <button class="btn btn-warning btn-sm" @click="delParamConfirm(item.oid)"><i class="bi bi-trash"></i></button>
                    </td>
                    <td>{{item.permission}}</td>
                    <td>{{item.permType}}</td>
				</tr>	
			</tbody>
		</table>		
	</div>
</div>
</template>
