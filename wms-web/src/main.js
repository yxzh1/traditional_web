import Vue from 'vue'
import App from './App.vue'

import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

import VueRouter from 'vue-router'
import router from "@/router";
import store from '@/store';
// import './assets/global.css';
import axios from "axios";
//qs工具
import qs from 'qs';
//粒子特效
import VueParticles from 'vue-particles';

/*图片懒加载*/
import VueLazyload from 'vue-lazyload';
Vue.use(VueLazyload, {		//options配置项
  preLoad: 1.5,
  error: require('./assets/images/common/404.jpg'),
  loading: require('./assets/images/common/loading.gif'),
  attempt: 5
})

/*使用hover.css*/
import hover from "hover.css"
Vue.use(hover);


Vue.prototype.$axios=axios;
Vue.prototype.$qs=qs;
Vue.prototype.$httpsUrl='http://localhost:8090';

Vue.config.productionTip = false

//前端解决跨域问题
axios.defaults.withCredentials = true;

Vue.use(VueParticles)
Vue.use(ElementUI);
Vue.use(VueRouter);

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')
