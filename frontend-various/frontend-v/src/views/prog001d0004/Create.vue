<script>
import Swal from 'sweetalert2';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';

import '../../../node_modules/bytemd/dist/index.css';
import gfm from '@bytemd/plugin-gfm';
import { Editor, Viewer } from '@bytemd/vue-next';
import importHtml from '@bytemd/plugin-import-html';

import Toolbar from '@/components/Toolbar.vue';
import { PageConstants } from './config';
import { 
	getAxiosInstance, 
	invalidFeedback,
	checkInvalid,
	escapeQifuHtmlMsg
} from '../../components/BaseHelper';

let checkFields = new Object();

const plugins = [ importHtml() ];

export default {
	components: { Toolbar, Editor },
	setup() { 
	},
	data() {
		return {
			pageProgramId : PageConstants.CreateId,
			checkFields,
			formParam : {
				templateId : '',
				title : '',
				message : '',
				description : ''
			},
			plugins
		}
	},
	methods: { 
		fieldInvalidFeedback : invalidFeedback,
		fieldCheckInvalid : checkInvalid,
		btnBack : function() {
			this.$router.back();
		},
		btnSave : _btnSave,
		btnClear : function() {
			this.checkFields = new Object();
			this.formParam.templateId = '';
			this.formParam.title = '';
			this.formParam.message = '';
			this.formParam.description = '';
		},
		handleChange : function(v) {
			this.formParam.message = v;
		}
	},
	created() { 
	},
	mounted() { 
	}
}

function _btnSave() {
    this.checkFields = new Object();
    Swal.fire({title: "Loading...", html: "請等待", showConfirmButton: false, allowOutsideClick: false});
    Swal.showLoading();      
    let axiosInstance = getAxiosInstance();
    axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/save', this.formParam)
    .then(response => {
        Swal.hideLoading();
        Swal.close();
        if (null != response.data) {
			this.checkFields = response.data.checkFields;
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(escapeQifuHtmlMsg(response.data.message));
                return;
            }            
            toast.success(response.data.message);   
            this.btnClear();
        } else {
            toast.error('error, null');
        }
    })
    .catch(e => {
        Swal.hideLoading();
        Swal.close();        
        alert(e);
    });
}

</script>

<template>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Toolbar 
			:progId="this.pageProgramId" 
        	description="Freemarker 樣板管理，新增資料作業." 
        	marginBottom="Y"
        	refreshFlag="Y"
        	@refreshMethod="btnClear"
        	backFlag="Y"
        	@backMethod="btnBack"
        	createFlag="N"
        	@createMethod="null"
        	saveFlag="Y"
        	@saveMethod="btnSave"
    	></Toolbar>		
	</div>
</div>
<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="templateId" class="form-label">樣板編號</label>
		<input type="text" v-bind:class="'form-control ' + ( fieldCheckInvalid('templateId', checkFields) ? 'is-invalid' : ' ')" id="templateId" placeholder="輸入樣板編號" v-model="this.formParam.templateId">
		<div v-if="fieldCheckInvalid('templateId', checkFields)" class="invalid-feedback d-block">{{ fieldInvalidFeedback('templateId', checkFields) }}</div>
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6">
		<label for="title" class="form-label">樣板標題</label>
		<input type="text" v-bind:class="'form-control ' + ( fieldCheckInvalid('title', checkFields) ? 'is-invalid' : ' ')" id="title" placeholder="輸入樣板標題" v-model="this.formParam.title">
		<div v-if="fieldCheckInvalid('title', checkFields)" class="invalid-feedback d-block">{{ fieldInvalidFeedback('title', checkFields) }}</div>
	</div>
</div>
<div class="row">
	&nbsp;
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<Editor :value="this.formParam.message" :plugins="plugins" @change="handleChange" />
	</div>
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<label for="description" class="form-label">說明</label>
		<textarea class="form-control" id="description" row="3" col="25" v-model="this.formParam.description"></textarea>		
	</div>
</div>
<div class="row">
	&nbsp;
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
    	<button type="button" class="btn btn-primary" v-on:click="btnSave"><i class="'bi bi-save"></i>&nbsp;儲存</button>
    	&nbsp;
    	<button type="button" class="btn btn-primary" v-on:click="btnClear"><i class="'bi bi-eraser"></i>&nbsp;清除</button>		
	</div>
</div>
</template>
