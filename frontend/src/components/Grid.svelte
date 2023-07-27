<script>
import { Table, Button, Icon, Tooltip } from "sveltestrap";

export let config = {};
export let dataSource = {};

</script>

<div class="col-xs-12 col-md-12 col-lg-12">
    <Table bordered hover>
        <thead style="background-color:{config.theadColor.backgroundColor}; color:{config.theadColor.color};">
        <tr>
            {#each config.column as col}
            <th>{col.label}</th>
            {/each}
        </tr>
        </thead>
        
        {#if null != dataSource && dataSource.dataList != null && dataSource.dataList.length > 0 }
        <tbody>
            {#each dataSource.dataList as row}
            <tr>
                {#each config.column as col}
                    {#if config.keyFieldFormatter.field == col.field}
                        <td>
                        {#each config.keyFieldFormatter.item as keyFieldFormatItem}                            
                            {#if config.keyFieldFormatter.showTooltip }
                            <Button id={'_' + keyFieldFormatItem.type + '_' + row[col.field]} class="btn btn-light btn-sm" on:click={keyFieldFormatItem.method(row[col.field])}><Icon name={keyFieldFormatItem.icon}></Icon></Button>
                            <Tooltip target={'_' + keyFieldFormatItem.type + '_' + row[col.field]} placement="bottom">{keyFieldFormatItem.memo}</Tooltip>
                            {:else}
                            <Button class="btn btn-light btn-sm" on:click={keyFieldFormatItem.method(row[col.field])}><Icon name={keyFieldFormatItem.icon}></Icon></Button>
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
        {/if}

    </Table>
  
</div>