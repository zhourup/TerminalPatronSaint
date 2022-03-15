import Vue from 'vue'
import Vuex from 'vuex'
import configure from './configure'

Vue.use(Vuex)

const store = new Vuex.Store({
    modules: {
        configure,
    }
})

export default store