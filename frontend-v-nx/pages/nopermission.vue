<script>
definePageMeta({ middleware : ['auth'] });
</script>

<template>
	<div class="callout callout-warning">
		<h4><i class="bi bi-cone-striped"></i>&nbsp;Permission denied.</h4>
		<br>
		<h5>{{ $route.redirectedFrom?.path }}</h5>
		<br>
		Permission denied，沒有操作權限。
		<br>    
	</div>
</template>
    