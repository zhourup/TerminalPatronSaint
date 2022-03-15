<template>
  <div class="inner">
    <!-- 第一列 -->
    <div class="data_left01">
      <div class="dataAll maginS">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">光照折线图</div>
            <div class="data_chart" id="drawSunLineChart"></div>
          </div>
        </div>
      </div>
      <div class="dataAll">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">静力水准仪</div>
            <div class="data_chart" id="drawStaticLevelChart"></div>
          </div>
        </div>
      </div>
      <div class="dataAll">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">相对沉降</div>
            <div class="data_chart" id="drawSettleChart"></div>
          </div>
        </div>
      </div>
    </div>

    <!-- 第二列 -->
    <div class="data_left01">
      <div class="dataAll maginS">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">噪声柱状图</div>
            <div class="data_chart" id="chart21"></div>
          </div>
        </div>
      </div>
      <div class="dataAll">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">危险气体饼状图</div>
            <div class="data_chart" id="chart22"></div>
          </div>
        </div>
      </div>
      <div class="dataAll">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">xxxxxxx分析</div>
            <div class="data_chart" id="chart23"></div>
          </div>
        </div>
      </div>
    </div>

    <!-- 第三列 -->
    <div class="data_left02">
      <div class="dataAll01">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit2">危险气体传感器</div>

            <table class="table_data01">
              <tr>
                <td>总数</td>
                <td colspan="3" class="font01">56320</td>
              </tr>
              <tr>
                <td>xxxxxx数</td>
                <td colspan="3" class="font02">56320</td>
              </tr>
              <tr>
                <td>xxxxx数：</td>
                <td>10个</td>
                <td>类型数：</td>
                <td>6个</td>
              </tr>
              <tr>
                <td>xxxx最多数：</td>
                <td>16-20点</td>
                <td>xxxxx最多月：</td>
                <td>12月</td>
              </tr>
              <tr>
                <td>xxxxx最多季节：</td>
                <td>xxxx</td>
                <td>xxxxx天气：</td>
                <td>晴天</td>
              </tr>
              <tr>
                <td>xxxxxx：</td>
                <td>数据一</td>
                <td>xxxxxx：</td>
                <td>活动</td>
              </tr>
              <tr>
                <td>xxxxxx：</td>
                <td>数据二</td>
                <td>xxxxx特殊时间：</td>
                <td>暴雨天</td>
              </tr>
              <tr>
                <td>xxxxx：</td>
                <td colspan="3" style="color: red">xxxxxB</td>
              </tr>
              <tr>
                <td>xxxxx多季节：</td>
                <td colspan="3" style="color: red">冬季</td>
              </tr>
            </table>
          </div>
        </div>
      </div>
      <div class="dataAll02">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">螺栓松动传感器</div>
            <div class="data_chart" id="chart31"></div>
          </div>
        </div>
      </div>
    </div>

    <!-- 第四列 -->
    <div class="data_left01">
      <div class="dataAll maginS">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">空气成分饼状图</div>
            <div class="data_chart" id="chart41"></div>
          </div>
        </div>
      </div>
      <div class="dataAll">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">环境湿度折线图</div>
            <div class="data_chart" id="chart42"></div>
          </div>
        </div>
      </div>
      <div class="dataAll">
        <div class="dataAllBorder01">
          <div class="dataAllBorder02">
            <div class="data_tit1">气温仪表盘</div>
            <div class="data_chart" id="chart43"></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { put } from "../api/http";
