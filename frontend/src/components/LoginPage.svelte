<script>
import { 
  Icon, 
  Button, 
  Badge,
  Label,
  Input,
  FormGroup
} from 'sveltestrap';

function loginClick() {
  fetch(import.meta.env.VITE_API_URL + '/auth/signin',{
    method: "POST", 
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        username : 'admin',
        password : 'admin99'
      }),
  })    
  .then(response => console.log(response.text()))
  .then(data => console.log(data));
}

</script>    
<style>
    @import '../assets/vali.css';
    @import '../assets/m.css';
</style>
<div class="login-body">
    <section class="login-content">


        <div class="login-box">
          <div class="login-form">
            
            <h3 class="login-head">
              <!--
              <img src="resource/logo.svg" width="250px" style="margin-bottom:10px" />
              -->
              <Icon name="person-circle"/>
              qífū - frontend
            </h3>
            <FormGroup>
              <Label for="username">帐户</Label>
              <Input type="text" name="username" id="username" placeholder="Account"/>
            </FormGroup>
            <FormGroup>
              <label class="control-label">密码</label>
              <input class="form-control" type="password" name="password" id="password" placeholder="Password">
            </FormGroup>

            <FormGroup>
              <div>
                <Button color="primary" on:click="{loginClick}"><Icon name="check-circle"/>&nbsp;登入</Button>
              </div>

              
            </FormGroup>

            <p class="form-text"><Badge color='danger'>{import.meta.env.VITE_API_URL}</Badge></p>
  
          </div>

        </div>
  
      </section>

</div>    