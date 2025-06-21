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


import com.dao.ChufangjiluDao;
import com.entity.ChufangjiluEntity;
import com.service.ChufangjiluService;
import com.entity.vo.ChufangjiluVO;
import com.entity.view.ChufangjiluView;

@Service("chufangjiluService")
public class ChufangjiluServiceImpl extends ServiceImpl<ChufangjiluDao, ChufangjiluEntity> implements ChufangjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChufangjiluEntity> page = this.selectPage(
                new Query<ChufangjiluEntity>(params).getPage(),
                new EntityWrapper<ChufangjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChufangjiluEntity> wrapper) {
		  Page<ChufangjiluView> page =new Query<ChufangjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChufangjiluVO> selectListVO(Wrapper<ChufangjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChufangjiluVO selectVO(Wrapper<ChufangjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChufangjiluView> selectListView(Wrapper<ChufangjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChufangjiluView selectView(Wrapper<ChufangjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
