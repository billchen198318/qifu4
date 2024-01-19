<script>
import { RouterLink, RouterView } from 'vue-router'
import LoginView from './views/LoginView.vue'
import { useBaseStore } from './store/baseStore'
import { 
  getAxiosInstance,
  getAccessTokenCookie, 
  getRefreshTokenCookie, 
  setRefreshAndAccessTokenCookie, 
  checkUserHasLogined, 
  userLogoutClearCookie } from './components/BaseHelper'

import { Tooltip } from 'bootstrap/dist/js/bootstrap'

export default {
  components: { LoginView },
  setup() {
    const baseStore = useBaseStore();
    return { 
      baseStore
    }
  },
  data() {
    return { }
  },
  methods: {
    initTreeMenu              : _initTreeMenu,
    jsTreeMenuInit            : _jsTreeMenuInit,
    loadUserLoginedFromClient : _loadUserLoginedFromClient,
    clearUserLoginData        : _clearUserLoginData
  },
  mounted() {
    this.loadUserLoginedFromClient();

    let bsToolTip = new Tooltip(document.body, {
      selector: "[data-bs-toggle='tooltip']",
      trigger : 'hover'
    });    
    document.addEventListener("mousedown", e => {
      if (null != bsToolTip) {
        //bsToolTip.hide(); // no work...
        const el = document.getElementsByClassName("tooltip bs-tooltip-auto fade show");
        if (null != el) {
          for (var n in el) {
            if (null == el[n]) { continue; }
            if (undefined == el[n].id) { continue; }
            if (null == el[n].id) { continue; }
            if (el[n].id.indexOf('tooltip') == 0) {
              el[n].remove();
            }
          }
        }
      }
    });

  },
  unmounted() {
    document.removeEventListener("mousedown");
  }
};

function _loadUserLoginedFromClient() {
  var ck_user_refresh_token = getRefreshTokenCookie();
  var ck_user_access_token = getAccessTokenCookie();
  let userData = this.baseStore.user;
  if (!checkUserHasLogined(userData) && (null != ck_user_refresh_token && '' != ck_user_refresh_token) && (null != ck_user_access_token && '' != ck_user_access_token)) {
    fetch(import.meta.env.VITE_API_URL + '/auth/validLogined', {
  			method: "POST",
  			headers: {
  				"Content-Type": "application/json",
  			},
  			body: JSON.stringify({
  				accessToken: ck_user_access_token,
  				refreshToken: ck_user_refresh_token
  			}),
  			signal: AbortSignal.timeout(import.meta.env.VITE_FETCH_TIMEOUT)
  	})
  	.then(response => {
  			if (response.ok) {
  				return response.json();
  			}
        this.clearUserLoginData();
  			throw new Error(response.status + ' ' + response.statusText);
  	})
  	.then((responseJson) => {
      if (null != responseJson) {
        if ('' == responseJson.accessToken || '' == responseJson.refreshToken) {
          this.clearUserLoginData();
          return;
        }
        this.baseStore.setUserData(responseJson);
        setRefreshAndAccessTokenCookie(userData.refreshToken, userData.accessToken);
        this.initTreeMenu();
      } else {
        this.clearUserLoginData();
  		}
  	})
  	.catch((error) => {
  			this.clearUserLoginData();
  			console.log(error);
  	});
  }
}

function _initTreeMenu() {
  var that = this;
  let userData = this.baseStore.user;
  let menuData = this.baseStore.menuList;
  if (menuData != null && menuData.length > 0) {
    setTimeout(() => {
      that.jsTreeMenuInit();
    }, 250);
    return;
  }
  
  if (!checkUserHasLogined(userData)) {
    return;
  }
  
  const axiosInstance = getAxiosInstance();
  axiosInstance.post(import.meta.env.VITE_API_URL + '/menu/getMemuItemAndProgList')
  .then(response => {
    if (null != response.data.value) {
      this.baseStore.menuList = response.data.value.menuList;
      this.baseStore.progList = response.data.value.programList;
      setTimeout(() => {
        that.jsTreeMenuInit();
      }, 250);
    }
  })
  .catch(e => {
    alert(e);
    this.clearUserLoginData();
  });
}

function _jsTreeMenuInit() {
  
  var treeviewMenu = document.querySelector('.app-menu');

  // Toggle Sidebar
  document.querySelector('[data-toggle="sidebar"]').addEventListener('click', function(event) {
    event.preventDefault();
    document.querySelector('.app').classList.toggle('sidenav-toggled');
  });

  // Activate sidebar treeview toggle
  var treeviewToggle = document.querySelectorAll("[data-toggle='treeview']");
  treeviewToggle.forEach(function(toggle) {
    toggle.addEventListener('click', function(event) {
      event.preventDefault();
      var parent = toggle.parentNode;
      if (!parent.classList.contains('is-expanded')) {
        var expandedToggles = treeviewMenu.querySelectorAll("[data-toggle='treeview']");
        expandedToggles.forEach(function(expandedToggle) {
          expandedToggle.parentNode.classList.remove('is-expanded');
        });
      }
      parent.classList.toggle('is-expanded');
    });
  });

  // Set initial active toggle
  var initialActiveToggle = document.querySelector("[data-toggle='treeview.'].is-expanded");
  if (initialActiveToggle) {
    initialActiveToggle.parentNode.classList.toggle('is-expanded');
  }
}

function _clearUserLoginData() {
  userLogoutClearCookie();
  this.baseStore.clearUserData();  
}

</script>

<style>

</style>

<template>  

<div v-if=" 'Y' == this.baseStore.user.login ">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="#">qífū</a>
		<!-- Sidebar toggle button-->
		<a class="app-sidebar__toggle" href="javascript:window.location.reload();" data-toggle="sidebar" aria-label="Hide Sidebar"><h4 style="margin-top: 10px;"><i class="bi bi-list"></i></h4></a>
		<!-- Navbar Right Menu-->

    <!-- nav logout ....   -->
    
    </header>
    
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
		<ul class="app-menu">

      <!-- menu item -->
      <template v-if="null != this.baseStore && null != this.baseStore.menuList && this.baseStore.menuList.length > 0">
      <li class="treeview" v-for=" (t, idx) in this.baseStore.menuList ">
        <a class="app-menu__item" href="#" data-toggle="treeview"><i :class="'bi bi-' + t.icon"></i>&nbsp;<span class="app-menu__label">{{t.name}}</span><i class="treeview-indicator fa fa-angle-right"></i></a>
        <ul class="treeview-menu">
          <li v-for="(mdi, iidx) in t.items">
            <router-link v-bind:to=" (mdi.url.length > 0 && mdi.url.indexOf('#') == 0) ? mdi.url.substring(1, mdi.url.length) : mdi.url " class="treeview-item"><i :class="'bi bi-' + mdi.icon"></i>&nbsp;&nbsp;{{mdi.name}}</router-link>
          </li>
        </ul>
      </li>
      </template>

      
			<li><router-link to="/about" class="app-menu__item"><i class="bi bi-info-circle"></i>&nbsp;<span class="app-menu__label">About</span></router-link></li>

      <li><a class="app-menu__item" href="javascript:false;" ><i class="bi bi-door-open"></i>&nbsp;<span class="app-menu__label">Logout</span></a></li>
		</ul>
	</aside>

  <main class="app-content">      
		<div class="tab-content">
			<RouterView />
		</div>
	</main>

</div>
<div v-if=" 'Y' != this.baseStore.user.login ">
  <LoginView/>
</div>

</template>

