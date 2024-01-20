import { createRouter, createWebHistory } from 'vue-router';
import { routerAddItem } from './support';
import { PageAbout, PageNoPermission } from './various';
import { PROG001D0001 } from './prog001d0001';
import { PROG001D0002 } from './prog001d0002';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [ ]
});

routerAddItem(router, PageAbout);
routerAddItem(router, PageNoPermission);
routerAddItem(router, PROG001D0001); 
routerAddItem(router, PROG001D0002);

export default router
