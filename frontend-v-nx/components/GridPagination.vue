<script setup lang="ts">
import { computed } from 'vue';
import { getProgItem } from './BaseHelper';

const props = defineProps<{
  progId: string;
  gridConfig: any;
  changePageSelectMethod: (page: number) => void;
  changeGridConfigRowMethod: (row: number) => void;
}>();

const pageProg = computed(() => getProgItem(props.progId));

const lastPage = computed(() => {
  return Math.max(1, Math.ceil(props.gridConfig.total / props.gridConfig.row));
});

const prevPage = computed(() => Math.max(1, props.gridConfig.page - 1));
const nexPage = computed(() => Math.min(lastPage.value, props.gridConfig.page + 1));

const pItem = computed(() => {
  const items = [];
  const midMaxShow = 3;
  
  // 確保頁碼在合法範圍內
  let currentPage = props.gridConfig.page;
  if (currentPage > lastPage.value) currentPage = lastPage.value;
  if (currentPage < 1) currentPage = 1;

  let pStart = Math.max(1, currentPage - midMaxShow);
  let pEnd = Math.min(lastPage.value, currentPage + midMaxShow);

  for (let i = pStart; i <= pEnd; i++) {
    items.push(i);
  }
  return items;
});
</script>

<template>
  <div v-if="gridConfig && gridConfig.total > 0" class="d-flex flex-wrap align-items-center justify-content-between mb-3 gap-3">
    <!-- 左側：分頁條 -->
    <nav aria-label="Page navigation">
      <ul class="pagination pagination-sm mb-0">
        <li class="page-item" @click.prevent="changePageSelectMethod(1)">
          <a class="page-link" href="#"><span aria-hidden="true">&laquo;</span></a>
        </li>
        <li class="page-item" @click.prevent="changePageSelectMethod(prevPage)">
          <a class="page-link" href="#"><span aria-hidden="true">&lsaquo;</span></a>
        </li>
        <li 
          v-for="pNum in pItem" 
          :key="pNum"
          :class="['page-item', pNum === gridConfig.page ? 'active' : '']" 
          @click.prevent="changePageSelectMethod(pNum)"
        >
          <a class="page-link" href="#">{{ pNum }}</a>
        </li>
        <li class="page-item" @click.prevent="changePageSelectMethod(nexPage)">
          <a class="page-link" href="#"><span aria-hidden="true">&rsaquo;</span></a>
        </li>
        <li class="page-item" @click.prevent="changePageSelectMethod(lastPage)">
          <a class="page-link" href="#"><span aria-hidden="true">&raquo;</span></a>
        </li>
      </ul> 
    </nav>

    <!-- 右側：資料筆數與切換 -->
    <div class="d-flex align-items-center gap-3">
      <div class="btn-group btn-group-sm" role="group">
        <button v-for="size in [10, 30, 50, 100]" :key="size" type="button" 
                :class="['btn btn-outline-secondary', gridConfig.row === size ? 'active' : '']" 
                @click="changeGridConfigRowMethod(size)">{{ size }}</button>
      </div>
      <div class="text-muted small">
        共 <span class="badge bg-info text-dark">{{ gridConfig.total }}</span> 筆
      </div>
    </div>
  </div>
</template>

<style scoped>
.page-link {
  cursor: pointer;
}
</style>
