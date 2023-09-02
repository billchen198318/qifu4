<script>
import { onMount, onDestroy } from 'svelte';
import { 
    Card,
    CardBody,
    CardFooter,
    CardHeader,
    CardText,
    CardTitle,
    Icon
} from 'sveltestrap';

onMount(()=>{
    
});
onDestroy(()=>{
    
});

</script>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
        <Card class="mb-3">
            <CardHeader>
                <CardTitle><Icon name="cone-striped" />&nbsp;Permission denied.</CardTitle>
            </CardHeader>
            <CardBody>
                <CardText>
                    Permission denied，沒有操作權限。
                </CardText>
            </CardBody>
            <CardFooter>&nbsp;</CardFooter>
        </Card>
	</div>  
</div>