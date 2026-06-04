<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';
import { useSwalLoading } from '@/composables/useSwalLoading';

import Toolbar from '@/components/Toolbar.vue';
import Grid from '@/components/Grid.vue';
import GridPagination from '@/components/GridPagination.vue';
import HiddenQueryFieldAlertInfo from '@/components/HiddenQueryFieldAlertInfo.vue';
import { PageConstants } from './config';
import { getGridConfig, setConfigRow, setConfigPage, setConfigTotal, resetConfigByOld } from '../../components/GridHelper';
import { useProg005d0001Store } from './QueryPageStore'; 
import { 
	getAxiosInstance
} from '../../components/BaseHelper';

definePageMeta({ middleware : ['auth'] });

const queryPageStore = useProg005d0001Store();
const { showLoading, hideLoading } = useSwalLoading();

const pageProgramId = ref(PageConstants.QueryId);
const dsList = ref<any[]>([]);
const qFieldShow = ref(true);
const activeTab = ref('clients'); // clients, topics

const tbRefresh = () => {
    if (activeTab.value === 'clients') {
        btnQuery();
    } else {
        btnQueryTopics();
    }
};
const tbQueryFieldShow = () => qFieldShow.value = !qFieldShow.value;

const btnClear = () => {
    dsList.value = [];
	clearGridConfig();
    queryPageStore.clearData();
};

const changeQueryGridRow = (row: number) => {
	setConfigRow(queryPageStore.gridConfig, row);
	queryPageStore.gridConfig.page = 1;
	btnQuery();
};

const changePageSelect = (page: number) => {
	setConfigPage(queryPageStore.gridConfig, page);
	btnQuery();
};

const clearGridConfig = () => {
	setConfigRow(queryPageStore.gridConfig, import.meta.env.VITE_DEFAULT_ROW);
	setConfigPage(queryPageStore.gridConfig, 1);
	setConfigTotal(queryPageStore.gridConfig, 0);
};

const initQueryGridConfig = () => {
  	return getGridConfig(
		'clientId',
		[],
		[
			{ label: 'Client ID', field: 'clientId' },
			{ label: 'Address', field: 'address' },			
			{ label: 'Port', field: 'port' }
		]  
	);
};

const initTopicGridConfig = () => {
    return getGridConfig(
        'topic',
        [
            {
				'method'  : (val: any) => { 
					btnViewMessages(val);           
				},
				'icon'    : 'search',
				'type'    : 'view',
				'memo'    : 'View messages for this topic.',
				'class'	  : 'btn btn-info btn-sm'
			}
        ],
        [
            { label: 'Topic Filter', field: 'topic' },
            { label: 'Subscribers', field: 'subscriberCount' },
            { label: 'Last Message', field: 'lastMessageTime' },
            { label: 'Messages', field: 'topic' }
        ]
    );
};

const btnQuery = async () => {
	showLoading();
	dsList.value = [];
	try {
		const axiosInstance = getAxiosInstance();
		const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findPage', {
			"field": {},
			"pageOf": {
				"select"  : queryPageStore.gridConfig.page,
				"showRow" : queryPageStore.gridConfig.row
			}
		});
		hideLoading();
		if (response.data) {
			if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
				clearGridConfig();
				toast.warning(response.data.message);
				return;
			}
			const brokerVO = response.data.value;
            queryPageStore.brokerInfo.host = brokerVO.host;
            queryPageStore.brokerInfo.port = brokerVO.port;
            queryPageStore.brokerInfo.clientSize = brokerVO.clientSize;
			dsList.value = brokerVO.clients;
			setConfigTotal(queryPageStore.gridConfig, brokerVO.clientSize);
		} else {
			toast.error('error, null');
			clearGridConfig();
		}
	} catch (e: any) {
		hideLoading();    
		clearGridConfig();
		alert(e);
	}
};

const btnQueryTopics = async () => {
    showLoading();
    queryPageStore.topics = [];
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findTopics', {
            "field": {},
            "pageOf": {
                "select" : 1,
                "showRow" : 100
            }
        });
        hideLoading();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            queryPageStore.topics = response.data.value;
            setConfigTotal(queryPageStore.topicGridConfig, queryPageStore.topics.length);
        }
    } catch (e: any) {
        hideLoading();
        alert(e);
    }
};

const btnViewMessages = async (topic: string) => {
    showLoading();
    queryPageStore.currentTopic = topic;
    queryPageStore.currentTopicMessages = [];
    try {
        const axiosInstance = getAxiosInstance();
        const response = await axiosInstance.post(import.meta.env.VITE_API_URL + PageConstants.eventNamespace + '/findMessages', {
            "field": { "topic": topic }
        });
        hideLoading();
        if (response.data) {
            if (import.meta.env.VITE_SUCCESS_FLAG != response.data.success) {
                toast.warning(response.data.message);
                return;
            }
            queryPageStore.currentTopicMessages = response.data.value;
            showMessagesModal.value = true;
        }
    } catch (e: any) {
        hideLoading();
        alert(e);
    }
};

