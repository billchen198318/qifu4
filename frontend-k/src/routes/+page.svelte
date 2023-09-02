<script>
import { onMount, onDestroy } from 'svelte';
import { goto } from '$app/navigation';
import { checkUserHasLogined, checkHasRole } from '../components/BaseHelper.svelte';
import { _user } from '../store/userStore.js';

let userData;
  	_user.subscribe(value => {
  	userData = value;
});

onMount(()=>{
    if (!checkUserHasLogined(userData)) {
        window.location.href = '/login';
    } else {
        if (checkHasRole('admin') || checkHasRole('*')) {
            window.location.href = '/dashboard_demo';
        } else {
            window.location.href = '/about';
        }
    }
});

</script>

<div>
    <h2>Welcome, qífū</h2>
</div>    