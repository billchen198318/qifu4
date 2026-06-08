<script setup lang="ts">
import { ref, onMounted } from 'vue';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import { useSwalLoading } from '@/composables/useSwalLoading';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from './config';
import { useProg002d0003Store } from './QueryPageStore'; 
import { 
	getAxiosInstance
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const queryPageStore = useProg002d0003Store();

const pleaseSelectId = ref(import.meta.env.VITE_PLEASE_SELECT_ID);
const pleaseSelectText = ref(import.meta.env.VITE_PLEASE_SELECT_LABEL);            
const { showLoading, hideLoading } = useSwalLoading();

const pageProgramId = ref(PageConstants.QueryId);

const progList = ref<any[]>([]);
const progRoleList = ref<any[]>([]);
const progRoleEnableList = ref<any[]>([]);
const formParam = ref({
    oid : ''
});

const tbRefresh = () => clearPage();

const clearPage = () => {
	queryPageStore.queryParam.oid = import.meta.env.VITE_PLEASE_SELECT_ID;
    progRoleList.value = [];
    progRoleEnableList.value = [];
    formParam.value.oid = '';
};

const loadProgramList = async () => {
    const currSysId = 'CORE';
	progList.value = [];
    showLoading() 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findProgramFolderMenuItem/' + currSysId);
        hideLoading()
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            progList.value = response.data.value;            
        } else {
            toast.error('error, null');            
        }
    } catch (e: any) {
        hideLoading()        
        alert(e);        
    }	
};

const progChange = async () => {
	progRoleList.value = [];
    progRoleEnableList.value = [];
    if (import.meta.env.VITE_PLEASE_SELECT_ID == queryPageStore.queryParam.oid) {
        return;
    }
	formParam.value.oid = queryPageStore.queryParam.oid;
    showLoading() 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findMenuProgramRoleList', formParam.value);
        hideLoading()
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            progRoleList.value = response.data.value.all;
            progRoleEnableList.value = response.data.value.enable;
        } else {
            toast.error('error, null');            
        }
    } catch (e: any) {
        hideLoading()        
        alert(e);        
    }    
};

const progRoleEnableChange = async (e: any, itemOid: string) => {
	const checked = e.target.checked;
    let appendOid = '';
    for (const n in progRoleEnableList.value) {        
        appendOid += progRoleEnableList.value[n].oid + ',';
    }
    if (checked) {
        appendOid += itemOid + ',';
    } else {
        appendOid = appendOid.replaceAll(itemOid + ',', '');
    }
	if ('' == appendOid) {
		appendOid = ',';
	}
    formParam.value.oid = queryPageStore.queryParam.oid;
    showLoading() 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/updateMenuRole/' + formParam.value.oid + '/' + appendOid);
        hideLoading()
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                clearPage();
            } else {
                toast.success(response.data.message);
                // 更新成功後重新載入列表以同步狀態
                progChange();
            }            
        } else {
            toast.error('error, null');
            clearPage();
        }        
    } catch (e: any) {
        hideLoading()        
        alert(e);        
        clearPage();
    }	
};

const checkItemChecked = (itemOid: string) => {
	return progRoleEnableList.value.some(item => item.oid === itemOid);
};

onMounted(() => {
    loadProgramList();
    if (queryPageStore.queryParam.oid != import.meta.env.VITE_PLEASE_SELECT_ID) {
        progChange();
    }
});
</script>

<template>

<div class="row">
  <div class="col-12">
    <Toolbar 
        :progId="pageProgramId" 
        description="選單Role管理配置." 
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
    />
  </div>
</div>

<div class="card mb-4">
  <div class="card-body">
    <div class="row">
        <div class="col-12 form-floating">
            <select id="progOid" class="form-select" aria-label="請選取" v-model="queryPageStore.queryParam.oid" @change="progChange">
                <option :value="pleaseSelectId">{{pleaseSelectText}}</option>
                <option v-for="item in progList" :key="item.oid" :value="item.oid">{{item.name}}</option>
            </select>		
            <label for="progOid">程式</label>
        </div>
    </div>
  </div>
</div>

<div class="card">
  <div class="card-body p-0">
    <div class="table-responsive">
        <table class="table table-hover table-bordered mb-0">
            <thead class="table-dark">
                <tr>
                    <th style="width: 50px;"><i class="bi bi-hand-index-thumb"></i></th>
                    <th>Role代號</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in progRoleList" :key="item.oid">
                    <td>
                        <div class="form-check d-flex justify-content-center">
                            <input 
                                type="checkbox" 
                                class="form-check-input" 
                                @change="progRoleEnableChange($event, item.oid)" 
                                :checked="checkItemChecked(item.oid)"
                            >
                        </div>
                    </td>
                    <td>{{item.role}}</td>
                </tr>		
            </tbody>
        </table>
    </div>
  </div>
</div>

</template>
