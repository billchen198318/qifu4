<script setup lang="ts">
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from './config';
import { 
	getAxiosInstance, 
	invalidFeedback,
	checkInvalid,
	escapeQifuHtmlMsg
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const router = useRouter();
const pageProgramId = ref(PageConstants.CreateId);
const checkFields = ref<any>({});
const formParam = ref({
	role : '',
	description : ''
});

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.role = '';
	formParam.value.description = '';
};

const btnSave = async () => {
    checkFields.value = {};
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading();
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/save', formParam.value);
        Swal.close();
        if (response.data) {
			checkFields.value = response.data.checkFields || {};
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(escapeQifuHtmlMsg(response.data.message));
                return;
            }            
            toast.success(response.data.message);   
            btnClear();
        } else {
            toast.error('error, null');
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);
    }
};
</script>

<template>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Toolbar 
			:progId="pageProgramId" 
        	description="Role管理，新增資料作業." 
        	marginBottom="Y"
        	refreshFlag="Y"
        	@refreshMethod="btnClear"
        	backFlag="Y"
        	@backMethod="btnBack"
        	saveFlag="Y"
        	@saveMethod="btnSave"
    	/>		
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<label for="role" class="form-label">Role編號</label>
		<input 
			type="text" 
			:class="['form-control', checkInvalid('role', checkFields) ? 'is-invalid' : '']" 
			id="role" 
			placeholder="輸入Role編號" 
			v-model="formParam.role"
		>
		<div v-if="checkInvalid('role', checkFields)" class="invalid-feedback d-block">{{ invalidFeedback('role', checkFields) }}</div>
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
    	<button type="button" class="btn btn-primary" @click="btnSave"><i class="bi bi-save"></i>&nbsp;儲存</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" @click="btnClear"><i class="bi bi-eraser"></i>&nbsp;清除</button>		
	</div>
</div>
</template>
