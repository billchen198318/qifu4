<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { useRouter, useRoute } from 'vue-router';
import { toast } from 'vue3-toastify';
import { useSwalLoading } from '@/composables/useSwalLoading';
import 'vue3-toastify/dist/index.css';

import '../../../node_modules/bytemd/dist/index.css';
import gfm from '@bytemd/plugin-gfm';
import { Editor } from '@bytemd/vue-next';
import importHtml from '@bytemd/plugin-import-html';

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

const pageProgramId = ref(PageConstants.EditId);
const checkFields = ref<any>({});
const formParam = ref({
	oid : route.params.id as string,
	templateId : '',
	title : '',
	message : '',
	description : ''
});

const plugins = [ importHtml(), gfm() ];

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.title = '';
	formParam.value.message = '';
	formParam.value.description = '';
};

const handleChange = (v: string) => {
	formParam.value.message = v;
};

const loadData = async () => {
    showLoading() 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/load', { 'oid' : formParam.value.oid });
        hideLoading()
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                router.push(getUrlPrefixFromProgItem(getProgItem(PageConstants.QueryId)));
                return;
            }
            formParam.value = response.data.value;
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

const btnUpdate = async () => {
    checkFields.value = {};
    showLoading()      
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/update', formParam.value);
        hideLoading()
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
        hideLoading()        
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
        	description="Freemarker 樣板管理，修改資料作業." 
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
		<label for="templateId" class="form-label">樣板編號</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('templateId', checkFields) ? 'is-invalid' : '']" 
			id="templateId" 
			v-model="formParam.templateId" 
			readonly
		>
		<div v-if="checkInvalid('templateId', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('templateId', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="title" class="form-label">樣板標題</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('title', checkFields) ? 'is-invalid' : '']" 
			id="title" 
			placeholder="輸入樣板標題" 
			v-model="formParam.title"
		>
		<div v-if="checkInvalid('title', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('title', checkFields) }}</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">&nbsp;</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Editor :value="formParam.message" :plugins="plugins" @change="handleChange" />
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
