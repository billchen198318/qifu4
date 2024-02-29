export let PageAbout = {
    path: "/about",
    name: "about",
    component: () => import("../views/AboutView.vue"),
    children: null
}

export let PageNoPermission = {
    path: "/nopermission",
    name: "nopermission",
    component: () => import("../views/NoPermissionView.vue"),
    children: null    
}

export let PageNotFound = {
    path: "/:pathMatch(.*)*",
    name: "notfound",
    component: () => import("../views/NotFoundView.vue"),
    children: null    
}

export let PageWelcome = {
    path: "/",
    name: "welcome",
    component: () => import("../views/WelcomeView.vue"),
    children: null   
}

export let PageDashboardDemo = {
    path: "/dashboard",
    name: "dashboard",
    component: () => import("../views/DashboardDemoView.vue"),
    children: null   
}
