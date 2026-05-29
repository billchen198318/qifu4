<script setup lang="ts">
import { ref, onMounted } from 'vue';
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from './config';
import { useProg002d0002Store } from './QueryPageStore'; 
import { 
	getAxiosInstance
} from '../../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

const queryPageStore = useProg002d0002Store();

const pleaseSelectId = ref(import.meta.env.VITE_PLEASE_SELECT_ID);
const pleaseSelectText = ref(import.meta.env.VITE_PLEASE_SELECT_LABEL);            
const pageProgramId = ref(PageConstants.QueryId);

const userList = ref<any[]>([]);
const userRoleList = ref<any[]>([]);
const userRoleEnableList = ref<any[]>([]);
const formParam = ref({
    oid : ''
});

const tbRefresh = () => clearPage();

const clearPage = () => {
	queryPageStore.queryParam.oid = import.meta.env.VITE_PLEASE_SELECT_ID;
    userRoleList.value = [];
    userRoleEnableList.value = [];
    formParam.value.oid = '';
};

const loadUserList = async () => {
	userList.value = [];
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/loadUserList');
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            userList.value = response.data.value;            
        } else {
            toast.error('error, null');            
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);        
    }	
};

const userChange = async () => {
	userRoleList.value = [];
	userRoleEnableList.value = [];
    if (import.meta.env.VITE_PLEASE_SELECT_ID == queryPageStore.queryParam.oid) {
        return;
    }
	formParam.value.oid = queryPageStore.queryParam.oid;
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findUserRoleListByAccountOid', formParam.value);
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            userRoleList.value = response.data.value.all;      
			userRoleEnableList.value = response.data.value.enable;      
        } else {
            toast.error('error, null');            
        }
    } catch (e: any) {
        Swal.close();        
        alert(e);        
    }		
};

const userRoleEnableChange = async (e: any, itemOid: string) => {
	const checked = e.target.checked;
    let appendOid = '';
    for (const n in userRoleEnableList.value) {        
        appendOid += userRoleEnableList.value[n].oid + ',';
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
    Swal.fire({ title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false });
    Swal.showLoading(); 
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/updateUserRole/' + formParam.value.oid + '/' + appendOid);
        Swal.close();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                clearPage();
            } else {
                toast.success(response.data.message);
                // 更新成功後重新載入列表以同步狀態
                userChange();
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

const checkItemChecked = (itemOid: string) => {
	return userRoleEnableList.value.some(item => item.oid === itemOid);
};

onMounted(() => {
	loadUserList();
    if (queryPageStore.queryParam.oid != import.meta.env.VITE_PLEASE_SELECT_ID) {
        userChange();
    }
});
</script>

<template>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    <Toolbar 
        :progId="pageProgramId" 
        description="帳戶角色Role管理配置." 
        marginBottom="Y"
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
    />
  </div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12 form-floating">
		<select id="userOid" class="form-select" aria-label="請選取" v-model="queryPageStore.queryParam.oid" @change="userChange">
			<option :value="pleaseSelectId">{{pleaseSelectText}}</option>
			<option v-for="item in userList" :key="item.oid" :value="item.oid">{{item.account}}</option>
		</select>		
        <label for="userOid">使用者帳戶</label>
	</div>
</div>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th style="background-color: #575757; color: whitesmoke;"><i class="bi bi-hand-index-thumb"></i></th>
                    <th style="background-color: #575757; color: whitesmoke;">Role代號</th>
                </tr>
            </thead>
			<tbody>
				<tr v-for="item in userRoleList" :key="item.oid">
					<td style="background-color: #BCC6CC;">
						<div class="form-check">
							<input 
                                type="checkbox" 
                                class="form-check-input" 
                                @change="userRoleEnableChange($event, item.oid)" 
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

</template>
