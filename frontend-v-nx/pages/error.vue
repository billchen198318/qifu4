<script>
export default {
    setup() {
    },
    data() {
      return {
        currLoc : ''
      }
    },
    mounted() {
      this.currLoc = window.location.href;
    }
}

</script>

<template>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

    <div class="card text-center">
      <div class="card-header">
        <i class="bi bi-cone-striped"></i>&nbsp;Error or Not found resources.
      </div>
      <div class="card-body">
        <p class="card-text">
          無法存取:&nbsp;{{this.currLoc}}
          <br>
          請利用網站選單，來進行操作。      
        </p>
      </div>
      <div class="card-footer text-muted">
        無效資源:&nbsp;{{this.currLoc}}
      </div>
    </div>
	</div>  
</div>
</template>
