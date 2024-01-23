export let PROG004D0001 = {
  path: '/prog004d0001',
  component: () => import('../views/prog004d0001/Index.vue'),
  children: [
    { 
      path: '', 
      component: () => import('../views/prog004d0001/Home.vue') 
    }    
  ]
}