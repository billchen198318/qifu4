<script>
import { 
    Pagination, PaginationItem, PaginationLink, Button, ButtonGroup
} from 'sveltestrap';

export let changeGridConfigRowMethod;
export let gridConfig;
export let dataSource;

</script>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
    {#if dataSource != null && dataSource.length > 0 }

    <table width="100%" border="0" cellspacing="0" cellpadding="1" >
      <tr>
        <td  width="70%" align="left" valign="middle">
          <Pagination ariaLabel="Page navigation">
            <PaginationItem>
                <PaginationLink first href="#" />
              </PaginationItem>
              <PaginationItem>
                <PaginationLink previous href="#" />
              </PaginationItem>
              <PaginationItem active>
                <PaginationLink href="#">1</PaginationLink>
              </PaginationItem>
              <PaginationItem>
                <PaginationLink href="#">2</PaginationLink>
              </PaginationItem>
              <PaginationItem>
                <PaginationLink href="#">3</PaginationLink>
              </PaginationItem>
              <PaginationItem>
                <PaginationLink href="#">4</PaginationLink>
              </PaginationItem>
              <PaginationItem>
                <PaginationLink href="#">5</PaginationLink>
              </PaginationItem>
              <PaginationItem>
                <PaginationLink next href="#" />
              </PaginationItem>
              <PaginationItem>
                <PaginationLink last href="#" />
              </PaginationItem>    
          </Pagination>        
      
        </td>
        <td width="30%" align="right" valign="middle">
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
      </tr>
    </table>  
    {:else}
      &nbsp;
    {/if}
    
  </div>
</div>
