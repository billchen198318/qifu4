<script>
import { getProgItem } from './BaseHelper';

export default {
    props: [ 'progId', 'dataSource', 'config' ],
    setup(props) {
    },
    data() {
        return {
            pageProg : null
        }
    },
    methods: {
    },
    created() {
        this.pageProg = getProgItem(this.progId);
        if (null == this.pageProg) {
            //alert('Please close this page, grid load fail!');
            //window.location = "/";
            console.log('error, pageProg null');
        }        
    },
    mounted() {
    } /* ,
    watch : {
        dataSource : {
            deep : true,
            handler() {
                console.log('array updated');
            }
        }
    } */
}
</script>

<template>
<div class="col-xs-12 col-md-12 col-lg-12">
    <table class="table table-hover table-bordered" v-if="this.dataSource != null && this.dataSource.length > 0">
        <thead>
            <tr>
                <th v-for="col in config.column" v-bind:style="'background-color:' + config.theadColor.backgroundColor + '; color:' + config.theadColor.color + ';'">{{col.label}}</th>
            </tr>            
        </thead>
        <tbody>
            <tr v-for="row in dataSource">
                <td v-for="col in config.column">
                    <template v-if="config.keyFieldFormatter.field == col.field">
                        <template v-for="keyFieldFormatItem in config.keyFieldFormatter.item">
                            <template v-if="   typeof keyFieldFormatItem.method === 'function'  ">
                                <button v-if="  config.keyFieldFormatter.showTooltip " v-bind:id="'_' + keyFieldFormatItem.type + '_' + row[col.field]" v-bind:class="keyFieldFormatItem.class" @click="keyFieldFormatItem.method(row[col.field])" data-bs-toggle="tooltip" data-bs-placement="bottom" v-bind:data-bs-title="keyFieldFormatItem.memo" data-trigger="hover"><i v-bind:class="'bi bi-' + keyFieldFormatItem.icon "></i></button>
                                <button v-if=" !config.keyFieldFormatter.showTooltip " v-bind:id="'_' + keyFieldFormatItem.type + '_' + row[col.field]" v-bind:class="keyFieldFormatItem.class" @click="keyFieldFormatItem.method(row[col.field])"><i v-bind:class="'bi bi-' + keyFieldFormatItem.icon "></i></button>
                                &nbsp;
                            </template>
                            <template v-if=" !(typeof keyFieldFormatItem.method === 'function') ">{{row[col.field]}}</template>
                        </template>
                    </template>
                    <template v-if="config.keyFieldFormatter.field != col.field">{{row[col.field]}}</template>
                </td>
            </tr>
        </tbody>
    </table>
</div>
</template>