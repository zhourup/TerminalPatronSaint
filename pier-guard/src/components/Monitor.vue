<template>
  <div class="inner" style="height: 100%">
    <div class="left_cage">
      <div
        class="dataAllBorder01 cage_cl"
        style="margin-top: 2% !important; height: 35%"
      >
        <img class="dataAllBorder02 video_cage" style="margin:15%;width: 60%;height: 60%" src="../assets/img/logo1.jpg" />
      </div>
      <div
        class="dataAllBorder01 cage_cl"
        style="margin-top: 1.5% !important; height: 41%"
      >
        <div class="dataAllBorder02 video_cage">
          <img class="video_around" src="../assets/img/img1.jpg" />
          <img class="video_around" src="../assets/img/img2.jpg" />
          <img class="video_around" src="../assets/img/img3.jpg" />
          <img class="video_around" src="../assets/img/img4.jpg" />
        </div>
      </div>
      <div
        class="dataAllBorder01 cage_cl"
        style="margin-top: 1.5% !important; height: 23%; position: relative"
      >
        <div class="dataAllBorder02" style="padding: 1.2%; overflow: hidden">
          <div class="message_scroll_box">
            <div class="message_scroll">
              <div class="scroll_top">
                <span class="scroll_title">数据流量警示</span>
                <span class="scroll_level scroll_level01">一级</span>
                <a class="localize"></a>
                <span class="scroll_timer">17-09-13/9:52</span>
              </div>
              <div class="msg_cage">
                <a class="localize_title">风速</a>
              </div>
              <div class="msg_cage">
                <a class="localize_msg">风速传感器</a>
              </div>
            </div>
            <div class="message_scroll">
              <div class="scroll_top">
                <span class="scroll_title">数据流量警示</span>
                <span class="scroll_level scroll_level03">三级</span>
                <a class="localize"></a>
                <span class="scroll_timer">17-09-13/9:52</span>
              </div>
              <div class="msg_cage">
                <a class="localize_title">风速</a>
              </div>
              <div class="msg_cage">
                <a class="localize_msg">风速传感器</a>
              </div>
            </div>
            <!-- <div class="message_scroll">
              <div class="scroll_top">
                <span class="scroll_title">数据流量警示</span>
                <span class="scroll_level scroll_level02">二级</span>
                <a class="localize"></a>
                <span class="scroll_timer">17-09-13/9:52</span>
              </div>
              <div class="msg_cage">
                <a class="localize_title">风速传感器</a>
              </div>
              <div class="msg_cage">
                <a class="localize_msg">风速传感器</a>
              </div>
            </div> -->
            <!-- <div class="message_scroll">
              <div class="scroll_top">
                <span class="scroll_title">数据流量警示</span>
                <span class="scroll_level scroll_level01">一级</span>
                <a class="localize"></a>
                <span class="scroll_timer">17-09-13/9:52</span>
              </div>
              <div class="msg_cage">
                <a class="localize_title">风速</a>
              </div>
              <div class="msg_cage">
                <a class="localize_msg">风速传感器</a>
              </div>
            </div>-->
          </div>
        </div>
      </div>
    </div>

    <!-- center -->
    <div class="center_cage">
      <div
        class="dataAllBorder01 cage_cl"
        style="margin-top: 1% !important; height: 65.7%; position: relative"
      >
      <!-- <map-view></map-view> -->
      <img class="video_around" src="../assets/img/img_center.jpg" style="width:100%;height: 100%;"/>
      </div>
      <div
        class="dataAllBorder01 cage_cl"
        style="margin-top: 0.6% !important; height: 33.3%"
      >
        <div
          class="dataAllBorder02"
          style="position: relative; overflow: hidden"
        >
          <div class="map_title_box" style="height: 6%">
            <div class="map_title_innerbox">
              <div class="map_title">分析数据</div>
            </div>
          </div>
          <table
            id="table"
            style="width: 100%; margin-top: 10px"
            class="table table-bordered"
          >
            <thead>
              <tr>
                <th style="width: 15%">降雨量</th>
                <th style="width: 15%">水深</th>
                <th style="width: 15%">水向</th>
                <th style="width: 15%">危险气体</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td style="padding-left: 11% !important">300</td>
                <td style="padding-left: 11% !important">15m</td>
                <td style="padding-left: 11% !important">东北</td>
                <td style="padding-left: 10% !important">CO、H2</td>
              </tr>
              <tr>
                <td style="padding-left: 11% !important">300</td>
                <td style="padding-left: 11% !important">15m</td>
                <td style="padding-left: 11% !important">东北</td>
                <td style="padding-left: 10% !important">CO、H2</td>
              </tr>
              <tr>
                <td style="padding-left: 11% !important">300</td>
                <td style="padding-left: 11% !important">15m</td>
                <td style="padding-left: 11% !important">东北</td>
                <td style="padding-left: 10% !important">CO、H2</td>
              </tr>
              <tr>
                <td style="padding-left: 11% !important">300</td>
                <td style="padding-left: 11% !important">15m</td>
                <td style="padding-left: 11% !important">东北</td>
                <td style="padding-left: 10% !important">CO、H2</td>
              </tr>
            </tbody>
          </table>
          <div class="textBox">
            <transition name="slide">
              <p class="text" :key="text.id">{{ text.val }}</p>
            </transition>
          </div>
        </div>
      </div>
    </div>

    <!-- right -->
    <div class="right_cage">
      <!--顶格-->
      <div
        class="dataAllBorder01 cage_cl"
        style="margin-top: 2.5% !important; height: 24%"
      >
        <div class="dataAllBorder02" id="cage_cl">
          <div class="analysis">实时监测：</div>
          <ul class="data_show_box">
            <li class="data_cage">0</li>
            <li class="data_cage">0</li>
            <li class="data_cage" style="background-image: none">,</li>
            <li class="data_cage">0</li>
            <li class="data_cage">0</li>
            <li class="data_cage">2</li>
          </ul>
          <div class="depart_number_box">
            <ul class="depart_number_cage">
              <li class="depart_name" @click="handleTest">风速：</li>
              <li class="depart_number">{{ wind.speed }}</li>
            </ul>
            <ul class="depart_number_cage">
              <li class="depart_name">水速：</li>
              <li class="depart_number">{{ water.speed }}</li>
            </ul>
            <ul class="depart_number_cage" style="margin-bottom: 0px">
              <li class="depart_name">风向：</li>
              <li class="depart_number">{{ wind.dir }}</li>
            </ul>
            <ul class="depart_number_cage" style="margin-bottom: 0px">
              <li class="depart_name">温度：</li>
              <li class="depart_number">{{ temperature.val }}</li>
            </ul>
          </div>
        </div>
      </div>

      <!-- 中间格 -->
      <div
        class="dataAllBorder01 cage_cl check_increase"
        style="margin-top: 1.5% !important; height: 41%"
      >
        <div class="dataAllBorder02 over_hide dataAllBorder20" id="over_hide">
          <table class="table table-bordered">
            <thead>
              <tr>
                <th style="width: 13%">名称</th>
                <th>归属</th>
                <th>阈值</th>
                <th>范围</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
            </tbody>
          </table>
          <table class="table table-bordered">
            <thead>
              <tr>
                <th style="width: 13%">名称</th>
                <th>归属</th>
                <th>阈值</th>
                <th>范围(r=?)</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>200-500</td>
              </tr>
              <tr>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>xxxxxxx</td>
                <td>-</td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>

      <!-- 底格 -->
      <div
        class="dataAllBorder01 cage_cl check_decrease"
        style="margin-top: 1.5% !important; height: 33%; position: relative"
      >
        <div class="dataAllBorder02 over_hide" style="padding: 1.2%">
          <div class="analysis">危险气体构成因素占比：</div>
          <div class="danger_depart_box">
            <ul class="danger_depart">
              <li class="danger_ico" style="background-position-x: 0px">
                <img src="../assets/img/pic_ico_01.png" />
              </li>
              <li class="data_name">综合危险指数</li>
              <li class="data data01">652</li>
              <li class="data data02">↑ 1.2%</li>
            </ul>
            <ul class="danger_depart">
              <li class="danger_ico" style="background-position-x: 0px">
                <img src="../assets/img/pic_ico_02.png" />
              </li>
              <li class="data_name">统计一</li>
              <li class="data data01">97</li>
              <li class="data data02" style="color: #ff2865">↓ 0.3%</li>
            </ul>
            <ul class="danger_depart danger_depart01">
              <li class="danger_ico" style="background-position-x: 0px">
                <img src="../assets/img/pic_ico_03.png" />
              </li>
              <li class="data_name">统计二</li>
              <li class="data data01">423</li>
              <li class="data data02">↑ 1%</li>
            </ul>
            <ul class="danger_depart danger_depart01">
              <li class="danger_ico" style="background-position-x: 0px">
                <img src="../assets/img/pic_ico_01.png" />
              </li>
              <li class="data_name">统计三</li>
              <li class="data data01">218</li>
              <li class="data data02">↑ 0.3%</li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import mapView from './mapView'
