import { defineStore } from 'pinia';
import { getInitGridConfigVariable, type GridConfig } from '@/components/GridHelper';

export const getProg004d0002Store = function() {
    return useProg004d0002Store();
}

export const useProg004d0002Store = defineStore('prog004d0002', {
    state: () => {
        return { 
            gridConfig : getInitGridConfigVariable() as GridConfig,
            queryParam : {
                userId : ''
            }
        }
    },
    actions: {
        setQueryParam(qJsonRes:any) {
            this.queryParam = qJsonRes;
        },
        setGridConfig(gJsonRes:any) {
            this.gridConfig = gJsonRes;
        },        
        clearData() {
            this.queryParam.userId = '';
            this.gridConfig.page = 1;
            this.gridConfig.row = 10;
            this.gridConfig.total = 0;
        }
    },
})