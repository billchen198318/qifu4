<script setup lang="ts">
import { ref, watch, onMounted } from 'vue';
import { useBaseStore } from '../store/baseStore';
import { 
  checkUserHasLogined, 
  userLogoutClearCookie,
} from '../components/BaseHelper';
import Swal from 'sweetalert2';

const baseStore = useBaseStore();
const isSidebarToggled = ref(false);
const expandedMenus = ref<Record<number, boolean>>({});

const toggleSidebar = () => {
  isSidebarToggled.value = !isSidebarToggled.value;
};

const toggleMenu = (index: number) => {
  if (expandedMenus.value[index]) {
    expandedMenus.value[index] = false;
  } else {
    // 關閉其他已展開的選單
    expandedMenus.value = { [index]: true };
  }
};

const userLogout = () => {
  Swal.fire({
    title: '確定登出?',
    icon: 'question',
    confirmButtonText: 'Yes',
    cancelButtonText: 'No',
    showCancelButton: true,
  }).then((result) => {
    if (result.isConfirmed) {
      userLogoutClearCookie();
      baseStore.clearUserData();
      navigateTo('/login');
    }
  });
};

const showUserProfile = () => {
  let str = `User Id: ${baseStore.user.id}<br>Administrator: ${baseStore.user.admin}`;
  str += '<br>Role: [ ';
  str += baseStore.user.roleList.map(r => r.role).join(', ');
  str += ' ]';
  
  Swal.fire({
    title: "User info",
    html: str,
    icon: "info"
  });
};

const reloadPageLogoClick = () => {
  navigateTo('/');
};

// 監聽登入狀態
watch(() => baseStore.isLoggedIn, (isLoggedIn) => {
  if (!isLoggedIn) {
    navigateTo('/login');
  }
});

onMounted(() => {
  if (!checkUserHasLogined(baseStore.user)) {
    // 由 middleware 處理導向，此處僅作為保險
  }
});
</script>

<template>
  <div v-if="baseStore.isLoggedIn" class="app sidebar-mini" :class="{ 'sidenav-toggled': isSidebarToggled }">
    <!-- Navbar-->
    <header class="app-header">
      <a class="app-header__logo" href="#" @click.prevent="reloadPageLogoClick">qífū</a>
      <!-- Sidebar toggle button-->
      <a class="app-sidebar__toggle" href="#" @click.prevent="toggleSidebar" aria-label="Hide Sidebar">
        <h4 style="margin-top: 10px;"><i class="bi bi-list"></i></h4>
      </a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        <!-- User Menu-->
        <li class="dropdown">
          <a class="app-nav__item" href="#" data-bs-toggle="dropdown" aria-label="Open Profile Menu">
            <i class="bi bi-person fs-4"></i>
          </a>
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-item" href="#" @click.prevent="showUserProfile"><i class="bi bi-person-badge me-2 fs-5"></i> Profile</a></li>
            <li><a class="dropdown-item" href="#" @click.prevent="userLogout"><i class="bi bi-box-arrow-right me-2 fs-5"></i> Logout</a></li>
          </ul>
        </li>
      </ul>
    </header>
    
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" @click="toggleSidebar"></div>
    <aside class="app-sidebar">
      <ul class="app-menu">
        <template v-if="baseStore.menuList && baseStore.menuList.length > 0">
          <li class="treeview" v-for="(t, idx) in baseStore.menuList" :key="idx" :class="{ 'is-expanded': expandedMenus[idx] }">
            <a class="app-menu__item" href="#" @click.prevent="toggleMenu(idx)">
              <i :class="'bi bi-' + t.icon"></i>&nbsp;
              <span class="app-menu__label">{{ t.name }}</span>
              <i class="treeview-indicator bi bi-chevron-right"></i>
            </a>
            <ul class="treeview-menu">
              <li v-for="(mdi, iidx) in t.items" :key="iidx">
                <NuxtLink 
                  :to="(mdi.url.startsWith('#')) ? mdi.url.substring(1) : mdi.url" 
                  class="treeview-item"
                >
                  <i :class="'bi bi-' + mdi.icon"></i>&nbsp;&nbsp;{{ mdi.name }}
                </NuxtLink>
              </li>
            </ul>
          </li>
        </template>
        
        <li>
          <NuxtLink to="/about" class="app-menu__item">
            <i class="bi bi-info-circle"></i>&nbsp;<span class="app-menu__label">About</span>
          </NuxtLink>
        </li>
        <li>
          <a class="app-menu__item" href="#" @click.prevent="userLogout">
            <i class="bi bi-door-open"></i>&nbsp;<span class="app-menu__label">Logout</span>
          </a>
        </li>
      </ul>
    </aside>
    
    <main class="app-content">      
      <div class="tab-content">
        <slot />
      </div>
    </main>
  </div>
</template>

<style scoped>
/* 原有的 CSS 如果有需要可以保留或在此優化 */
.treeview-indicator {
  transition: transform 0.3s ease;
}
.is-expanded .treeview-indicator {
  transform: rotate(90deg);
}
</style>
