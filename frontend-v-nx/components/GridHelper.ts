export interface GridConfig {
  row: number;
  page: number;
  total: number;
  theadColor: {
    backgroundColor: string;
    color: string;
  };
  keyFieldFormatter: {
    field: string;
    showTooltip: boolean;
    item: any[];
  };
  column: any[];
}

export function getInitGridConfigVariable() {
  return {
    page: 1,
    row: 10,
    total: 0
  };
}

export function getGridConfig(keyFieldName: string, formatterItems: any[], columnItems: any[]): GridConfig {
  for (let i in columnItems) {
    if (columnItems[i].labHtml === undefined) {
      columnItems[i].labHtml = false;
    }
    if (columnItems[i].colHtml === undefined) {
      columnItems[i].colHtml = false;
    }
    if (columnItems[i].colMethod === undefined) {
      columnItems[i].colMethod = null;
    }
    if (columnItems[i].textAlign === undefined) {
      columnItems[i].textAlign = 'left';
    }
    if (columnItems[i].labTextAlign === undefined) {
      columnItems[i].labTextAlign = 'left';
    }
  }
  return {
    row: 10,
    page: 1,
    total: 0,
    theadColor: {
      backgroundColor: '#575757',
      color: 'whitesmoke'
    },
    keyFieldFormatter: {
      field: !keyFieldName ? 'oid' : keyFieldName,
      showTooltip: false,
      item: formatterItems
    },
    column: columnItems
  };
}

export function setConfigRow(gridConfig: GridConfig, row: number | string) {
  gridConfig.row = typeof row === 'string' ? parseInt(row, 10) : row;
}
export function setConfigPage(gridConfig: GridConfig, page: number | string) {
  gridConfig.page = typeof page === 'string' ? parseInt(page, 10) : page;
}
export function setConfigTotal(gridConfig: GridConfig, total: number | string) {
  gridConfig.total = typeof total === 'string' ? parseInt(total, 10) : total;
}

export function resetConfigByOld(newGridConfig: GridConfig, oldGridConfig: GridConfig) {
  newGridConfig.total = oldGridConfig.total;
  newGridConfig.row = oldGridConfig.row;
  newGridConfig.page = oldGridConfig.page;
}
