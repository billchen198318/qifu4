<script>
import { 
    Pagination, PaginationItem, PaginationLink, Button, ButtonGroup
} from 'sveltestrap';
</script>

<div class="row">
  <div class="col-xs-12 col-md-12 col-lg-12">
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
            <Button active>Row 10</Button>
            <Button>30</Button>
            <Button>50</Button>
            <Button>100</Button>
          </ButtonGroup>
        </td>        
      </tr>
    </table>    
  </div>
</div>
