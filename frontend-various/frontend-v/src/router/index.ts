import { createRouter, createWebHistory } from 'vue-router';
import { routerAddItem } from './support';
import { PageAbout, PageNoPermission, PageNotFound, PageWelcome, PageDashboardDemo } from './various';
import { PROG001D0001 } from './prog001d0001';
import { PROG001D0002 } from './prog001d0002';
import { PROG001D0003 } from './prog001d0003';
import { PROG001D0004 } from './prog001d0004';
import { PROG001D0005 } from './prog001d0005';
import { PROG002D0001 } from './prog002d0001';
import { PROG002D0002 } from './prog002d0002';
import { PROG002D0003 } from './prog002d0003';
import { PROG004D0001 } from './prog004d0001';
import { PROG004D0002 } from './prog004d0002';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [ ]
});

routerAddItem(router, PageWelcome);
routerAddItem(router, PageAbout);
routerAddItem(router, PageNoPermission);
routerAddItem(router, PageDashboardDemo);
routerAddItem(router, PROG001D0001); 
routerAddItem(router, PROG001D0002);
routerAddItem(router, PROG001D0003);
routerAddItem(router, PROG001D0004);
routerAddItem(router, PROG001D0005);
routerAddItem(router, PROG002D0001);
routerAddItem(router, PROG002D0002);
routerAddItem(router, PROG002D0003);
routerAddItem(router, PROG004D0001);
routerAddItem(router, PROG004D0002);
routerAddItem(router, PageNotFound);

export default router
