<script setup lang="ts">
defineProps<{
  dataSource: any[];
  queryFieldShowFlag: boolean;
}>();
</script>

<template>
  <div v-show="!queryFieldShowFlag && (!dataSource || dataSource.length < 1)" class="alert alert-info" role="alert">
    隱藏查詢輸入欄，點選上方工具列&nbsp;<i class="bi bi-arrow-up-circle"></i>&nbsp;按鈕，顯示查詢欄方塊!
  </div>    
</template>

<style scoped>
</style>
