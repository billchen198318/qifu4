export let PROG001D0004 = {
  path: '/prog001d0004',
  component: () => import('../views/prog001d0004/Index.vue'),
  children: [
    { 
      path: '', 
      component: () => import('../views/prog001d0004/Home.vue') 
    }
    ,
    { 
      path: 'create', 
      component: () => import('../views/prog001d0004/Create.vue') 
    }
    ,
    { 
      path: 'edit/:id', 
      component: () => import('../views/prog001d0004/Edit.vue') 
    }
    ,
    { 
      path: 'setparam/:id', 
      component: () => import('../views/prog001d0004/SetParam.vue') 
    }            
  ]
}