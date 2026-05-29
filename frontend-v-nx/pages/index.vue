<script setup lang="ts">
import { onMounted } from 'vue';
import { checkHasRole } from '../components/BaseHelper';

definePageMeta({ middleware: ['auth'] });

onMounted(() => {
  if (checkHasRole('admin') || checkHasRole('*')) {
    navigateTo('/dashboard');
  }
});
</script>

<template>
  <div class="callout callout-info">
    <h4><i class="bi bi-info-circle"></i>&nbsp;Welcome</h4>
    Welcome qífū-4&nbsp;(Version&nbsp;:&nbsp;0.4)&nbsp;
    <br>
    請點選左邊選單，進行操作。
    <br>
  </div>
  <div class="row">
    <img src="/img/about-bg.jpg" class="img-fluid" alt="qifu4 background image">
  </div>
</template>

<style scoped>
/* 加入 index 專屬樣式 */
</style>
