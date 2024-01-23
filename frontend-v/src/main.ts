import { createApp } from 'vue'
import router from './router'
import pinia from './store/index';
import App from './App.vue'

import 'bootstrap/dist/js/bootstrap';
import 'bootstrap/dist/css/bootstrap.css';
import "bootstrap-icons/font/bootstrap-icons.css";
import "./assets/vali.css";
import "./assets/m.css";

const app = createApp(App)

app.use(pinia)
app.use(router)


app.mount('#app')