const showMessagesModal = ref(false);

onMounted(() => {
	const newGridConfig = initQueryGridConfig();
	if (queryPageStore.gridConfig.column) {
		resetConfigByOld(newGridConfig, queryPageStore.gridConfig);
	}
	queryPageStore.gridConfig = newGridConfig;

    const newTopicGridConfig = initTopicGridConfig();
    queryPageStore.topicGridConfig = newTopicGridConfig;
    
    btnQuery();
});
</script>

<template>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    <Toolbar 
        :progId="pageProgramId" 
        description="MQTT Dashboard." 
        marginBottom="Y"
        refreshFlag="Y"
        @refreshMethod="tbRefresh"
		queryFieldShowSwitchFlag="Y"
		@queryFieldShowSwitcMethod="tbQueryFieldShow"			
    />
  </div>
</div>

<HiddenQueryFieldAlertInfo :dataSource="dsList" :queryFieldShowFlag="qFieldShow" />

<div class="row" v-show="qFieldShow">
    <div class="col-xs-12 col-md-4 col-lg-4">
        <div class="card bg-primary text-white mb-4">
            <div class="card-body">
                <h5 class="card-title">Broker Host</h5>
                <p class="card-text">{{ queryPageStore.brokerInfo.host }}</p>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-md-4 col-lg-4">
        <div class="card bg-success text-white mb-4">
            <div class="card-body">
                <h5 class="card-title">Broker Port</h5>
                <p class="card-text">{{ queryPageStore.brokerInfo.port }}</p>
            </div>
        </div>
    </div>
    <div class="col-xs-12 col-md-4 col-lg-4">
        <div class="card bg-info text-white mb-4">
            <div class="card-body">
                <h5 class="card-title">Connected Clients</h5>
                <p class="card-text">{{ queryPageStore.brokerInfo.clientSize }}</p>
            </div>
        </div>
    </div>
</div>

<br/>

<ul class="nav nav-tabs mb-3">
  <li class="nav-item">
    <a class="nav-link" :class="{ active: activeTab === 'clients' }" href="#" @click.prevent="activeTab = 'clients'; btnQuery()">Clients</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" :class="{ active: activeTab === 'topics' }" href="#" @click.prevent="activeTab = 'topics'; btnQueryTopics()">Topics</a>
  </li>
</ul>

<div v-if="activeTab === 'clients'">
    <div class="row">
        <div class="col-xs-12 col-md-12 col-lg-12">
            <GridPagination 
                :progId="pageProgramId" 
                :gridConfig="queryPageStore.gridConfig" 
                :changePageSelectMethod="changePageSelect" 
                :changeGridConfigRowMethod="changeQueryGridRow" 
            />
            <Grid :progId="pageProgramId" :dataSource="dsList" :config="queryPageStore.gridConfig" />
        </div>
    </div>
</div>

<div v-if="activeTab === 'topics'">
    <div class="row">
        <div class="col-xs-12 col-md-12 col-lg-12">
            <Grid :progId="pageProgramId" :dataSource="queryPageStore.topics" :config="queryPageStore.topicGridConfig" />
        </div>
    </div>
</div>

<!-- Messages Modal Overlay -->
<div v-if="showMessagesModal" class="modal-overlay">
    <div class="modal-content-custom">
        <div class="modal-header">
            <h5 class="modal-title">Messages for: {{ queryPageStore.currentTopic }}</h5>
            <button type="button" class="btn-close" @click="showMessagesModal = false"></button>
        </div>
        <div class="modal-body">
            <div v-if="queryPageStore.currentTopicMessages.length === 0" class="alert alert-info">
                No messages captured for this topic yet.
            </div>
            <div v-else class="list-group">
                <div v-for="(msg, index) in queryPageStore.currentTopicMessages" :key="index" class="list-group-item">
                    <div class="d-flex w-100 justify-content-between">
                        <small>{{ msg.time }}</small>
                    </div>
                    <pre class="mb-1 mt-2 p-2 bg-light border rounded"><code>{{ msg.payload }}</code></pre>
                </div>
            </div>
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-secondary" @click="showMessagesModal = false">Close</button>
        </div>
    </div>
</div>

</template>

<style scoped>
.modal-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background: rgba(0,0,0,0.5);
    display: flex;
    justify-content: center;
    align-items: center;
    z-index: 1050;
}
.modal-content-custom {
    background: white;
    padding: 20px;
    border-radius: 8px;
    width: 80%;
    max-width: 800px;
    max-height: 80%;
    overflow-y: auto;
    box-shadow: 0 5px 15px rgba(0,0,0,0.3);
}
.modal-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    border-bottom: 1px solid #dee2e6;
    margin-bottom: 15px;
    padding-bottom: 10px;
}
.modal-footer {
    border-top: 1px solid #dee2e6;
    margin-top: 15px;
    padding-top: 10px;
    text-align: right;
}
pre {
    white-space: pre-wrap;
    word-break: break-all;
}
</style>
