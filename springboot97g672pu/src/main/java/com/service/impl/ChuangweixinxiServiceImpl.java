package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChuangweixinxiDao;
import com.entity.ChuangweixinxiEntity;
import com.service.ChuangweixinxiService;
import com.entity.vo.ChuangweixinxiVO;
import com.entity.view.ChuangweixinxiView;

@Service("chuangweixinxiService")
public class ChuangweixinxiServiceImpl extends ServiceImpl<ChuangweixinxiDao, ChuangweixinxiEntity> implements ChuangweixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangweixinxiEntity> page = this.selectPage(
                new Query<ChuangweixinxiEntity>(params).getPage(),
                new EntityWrapper<ChuangweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangweixinxiEntity> wrapper) {
		  Page<ChuangweixinxiView> page =new Query<ChuangweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChuangweixinxiVO> selectListVO(Wrapper<ChuangweixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangweixinxiVO selectVO(Wrapper<ChuangweixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangweixinxiView> selectListView(Wrapper<ChuangweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangweixinxiView selectView(Wrapper<ChuangweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
