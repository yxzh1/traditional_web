import Vue from 'vue'
import Vuex from 'vuex'
// import router,{resetRouter} from "@/router";
import createPersistedState from "vuex-persistedstate"
Vue.use(Vuex)
export default new Vuex.Store({
    state: {
        login_user: {},
    },
    mutations: {
        setUser(state,login_user) {
            state.login_user = login_user
        },
        removeLoginUser(state){
            state.login_user = {};
        },
    },
    // actions: {
    // },
    // getters: {
    // },
    plugins: [createPersistedState()]
})