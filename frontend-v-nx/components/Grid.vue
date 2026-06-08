<script setup lang="ts">
import { ref, onMounted } from 'vue';
import { getProgItem } from './BaseHelper';

interface GridColumn {
  field: string;
  label: string;
  labTextAlign?: string;
  labHtml?: boolean;
  textAlign?: string;
  colMethod?: (val: any) => any;
  colHtml?: boolean;
}

interface KeyFieldFormatterItem {
  type: string;
  method: (val: any) => void;
  icon: string;
  class: string;
  memo?: string;
}

interface GridConfig {
  column: GridColumn[];
  theadColor: { backgroundColor: string; color: string };
  keyFieldFormatter: {
    field: string;
    showTooltip: boolean;
    item: KeyFieldFormatterItem[];
  };
}

const props = defineProps<{
  progId: string;
  dataSource: any[];
  config: GridConfig;
}>();

const pageProg = ref<any>(null);

onMounted(() => {
  pageProg.value = getProgItem(props.progId);
  if (!pageProg.value) {
    console.warn('Grid load warning: pageProg is null for', props.progId);
  }
});
</script>

<template>
  <div v-if="dataSource && dataSource.length > 0" class="table-responsive">
    <table class="table table-hover table-bordered mb-0">
      <thead class="table-dark">
        <tr>
          <th 
            v-for="(col, idx) in config.column" 
            :key="idx"
            :class="[col.labTextAlign ? `text-${col.labTextAlign}` : 'text-start']"
          >
            <template v-if="col.labHtml">
              <span v-html="col.label"></span>
            </template>
            <template v-else>
              {{ col.label }}
            </template>
          </th>
        </tr>            
      </thead>
      <tbody>
        <tr v-for="(row, rIdx) in dataSource" :key="rIdx">
          <td 
            v-for="(col, cIdx) in config.column" 
            :key="cIdx"
            :class="[col.textAlign ? `text-${col.textAlign}` : 'text-start']"
          >
            <!-- Key Field Formatter (Buttons) -->
            <template v-if="config.keyFieldFormatter.field === col.field">
              <div class="d-flex gap-1">
                <template v-for="(item, iIdx) in config.keyFieldFormatter.item" :key="iIdx">
                  <button 
                    v-if="typeof item.method === 'function'"
                    :id="`_${item.type}_${row[col.field]}`"
                    :class="item.class"
                    @click="item.method(row[col.field])"
                    :data-bs-toggle="config.keyFieldFormatter.showTooltip ? 'tooltip' : undefined"
                    data-bs-placement="bottom"
                    :data-bs-title="item.memo"
                  >
                    <i :class="`bi bi-${item.icon}`"></i>
                  </button>
                  <template v-else>
                    {{ row[col.field] }}
                  </template>
                </template>
              </div>
            </template>

            <!-- Regular Field -->
            <template v-else>
              <template v-if="typeof col.colMethod === 'function'">
                <template v-if="col.colHtml">
                  <span v-html="col.colMethod(row[col.field])"></span>
                </template>
                <template v-else>
                  {{ col.colMethod(row[col.field]) }}
                </template>
              </template>
              <template v-else>
                {{ row[col.field] }}
              </template>
            </template>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<style scoped>
.table-responsive {
  border-radius: 4px;
}
</style>
