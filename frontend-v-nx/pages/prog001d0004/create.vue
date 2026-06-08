<script setup lang="ts">
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import { toast } from 'vue3-toastify';
import { useSwalLoading } from '@/composables/useSwalLoading';
import 'vue3-toastify/dist/index.css';

import '../../../node_modules/bytemd/dist/index.css';
import gfm from '@bytemd/plugin-gfm';
import { Editor } from '@bytemd/vue-next';
import importHtml from '@bytemd/plugin-import-html';

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
const { showLoading, hideLoading } = useSwalLoading();

const pageProgramId = ref(PageConstants.CreateId);
const checkFields = ref<any>({});
const formParam = ref({
	templateId : '',
	title : '',
	message : '',
	description : ''
});

const plugins = [ importHtml(), gfm() ];

const btnBack = () => router.back();

const btnClear = () => {
	checkFields.value = {};
	formParam.value.templateId = '';
	formParam.value.title = '';
	formParam.value.message = '';
	formParam.value.description = '';
};

const handleChange = (v: string) => {
	formParam.value.message = v;
};

const btnSave = async () => {
    checkFields.value = {};
    showLoading()      
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/save', formParam.value);
        hideLoading()
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
        hideLoading()        
        alert(e);
    }
};
</script>

<template>
<div class="row">
	<div class="col-12">
		<Toolbar 
			:progId="pageProgramId" 
        	description="Freemarker 樣板管理，新增資料作業." 
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
        <label for="templateId" class="form-label">樣板編號</label>
        <input 
          type="text" 
          :class="['form-control', checkInvalid('templateId', checkFields) ? 'is-invalid' : '']" 
          id="templateId" 
          placeholder="輸入樣板編號" 
          v-model="formParam.templateId"
        >
        <div v-if="checkInvalid('templateId', checkFields)" class="invalid-feedback">{{ invalidFeedback('templateId', checkFields) }}</div>
      </div>
      <div class="col-md-6">
        <label for="title" class="form-label">樣板標題</label>
        <input 
          type="text" 
          :class="['form-control', checkInvalid('title', checkFields) ? 'is-invalid' : '']" 
          id="title" 
          placeholder="輸入樣板標題" 
          v-model="formParam.title"
        >
        <div v-if="checkInvalid('title', checkFields)" class="invalid-feedback">{{ invalidFeedback('title', checkFields) }}</div>
      </div>
      
      <div class="col-12">
        <label class="form-label">內容 (Markdown)</label>
        <Editor :value="formParam.message" :plugins="plugins" @change="handleChange" />
      </div>

      <div class="col-12">
        <label for="description" class="form-label">說明</label>
        <textarea class="form-control" id="description" rows="3" v-model="formParam.description"></textarea>		
      </div>
    </div>
    
    <div class="mt-4 d-flex gap-2">
      <button type="button" class="btn btn-primary" @click="btnSave"><i class="bi bi-save"></i> 儲存</button>
      <button type="button" class="btn btn-outline-secondary" @click="btnClear"><i class="bi bi-eraser"></i> 清除</button>		
    </div>
  </div>
</div>
</template>
