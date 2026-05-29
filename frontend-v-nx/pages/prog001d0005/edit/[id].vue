<script setup lang="ts">
import { ref, watch, onMounted } from 'vue';
import { useRouter, useRoute } from 'vue-router';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from '../config';
import { 
	getAxiosInstance, 
	invalidFeedback,
	checkInvalid,
	escapeQifuHtmlMsg,
	getProgItem, 
	getUrlPrefixFromProgItem,	
	getFile2Base64
} from '../../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const route = useRoute();

const pageProgramId = ref(PageConstants.EditId);
const checkFields = ref<any>({});
const formParam = ref({
	oid : route.params.id as string,
	reportId : '',
	description : '',
	isCompile : 'N',
	compile : false,
	uploadBase64 : '',
	file : ''
});

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.description = '';
	formParam.value.isCompile = 'N';
	formParam.value.compile = false;
	formParam.value.uploadBase64 = '';
	formParam.value.file = '';
	const fileInput = document.getElementById('file') as HTMLInputElement;
	if (fileInput) fileInput.value = '';
};

const handleFiles = async (event: any) => {
	formParam.value.uploadBase64 = '';
	formParam.value.file = '';
	const files = event.target.files;
	if (files == null || files.length < 1) {
		toast.warning('請選取檔案');
		event.target.value = null;
		return;
	}
	
	if (!files[0].name.toLowerCase().endsWith('.zip')) {
		toast.warning('只允許上傳zip檔案');
		event.target.value = null;
		return;
	}
	
	if (files[0].size > 1 && files[0].size <= (import.meta.env.VITE_UPLOAD_MAX_SIZE || 10485760)) {
		try {
			const c = await getFile2Base64(files[0]);
			formParam.value.uploadBase64 = c;
			formParam.value.file = files[0].name;
		} catch (e: any) {
			formParam.value.uploadBase64 = ''; 
			toast.error('請重新選取檔案,發生錯誤');
			event.target.value = null;
		}
	} else {
		toast.warning('選取之檔案,容量不允許上傳');
		event.target.value = null;
	}
};

const refreshSwitchItemVariableFn = () => {
	formParam.value.isCompile = formParam.value.compile ? 'Y' : 'N';
};

watch(() => formParam.value.compile, refreshSwitchItemVariableFn);

const loadData = async () => {
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', { 'oid' : formParam.value.oid });
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
                return;
            }
            formParam.value = response.data.value;
			formParam.value.oid = route.params.id as string;
            formParam.value.uploadBase64 = '';
            formParam.value.compile = (formParam.value.isCompile === 'Y');
        } else {
            toast.error('error, null');
            router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);
        router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
    }         
};

const btnUpdate = async () => {
    checkFields.value = {};
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading();
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/update', formParam.value);
        Swal.close();
        if (response.data) {
			checkFields.value = response.data.checkFields || {};
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(escapeQifuHtmlMsg(response.data.message));
                return;
            }            
            toast.success(response.data.message);   
        } else {
            toast.error('error, null');
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);
    }
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
        	description="Jasperreport resources管理，修改資料作業." 
        	marginBottom="Y"
        	refreshFlag="Y"
        	@refreshMethod="loadData"
        	backFlag="Y"
        	@backMethod="btnBack"
        	saveFlag="Y"
        	@saveMethod="btnUpdate"
    	/>		
	</div>
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="reportId" class="form-label">報表編號</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('reportId', checkFields) ? 'is-invalid' : '']" 
			id="reportId" 
			v-model="formParam.reportId" 
			readonly
		>
		<div v-if="checkInvalid('reportId', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('reportId', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="file" class="form-label">jasperreport資源zip壓縮檔</label>
		<input 
			type="file" 
			:class="['custom-file-input form-control', checkInvalid('file', checkFields) ? 'is-invalid' : '']" 
			id="file" 
			placeholder="輸入名稱" 
			@change="handleFiles"
		>
		<div v-if="checkInvalid('file', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('file', checkFields) }}</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<div class="form-check form-switch">
			<input class="form-check-input" type="checkbox" role="switch" id="compile" v-model="formParam.compile">
			<label class="form-check-label" for="compile">編譯jrxml</label>
		</div>		
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<label for="description" class="form-label">說明</label>
		<textarea class="form-control" id="description" rows="3" v-model="formParam.description"></textarea>			
	</div>
</div>

<p style="margin-bottom: 5px"></p>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
    	<button type="button" class="btn btn-primary" @click="btnUpdate"><i class="bi bi-save"></i>&nbsp;儲存</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" @click="btnClear"><i class="bi bi-eraser"></i>&nbsp;清除</button>		
	</div>
</div>
</template>
