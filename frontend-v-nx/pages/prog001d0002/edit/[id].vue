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
	getUrlPrefixFromProgItem 	
} from '../../../components/BaseHelper';

import { popularIcons } from '@/assets/icons';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const route = useRoute();

const pageProgramId = ref(PageConstants.EditId);
const checkFields = ref<any>({});
const formParam = ref({
	oid : route.params.id as string,
	progId : '',
	name : '',
	url : '',
	editModeVar : false,
	isDialogVar : false,
	editMode : 'N',
	isDialog : 'N',    
	dialogW : 0,
	dialogH : 0,
	progSystem : 'CORE',
	itemType : 'ITEM',
	fontIconClassId : 'globe2',
	icon : 'SYSTEM'
});

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.name = '';
	formParam.value.url = '';
	formParam.value.editModeVar = false;
	formParam.value.isDialogVar = false;
	formParam.value.editMode = 'N';
	formParam.value.isDialog = 'N';
	formParam.value.dialogW = 0;
	formParam.value.dialogH = 0;
	formParam.value.progSystem = 'CORE';
	formParam.value.itemType = 'ITEM';
	formParam.value.fontIconClassId = 'globe2';
	formParam.value.icon = 'SYSTEM';
};

const refreshSwitchItemVariableFn = () => {
	formParam.value.editMode = formParam.value.editModeVar ? 'Y' : 'N';
	formParam.value.isDialog = formParam.value.isDialogVar ? 'Y' : 'N';
};

watch(() => formParam.value.editModeVar, refreshSwitchItemVariableFn);
watch(() => formParam.value.isDialogVar, refreshSwitchItemVariableFn);

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
            formParam.value.editModeVar = (formParam.value.editMode === 'Y');
            formParam.value.isDialogVar = (formParam.value.isDialog === 'Y');
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
        	description="程式管理，修改資料作業." 
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
		<label for="progId" class="form-label">程式編號</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('progId', checkFields) ? 'is-invalid' : '']" 
			id="progId" 
			v-model="formParam.progId" 
			readonly
		>
		<div v-if="checkInvalid('progId', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('progId', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="name" class="form-label">程式名稱</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('name', checkFields) ? 'is-invalid' : '']" 
			id="name" 
			placeholder="輸入程式名稱" 
			v-model="formParam.name"
		>
		<div v-if="checkInvalid('name', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('name', checkFields) }}</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<label for="url" class="form-label">Url</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('url', checkFields) ? 'is-invalid' : '']" 
			id="url" 
			placeholder="輸入Url" 
			v-model="formParam.url"
		>
		<div v-if="checkInvalid('url', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('url', checkFields) }}</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<div class="form-check form-switch">
			<input class="form-check-input" type="checkbox" role="switch" id="editMode" v-model="formParam.editModeVar">
			<label class="form-check-label" for="editMode">編輯頁</label>
		</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<div class="form-check form-switch">
			<input class="form-check-input" type="checkbox" role="switch" id="isDialog" v-model="formParam.isDialogVar">
			<label class="form-check-label" for="isDialog">Dialog模式</label>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="dialogW" class="form-label">Dialog寬</label>
		<input 
			type="number" 
			:class="['form-control', checkInvalid('dialogW', checkFields) ? 'is-invalid' : '']" 
			id="dialogW" 
			v-model="formParam.dialogW"
		>
		<div v-if="checkInvalid('dialogW', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('dialogW', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="dialogH" class="form-label">Dialog高</label>
		<input 
			type="number" 
			:class="['form-control', checkInvalid('dialogH', checkFields) ? 'is-invalid' : '']" 
			id="dialogH" 
			v-model="formParam.dialogH"
		>
		<div v-if="checkInvalid('dialogH', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('dialogH', checkFields) }}</div>
	</div>
</div>

<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="itemType" class="form-label">類別</label>
		<select class="form-select" id="itemType" v-model="formParam.itemType">
			<option value="ITEM">ITEM-頁面</option>
			<option value="FOLDER">FOLDER-目錄</option>
		</select>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="fontIconClassId" class="form-label">Icon class</label>
		<div class="d-flex align-items-center">
			<select 
				:class="['form-select', checkInvalid('fontIconClassId', checkFields) ? 'is-invalid' : '']" 
				id="fontIconClassId" 
				v-model="formParam.fontIconClassId"
			>
				<option v-for="icon in popularIcons" :key="icon.name" :value="icon.name">
					{{ icon.label }} ({{ icon.name }})
				</option>
			</select>
			<i :class="['bi', 'bi-' + formParam.fontIconClassId]" style="font-size: 1.5rem; margin-left: 10px;"></i>
		</div>
		<div v-if="checkInvalid('fontIconClassId', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('fontIconClassId', checkFields) }}</div>
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
