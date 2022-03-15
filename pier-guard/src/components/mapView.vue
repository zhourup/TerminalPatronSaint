<template>
  <div class="dataAllBorder02" style="position: relative; overflow: hidden">
    <!--标题栏-->
    <div class="map_title_box" style="height: 4%">
      <div class="map_title_innerbox">
        <div class="map_title">实时地图</div>
      </div>
    </div>
    <!-- 地图 -->
    <div class="map" id="map"></div>
  </div>
</template>

<script>
export default {
  name: "mapView",
  mounted() {
    this.getMap();
  },
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
  },
};
</script>

<style>
.dataAllBorder02 {
  width: 100%;
  height: 100%;
  box-sizing: border-box;
  border: 2px solid #016ae0;
  border-radius: 10px;
}
.map_title_box {
  height: 11%;
  width: 100%;
  top: 0px;
  left: 0px;
  background-color: rgba(17, 25, 69, 0.1);
  border-radius: 11px 11px 0px 0px;
  position: relative;
}
.map_title_innerbox {
  position: absolute;
  top: -4px;
  width: 100%;
}
.map_title {
  width: 358px;
  background-image: url("../assets/img/first_title.png");
  background-repeat: no-repeat;
  margin: auto;
  height: 28px;
  text-align: center;
  color: white;
  font-size: 14px;
  font-family: "Microsoft YaHei";
  font-weight: bold;
}
.map {
  width: 100%;
  height: 104%;
  background-repeat: no-repeat;
  background-position-x: -300px;
  background-position-y: -200px;
  border-radius: 0px 0px 8px 8px;
  position: relative;
  overflow: hidden;
  cursor: move;
}
</style>