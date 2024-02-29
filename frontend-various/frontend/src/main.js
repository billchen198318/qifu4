import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.js';

import App from "./App.svelte";

const app = new App({
  target: document.getElementById("app"),
});

export default app;
