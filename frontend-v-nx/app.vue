<script setup lang="ts">
import { onMounted, onUnmounted, nextTick } from "vue";
import { useBaseStore } from './store/baseStore';
import { userLogoutClearCookie } from './components/BaseHelper';
import { createPopper } from '@popperjs/core';

// CSS Imports
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-icons/font/bootstrap-icons.css";
import './assets/vali.css';
import './assets/m.css';
import './assets/callout.scss';

const baseStore = useBaseStore();
const nuxtApp = useNuxtApp();

const clearUserLoginData = () => {
  userLogoutClearCookie();
  baseStore.clearUserData();  
};

const handleMouseDown = (e: MouseEvent) => {
  // 移除 Bootstrap Tooltip 的 DOM
  const el = document.getElementsByClassName("tooltip bs-tooltip-auto fade show");
  if (el && el.length > 0) {
    for (let i = 0; i < el.length; i++) {
      const item = el[i] as HTMLElement;
      if (item.id && item.id.indexOf('tooltip') === 0) {
        item.remove();
      }
    }
  }
};

onMounted(() => {
  // 初始化 Bootstrap Tooltip
  if (nuxtApp.$bootstrap) {
    new nuxtApp.$bootstrap.Tooltip(document.body, {
      selector: "[data-bs-toggle='tooltip']",
      trigger : 'hover'
    });
  }

  document.addEventListener("mousedown", handleMouseDown);

  nextTick(() => {
    const button = document.querySelector('#button');
    const tooltip = document.querySelector('#tooltip');
    if (button && tooltip) {
      createPopper(button, tooltip);
    }
  });
});

onUnmounted(() => {
  document.removeEventListener("mousedown", handleMouseDown);
});
</script>

<template>
  <NuxtLayout>
    <NuxtPage />
  </NuxtLayout>
</template>

<style>
/* 全域樣式 */
</style>
