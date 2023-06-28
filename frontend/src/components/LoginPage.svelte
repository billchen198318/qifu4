<script>
import { Icon } from 'sveltestrap';
import { Button } from 'sveltestrap';
import { Badge } from 'sveltestrap';

</script>    
<style>
    @import '../assets/vali.css';
    @import '../assets/m.css';
</style>
<div class="login-body">
    <section class="login-content">


        <div class="login-box">
          <form class="login-form" method="post" name="formLogin" id="formLogin" action="/login">
            
            <h3 class="login-head">
              <!--
              <img src="resource/logo.svg" width="250px" style="margin-bottom:10px" />
              -->
              qifu4 frontend
            </h3>
            <div class="form-group">
              <label class="control-label">帐户</label>
              <input class="form-control" type="text" name="username" id="username" placeholder="Account" maxlength="34" autofocus>
            </div>
            <div class="form-group">
              <label class="control-label">密码</label>
              <input class="form-control" type="password" name="password" id="password" placeholder="Password" maxlength="16">
            </div>

            <div class="form-group btn-container">
              <button class="btn btn-primary btn-block" id="btnLogin" name="btnLogin" ><i class="fa fa-sign-in fa-lg fa-fw"></i>登入</button>
            </div>

            <p class="form-text"><Badge color='danger'>errMsg,errMsg,errMsg</Badge></p>
  
          </form>
          <form class="forget-form" action="index.html">
            <h3 class="login-head"><i class="fa fa-lg fa-fw fa-lock"></i>Forgot Password ?</h3>
            <div class="form-group">
              <label class="control-label">EMAIL</label>
              <input class="form-control" type="text" placeholder="Email">
            </div>
            <div class="form-group btn-container">
              <button class="btn btn-primary btn-block"><i class="fa fa-unlock fa-lg fa-fw"></i>RESET</button>
            </div>
            <div class="form-group mt-3">
              <p class="semibold-text mb-0"><a href="#" data-toggle="flip"><i class="fa fa-angle-left fa-fw"></i> Back to Login</a></p>
            </div>
          </form>
        </div>
  
      </section>

</div>    