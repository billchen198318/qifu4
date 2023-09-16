import { defineConfig } from 'vite'
import { svelte } from '@sveltejs/vite-plugin-svelte'

// https://vitejs.dev/config/
export default defineConfig({
  base: "./",   /* base: "/svelte-starter/", */
  plugins: [svelte()],
	server: {
		port: 8188
	},
	preview: {
		port: 8288
	}	  
})
