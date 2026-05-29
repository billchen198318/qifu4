<script setup lang="ts">
import { ref, onMounted } from 'vue';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from './config';
import { useProg001d0003Store } from './QueryPageStore'; 
import { 
	getAxiosInstance
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const queryPageStore = useProg001d0003Store();

const pleaseSelectId = ref(import.meta.env.VITE_PLEASE_SELECT_ID);
const pleaseSelectText = ref(import.meta.env.VITE_PLEASE_SELECT_LABEL);
const pageProgramId = ref(PageConstants.QueryId);

const itemAllList = ref<any[]>([]);
const itemEnableList = ref<any[]>([]);
const folderList = ref<any[]>([]);

const tbRefresh = () => {
	clearPage();
	loadProgramFolder();
};

const clearPage = () => {
	queryPageStore.queryParam.folderOid = import.meta.env.VITE_PLEASE_SELECT_ID;
	itemAllList.value = [];
	itemEnableList.value = [];
};

const loadProgramFolder = async () => {
    folderList.value = [];
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadProgramFolder');
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            folderList.value = response.data.value;            
        } else {
            toast.error('error, null');            
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);        
    }
};

const programFolderChange = async () => {
    itemAllList.value = [];
    itemEnableList.value = [];    
    if (import.meta.env.VITE_PLEASE_SELECT_ID == queryPageStore.queryParam.folderOid) {
        return;
    }
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadProgramEnableAndAllList/' + queryPageStore.queryParam.folderOid);
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            itemAllList.value = response.data.value.all;
            itemEnableList.value = response.data.value.enable;
        } else {
            toast.error('error, null');            
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);        
    }
};

const programItemEnableChange = async (e: any, itemOid: string) => {
    const checked = e.target.checked;
    let appendOid = '';
    for (const n in itemEnableList.value) {        
        appendOid += itemEnableList.value[n].oid + ',';
    }
    if (checked) {
        appendOid += itemOid + ',';
    } else {
        appendOid = appendOid.replaceAll(itemOid + ',', '');
    }
	if ('' == appendOid) {
		appendOid = ',';
	}    
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/updateMenu/' + queryPageStore.queryParam.folderOid + '/' + appendOid);
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                clearPage();
            } else {
				toast.success(response.data.message);
                // 更新成功後重新抓取清單以同步狀態
                programFolderChange();
			}           
        } else {
            toast.error('error, null');
            clearPage();
        }        
    } catch (e: any) {
        Swal.close();        
        alert(e);        
        clearPage();
    }
};

const checkItemDisable = (itemOid: string) => {
    return itemAllList.value.some(item => item.oid === itemOid && item.itemType === 'FOLDER');
};

const checkItemChecked = (itemOid: string) => {
    return itemEnableList.value.some(item => item.oid === itemOid);
};

onMounted(() => {
	tbRefresh();
});
</script>

<template>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    <Toolbar 
        :progId="pageProgramId" 
        description="選單配置." 
        marginBottom="Y"
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
    />
  </div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12 form-floating">
		<select id="folderOid" class="form-select" aria-label="請選取" v-model="queryPageStore.queryParam.folderOid" @change="programFolderChange">
			<option :value="pleaseSelectId">{{pleaseSelectText}}</option>
			<option v-for="item in folderList" :key="item.oid" :value="item.oid">{{item.progId}} - {{item.name}}</option>
		</select>		
        <label for="folderOid">程式目錄</label>
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th style="background-color: #575757; color: whitesmoke;"><i class="bi bi-hand-index-thumb"></i></th>
                    <th style="background-color: #575757; color: whitesmoke;">頁面程式代號</th>
                    <th style="background-color: #575757; color: whitesmoke;">頁面程式名稱</th>
                </tr>
            </thead>
			<tbody>
				<template v-for="item in itemAllList" :key="item.oid">
					<tr v-if="item.itemType != 'FOLDER'">
                        <td style="background-color: #BCC6CC;">
                            <div class="form-check">
                                <input 
                                    type="checkbox" 
                                    class="form-check-input" 
                                    @change="programItemEnableChange($event, item.oid)" 
                                    :checked="checkItemChecked(item.oid)" 
                                    :disabled="checkItemDisable(item.oid)"
                                >
                            </div>
                        </td>
                        <td>{{item.progId}}</td>
                        <td><i :class="'bi bi-' + item.fontIconClassId"></i>&nbsp;{{item.name}}</td>
                    </tr>		
				</template>
			</tbody>
		</table>
	</div>
</div>

</template>
