import { createRouter, createWebHistory } from 'vue-router'
import { routerAddItem } from './support'
import { PageAbout } from './various'
import { PROG001D0001 } from './prog001d0001'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [ ]
})

routerAddItem(router, PageAbout); 
routerAddItem(router, PROG001D0001); 

export default router
