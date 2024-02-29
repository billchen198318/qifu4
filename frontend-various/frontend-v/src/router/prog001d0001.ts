export let PROG001D0001 = {
  path: '/prog001d0001',
  component: () => import('../views/prog001d0001/Index.vue'),
  children: [
    { 
      path: '', 
      component: () => import('../views/prog001d0001/Home.vue') 
    }
    ,
    { 
      path: 'create', 
      component: () => import('../views/prog001d0001/Create.vue') 
    }
    ,
    { 
      path: 'edit/:id', 
      component: () => import('../views/prog001d0001/Edit.vue') 
    }        
  ]
}