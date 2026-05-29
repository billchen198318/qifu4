import { defineStore } from 'pinia'
import type { BaseState, User, MenuItem, Program } from '../types'

export const getBaseStore = function() {
    return useBaseStore();
}

export const useBaseStore = defineStore('baseStore', {
    state: (): BaseState => {
        return { 
            user : {
                id : '',
                login : 'N',
                admin : 'N',
                accessToken     : '',
                refreshToken    : '',                
                roleList : [],
                permList : []
            },
            menuList : [],
            progList : []
        }
    },
    getters: {
        isLoggedIn: (state) => state.user.login === 'Y',
        isAdmin: (state) => state.user.admin === 'Y',
        userId: (state) => state.user.id,
    },
    actions: {
        setUserData(uJsonRes: any) {
            this.user.id = uJsonRes.userId || '';
            this.user.login = 'Y';
            this.user.admin = uJsonRes.admin ? 'Y' : 'N';
            this.user.roleList = uJsonRes.roles || [];
            this.user.permList = uJsonRes.authorities || [];
            this.user.accessToken = uJsonRes.accessToken || '';
            this.user.refreshToken = uJsonRes.refreshToken || '';
        },
        setMenuList(v: MenuItem[]) {
            this.menuList = v;
        },
        setProgList(v: Program[]) {
            this.progList = v;
        },        
        setLoginStatus(v: 'Y' | 'N' | '') {
            this.user.login = v;
        },
        clearUserData() {
            this.user = {
                id: '',
                login: '',
                admin: 'N',
                roleList: [],
                permList: [],
                accessToken: '',
                refreshToken: ''
            };
            this.menuList = [];
            this.progList = [];
        }
    },
})
