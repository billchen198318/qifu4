<script>
import {
	Icon,
	Button,
	Badge,
	Label,
	Input,
	FormGroup
} from 'sveltestrap';
import { goto } from '$app/navigation';
import Swal from 'sweetalert2';
import { _user } from '../../store/userStore.js';
import { setRefreshAndAccessTokenCookie, checkHasRole } from '../../components/BaseHelper.svelte';

let userData;
_user.subscribe(value => {
	userData = value;
});

let lgParam = {
	username: '',
	password: '',
	message: ''
}

function loginClick() {
	Swal.fire({
		title: "Loading...",
		html: "請等待",
		showConfirmButton: false,
		allowOutsideClick: false
	});
	Swal.showLoading();

	lgParam.message = '';
	fetch(import.meta.env.VITE_API_URL + '/auth/signin', {
		method: "POST",
		headers: {
			"Content-Type": "application/json",
		},
		body: JSON.stringify({
			username: lgParam.username,
			password: lgParam.password
		}),
		signal: AbortSignal.timeout(import.meta.env.VITE_FETCH_TIMEOUT)
	})
	.then(response => {
		Swal.hideLoading();
		Swal.close();
		if (response.ok) {
			return response.json();
		}
		throw new Error(response.status + ' ' + response.statusText);
	})
	.then((responseJson) => {
		if (null != responseJson) {
			_user.update((val) => {
				return responseJson;
			});
		} else {
			_user.update((val) => {
				return {};
			});
		}
		setRefreshAndAccessTokenCookie(userData.refreshToken, userData.accessToken);
		if (checkHasRole('admin') || checkHasRole('*')) {
			goto('/dashboard_demo');
		} else {
			goto('/about');
		}
	})
	.catch((error) => {
		console.log(error);
		lgParam.message = error;
		lgParam.username = '';
		lgParam.password = '';
		Swal.hideLoading();
		Swal.close();
	});
}

</script>    

<div class="login-body">
    <section class="login-content">
        <div class="login-box">
			<div class="login-form">
            
				<h3 class="login-head">
					<!-- <img src="resource/logo.svg" width="250px" style="margin-bottom:10px" /> -->
					<Icon name="person-circle"/>
					qífū - frontend
				</h3>
				<FormGroup>
					<Label for="username">帳戶</Label>
					<Input type="text" name="username" id="username" placeholder="Account" bind:value={lgParam.username} />
				</FormGroup>
				<FormGroup>
					<Label for="password">密碼</Label>
					<input class="form-control" type="password" name="password" id="password" placeholder="Password" bind:value={lgParam.password} />
				</FormGroup>

				<FormGroup>
					<div>
						<Button color="primary" class="col-12" on:click="{loginClick}"><Icon name="box-arrow-in-right"/>&nbsp;登入</Button>
					</div>
				</FormGroup>
				
				{#if null != lgParam && null != lgParam.message && '' != lgParam.message }
				<p class="form-text"><Badge color='danger'>{lgParam.message}</Badge></p>
				{/if}
						
			</div>	
		</div>
	</section>
</div>    