let echarts = require("echarts");
import { getStaticLevel } from "../api/index";
export default {
  data() {
    return {
      current: 0,
      StaticLevelDatas: [],
    };
  },
  computed: {
    staticlevel() {
      return {
        datas: this.StaticLevelDatas[(this.current, this.current + 11)],
      };
    },
  },
  methods: {
    startMove() {
      let timer = setTimeout(() => {
        if (this.current === 37) {
          this.current = 0;
        } else {
          this.current += 1;
        }
        this.startMove();
      }, 1000); // 滚动不需要停顿则将2000改成动画持续时间
    },
    getNowStaticLevelData() {
      getStaticLevel()
        .then((res) => {
          // for (let i = 0; i < res.page.list.length; i++) {
          //   this.StaticLevelDatas.push(res.page.list[i].value);
          // }
          this.StaticLevelDatas.push(
            "[0.59,0.06,0.31,0.44,0.54,0.4,0.18,0.88,0.46,0.33,0.84,0.3]"
          );
          console.log("输出数据：" + this.StaticLevelDatas);
        })
        .catch((err) => {
          console.log("请求失败");
        });
    },
    drawSunLineChart() {
      let myChart = echarts.init(document.getElementById("drawSunLineChart"));
      var option = {
        tooltip: {
          //提示框，鼠标悬浮交互时的信息提示
          show: true,
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 30,
          y2: 40,
          borderWidth: 0,
        },
        legend: {
          data: [],
          orient: "vertical",
          textStyle: { fontWeight: "bold", color: "#a4a7ab" },
        },

        calculable: false,
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
            data: [
              "1",
              "2",
              "3",
              "4",
              "5",
              "6",
              "7",
              "8",
              "9",
              "10",
              "11",
              "12",
              "13",
              "14",
              "15",
              "16",
              "17",
              "18",
              "19",
              "20",
              "21",
              "22",
              "23",
              "24",
            ],
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
                align: "center",
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
                align: "right",
              },
            },
          },
        ],
        series: [
          {
            name: "",
            type: "line",
            stack: "24小时购买时间",
            data: [
              120,
              132,
              101,
              146,
              199,
              230,
              210,
              230,
              240,
              256,
              278,
              300,
              120,
              132,
              101,
              146,
              199,
              230,
              210,
              230,
              240,
              256,
              278,
              300,
            ],
            itemStyle: {
              normal: {
                color: "#02bcbc",
              },
            },
          },
        ],
      };

      myChart.setOption(option);
    },
    drawStaticLevelChart() {
      let myChart = echarts.init(
        document.getElementById("drawStaticLevelChart")
      );
      var option = {
        tooltip: {
          //提示框，鼠标悬浮交互时的信息提示
          show: true,
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 30,
          y2: 40,
          borderWidth: 0,
        },
        legend: {
          data: [],
          orient: "vertical",
          textStyle: { fontWeight: "bold", color: "#a4a7ab" },
        },

        calculable: false,
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
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
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
                align: "center",
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
                align: "right",
              },
            },
          },
        ],
        series: [
          {
            name: "",
            type: "line",
            stack: "订单数",
            data: this.StaticLevelDatas,
            data: [
              983,
              820,
              1236,
              930,
              1600,
              1032,
              890,
              1300,
              1921,
              984,
              1960,
              2630
            ],
            itemStyle: {
              normal: {
                color: "#02bcbc",
              },
            },
          },
        ],
      };
      myChart.setOption(option);
    },
    drawSettleChart() {
      let myChart = echarts.init(document.getElementById("drawSettleChart"));
      var option = {
        tooltip: {
          //提示框，鼠标悬浮交互时的信息提示
          show: true,
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 30,
          y2: 40,
          borderWidth: 0,
        },
        legend: {
          data: [],
          orient: "vertical",
          textStyle: { fontWeight: "bold", color: "#a4a7ab" },
        },

        calculable: false,
        xAxis: [
          {
            type: "category",
            boundaryGap: false,
            data: [
              "1",
              "2",
              "3",
              "4",
              "5",
              "6",
              "7",
              "8",
              "9",
              "10",
              "11",
              "12",
              "13",
              "14",
              "15",
              "16",
              "17",
              "18",
              "19",
              "20",
              "21",
              "22",
              "23",
              "24",
            ],
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
                align: "center",
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
                align: "right",
              },
            },
          },
        ],
        series: [
          {
            name: "",
            type: "line",
            stack: "24小时购买时间",
            data: [
              120,
              132,
              101,
              146,
              199,
              230,
              210,
              230,
              240,
              256,
              278,
              300,
              120,
              132,
              101,
              146,
              199,
              230,
              210,
              230,
              240,
              256,
              278,
              300,
            ],
            itemStyle: {
              normal: {
                color: "#02bcbc",
              },
            },
          },
        ],
      };

      myChart.setOption(option);
    },
    chart21() {
      let myChart = echarts.init(document.getElementById("chart21"));
      var option = {
        tooltip: {
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 30,
          y2: 40,
          borderWidth: 0,
        },
        legend: {
          data: ["白天", "晚上"],
          textStyle: {
            color: "#e9ebee",
          },
        },
        calculable: false,
        xAxis: [
          {
            type: "category",
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
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
                align: "center",
              },
              splitLine: {
                show: false,
              },
            },
          },
        ],
        yAxis: [
          {
            type: "value",
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: {
              show: false,
            },
          },
        ],
        series: [
          {
            name: "白天",
            type: "bar",
            data: [100, 80, 136, 150, 120, 56, 200, 162, 105, 63, 169, 236],
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
            name: "晚上",
            type: "bar",
            data: [
              983,
              820,
              1236,
              930,
              1600,
              1032,
              890,
              1300,
              1921,
              984,
              1960,
              2630,
            ],
            markPoint: {
              data: [
                {
                  name: "月最高",
                  value: 2630,
                  xAxis: 12,
                  yAxis: 2630,
                  symbolSize: 18,
                },
                { name: "月最低", value: 820, xAxis: 2, yAxis: 830 },
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
    chart22() {
      let myChart = echarts.init(document.getElementById("chart22"));
      let option = {
        legend: {
          orient: "vertical",
          x: "left",
          data: ["PM2.5", "PM10", "TVOC", "O2", "CO2"],
          textStyle: {
            color: "#e9ebee",
          },
        },
        toolbox: {
          show: true,
          feature: {
            mark: { show: true },
            dataView: { show: true, readOnly: false },
            magicType: {
              show: true,
              type: ["pie", "funnel"],
              option: {
                funnel: {
                  x: "25%",
                  width: "50%",
                  funnelAlign: "left",
                  max: 1548,
                },
              },
            },
            restore: { show: true },
            saveAsImage: { show: true },
          },
        },
        calculable: false,
        series: [
          {
            name: "套餐",
            type: "pie",
            radius: "55%",
            center: ["50%", "60%"],
            data: [
              {
                value: 335,
                name: "PM2.5",
                itemStyle: {
                  normal: {
                    color: "#1afffd",
                  },
                },
              },
              {
                value: 310,
                name: "PM10",
                itemStyle: {
                  normal: {
                    color: "#2e7cff",
                  },
                },
              },
              {
                value: 234,
                name: "TVOC",
                itemStyle: {
                  normal: {
                    color: "#ffcb89",
                  },
                },
              },
              {
                value: 135,
                name: "O2",
                itemStyle: {
                  normal: {
                    color: "#005ea1",
                  },
                },
              },
              {
                value: 1548,
                name: "Co2",
                itemStyle: {
                  normal: {
                    color: "#0ad5ff",
                  },
                },
              },
            ],
          },
        ],
      };
      myChart.setOption(option);
    },
    chart23() {
      let myChart = echarts.init(document.getElementById("chart23"));
      let option = {
        legend: {
          orient: "vertical",
          x: "left",
          data: [
            "数据1",
            "数据2",
            "数据3",
            "数据4",
            "数据5",
            "数据6",
            "数据7",
            "数据8",
          ],
          textStyle: {
            color: "#e9ebee",
          },
        },
        calculable: false,
        series: [
          {
            name: "面积模式",
            type: "pie",
            radius: "60%",
            center: ["50%", "50%"],
            roseType: "area",
            x: "20%", // for funnel
            max: 40, // for funnel
            sort: "ascending", // for funnel
            data: [
              {
                value: 10,
                name: "数据1",
                itemStyle: {
                  normal: {
                    color: "#45c0ff",
                  },
                },
              },
              {
                value: 5,
                name: "数据2",
                itemStyle: {
                  normal: {
                    color: "#e15828",
                  },
                },
              },
              {
                value: 15,
                name: "数据3",
                itemStyle: {
                  normal: {
                    color: "#ff81cb",
                  },
                },
              },
              {
                value: 25,
                name: "数据4",
                itemStyle: {
                  normal: {
                    color: "#2e7cff",
                  },
                },
              },
              {
                value: 20,
                name: "数据5",
                itemStyle: {
                  normal: {
                    color: "#feb602",
                  },
                },
              },
              {
                value: 35,
                name: "数据6",
                itemStyle: {
                  normal: {
                    color: "#ff7d0a",
                  },
                },
              },
              {
                value: 30,
                name: "数据7",
                itemStyle: {
                  normal: {
                    color: "#1afffd",
                  },
                },
              },
              {
                value: 40,
                name: "数据8",
                itemStyle: {
                  normal: {
                    color: "#2e7cff",
                  },
                },
              },
            ],
          },
        ],
      };
      myChart.setOption(option);
    },
    chart31() {
      let myChart = echarts.init(document.getElementById("chart31"));
      let option = {
        tooltip: {
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 30,
          y2: 20,
          borderWidth: 0,
        },
        calculable: false,
        xAxis: [
          {
            type: "category",
            data: ["周一", "周二", "周三", "周四", "周五", "周六", "周日"],
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#a4a7ab",
                align: "center",
              },
            },
          },
        ],
        yAxis: [
          {
            type: "value",
            name: "松动大小(mm)",
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: {
              show: false,
            },
          },
          {
            type: "value",
            name: "松动大小(mm)",
            axisLabel: {
              formatter: "{value} ",
              textStyle: {
                color: "#a4a7ab",
                align: "right",
              },
            },
            splitLine: {
              show: false,
            },
          },
        ],
        series: [
          {
            name: "畅通",
            type: "bar",
            stack: "车流量",
            data: [120, 132, 101, 134, 90, 230, 210],
            itemStyle: {
              normal: {
                color: "#ffcb89",
              },
            },
          },
          {
            name: "拥堵",
            type: "bar",
            stack: "车流量",
            data: [220, 232, 301, 234, 190, 330, 210],
            itemStyle: {
              normal: {
                color: "#005ea1",
              },
            },
          },

          {
            name: "订单量",
            type: "line",
            yAxisIndex: 1,
            data: [320, 232, 101, 134, 290, 230, 210],
            itemStyle: {
              normal: {
                color: "#0ad5ff",
              },
            },
          },
        ],
      };
      myChart.setOption(option);
    },
    chart41() {
      let myChart = echarts.init(document.getElementById("chart41"));
      let option = {
        legend: {
          orient: "vertical",
          x: "left",
          data: ["PM2.5", "PM10", "O2", "CO2"],
          textStyle: {
            color: "#e9ebee",
          },
        },
        calculable: false,
        series: [
          {
            type: "pie",
            radius: "70%",
            center: ["50%", "50%"],
            splitLine: { show: false },
            roseType: "area",
            x: "30%", // for funnel
            max: 40, // for funnel
            sort: "ascending", // for funnel
            data: [
              {
                value: 2560,
                name: "PM2.5",
                itemStyle: {
                  normal: {
                    color: "#2e7cff",
                  },
                },
              },
              {
                value: 3690,
                name: "PM10",
                itemStyle: {
                  normal: {
                    color: "#ffcb89",
                  },
                },
              },
              {
                value: 5690,
                name: "O2",
                itemStyle: {
                  normal: {
                    color: "#005ea1",
                  },
                },
              },
              {
                value: 6312,
                name: "CO2",
                itemStyle: {
                  normal: {
                    color: "#0ad5ff",
                  },
                },
              },
            ],
          },
        ],
      };
      myChart.setOption(option);
    },
    chart42() {
      let myChart = echarts.init(document.getElementById("chart42"));
      let option = {
        tooltip: {
          trigger: "axis",
        },
        grid: {
          x: 46,
          y: 30,
          x2: 30,
          y2: 20,
          borderWidth: 0,
        },

        calculable: false,
        xAxis: [
          {
            type: "category",
            splitLine: { show: false },
            data: ["周一", "周二", "周三", "周四", "周五", "周六", "周日"],
            axisLabel: {
              show: true,
              textStyle: {
                color: "#fff",
                align: "center",
              },
            },
          },
        ],
        yAxis: [
          {
            type: "value",
            position: "right",
            splitLine: { show: false },
            axisLabel: {
              show: true,
              textStyle: {
                color: "#fff",
                align: "center",
              },
            },
          },
        ],
        series: [
          {
            type: "bar",
            data: [320, 332, 301, 334, 390, 330, 320],
            itemStyle: {
              normal: {
                color: "#2e7cff",
              },
            },
          },
          {
            type: "bar",
            tooltip: { trigger: "item" },
            stack: "广告",
            data: [120, 132, 101, 134, 90, 230, 210],
            itemStyle: {
              normal: {
                color: "#feb602",
              },
            },
          },
          {
            type: "bar",
            tooltip: { trigger: "item" },
            stack: "广告",
            data: [220, 182, 191, 234, 290, 330, 310],
            itemStyle: {
              normal: {
                color: "#ffcb89",
              },
            },
          },
          {
            type: "bar",
            tooltip: { trigger: "item" },
            stack: "广告",
            data: [150, 232, 201, 154, 190, 330, 410],
            itemStyle: {
              normal: {
                color: "#005ea1",
              },
            },
          },
          {
            type: "line",
            data: [862, 1018, 964, 1026, 1679, 1600, 1570],
            itemStyle: {
              normal: {
                color: "#0ad5ff",
              },
            },
          },
          {
            type: "pie",
            tooltip: {
              trigger: "item",
              formatter: "{a} <br/>{b} : {c} ({d}%)",
            },
            center: [100, 80],
            radius: [0, 30],
            itemStyle: {
              normal: {
                labelLine: {
                  length: 20,
                },
              },
            },
            data: [
              {
                value: 1048,
                name: "因素一",
                itemStyle: {
                  normal: {
                    color: "#1afffd",
                  },
                },
              },
              {
                value: 251,
                name: "因素二",
                itemStyle: {
                  normal: {
                    color: "#2e7cff",
                  },
                },
              },
              {
                value: 147,
                name: "因素三",
                itemStyle: {
                  normal: {
                    color: "#ffcb89",
                  },
                },
              },
              {
                value: 102,
                name: "因素四",
                itemStyle: {
                  normal: {
                    color: "#005ea1",
                  },
                },
              },
            ],
          },
        ],
      };
      myChart.setOption(option);
    },
    chart43() {
      let myChart = echarts.init(document.getElementById("chart43"));
      let option = {
        series: [
          {
            type: "gauge",
            center: ["50%", "60%"],
            startAngle: 200,
            endAngle: -20,
            min: 0,
            max: 60,
            splitNumber: 12,
            itemStyle: {
              color: "#FFAB91",
            },
            progress: {
              show: true,
              width: 30,
            },

            pointer: {
              show: false,
            },
            axisLine: {
              lineStyle: {
                width: 30,
              },
            },
            axisTick: {
              distance: -45,
              splitNumber: 5,
              lineStyle: {
                width: 2,
                color: "#999",
              },
            },
            splitLine: {
              distance: -52,
              length: 14,
              lineStyle: {
                width: 3,
                color: "#999",
              },
            },
            axisLabel: {
              distance: -20,
              color: "#999",
              fontSize: 20,
            },
            anchor: {
              show: false,
            },
            title: {
              show: false,
            },
            detail: {
              valueAnimation: true,
              width: "60%",
              lineHeight: 40,
              height: "15%",
              borderRadius: 8,
              offsetCenter: [0, "-15%"],
              fontSize: 60,
              fontWeight: "bolder",
              formatter: "{value} °C",
              color: "auto",
            },
            data: [
              {
                value: 20,
              },
            ],
          },

          {
            type: "gauge",
            center: ["50%", "60%"],
            startAngle: 200,
            endAngle: -20,
            min: 0,
            max: 60,
            itemStyle: {
              color: "#FD7347",
            },
            progress: {
              show: true,
              width: 8,
            },

            pointer: {
              show: false,
            },
            axisLine: {
              show: false,
            },
            axisTick: {
              show: false,
            },
            splitLine: {
              show: false,
            },
            axisLabel: {
              show: false,
            },
            detail: {
              show: false,
            },
            data: [
              {
                value: 20,
              },
            ],
          },
        ],
      };
      myChart.setOption(option);
    },
  },
  mounted() {
    // 先读数据
    this.getNowStaticLevelData();
    // 生成统计图
    this.drawSunLineChart();
    this.drawStaticLevelChart();
    this.drawSettleChart();
    this.chart21();
    console.log(this.StaticLevelDatas);
    this.chart22();
    this.chart23();
    this.chart31();
    this.chart41();
    this.chart42();
    this.chart43();
    // this.startMove();
  },
};
</script>

<style scoped>
@import "../assets/css/security.scss";
</style>