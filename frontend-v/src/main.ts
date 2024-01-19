import { createApp } from 'vue'
import router from './router'
import pinia from './store/index';
import App from './App.vue'

import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap";
import "./assets/vali.css";
import "./assets/m.css";
import "bootstrap-icons/font/bootstrap-icons.css";


const app = createApp(App)

app.use(pinia)
app.use(router)


app.mount('#app')
