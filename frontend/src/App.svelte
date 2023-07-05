<script>
  import Router, { link } from "svelte-spa-router";
  import { push, pop, replace } from 'svelte-spa-router'
  import { routes } from "./routes.js";  
  import { Icon } from 'sveltestrap';
  import { Button, Col, Row } from 'sveltestrap';
  import { onMount } from 'svelte';
  import jq from 'jquery'; /* 為了tree menu */
  
  import LoginPage from './pages/LoginPage.svelte';
  import { _user } from './store/userStore.js';

  import './components/SvelteCookie.svelte';
  import { 
    setRefreshTokenAndUidCookie, 
    getRefreshTokenCookie, 
    getUserIdCookie, 
    userLogoutClearCookie } 
  from "./components/SvelteCookie.svelte";

  import Swal from 'sweetalert2';

  //const jq = window.$;

  let menuData = [];

	let userData;
	_user.subscribe(value => {
		userData = value;
	});

  onMount(() => {

    var ck_user_refresh_token = getRefreshTokenCookie();
    var ck_user_id = getUserIdCookie();
    alert('user_refresh_token='+ck_user_refresh_token + ',user_id='+ck_user_id);

    fetch("./menutest.json")
        .then(response => response.json())
        .then(data => {
          //console.log('aaaaaaaaaaaaaaaaaaaaaaaaaaa');
          //console.log(data);
          menuData = data;
          //apiData.set(data);
          //console.log(menuData);

          setTimeout(() => {
            jqTreeMenuInit();
          }, 100);

        }).catch(error => {
          //console.log('bbbbbbbbbbbbbbbbbbbbbbbbbbbbb');
          console.log(error);
          return [];
        }); 



        
  });

  export function jqTreeMenuInit() {

       //const jq = window.$;

       //alert(jq);

       var treeviewMenu = jq('.app-menu');

      // Toggle Sidebar
      jq('[data-toggle="sidebar"]').click(function(event) {
        event.preventDefault();
        jq('.app').toggleClass('sidenav-toggled');
      });

      // Activate sidebar treeview toggle
      jq("[data-toggle='treeview']").click(function(event) {
        event.preventDefault();
        if(!jq(this).parent().hasClass('is-expanded')) {
          treeviewMenu.find("[data-toggle='treeview']").parent().removeClass('is-expanded');
        }
        jq(this).parent().toggleClass('is-expanded');
      });

      // Set initial active toggle
      jq("[data-toggle='treeview.'].is-expanded").parent().toggleClass('is-expanded');

      //Activate bootstrip tooltips
      //jq("[data-toggle='tooltip']").tooltip();    
      //alert(55);
  }

  
  function routeLoading(event) {
    console.log('-----------------------------------------');
    console.log('routeLoading event')
    console.log('Route', event.detail.route)
    console.log('Location', event.detail.location)
    console.log('Querystring', event.detail.querystring)
    console.log('User data', event.detail.userData)
    if ('/prog01/c2/:oid' == event.detail.route && event.detail.location.indexOf('0000')>-1 ) {
      alert('test replace!');
      replace('/prog01c1');      
    }

  }

  function routeLoaded(event) {
    console.log('-----------------------------------------');
    console.log('routeLoaded event')
    // The first 5 properties are the same as for the routeLoading event
    console.log('Route', event.detail.route)
    console.log('Location', event.detail.location)
    console.log('Querystring', event.detail.querystring)
    console.log('Params', event.detail.params)
    console.log('User data', event.detail.userData)
    // The last two properties are unique to routeLoaded
    console.log('Component', event.detail.component) // This is a Svelte component, so a function
    console.log('Name', event.detail.name)
  }  

  function userLogout() {
    Swal.fire({
      title: 'Logout, are you sure?',
      icon: 'question',
      iconHtml: '?',
      confirmButtonText: 'Yes',
      cancelButtonText: 'No',
      showCancelButton: true,
      showCloseButton: true
    }).then((result) => {
        if (result.isConfirmed) {
          userLogoutClearCookie();
          _user.update((val) => {return {};});
        }
    });
    
  }

</script>


<style>
  @import './assets/vali.css';
  @import './assets/m.css';
</style>


{#if null != userData && !(userData.accessToken === undefined) && '' != userData.accessToken }
  
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="#">qífū</a>
      <!-- Sidebar toggle button--><a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
      <!-- Navbar Right Menu-->
      <ul class="app-nav">
        <!-- User Menu-->
        <li class="dropdown"><a class="app-nav__item" href="#" on:click={userLogout} data-toggle="dropdown" aria-label="Open Profile Menu"><Icon name="door-open" /></a>
          <!--
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-item" href="#">Logout</a></li>
          </ul>
          -->
        </li>
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
       	<li><a class="app-menu__item" href="#" ><Icon name="door-open" />&nbsp;<span class="app-menu__label">Logout</span></a></li>
       	        
        
      </ul>
    </aside>
    
    
    
    <main class="app-content">      
      <div class="tab-content">
        <Router {routes} on:routeLoading={routeLoading} on:routeLoaded={routeLoaded} />
      </div>
    </main>
{:else}
    <LoginPage jqTreeMenuInit={jqTreeMenuInit}/>
{/if}
