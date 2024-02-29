export let PROG001D0002 = {
  path: '/prog001d0002',
  component: () => import('../views/prog001d0002/Index.vue'),
  children: [
    { 
      path: '', 
      component: () => import('../views/prog001d0002/Home.vue') 
    }
    ,
    { 
      path: 'create', 
      component: () => import('../views/prog001d0002/Create.vue') 
    }
    ,
    { 
      path: 'edit/:id', 
      component: () => import('../views/prog001d0002/Edit.vue') 
    }        
  ]
}