<script>
import { Table, Button, Icon, Tooltip } from "sveltestrap";

export let config = {};
export let dataSource = [];

</script>
<script context="module">
export function getGridConfig(keyFieldName, formatterItems, columnItems) {
    var gridConfig = {
        row : 10,
        page : 1,
        total : 0,
        theadColor : {
            'backgroundColor' : '#1a1a1a',
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
</script>
<div class="col-xs-12 col-md-12 col-lg-12">
    
    {#if null != dataSource && dataSource.length > 0 }
    <Table bordered hover>
        <thead style="background-color:{config.theadColor.backgroundColor}; color:{config.theadColor.color};">
        <tr>
            {#each config.column as col}
            <th>{col.label}</th>
            {/each}
        </tr>
        </thead>
        <tbody>
            {#each dataSource as row}
            <tr>
                {#each config.column as col}
                    {#if config.keyFieldFormatter.field == col.field}
                        <td>
                        {#each config.keyFieldFormatter.item as keyFieldFormatItem}                            
                            {#if typeof keyFieldFormatItem.method === 'function' }
                                {#if config.keyFieldFormatter.showTooltip }
                                <Button id={'_' + keyFieldFormatItem.type + '_' + row[col.field]} class="btn btn-light btn-sm" on:click={keyFieldFormatItem.method(row[col.field])}><Icon name={keyFieldFormatItem.icon}></Icon></Button>
                                <Tooltip target={'_' + keyFieldFormatItem.type + '_' + row[col.field]} placement="bottom">{keyFieldFormatItem.memo}</Tooltip>
                                {:else}
                                <Button class="btn btn-light btn-sm" on:click={keyFieldFormatItem.method(row[col.field])}><Icon name={keyFieldFormatItem.icon}></Icon></Button>
                                {/if}
                            {:else}
                                {row[col.field]}
                            {/if}
                        {/each}
                        </td>
                    {:else}
                        <td>{row[col.field]}</td>
                    {/if}                
                {/each}                
            </tr>        
            {/each}
        </tbody>

    </Table>
    {/if}

</div>