<template>
  <div class="inner">
    <div class="data_left05">
      <div class="dataAllNo02">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit">数据分析</div>
            <div class="data_chart02" id="chart1"></div>
          </div>
        </div>
      </div>
    </div>
    <div class="data_left05">
      <div class="dataAllNo02">
        <div class="dataAllBorder02 video_cage">
          <img
            class="video_around video_around_chose"
            src="../assets/img/video.jpg"
          />
          <img class="video_around" src="../assets/img/video.jpg" />
          <img class="video_around" src="../assets/img/video.jpg" />
          <img class="video_around" src="../assets/img/video.jpg" />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
let echarts = require("echarts");
export default {
  methods: {
    chart1() {
      let myChart = echarts.init(document.getElementById("chart1"));
      var option = {
        tooltip: {
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 32,
          y2: 40,
          borderWidth: 0,
        },
        calculable: true,
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
            data: [
              "一月",
              "二月",
              "三月",
              "四月",
              "五月",
              "六月",
              "七月",
              "八月",
              "九月",
              "十月",
              "十一月",
              "十二月",
            ],
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
              },
            },
          },
        ],
        yAxis: [
          {
            type: "value",
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
              },
            },
          },
        ],
        series: [
          {
            name: "水速",
            type: "line",
            stack: "m/s",
            data: [120, 132, 101, 134, 90, 230, 210, 230, 245, 256, 278, 300],
            itemStyle: {
              normal: {
                color: "#45c0ff",
              },
            },
          },
          {
            name: "风速",
            type: "line",
            stack: "m/s",
            data: [220, 182, 191, 234, 290, 330, 310, 230, 245, 256, 278, 300],
            itemStyle: {
              normal: {
                color: "#0ad5ff",
              },
            },
          },
          {
            name: "风向",
            type: "line",
            stack: "米",
            data: [220, 182, 191, 234, 290, 330, 310, 230, 245, 256, 278, 300],
            itemStyle: {
              normal: {
                color: "#005ea1",
              },
            },
          },
          {
            name: "温度",
            type: "line",
            stack: "。C",
            data: [220, 182, 191, 234, 290, 330, 310, 230, 245, 256, 278, 300],
            itemStyle: {
              normal: {
                color: "#ffcb89",
              },
            },
          },
          {
            name: "水深",
            type: "line",
            stack: "m",
            data: [220, 182, 191, 234, 290, 330, 310, 230, 245, 256, 278, 300],
            itemStyle: {
              normal: {
                color: "#2e7cff",
              },
            },
          },
          {
            name: "降雨量",
            type: "line",
            stack: "ml",
            data: [220, 182, 191, 234, 290, 330, 310, 230, 245, 256, 278, 300],
            itemStyle: {
              normal: {
                color: "#1afffd",
              },
            },
          },
        ],
      };
      myChart.setOption(option);
    },
  },
  mounted() {
    this.chart1();
  },
};
</script>

<style scoped>
@import "../assets/css/security.scss";
</style>