<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { getProgItem } from './BaseHelper';

const props = defineProps<{
  progId: string;
  description?: string;
  refreshFlag?: string;
  backFlag?: string;
  createFlag?: string;
  saveFlag?: string;
  queryFieldShowSwitchFlag?: string;
}>();

const emit = defineEmits<{
  (e: 'refreshMethod'): void;
  (e: 'backMethod'): void;
  (e: 'createMethod'): void;
  (e: 'saveMethod'): void;
  (e: 'queryFieldShowSwitcMethod'): void;
}>();

const pageProg = ref<any>(null);
const switchEye = ref(true);

const fnBack = () => emit('backMethod');
const fnRefresh = () => emit('refreshMethod');
const fnCreate = () => emit('createMethod');
const fnSave = () => emit('saveMethod');
const fnQueryFieldShowSwitch = () => {
  switchEye.value = !switchEye.value;
  emit('queryFieldShowSwitcMethod');
};

onMounted(() => {
  pageProg.value = getProgItem(props.progId);
});
</script>

<template>
<div class="app-toolbar d-flex align-items-center justify-content-between mb-3 shadow-sm border-bottom">
  <!-- 左側：標題 (精簡型) -->
  <div class="toolbar-left d-flex align-items-center">
    <h6 class="mb-0 text-dark fw-bold" v-if="pageProg">
      <i :class="'bi bi-' + pageProg.fontIconClassId" class="me-2"></i>{{ pageProg.name }}
    </h6>
    <span class="text-muted ms-2 ps-2 border-start d-none d-md-inline-block small">
        {{ description }}
    </span>
  </div>

  <!-- 右側：按鈕群 (使用 gap 取代 &nbsp;) -->
  <div class="toolbar-right d-flex align-items-center gap-1">
    <button v-if="backFlag === 'Y'" class="btn btn-light btn-sm text-secondary" @click="fnBack" title="上一頁">
        <i class="bi bi-arrow-left"></i>
    </button>
    <button v-if="refreshFlag === 'Y'" class="btn btn-light btn-sm text-secondary" @click="fnRefresh" title="刷新">
        <i class="bi bi-repeat"></i>
    </button>
    <button v-if="createFlag === 'Y'" class="btn btn-light btn-sm text-success" @click="fnCreate" title="新增">
        <i class="bi bi-plus-circle"></i>
    </button>
    
    <div v-if="(queryFieldShowSwitchFlag === 'Y' || saveFlag === 'Y') && (backFlag === 'Y' || refreshFlag === 'Y' || createFlag === 'Y')" class="vr mx-1"></div>

    <button v-if="saveFlag === 'Y'" class="btn btn-light btn-sm text-primary" @click="fnSave" title="儲存">
        <i class="bi bi-save"></i>
    </button>
    <button v-if="queryFieldShowSwitchFlag === 'Y'" class="btn btn-light btn-sm text-dark" @click="fnQueryFieldShowSwitch" title="查詢開關">
        <i :class="'bi bi-' + (switchEye ? 'chevron-down' : 'chevron-up')"></i>
    </button>
  </div>
</div>
</template>

<style scoped>
.app-toolbar {
    height: 40px; /* 固定精簡高度 */
    padding: 0 15px; /* 兩側呼吸空間 */
    background-color: #f8f9fa; /* 改為極淡灰底 */
    border-bottom: 1px solid #e9ecef; /* 明確的邊框 */
    border-radius: 4px;
}
.app-toolbar .btn i {
    font-size: 1.15rem; /* 放大圖示 */
}
.small { font-size: 0.8rem; }
</style>
