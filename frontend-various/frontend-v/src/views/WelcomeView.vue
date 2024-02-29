<script>
import { checkHasRole } from '../components/BaseHelper';

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
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

    <div class="card text-center">
      <div class="card-header">
        <i class="bi bi-info-circle"></i>&nbsp;Welcome
      </div>
      <div class="card-body">
        <p class="card-text">
            <h5>Welcome qífū&nbsp;-&nbsp;4</h5>        
        </p>
      </div>
      <div class="card-footer text-muted">
        ver 0.4
      </div>
    </div>
	</div>  
</div>
</template>