import {
  getWindSpeed,
  getWaterSpeed,
  getWindDirect,
  getTemperature,
} from "../api/index";
import { goTest } from "../assets/js/monitor";
export default {
  components: {mapView},
  data() {
    return {
      textArr: [
        "1 第一条公告",
        "2 第二条公告第二条公告",
        "3 第三条公告第三条公告第三条公告",
      ],
      number: 0,
      current: 0,
      WindDatas: [],
      WaterDatas: [],
      TemperatureDatas: [],
      WindDirectDatas: [],
    };
  },
  computed: {
    text() {
      return {
        id: this.number,
        val: this.textArr[this.number],
      };
    },
    wind() {
      return {
        speed: this.WindDatas.page.list[this.current].value,
        dir: this.WindDirectDatas.page.list[this.current].value,
      };
    },
    water() {
      return {
        speed: this.WaterDatas.page.list[this.current].value,
      };
    },
    temperature() {
      return {
        val: this.TemperatureDatas.page.list[this.current].value,
      };
    },
  },
  created() {
  },
  beforeMount() {},
  mounted() {
    this.getNowWindSpeed();
    this.getNowWaterSpeed();
    this.getNowTemperature();
    this.getNowWindDirect();
    this.startUpdate();
    this.startMove();
    // this.getMap();
  },
  beforeUpdate() {},
  methods: {
    getMap() {
      var map = new BMap.Map("map");
      map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
      map.addControl(
        new BMap.MapTypeControl({
          mapTypes: [BMAP_NORMAL_MAP, BMAP_HYBRID_MAP],
        })
      );
      var mapStyle = {
        style: "dark",
      };
      map.setMapStyle(mapStyle);
      map.setCurrentCity("北京");
      map.enableScrollWheelZoom(true);
    },
    handleTest() {
      goTest();
      console.log("风速数据：");
    },
    startMove() {
      let timer = setTimeout(() => {
        if (this.number === 2) {
          this.number = 0;
        } else {
          this.number += 1;
        }
        this.startMove();
      }, 2000); // 滚动不需要停顿则将2000改成动画持续时间
    },
    startUpdate() {
      let timer = setTimeout(() => {
        if (this.current === 20) {
          this.current = 0;
        } else {
          this.current += 1;
        }
        this.startUpdate();
      }, 1000);
    },
    getNowWindSpeed() {
      getWindSpeed()
        .then((res) => {
          this.WindDatas = res;
        })
        .catch((err) => {
          console.log("请求失败");
        });
    },
    getNowWaterSpeed() {
      getWaterSpeed()
        .then((res) => {
          this.WaterDatas = res;
        })
        .catch((err) => {
          console.log("请求失败");
        });
    },
    getNowTemperature() {
      getTemperature()
        .then((res) => {
          this.TemperatureDatas = res;
        })
        .catch((err) => {
          console.log("请求失败");
        });
    },
    getNowWindDirect() {
      getWindDirect()
        .then((res) => {
          this.WindDirectDatas = res;
        })
        .catch((err) => {
          console.log("请求失败");
        });
    },
  },
};
</script>

<style scoped>
@import "../assets/css/monitor.scss";
</style>

