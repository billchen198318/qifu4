<script>
import { onMount, onDestroy } from 'svelte';
import { goto } from '$app/navigation';
import { checkUserHasLogined } from '../components/BaseHelper.svelte';
import { _user } from '../store/userStore.js';

let userData;
  	_user.subscribe(value => {
  	userData = value;
});

onMount(()=>{
    if (!checkUserHasLogined(userData)) {
        goto('/login');
    } else {
        goto('/about');
    }
});

</script>

<div>
    <h2>Welcome, qífū</h2>
</div>    