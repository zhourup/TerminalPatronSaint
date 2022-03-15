import Vue from 'vue'
import Router from 'vue-router'
import Monitor from '@/components/Monitor'
import Security from '@/components/Security'
import SmartShip from '@/components/SmartShip'
import Setting from '@/components/Setting'
import Evaluation from '@/components/Evaluation'
import Invasion from '@/components/Invasion'
import LoginIn from '@/components/LoginIn'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Monitor',
      component: Monitor
    },
    {
      path: '/monitor',
      name: 'Monitor',
      component: Monitor
    },
    {
      path: '/security',
      name: 'security',
      component: Security
    },
    {
      path: '/smartShip',
      name: 'smartShip',
      component: SmartShip
    },
    {
      path: '/setting',
      name: 'setting',
      component: Setting
    },
    {
      path: '/evaluation',
      name: 'evaluation',
      component: Evaluation
    },
    {
      path: '/invasion',
      name: 'invasion',
      component: Invasion
    },
    {
      path: '/login-in',
      name: 'login-in',
      component: LoginIn
    },
  ]
})
