export let routerAddItem = function(router : any, cnf : any) {
    router.addRoute({
        path: cnf.path,
        name: cnf.name,
        component: cnf.component,
        children: cnf.children
    });
}