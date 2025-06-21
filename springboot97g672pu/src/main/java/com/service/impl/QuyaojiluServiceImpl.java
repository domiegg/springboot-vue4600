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


import com.dao.QuyaojiluDao;
import com.entity.QuyaojiluEntity;
import com.service.QuyaojiluService;
import com.entity.vo.QuyaojiluVO;
import com.entity.view.QuyaojiluView;

@Service("quyaojiluService")
public class QuyaojiluServiceImpl extends ServiceImpl<QuyaojiluDao, QuyaojiluEntity> implements QuyaojiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuyaojiluEntity> page = this.selectPage(
                new Query<QuyaojiluEntity>(params).getPage(),
                new EntityWrapper<QuyaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuyaojiluEntity> wrapper) {
		  Page<QuyaojiluView> page =new Query<QuyaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QuyaojiluVO> selectListVO(Wrapper<QuyaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuyaojiluVO selectVO(Wrapper<QuyaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuyaojiluView> selectListView(Wrapper<QuyaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuyaojiluView selectView(Wrapper<QuyaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
