<template>
  <el-container>
    <el-header>
      <div class="index_nav">
        <ul style="height: 30px; margin-bottom: 0px">
          <li class="l_left total_chose_fr nav_active" @click="goMonitor">
            实时监测
          </li>
          <li class="l_left total_chose_pl" @click="goSecurity">
            码头安全风险
          </li>
          <li class="l_left total_chose_pl" @click="goSmartShip">智能船舶</li>
          <li class="r_right total_chose_pl" @click="goSetting">设置</li>
          <li class="r_right total_chose_pl" @click="goEvalu">预警评估决策</li>
          <li class="r_right total_chose_pl" @click="goInvasion">周界入侵</li>
        </ul>
      </div>
    </el-header>
    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>
import { mapGetters } from "vuex";
export default {
  computed: {
    ...mapGetters([
      'activeName'
    ])
  },
  methods: {
    goMonitor() {
      this.$store.commit("setActiveName", "monitor");
      this.$router.push({ path: "/monitor" });
    },
    goSecurity() {
      this.$store.commit("setActiveName", "security");
      this.$router.push({ path: "/security" });
    },
    goSmartShip() {
      this.$store.commit("setActiveName", "smartShip");
      this.$router.push({ path: "/smartShip" });
    },
    goSetting() {
      this.$store.commit("setActiveName", "setting");
      // this.$router.push({ path: "/setting" });
      this.$router.push({ path: "/login-in" });
    },
    goEvalu() {
      let url="http://47.105.94.123:8091/hgy/";
      window.location.href = url;
      // this.$store.commit("setActiveName", "evaluation");
      // this.$router.push({ path: "/evaluation" });
    },
    goInvasion() {
      this.$store.commit("setActiveName", "invasion");
      this.$router.push({ path: "/invasion" });
    },
  },
};
</script>

<style scoped>
.el-container {
  background: url("assets/img/bg03.jpg");
  background-size: 100% 100%;
  margin: 0;
  padding: 0%;
  height: 100%;
  position: fixed;
  width: 100%;
}
.el-header {
  width: 100%;
  color: #333;
  line-height: 15px;
}
.el-main {
  margin: 0;
  padding-top: 0;
  width: 100%;
}
.index_nav ul li {
  font-size: 1em;
  color: #fff;
  opacity: 0.8;
  padding-top: 8px;
  padding-left: 10px;
  padding-right: 10px;
  padding-bottom: 5px;
  cursor: pointer;
  text-shadow: 0 6px 8px #00225b;
  list-style-type: none;
}
.index_nav ul .l_left {
  margin-left: 3%;
}
.index_nav ul .r_right {
  margin-right: 3%;
}
.index_nav ul li:hover {
  opacity: 1;
}
.l_left {
  float: left;
}
.r_right {
  float: right;
}
</style>
