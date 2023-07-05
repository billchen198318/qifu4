<script>
import { 
  Icon, 
  Button, 
  Badge,
  Label,
  Input,
  FormGroup
} from 'sveltestrap';

import { _user } from '../store/userStore.js';

let userData;
	_user.subscribe(value => {
		userData = value;
});


let lgParam = {
  username : '',
  password : '',
  message  : ''
}

export let jqTreeMenuInit;

function loginClick() {
  //console.log('test>>>' + JSON.stringify(lgParam));
  lgParam.message = '';
  fetch(import.meta.env.VITE_API_URL + '/auth/signin',{
    method: "POST", 
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        username : lgParam.username,
        password : lgParam.password
      }),
  })    
  .then(response => {
    if (response.ok) {
      return response.json();
    }
    throw new Error( response.status + ' ' + response.statusText );
  })
  .then((responseJson) => {

    _user.update((val) => {return responseJson;});
    console.log('[userData]-----------------------------');
    console.log(userData);

    setTimeout(() => {
      jqTreeMenuInit(); // App.svelte 的 jq 選單 init
    }, 50);

  })
  .catch((error) => {
    console.log(error);
    lgParam.message = error;
  });  

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
              <Input type="text" name="username" id="username" placeholder="Account" bind:value={lgParam.username} />
            </FormGroup>
            <FormGroup>
              <Label for="password">密码</Label>
              <input class="form-control" type="password" name="password" id="password" placeholder="Password" bind:value={lgParam.password} />
            </FormGroup>

            <FormGroup>
              <div>
                <Button color="primary" on:click="{loginClick}"><Icon name="check-circle"/>&nbsp;登入</Button>
              </div>

              
            </FormGroup>
            
            {#if null != lgParam && null != lgParam.message && '' != lgParam.message }
            <p class="form-text"><Badge color='danger'>{lgParam.message}</Badge></p>
            {/if}

          </div>

        </div>
  
      </section>

</div>    