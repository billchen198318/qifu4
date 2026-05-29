<script setup lang="ts">
import { ref, watch, onMounted } from 'vue';
import { getProgItem } from './BaseHelper';

const props = defineProps<{
  progId: string;
  gridConfig: any;
  changePageSelectMethod: (page: number) => void;
  changeGridConfigRowMethod: (row: number) => void;
}>();

const pageProg = ref<any>(null);
const prevPage = ref(1);
const nexPage = ref(1);
const lastPage = ref(1);
const midMaxShow = 3;
const pItem = ref<number[]>([]);

const gBtnChangeRowClasses = ref({
  r10: ' ',
  r30: ' ',
  r50: ' ',
  r100: ' ',
});

const refreshRowActiveFn = () => {
  gBtnChangeRowClasses.value = {
    r10: props.gridConfig.row === 10 ? ' active ' : ' ',
    r30: props.gridConfig.row === 30 ? ' active ' : ' ',
    r50: props.gridConfig.row === 50 ? ' active ' : ' ',
    r100: props.gridConfig.row === 100 ? ' active ' : ' ',
  };
};

const refreshPageNumFn = () => {
  pItem.value = [];
  if (props.gridConfig.total > 0) {
    lastPage.value = Math.ceil(props.gridConfig.total / props.gridConfig.row);
    
    // 修正頁碼範圍
    if (props.gridConfig.page > lastPage.value) props.gridConfig.page = lastPage.value;
    if (props.gridConfig.page < 1) props.gridConfig.page = 1;

    prevPage.value = Math.max(1, props.gridConfig.page - 1);
    nexPage.value = Math.min(lastPage.value, props.gridConfig.page + 1);

    let pStart = Math.max(1, props.gridConfig.page - midMaxShow);
    let pEnd = Math.min(lastPage.value, props.gridConfig.page + midMaxShow);

    for (let i = pStart; i <= pEnd; i++) {
      pItem.value.push(i);
    }
  }
};

watch(() => props.gridConfig.row, () => {
  refreshRowActiveFn();
  refreshPageNumFn();
});

watch(() => [props.gridConfig.page, props.gridConfig.total], () => {
  refreshPageNumFn();
});

onMounted(() => {
  pageProg.value = getProgItem(props.progId);
  refreshRowActiveFn();
  refreshPageNumFn();
});
</script>

<template>
  <div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
      <table v-if="gridConfig && gridConfig.total > 0" width="100%" border="0" cellspacing="0" cellpadding="1">
        <tbody>
          <tr>
            <td width="70%" align="left" valign="middle">
              <nav aria-label="Page navigation">
                <ul class="pagination">
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
            </td>   
            <td width="30%" align="right" valign="middle">
              <table width="100%" border="0" cellspacing="0" cellpadding="1">
                <tbody>
                  <tr>
                    <td align="right">
                      <div class="btn-group me-2" role="group">
                        <button type="button" :class="['btn btn-secondary', gBtnChangeRowClasses.r10]" @click="changeGridConfigRowMethod(10)">10</button>
                        <button type="button" :class="['btn btn-secondary', gBtnChangeRowClasses.r30]" @click="changeGridConfigRowMethod(30)">30</button>
                        <button type="button" :class="['btn btn-secondary', gBtnChangeRowClasses.r50]" @click="changeGridConfigRowMethod(50)">50</button>
                        <button type="button" :class="['btn btn-secondary', gBtnChangeRowClasses.r100]" @click="changeGridConfigRowMethod(100)">100</button>
                      </div>
                    </td>
                    <td align="left">
                      <h6>
                        Total
                        <span class="badge text-bg-info">{{ gridConfig.total }}</span>
                      </h6>
                    </td>
                  </tr>
                </tbody>
              </table>
            </td>             
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<style scoped>
.pagination {
  margin-bottom: 0;
}
.page-link {
  cursor: pointer;
}
</style>
