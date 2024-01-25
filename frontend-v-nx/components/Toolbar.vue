<script>
import { getProgItem } from './BaseHelper';

export default {
    props: [
        'progId', 'description', 
        'marginBottom',
        'refreshFlag', 'refreshMethod', 
        'backFlag', 'backMethod', 
        'createFlag', 'createMethod',
        'saveFlag', 'saveMethod'
    ],
    emits: ["refreshMethod", "backMethod", "createMethod", "saveMethod"],
    setup(props) {
    },    
    data() {
        return { 
            pageProg : null
        }
    },
    methods: {
        fnBack : function() {
            this.$emit('backMethod');
        },        
        fnRefresh : function() {
            this.$emit('refreshMethod');
        },
        fnCreate : function() {
            this.$emit('createMethod');
        },
        fnSave : function() {
            this.$emit('saveMethod');
        }
    },
    created() {
        this.pageProg = getProgItem(this.progId);
        if (null == this.pageProg) {
            alert('Please close this page, toolbar load fail!');
            window.location = "/";
        }
        //console.log(this.pageProg);
    },
    mounted() {
        /*
        this.pageProg = getProgItem(this.progId);
        if (null == this.pageProg) {
            alert('Please close this page, toolbar load fail!');
        }
        console.log(this.pageProg);
        */
    }
}
</script>

<template>
<div class="app-title" style="background: linear-gradient(to top, #f8f9fa, #ffffff); width: 103vw; overflow: hidden;">
	<div>
		<h1 style="color: #003366;"><i v-bind:class="'bi bi-'+this.pageProg.fontIconClassId"></i>&nbsp;{{this.pageProg.name}}</h1>
		<p style="color: #333300;">{{this.description}}</p>
		<div>
            <i v-if=" 'Y' == this.backFlag" id="tb_back" class="bi bi-arrow-left-square btn btn-secondary btn-sm" @click="this.fnBack" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="上一頁" data-trigger="hover"></i>
            {{ 'Y' == this.backFlag ? '&nbsp;' : '' }}

            <i v-if=" 'Y' == this.refreshFlag" id="tb_repeat" class="bi bi-repeat btn btn-secondary btn-sm" @click="this.fnRefresh" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="刷新" data-trigger="hover"></i>
            {{ 'Y' == this.refreshFlag ? '&nbsp;' : '' }}

            <i v-if=" 'Y' == this.createFlag " id="tb_plus" class="bi bi-plus-circle btn btn-secondary btn-sm" @click="this.fnCreate" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="新增頁" data-trigger="hover"></i>
            {{ 'Y' == this.createFlag ? '&nbsp;' : '' }}

            <i v-if=" 'Y' == this.saveFlag " id="tb_save" class="bi bi-save btn btn-secondary btn-sm" @click="this.fnSave" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="儲存/更新" data-trigger="hover"></i>
            {{ 'Y' == this.saveFlag ? '&nbsp;' : '' }}
		</div>
	</div>    
</div> 
<p v-if=" 'Y' != this.marginBottom " style="margin-bottom: 5px"></p>
</template>