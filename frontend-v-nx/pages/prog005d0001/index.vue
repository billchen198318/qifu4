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
    <div class="col-md-4">
        <div class="tile">
            <h5 class="tile-title"><i class="bi bi-hdd-network"></i> Broker Host</h5>
            <div class="tile-body">
                <p class="fs-4">{{ queryPageStore.brokerInfo.host }}</p>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="tile">
            <h5 class="tile-title"><i class="bi bi-plug"></i> Broker Port</h5>
            <div class="tile-body">
                <p class="fs-4">{{ queryPageStore.brokerInfo.port }}</p>
            </div>
        </div>
    </div>
    <div class="col-md-4">
        <div class="tile">
            <h5 class="tile-title"><i class="bi bi-people"></i> Connected Clients</h5>
            <div class="tile-body">
                <p class="fs-4">{{ queryPageStore.brokerInfo.clientSize }}</p>
            </div>
        </div>
    </div>
</div>

<div class="tile">
    <div class="tile-body">
        <div class="row mb-4">
            <div class="col-12">
                <div class="btn-group w-100" role="group">
                    <button type="button" class="btn" :class="activeTab === 'clients' ? 'btn-primary' : 'btn-outline-primary'" @click="activeTab = 'clients'; btnQuery()">
                        <i class="bi bi-pc-display"></i> Clients
                    </button>
                    <button type="button" class="btn" :class="activeTab === 'topics' ? 'btn-primary' : 'btn-outline-primary'" @click="activeTab = 'topics'; btnQueryTopics()">
                        <i class="bi bi-tags"></i> Topics
                    </button>
                </div>
            </div>
        </div>

        <div v-if="activeTab === 'clients'">
            <GridPagination 
                :progId="pageProgramId" 
                :gridConfig="queryPageStore.gridConfig" 
                :changePageSelectMethod="changePageSelect" 
                :changeGridConfigRowMethod="changeQueryGridRow" 
            />
            <Grid :progId="pageProgramId" :dataSource="dsList" :config="queryPageStore.gridConfig" />
        </div>

        <div v-if="activeTab === 'topics'">
            <Grid :progId="pageProgramId" :dataSource="queryPageStore.topics" :config="queryPageStore.topicGridConfig" />
        </div>
    </div>
</div>

<!-- Messages Modal Overlay -->
<div v-if="showMessagesModal" class="modal-overlay">
    <div class="modal-content-custom tile">
        <div class="modal-header">
            <h5 class="modal-title"><i class="bi bi-chat-left-text"></i> Messages for: {{ queryPageStore.currentTopic }}</h5>
            <button type="button" class="btn-close" @click="showMessagesModal = false"></button>
        </div>
        <div class="modal-body">
            <div v-if="queryPageStore.currentTopicMessages.length === 0" class="alert alert-info">
                No messages captured for this topic yet.
            </div>
            <div v-else class="list-group">
                <div v-for="(msg, index) in queryPageStore.currentTopicMessages" :key="index" class="list-group-item">
                    <div class="d-flex w-100 justify-content-between">
                        <small class="text-muted">{{ msg.time }}</small>
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
    border-radius: 4px;
    width: 90%;
    max-width: 900px;
    max-height: 85%;
    overflow-y: auto;
    box-shadow: 0 5px 15px rgba(0,0,0,0.5);
    margin-bottom: 0; /* Override tile margin */
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
    font-size: 0.875rem;
}
.tile-title {
    border-bottom: 1px solid #ddd;
    padding-bottom: 10px;
    margin-bottom: 15px;
}
</style>
