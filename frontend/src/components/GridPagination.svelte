<script>
import { 
    Pagination, PaginationItem, PaginationLink, Button, ButtonGroup, Badge 
} from 'sveltestrap';

export let changeGridConfigRowMethod;
export let changePageSelectMethod;
export let gridConfig;

let prevPage = 1;
let nexPage = 1;
let lastPage = 1;

let midMaxShow = 3;
let pStart;
let pEnd;
let pItem = [];

$ : {  
  pItem = [];
  if (gridConfig.total > 0) {
    prevPage = gridConfig.page - 1;
    nexPage = gridConfig.page + 1;
    lastPage = parseInt( gridConfig.total / gridConfig.row );
    if (parseInt(gridConfig.total % gridConfig.row) != 0) {
      lastPage += 1;
    }
    if (gridConfig.page > lastPage) {
      gridConfig.page = lastPage;
      prevPage = gridConfig.page - 1;
      nexPage = gridConfig.page + 1;      
    }
    if (gridConfig.page < 1) {
      gridConfig.page = 1;
      prevPage = 1;
      nexPage = 1;
    }    
    if (prevPage < 1) {
      prevPage = 1;
    }
    if (nexPage > lastPage) {
      nexPage = lastPage;
    }
    pStart = gridConfig.page - midMaxShow;
    pEnd = gridConfig.page + midMaxShow;
    if (pStart < 1) { 
      pStart = 1;
    }
    if (pEnd > lastPage) {
      pEnd = lastPage;
    }
    for (let i = pStart; i <= pEnd; i++) {
      pItem.push(i);
    }
  }
}

</script>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    {#if gridConfig != null && gridConfig.total > 0 }
    <table width="100%" border="0" cellspacing="0" cellpadding="1" >
      <tr>
        <td  width="70%" align="left" valign="middle">

          <Pagination ariaLabel="Page navigation">
            <PaginationItem>
                <PaginationLink first href={window.location} on:click={changePageSelectMethod(1)} />
              </PaginationItem>
              <PaginationItem>
                <PaginationLink previous href={window.location} on:click={changePageSelectMethod(prevPage)} />
              </PaginationItem>

              {#each pItem as pNum }
              <PaginationItem active={ pNum == gridConfig.page } >
                <PaginationLink href={window.location} on:click={changePageSelectMethod(pNum)}>{pNum}</PaginationLink>
              </PaginationItem> 
              {/each}

              <PaginationItem>
                <PaginationLink next href={window.location} on:click={changePageSelectMethod(nexPage)} />
              </PaginationItem>
              <PaginationItem>
                <PaginationLink last href={window.location} on:click={changePageSelectMethod(lastPage)} />
              </PaginationItem>    
          </Pagination>        
      
        </td>
        <td width="30%" align="right" valign="middle">
          <table width="100%" border="0" cellspacing="0" cellpadding="1" >
            <tr>
              <td align="right">
                <ButtonGroup>
                  {#if gridConfig.row == 10 }
                    <Button active on:click={changeGridConfigRowMethod(10)}>Row 10</Button>
                  {:else}
                    <Button on:click={changeGridConfigRowMethod(10)}>Row 10</Button>
                  {/if}
                  
                  {#if gridConfig.row == 30 }
                    <Button active on:click={changeGridConfigRowMethod(30)}>30</Button>
                  {:else}
                    <Button on:click={changeGridConfigRowMethod(30)}>30</Button>
                  {/if}
                  
                  {#if gridConfig.row == 50 }
                    <Button active on:click={changeGridConfigRowMethod(50)}>50</Button>
                  {:else}
                    <Button on:click={changeGridConfigRowMethod(50)}>50</Button>
                  {/if}
      
                  {#if gridConfig.row == 100 }
                    <Button active on:click={changeGridConfigRowMethod(100)}>100</Button>
                  {:else}
                    <Button on:click={changeGridConfigRowMethod(100)}>100</Button>
                  {/if}
                </ButtonGroup>
              </td>
              <td align="left">
                <h6>
                  Total
                  <Badge>{gridConfig.total}</Badge>
                </h6>
              </td>
            </tr>
          </table>    
        </td>        
      </tr>
    </table>  
    {:else}
      &nbsp;
    {/if}
    
  </div>
</div>
