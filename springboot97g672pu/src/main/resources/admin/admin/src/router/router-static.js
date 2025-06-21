import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import huanzhe from '@/views/modules/huanzhe/list'
    import guahaoquxiao from '@/views/modules/guahaoquxiao/list'
    import keshi from '@/views/modules/keshi/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import quyaojilu from '@/views/modules/quyaojilu/list'
    import yuyueguahao from '@/views/modules/yuyueguahao/list'
    import chuangweixinxi from '@/views/modules/chuangweixinxi/list'
    import chufangjilu from '@/views/modules/chufangjilu/list'
    import yaopinleixing from '@/views/modules/yaopinleixing/list'
    import yisheng from '@/views/modules/yisheng/list'
    import zuozhenyisheng from '@/views/modules/zuozhenyisheng/list'
    import config from '@/views/modules/config/list'
    import dianzibingli from '@/views/modules/dianzibingli/list'
    import zhuyuanjilu from '@/views/modules/zhuyuanjilu/list'
    import newstype from '@/views/modules/newstype/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告栏',
        component: news
      }
      ,{
	path: '/huanzhe',
        name: '患者',
        component: huanzhe
      }
      ,{
	path: '/guahaoquxiao',
        name: '挂号取消',
        component: guahaoquxiao
      }
      ,{
	path: '/keshi',
        name: '科室',
        component: keshi
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/quyaojilu',
        name: '取药记录',
        component: quyaojilu
      }
      ,{
	path: '/yuyueguahao',
        name: '预约挂号',
        component: yuyueguahao
      }
      ,{
	path: '/chuangweixinxi',
        name: '床位信息',
        component: chuangweixinxi
      }
      ,{
	path: '/chufangjilu',
        name: '处方记录',
        component: chufangjilu
      }
      ,{
	path: '/yaopinleixing',
        name: '药品类型',
        component: yaopinleixing
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/zuozhenyisheng',
        name: '坐诊医生',
        component: zuozhenyisheng
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/dianzibingli',
        name: '电子病历',
        component: dianzibingli
      }
      ,{
	path: '/zhuyuanjilu',
        name: '住院记录',
        component: zhuyuanjilu
      }
      ,{
	path: '/newstype',
        name: '公告栏分类',
        component: newstype
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
