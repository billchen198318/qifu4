<script>
import { checkHasRole } from '../components/BaseHelper';

definePageMeta({ middleware : ['auth'] });

export default {
    setup() {
    },
    data() {
      return {
      }
    },
    mounted() {
      if (checkHasRole('admin') || checkHasRole('*')) {
        this.$router.push( '/dashboard' );
      }
    }
}
</script>
<template>
	<div class="callout callout-info">
		<h4><i class="bi bi-info-circle"></i>&nbsp;Welcome</h4>
		<br>
		Welcome qífū&nbsp;-&nbsp;4
		<br>
    <br>
    Version&nbsp;:&nbsp;0.4
	</div>
</template>
