<script>
  import Router, { link } from "svelte-spa-router";
  import { push, pop, replace } from 'svelte-spa-router'
  import { routes } from "./routes.js";
  import { Icon } from 'sveltestrap';
  import {
  	Dropdown,
  	DropdownItem,
  	DropdownMenu,
  	DropdownToggle
  } from 'sveltestrap';
  import { onMount, beforeUpdate } from 'svelte';
  
  import LoginPage from './pages/LoginPage.svelte';

  import { _user } from './store/userStore.js';
  import { _menu, _progList } from './store/menuStore.js';

  import {
  	setRefreshAndAccessTokenCookie,
  	getRefreshTokenCookie,
  	getAccessTokenCookie,
  	userLogoutClearCookie,
  	checkUserHasLogined,
  	getAxiosInstance,
	checkHasPermission,
    checkHasRole
  }
  from "./components/BaseHelper.svelte";

  import Swal from 'sweetalert2';

  let menuData = [];
  _menu.subscribe(value => {
  	menuData = value;
  });

  let progListData = [];
  _progList.subscribe(value => {
  	progListData = value;
  });

  let userData;
  _user.subscribe(value => {
  	userData = value;
  });

  onMount(() => {

  	//loadUserLoginedFromClient();

  });

  beforeUpdate(() => {
	loadUserLoginedFromClient();
  });

  // 驗證之前是否登入 refresh token , access token            
  function loadUserLoginedFromClient() {
	var ck_user_refresh_token = getRefreshTokenCookie();
  	var ck_user_access_token = getAccessTokenCookie();
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
  			clearUserLoginData();
  			throw new Error(response.status + ' ' + response.statusText);
  		})
  		.then((responseJson) => {
  			if (null != responseJson) {
  				_user.update((val) => {
  					return responseJson;
  				});
				if ('' == responseJson.accessToken || '' == responseJson.refreshToken) {
					clearUserLoginData();
					return;
				}
  				setRefreshAndAccessTokenCookie(userData.refreshToken, userData.accessToken);
  				initTreeMenu();
  			} else {
  				_user.update((val) => {
  					return {};
  				});
  			}
  		})
  		.catch((error) => {
  			clearUserLoginData();
  			console.log(error);
  		});
  	}
  }

  function initTreeMenu() {
  	if (menuData != null && menuData.length > 0) {
  		setTimeout(() => {
  			jsTreeMenuInit();
  		}, 500);
  		return;
  	}
  	if (!checkUserHasLogined(userData)) {
  		return;
  	}
  	const axiosInstance = getAxiosInstance();
  	axiosInstance.post(import.meta.env.VITE_API_URL + '/menu/getMemuItemAndProgList')
  		.then(response => {
  			if (null != response.data.value) {
  				//menuData = response.data.value;
  				_menu.update((val) => {
  					return response.data.value.menuList;
  				});
  				_progList.update((val) => {
  					return response.data.value.programList;
  				});
  				setTimeout(() => {
  					jsTreeMenuInit();
  				}, 500);
  			}
  		})
  		.catch(e => {
  			alert(e);
  			clearUserLoginData();
  		});
  }

  export function jsTreeMenuInit() {

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

  	//Activate bootstrip tooltips
  	//jq("[data-toggle='tooltip']").tooltip();
  }


  function routeLoading(event) {
	if (event.detail.location != '/nopermission' && event.detail.location != '/about' && event.detail.location != '/') {
		if (!checkHasPermission(event.detail.location,true)) {
			replace('/nopermission');
		}
	}
	if (checkHasRole('admin') || checkHasRole('*')) {
		if (event.detail.location == '/') {
			replace('/dashboard');
		}
	}
  }

  function routeLoaded(event) {

  }

  function userLogout() {
  	Swal.fire({
  		title: '確定登出?',
  		icon: 'question',
  		iconHtml: '?',
  		confirmButtonText: 'Yes',
  		cancelButtonText: 'No',
  		showCancelButton: true,
  		showCloseButton: true
  	}).then((result) => {
  		if (result.isConfirmed) {
  			clearUserLoginData();
			replace('/');
  		}
  	});
  }

  function clearUserLoginData() {
  	userLogoutClearCookie();
  	menuData = [];
  	progListData = [];
  	_user.update((val) => {
  		return {};
  	});
  	_menu.update((val) => {
  		return [];
  	});
  	_progList.update((val) => {
  		return [];
  	});
  }
  
</script>


<style>
  @import './assets/vali.css';
  @import './assets/m.css';
</style>


{#if checkUserHasLogined(userData) }
	
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="javascript:window.location.reload();">qífū</a>
		<!-- Sidebar toggle button-->
		<a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"><h4 style="margin-top: 10px;"><Icon name="list"/></h4></a>
		<!-- Navbar Right Menu-->
		<ul class="app-nav">
			<Dropdown>
				<DropdownToggle nav class="nav-link app-nav__item"><Icon name="person-circle" /></DropdownToggle>
				<DropdownMenu>
					<DropdownItem on:click={userLogout}><Icon name="door-closed" />&nbsp;Logout</DropdownItem>
				</DropdownMenu>
			</Dropdown>
		</ul>
    </header>
    
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
		<ul class="app-menu">
			{#each menuData as md}
			<li class="treeview">
				<a class="app-menu__item" href="#" data-toggle="treeview"><Icon name="{md.icon}" />&nbsp;<span class="app-menu__label">{md.name}</span><i class="treeview-indicator fa fa-angle-right"></i></a>
				<ul class="treeview-menu">
					{#each md.items as mdi}
					<li><a class="treeview-item" href="{mdi.url}" ><Icon name="{mdi.icon}" />&nbsp;&nbsp;{mdi.name}</a></li>
					{/each}
				</ul>
			</li>
			{/each}
			
			<li><a class="app-menu__item" href="#/about" ><Icon name="info-circle" />&nbsp;<span class="app-menu__label">About</span></a></li>
			<li><a class="app-menu__item" href="javascript:false;" on:click={userLogout} ><Icon name="door-open" />&nbsp;<span class="app-menu__label">Logout</span></a></li>
		</ul>
	</aside>

    <main class="app-content">      
		<div class="tab-content">
			<Router {routes} on:routeLoading={routeLoading} on:routeLoaded={routeLoaded} />
		</div>
	</main>

{:else}
    <LoginPage initTreeMenu={initTreeMenu}/>
{/if}
