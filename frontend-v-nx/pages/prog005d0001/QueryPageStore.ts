import { defineStore } from 'pinia';
import { getInitGridConfigVariable, type GridConfig } from '@/components/GridHelper';

export const getProg005d0001Store = function() {
    return useProg005d0001Store();
}

export const useProg005d0001Store = defineStore('prog005d0001', {
    state: () => {
        return { 
            gridConfig : getInitGridConfigVariable() as GridConfig,
            queryParam : {
                // No specific query params for now
            },
            brokerInfo : {
                host: '',
                port: '',
                clientSize: 0
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
            this.gridConfig.page = 1;
            this.gridConfig.row = 10;
            this.gridConfig.total = 0;
            this.brokerInfo.host = '';
            this.brokerInfo.port = '';
            this.brokerInfo.clientSize = 0;
        }
    },
})
