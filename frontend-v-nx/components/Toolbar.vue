<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { getProgItem } from './BaseHelper';

const props = defineProps<{
  progId: string;
  description?: string;
  marginBottom?: string;
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
  if (!pageProg.value) {
    console.warn('Toolbar load warning: pageProg is null for', props.progId);
  }
});
</script>

<template>
<div class="app-title" style="background: linear-gradient(to top, #f8f9fa, #ffffff); width: 103vw; overflow: hidden;">
	<div v-if="pageProg">
		<h1 class="text-dark"><i :class="'bi bi-' + pageProg.fontIconClassId"></i>&nbsp;{{ pageProg.name }}</h1>
		<p class="text-muted">{{ description }}</p>
		<div>
            <i v-if="backFlag === 'Y'" id="tb_back" class="fs-5 bi bi-arrow-left-square btn btn-light btn-sm text-info" @click="fnBack" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="上一頁" data-trigger="hover"></i>
            {{ backFlag === 'Y' ? '&nbsp;' : '' }}

            <i v-if="refreshFlag === 'Y'" id="tb_repeat" class="fs-5 bi bi-repeat btn btn-light btn-sm text-info" @click="fnRefresh" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="刷新" data-trigger="hover"></i>
            {{ refreshFlag === 'Y' ? '&nbsp;' : '' }}

            <i v-if="createFlag === 'Y'" id="tb_plus" class="fs-5 bi bi-plus-circle btn btn-light btn-sm text-info" @click="fnCreate" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="新增頁" data-trigger="hover"></i>
            {{ createFlag === 'Y' ? '&nbsp;' : '' }}

            <i class="fs-7 bi bi-three-dots-vertical text-muted" v-if="queryFieldShowSwitchFlag === 'Y' || saveFlag === 'Y'"></i>

            <i v-if="saveFlag === 'Y'" id="tb_save" class="fs-5 bi bi-save btn btn-light btn-sm text-info" @click="fnSave" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="儲存/更新" data-trigger="hover"></i>
            {{ saveFlag === 'Y' ? '&nbsp;' : '' }}

            <i v-if="queryFieldShowSwitchFlag === 'Y'" id="tb_queryFieldShowSwitch" :class="'fs-5 bi bi-' + (switchEye ? 'arrow-down-circle' : 'arrow-up-circle') + ' btn btn-light btn-sm '" @click="fnQueryFieldShowSwitch" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="顯示/隱藏查詢區塊" data-trigger="hover"></i>
            {{ queryFieldShowSwitchFlag === 'Y' ? '&nbsp;' : '' }}            
		</div>
	</div>    
</div> 
<p v-if="marginBottom === 'Y'" style="margin-bottom: 5px"></p>
</template>

<style scoped>
/* 移除多餘的 padding 與 margin，回歸全域 vali.css 控制 */
</style>
