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


import com.dao.GuahaoquxiaoDao;
import com.entity.GuahaoquxiaoEntity;
import com.service.GuahaoquxiaoService;
import com.entity.vo.GuahaoquxiaoVO;
import com.entity.view.GuahaoquxiaoView;

@Service("guahaoquxiaoService")
public class GuahaoquxiaoServiceImpl extends ServiceImpl<GuahaoquxiaoDao, GuahaoquxiaoEntity> implements GuahaoquxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaoquxiaoEntity> page = this.selectPage(
                new Query<GuahaoquxiaoEntity>(params).getPage(),
                new EntityWrapper<GuahaoquxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaoquxiaoEntity> wrapper) {
		  Page<GuahaoquxiaoView> page =new Query<GuahaoquxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<GuahaoquxiaoVO> selectListVO(Wrapper<GuahaoquxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaoquxiaoVO selectVO(Wrapper<GuahaoquxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaoquxiaoView> selectListView(Wrapper<GuahaoquxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaoquxiaoView selectView(Wrapper<GuahaoquxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
