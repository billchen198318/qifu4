<script setup>
const props = defineProps({
    error: {
        type: Object,
        required: true
    }
});
</script>

<template>
<div class="row">
    <div class="col-xs-12 col-md-12 col-lg-12">
        <div class="card text-center">
            <div class="card-header">
                <i class="bi bi-cone-striped"></i>&nbsp;Error!!
            </div>
            <div class="card-body">
                <p class="card-text">
                    <h2>{{ error.statusCode }}</h2><br>
                    <pre>{{ error.message }}</pre><br>
                    <NuxtLink to="/">回首頁</NuxtLink>
                </p>
            </div>
            <div class="card-footer text-muted">
                Status code:&nbsp;{{ error.statusCode }}
            </div>
        </div>
	</div>  
</div>
</template>