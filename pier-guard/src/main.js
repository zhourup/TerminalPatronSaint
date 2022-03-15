// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store/index'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import BaiduMap from 'vue-baidu-map'
import echarts from 'echarts'

Vue.prototype.$echarts = echarts;

Vue.use(ElementUI);

Vue.use(BaiduMap, {
  ak: 'http://api.map.baidu.com/api?v=2.0&ak=UVMduWvULCrnMvp4YpSzbnFu8ekAh46e'
})

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
