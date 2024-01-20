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
