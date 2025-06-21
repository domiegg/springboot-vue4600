import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import huanzheList from '../pages/huanzhe/list'
import huanzheDetail from '../pages/huanzhe/detail'
import huanzheAdd from '../pages/huanzhe/add'
import yishengList from '../pages/yisheng/list'
import yishengDetail from '../pages/yisheng/detail'
import yishengAdd from '../pages/yisheng/add'
import keshiList from '../pages/keshi/list'
import keshiDetail from '../pages/keshi/detail'
import keshiAdd from '../pages/keshi/add'
import zuozhenyishengList from '../pages/zuozhenyisheng/list'
import zuozhenyishengDetail from '../pages/zuozhenyisheng/detail'
import zuozhenyishengAdd from '../pages/zuozhenyisheng/add'
import yuyueguahaoList from '../pages/yuyueguahao/list'
import yuyueguahaoDetail from '../pages/yuyueguahao/detail'
import yuyueguahaoAdd from '../pages/yuyueguahao/add'
import guahaoquxiaoList from '../pages/guahaoquxiao/list'
import guahaoquxiaoDetail from '../pages/guahaoquxiao/detail'
import guahaoquxiaoAdd from '../pages/guahaoquxiao/add'
import dianzibingliList from '../pages/dianzibingli/list'
import dianzibingliDetail from '../pages/dianzibingli/detail'
import dianzibingliAdd from '../pages/dianzibingli/add'
import chufangjiluList from '../pages/chufangjilu/list'
import chufangjiluDetail from '../pages/chufangjilu/detail'
import chufangjiluAdd from '../pages/chufangjilu/add'
import quyaojiluList from '../pages/quyaojilu/list'
import quyaojiluDetail from '../pages/quyaojilu/detail'
import quyaojiluAdd from '../pages/quyaojilu/add'
import yaopinleixingList from '../pages/yaopinleixing/list'
import yaopinleixingDetail from '../pages/yaopinleixing/detail'
import yaopinleixingAdd from '../pages/yaopinleixing/add'
import yaopinxinxiList from '../pages/yaopinxinxi/list'
import yaopinxinxiDetail from '../pages/yaopinxinxi/detail'
import yaopinxinxiAdd from '../pages/yaopinxinxi/add'
import chuangweixinxiList from '../pages/chuangweixinxi/list'
import chuangweixinxiDetail from '../pages/chuangweixinxi/detail'
import chuangweixinxiAdd from '../pages/chuangweixinxi/add'
import zhuyuanjiluList from '../pages/zhuyuanjilu/list'
import zhuyuanjiluDetail from '../pages/zhuyuanjilu/detail'
import zhuyuanjiluAdd from '../pages/zhuyuanjilu/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'huanzhe',
					component: huanzheList
				},
				{
					path: 'huanzheDetail',
					component: huanzheDetail
				},
				{
					path: 'huanzheAdd',
					component: huanzheAdd
				},
				{
					path: 'yisheng',
					component: yishengList
				},
				{
					path: 'yishengDetail',
					component: yishengDetail
				},
				{
					path: 'yishengAdd',
					component: yishengAdd
				},
				{
					path: 'keshi',
					component: keshiList
				},
				{
					path: 'keshiDetail',
					component: keshiDetail
				},
				{
					path: 'keshiAdd',
					component: keshiAdd
				},
				{
					path: 'zuozhenyisheng',
					component: zuozhenyishengList
				},
				{
					path: 'zuozhenyishengDetail',
					component: zuozhenyishengDetail
				},
				{
					path: 'zuozhenyishengAdd',
					component: zuozhenyishengAdd
				},
				{
					path: 'yuyueguahao',
					component: yuyueguahaoList
				},
				{
					path: 'yuyueguahaoDetail',
					component: yuyueguahaoDetail
				},
				{
					path: 'yuyueguahaoAdd',
					component: yuyueguahaoAdd
				},
				{
					path: 'guahaoquxiao',
					component: guahaoquxiaoList
				},
				{
					path: 'guahaoquxiaoDetail',
					component: guahaoquxiaoDetail
				},
				{
					path: 'guahaoquxiaoAdd',
					component: guahaoquxiaoAdd
				},
				{
					path: 'dianzibingli',
					component: dianzibingliList
				},
				{
					path: 'dianzibingliDetail',
					component: dianzibingliDetail
				},
				{
					path: 'dianzibingliAdd',
					component: dianzibingliAdd
				},
				{
					path: 'chufangjilu',
					component: chufangjiluList
				},
				{
					path: 'chufangjiluDetail',
					component: chufangjiluDetail
				},
				{
					path: 'chufangjiluAdd',
					component: chufangjiluAdd
				},
				{
					path: 'quyaojilu',
					component: quyaojiluList
				},
				{
					path: 'quyaojiluDetail',
					component: quyaojiluDetail
				},
				{
					path: 'quyaojiluAdd',
					component: quyaojiluAdd
				},
				{
					path: 'yaopinleixing',
					component: yaopinleixingList
				},
				{
					path: 'yaopinleixingDetail',
					component: yaopinleixingDetail
				},
				{
					path: 'yaopinleixingAdd',
					component: yaopinleixingAdd
				},
				{
					path: 'yaopinxinxi',
					component: yaopinxinxiList
				},
				{
					path: 'yaopinxinxiDetail',
					component: yaopinxinxiDetail
				},
				{
					path: 'yaopinxinxiAdd',
					component: yaopinxinxiAdd
				},
				{
					path: 'chuangweixinxi',
					component: chuangweixinxiList
				},
				{
					path: 'chuangweixinxiDetail',
					component: chuangweixinxiDetail
				},
				{
					path: 'chuangweixinxiAdd',
					component: chuangweixinxiAdd
				},
				{
					path: 'zhuyuanjilu',
					component: zhuyuanjiluList
				},
				{
					path: 'zhuyuanjiluDetail',
					component: zhuyuanjiluDetail
				},
				{
					path: 'zhuyuanjiluAdd',
					component: zhuyuanjiluAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
