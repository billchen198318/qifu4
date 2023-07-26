<script>
import { Table } from "sveltestrap";

export let config = {};
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
    </Table>
  
</div>