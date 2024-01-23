export let PROG001D0005 = {
  path: '/prog001d0005',
  component: () => import('../views/prog001d0005/Index.vue'),
  children: [
    { 
      path: '', 
      component: () => import('../views/prog001d0005/Home.vue') 
    }
    ,
    { 
      path: 'create', 
      component: () => import('../views/prog001d0005/Create.vue') 
    }
    ,
    { 
      path: 'edit/:id', 
      component: () => import('../views/prog001d0005/Edit.vue') 
    }
    ,
    { 
      path: 'setparam/:id', 
      component: () => import('../views/prog001d0005/SetParam.vue') 
    }            
  ]
}