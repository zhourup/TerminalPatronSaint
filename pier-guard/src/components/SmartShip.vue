<template>
  <div class="inner">
    <div class="data_left03">
      <div class="dataAllNo01 maginS01">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit3">激光测距</div>
            <table class="table_data01">
              <tr>
                <td>数据1：</td>
                <td colspan="3" class="font01">100</td>
              </tr>
              <tr>
                <td>数据2：</td>
                <td colspan="3" class="font03">100</td>
              </tr>
              <tr>
                <td>数据3</td>
                <td class="font04">100</td>
                <td>数据4</td>
                <td class="font05">100</td>
              </tr>
              <tr>
                <td>数据5</td>
                <td class="font6">100</td>
                <td>数据6</td>
                <td class="font6">100</td>
              </tr>
              <tr>
                <td>数据7</td>
                <td class="font6">100</td>
                <td>数据8</td>
                <td class="font6">100</td>
              </tr>
              <tr>
                <td>数据9</td>
                <td class="font6">100</td>
                <td>数据10</td>
                <td class="font6">100</td>
              </tr>
            </table>
            <div
              class="data_chart01"
              id="chart1"
              style="height: 350px; margin-top: 15%"
            ></div>
          </div>
        </div>
      </div>
    </div>
    <div class="data_left04" style="margin-top: 1%">
      <div class="dataAllNo01 maginS01">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit3">冲击烈度传感器渐变</div>
            <table class="table_data02">
              <tr>
                <td class="font07">变化一</td>
                <td class="font03">100</td>
                <td class="font07">变化二</td>
                <td class="font02">100</td>
              </tr>
              <tr>
                <td class="font07">变化三</td>
                <td class="font01">100</td>
                <td class="font07">变化三</td>
                <td class="font01">100</td>
              </tr>
            </table>
            <div
              class="zhanleft02"
              id="chart2"
              style="height: 300px; margin-top: 5%"
            ></div>
          </div>
        </div>
      </div>
    </div>
    <div class="data_left03">
      <div class="dataAllNo01 maginS01">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit3">天气数据</div>
            <table class="table_data01">
              <tr>
                <td>风力</td>
                <td colspan="3" class="font02">500</td>
              </tr>
              <tr>
                <td>风向</td>
                <td colspan="3" class="font02">300</td>
              </tr>
              <tr>
                <td>水深</td>
                <td class="font05">300</td>
                <td>水速</td>
                <td class="font04">300</td>
              </tr>
              <tr>
                <td>水向</td>
                <td class="font6">东北</td>
                <td>雨量</td>
                <td class="font6">300</td>
              </tr>
              <tr>
                <td>其他数据1</td>
                <td class="font6">300</td>
                <td>其他数据2</td>
                <td class="font6">300</td>
              </tr>
              <tr>
                <td>其他数据3</td>
                <td class="font6">300</td>
                <td>其他数据4</td>
                <td class="font6">300</td>
              </tr>
            </table>
            <div class="data_chart01" id="chart3" style="height: 350px;margin-top:15%"></div>
          </div>
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
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(document.getElementById("chart1"));
      var option = {
        tooltip: {
          trigger: "axis",
          axisPointer: {
            // 坐标轴指示器，坐标轴触发有效
            type: "shadow", // 默认为直线，可选为：'line' | 'shadow'
          },
          formatter: function (params) {
            var tar = params[0];
            return tar.name + "<br/>" + tar.seriesName + " : " + tar.value;
          },
        },

        xAxis: [
          {
            type: "category",
            splitLine: { show: false },
            data: ["柱状图", "数据一", "数据二", "数据三", "数据四", "数据五"],
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: { show: false },
          },
        ],
        grid: {
          borderWidth: 0,
        },
        yAxis: [
          {
            type: "value",
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: { show: false },
          },
        ],
        series: [
          {
            name: "总收入",
            type: "bar",
            stack: "总量",
            itemStyle: {
              normal: {
                color: "#1afffd",
              },
            },
            data: [0, 1700, 1400, 1200, 300, 0],
          },
          {
            name: "渠道",
            type: "bar",
            stack: "总量",
            itemStyle: {
              normal: {
                color: "#28a3e1",
              },
            },
            data: [2900, 1200, 300, 200, 900, 300],
          },
        ],
      };

      myChart.setOption(option);
    },
    chart2() {
      let myChart = echarts.init(document.getElementById("chart2"));
      let option = {
        title: {
          text: "水速",
          textStyle: {
            color: "#e9ebee",
          },
          x: "center",
        },
        tooltip: {
          trigger: "axis",
        },
        legend: {
          orient: "vertical",
          x: "left",
          data: ["方向一", "方向二"],
          textStyle: {
            color: "#e9ebee",
          },
        },

        calculable: false,
        xAxis: [
          {
            type: "category",
            splitLine: { show: false },
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            data: [
              "1月",
              "2月",
              "3月",
              "4月",
              "5月",
              "6月",
              "7月",
              "8月",
              "9月",
              "10月",
              "11月",
              "12月",
            ],
          },
        ],
        yAxis: [
          {
            type: "value",
            splitLine: { show: false },
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
          },
        ],
        grid: {
          borderWidth: 0,
        },
        series: [
          {
            name: "营销投入量",
            type: "bar",
            data: [
              2.0,
              4.9,
              7.0,
              23.2,
              25.6,
              76.7,
              135.6,
              162.2,
              32.6,
              20.0,
              6.4,
              3.3,
            ],
            itemStyle: {
              normal: {
                color: "#2481ff",
              },
            },
            markPoint: {
              data: [
                { type: "max", name: "最大值" },
                { type: "min", name: "最小值" },
              ],
            },
            markLine: {
              data: [{ type: "average", name: "平均值" }],
            },
          },
          {
            name: "销售量",
            type: "bar",
            data: [
              2.6,
              5.9,
              9.0,
              26.4,
              28.7,
              70.7,
              175.6,
              182.2,
              48.7,
              18.8,
              6.0,
              2.3,
            ],
            itemStyle: {
              normal: {
                color: "#1afffd",
              },
            },

            markPoint: {
              data: [
                {
                  name: "最高",
                  value: 182.2,
                  xAxis: 7,
                  yAxis: 183,
                  symbolSize: 18,
                },
                { name: "最低", value: 2.3, xAxis: 11, yAxis: 3 },
              ],
            },
            markLine: {
              data: [{ type: "average", name: "平均值" }],
            },
          },
        ],
      };

      myChart.setOption(option);
    },
    chart3() {
      let myChart = echarts.init(document.getElementById("chart3"));
      let option = {
        tooltip: {
          trigger: "axis",
          axisPointer: {
            // 坐标轴指示器，坐标轴触发有效
            type: "shadow", // 默认为直线，可选为：'line' | 'shadow'
          },
          formatter: function (params) {
            var tar = params[0];
            return tar.name + "<br/>" + tar.seriesName + " : " + tar.value;
          },
        },

        xAxis: [
          {
            type: "category",
            splitLine: { show: false },
            data: ["柱状图", "数据一", "数据二", "数据三", "数据四", "数据五"],
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: { show: false },
          },
        ],
        grid: {
          borderWidth: 0,
        },
        yAxis: [
          {
            type: "value",
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: { show: false },
          },
        ],
        series: [
          {
            name: "总收入",
            type: "bar",
            stack: "总量",
            itemStyle: {
              normal: {
                color: "#1afffd",
              },
            },
            data: [0, 1700, 1400, 1200, 300, 0],
          },
          {
            name: "渠道",
            type: "bar",
            stack: "总量",
            itemStyle: {
              normal: {
                color: "#28a3e1",
              },
            },
            data: [2900, 1200, 300, 200, 900, 300],
          },
        ],
      };

      myChart.setOption(option);
    },
  },
  mounted() {
    this.chart1();
    this.chart2();
    this.chart3();
  },
};
</script>

<style scoped>
@import "../assets/css/security.scss";
</style>