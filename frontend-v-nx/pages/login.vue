<script setup lang="ts">
import { ref } from 'vue';
import { useBaseStore } from '../store/baseStore';
import { toast } from 'vue3-toastify';
import 'vue3-toastify/dist/index.css';
import { setRefreshAndAccessTokenCookie, userLogoutClearCookie } from '../components/BaseHelper';
import { useSwalLoading } from '@/composables/useSwalLoading';

definePageMeta({ layout: 'blank' });

const baseStore = useBaseStore();
const userId = ref('');
const passwd = ref('');
const message = ref('');
const { showLoading, hideLoading } = useSwalLoading();

const loginBtnClick = async () => {
  if (!userId.value.trim() || !passwd.value.trim()) {
    toast.warn('請輸入帳戶與密碼!');
    return;
  }

  showLoading();

  message.value = '';

  try {
    const responseJson: any = await useApi('/auth/signin', {
      method: "POST",
      body: {
        username: userId.value,
        password: passwd.value
      }
    });

    hideLoading();

    if (responseJson) {
      baseStore.setUserData(responseJson);
      setRefreshAndAccessTokenCookie(responseJson.refreshToken, responseJson.accessToken);
      navigateTo('/');
    } else {
      baseStore.clearUserData();
      userLogoutClearCookie();
    }
  } catch (error: any) {
    userLogoutClearCookie();
    console.log(error.message);
    message.value = 'Login failed';
    userId.value = '';
    passwd.value = '';
    hideLoading();
  }
};
</script>

<template>
  <div class="login-body">
    <section class="login-content">
      <div class="login-box">
        <div class="login-form">
          <h3 class="login-head">
            <i class="bi bi-person-circle"></i>
            qífū - frontend
          </h3>
          <div class="form-group form-floating">
            <input type="text" class="form-control" id="username" placeholder="Account" v-model="userId" @keyup.enter="loginBtnClick">
            <label for="username">請輸入帳戶</label>
          </div>
          <p style="margin-bottom: 5px"></p>
          <div class="form-group form-floating">
            <input class="form-control" type="password" name="password" id="password" placeholder="Password" v-model="passwd" @keyup.enter="loginBtnClick" />
            <label for="password">請輸入密碼</label>
          </div>
          <p style="margin-bottom: 10px"></p>
          <div class="form-group">
            <button type="button" class="btn btn-primary col-12" @click="loginBtnClick">
              <i class="bi bi-box-arrow-in-right"></i>&nbsp;登入
            </button>
          </div>
          <p style="margin-bottom: 5px"></p>
          <div v-if="message">
            <h6><span class="badge bg-danger">{{ message }}</span></h6>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<style scoped>
/* 可以在此加入 login 專屬樣式 */
</style>
