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

let currLocHash = '';
const updateInfoInterval = setInterval(() => (currLocHash = window.location.hash), 500);
onMount(()=>{
    currLocHash = window.location.hash;
});
onDestroy(()=>{
    clearInterval(updateInfoInterval);
});

</script>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
        <Card class="mb-3">
            <CardHeader>
                <CardTitle><Icon name="cone-striped" />&nbsp;Not found resources.</CardTitle>
            </CardHeader>
            <CardBody>
                <CardText>
                    無法存取:&nbsp;{currLocHash}
                    <br>
                    請利用網站選單，來進行操作。
                </CardText>
            </CardBody>
            <CardFooter>無效資源:&nbsp;{currLocHash}</CardFooter>
        </Card>
	</div>  
</div>