import { defineStore } from 'pinia';
import { getInitGridConfigVariable, type GridConfig } from '@/components/GridHelper';

export const getProg001d0005Store = function() {
    return useProg001d0005Store();
}

export const useProg001d0005Store = defineStore('prog001d0005', {
    state: () => {
        return { 
            gridConfig : getInitGridConfigVariable() as GridConfig,
            queryParam : {
                reportId : ''
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
            this.queryParam.reportId = '';
            this.gridConfig.page = 1;
            this.gridConfig.row = 10;
            this.gridConfig.total = 0;
        }
    },
})