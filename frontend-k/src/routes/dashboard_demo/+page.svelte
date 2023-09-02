<script>
import { onMount, onDestroy } from 'svelte';    
import { Badge } from 'sveltestrap';
import { Chart } from 'svelte-echarts';
import { getAxiosInstance } from "../../components/BaseHelper.svelte";

let barOption = { };
let pieOption = { };
let lineOption = { };

let updateBoardInterval = setInterval(() => {
	loadBarAndPieChart();
	loadLineChart();
}, 40000);

onMount(()=>{
	loadBarAndPieChart();
	loadLineChart();
});

onDestroy(()=>{
	clearInterval(updateBoardInterval);
});

function loadBarAndPieChart() {
	var axiosInstance = getAxiosInstance();
	axiosInstance.post(import.meta.env.VITE_API_URL + '/DashboardDemo/findBoardDemo')
	.then(response => {
		if (null != response.data) {
			let dsList = response.data.value;
       		let labList = [];
       		let dataList = [];
       		let pieDataList = [];
			for (var i in dsList) {
      			labList.push(dsList[i].userId);
    			dataList.push(dsList[i].countSize);
				pieDataList.push({
					'name' : dsList[i].userId,
					'value' : dsList[i].countSize
				});
       		}
       		initBarChart(labList, dataList);
       		initPieChart(pieDataList);
		} else {
			alert('error, null');
		}
	})
	.catch(e => {
		alert(e);
	});
}

function loadLineChart() {
	var axiosInstance = getAxiosInstance();
	axiosInstance.post(import.meta.env.VITE_API_URL + '/DashboardDemo/findSize')
	.then(response => {
		if (null != response.data) {
			let dsList = response.data.value;
       		let labList = [];
       		let dataList = [];
			for (var i in dsList) {
				labList.push(dsList[i].date);
				dataList.push(dsList[i].countSize);
    		}
        	initLineChart(labList, dataList);
		} else {
			alert('error, null');
		}
	})
	.catch(e => {
		alert(e);
	});
}

function initBarChart(labList, dataList) {
	barOption = {
		tooltip: {
			trigger: 'axis',
			axisPointer: {
				type: 'shadow'
			}
		},
		grid: {
			left: '3%',
			right: '4%',
			bottom: '3%',
			containLabel: true
		},
		xAxis: [{
			type: 'category',
			data: labList,
			axisTick: {
				alignWithLabel: true
			}
		}],
		yAxis: [{
			type: 'value'
		}],
		series: [{
			name: 'usage count',
			type: 'bar',
			barWidth: '60%',
			data: dataList
		}]
	};
}

function initPieChart(pieDataList) {
	pieOption = {
		tooltip: {
			trigger: 'item'
		},
		legend: {
			top: '5%',
			left: 'center'
		},
		series: [{
			name: 'User',
			type: 'pie',
			radius: ['40%', '70%'],
			avoidLabelOverlap: false,
			label: {
				show: false,
				position: 'center'
			},
			emphasis: {
				label: {
					show: true,
					fontSize: 40,
					fontWeight: 'bold'
				}
			},
			labelLine: {
				show: false
			},
			data: pieDataList
		}]
	};
}

function initLineChart(labList, dateList) {
	lineOption = {
		title: {
			text: 'Usage count per day'
		},
		tooltip: {
			trigger: 'axis'
		},		
		xAxis: {
			type: 'category',
			data: labList
		},
		yAxis: {
			type: 'value'
		},
		series: [{
			data: dateList,
			type: 'line',
			smooth: true,
			areaStyle: {}
		}]
	};
}


</script>

<style>
.chartSmall {
  width: 40vw;
  height: 45vh;
}
.chartAll {
  width: 80vw;
  height: 45vh;
}
</style>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">
		<h2>
			<Badge pill color="info">User usage count</Badge>
		</h2>
	</div>
</div>
<div class="row">
	<div class="col-xs-6 col-md-6 col-lg-6 chartSmall">
		<Chart options={barOption} />
	</div>
	<div class="col-xs-6 col-md-6 col-lg-6 chartSmall">
		<Chart options={pieOption} />
	</div>
</div>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12 chartAll">
		<Chart options={lineOption} />
	</div>
</div>
