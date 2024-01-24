<template>
    <div class="row">
        <div class="col-xs-12 col-md-12 col-lg-12">
    
        <div class="card text-center">
          <div class="card-header">
            <i class="bi bi-cone-striped"></i>&nbsp;Permission denied.
          </div>
          <div class="card-body">
            <p class="card-text">
                <h5>{{ $router.options.history.state.back }}</h5>
                <br>
                Permission denied，沒有操作權限。
                <br>          
            </p>
          </div>
          <div class="card-footer text-muted">
            &nbsp;
          </div>
        </div>
        </div>  
    </div>
    </template>
    