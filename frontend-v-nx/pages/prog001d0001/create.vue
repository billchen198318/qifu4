<script setup lang="ts">
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import { useSwalLoading } from '@/composables/useSwalLoading';
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
const { showLoading, hideLoading } = useSwalLoading();
const formParam = ref({
	sysId : '',
	name : '',
	host : '',
	contextPath : '',
	isLocal : 'N',
	icon : 'SYSTEM'
});

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.sysId = '';
	formParam.value.name = '';
	formParam.value.host = '';
	formParam.value.contextPath = '';
};

const btnSave = async () => {
    checkFields.value = {};
    showLoading();      
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/save', formParam.value);
        hideLoading();
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
        hideLoading();        
        alert(e);
    }
};
</script>

<template>
<div class="row">
	<div class="col-12">
		<Toolbar 
			:progId="pageProgramId" 
        	description="站台測試用，新增資料作業." 
        	refreshFlag="Y"
        	@refreshMethod="btnClear"
        	backFlag="Y"
        	@backMethod="btnBack"
        	saveFlag="Y"
        	@saveMethod="btnSave"
    	/>		
	</div>
</div>

<div class="card mb-4">
  <div class="card-body">
    <div class="row g-3">
      <div class="col-md-6">
        <label for="sysId" class="form-label">編號</label>
        <input 
          type="text" 
          :class="['form-control', checkInvalid('sysId', checkFields) ? 'is-invalid' : '']" 
          id="sysId" 
          placeholder="輸入編號" 
          v-model="formParam.sysId"
        >
        <div v-if="checkInvalid('sysId', checkFields)" class="invalid-feedback">{{ invalidFeedback('sysId', checkFields) }}</div>
      </div>
      <div class="col-md-6">
        <label for="name" class="form-label">名稱</label>
        <input 
          type="text" 
          :class="['form-control', checkInvalid('name', checkFields) ? 'is-invalid' : '']" 
          id="name" 
          placeholder="輸入名稱" 
          v-model="formParam.name"
        >
        <div v-if="checkInvalid('name', checkFields)" class="invalid-feedback">{{ invalidFeedback('name', checkFields) }}</div>
      </div>
      <div class="col-md-6">
        <label for="host" class="form-label">Host</label>
        <input 
          type="text" 
          :class="['form-control', checkInvalid('host', checkFields) ? 'is-invalid' : '']" 
          id="host" 
          placeholder="輸入Host" 
          v-model="formParam.host"
        >
        <div v-if="checkInvalid('host', checkFields)" class="invalid-feedback">{{ invalidFeedback('host', checkFields) }}</div>
      </div>
      <div class="col-md-6">
        <label for="contextPath" class="form-label">Context path</label>
        <input 
          type="text" 
          :class="['form-control', checkInvalid('contextPath', checkFields) ? 'is-invalid' : '']" 
          id="contextPath" 
          placeholder="輸入Context path" 
          v-model="formParam.contextPath"
        >
        <div v-if="checkInvalid('contextPath', checkFields)" class="invalid-feedback">{{ invalidFeedback('contextPath', checkFields) }}</div>
      </div>
    </div>
    <div class="mt-4 d-flex gap-2">
      <button type="button" class="btn btn-primary" @click="btnSave"><i class="bi bi-save"></i> 儲存</button>
      <button type="button" class="btn btn-outline-secondary" @click="btnClear"><i class="bi bi-eraser"></i> 清除</button>		
    </div>
  </div>
</div>
</template>
