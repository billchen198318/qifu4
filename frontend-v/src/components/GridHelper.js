export function getInitGridConfigVariable() {
    return {
        page : 1,
        row : 10,
        total : 0
    };
}

export function getGridConfig(keyFieldName, formatterItems, columnItems) {
    var gridConfig = {
        row : 10,
        page : 1,
        total : 0,
        theadColor : {
            'backgroundColor' : '#575757',
            'color'           : 'whitesmoke'
        },
        keyFieldFormatter : {
            'field' : (null == keyFieldName || '' == keyFieldName) ? 'oid' : keyFieldName,
            'showTooltip' : false,
            'item' : formatterItems
        },
        column : columnItems
    };
    return gridConfig;
}

export function setConfigRow(gridConfig, row) {
    gridConfig.row = row;
}
export function setConfigPage(gridConfig, page) {
    gridConfig.page = page;
}
export function setConfigTotal(gridConfig, total) {
    gridConfig.total = total;
}

export function resetConfigByOld(newGridConfig, oldGridConfig) {
    newGridConfig.total = oldGridConfig.total;
    newGridConfig.row = oldGridConfig.row;
    newGridConfig.page = oldGridConfig.page;
}
