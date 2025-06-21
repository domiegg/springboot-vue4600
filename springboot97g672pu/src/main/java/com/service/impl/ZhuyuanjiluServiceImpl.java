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


import com.dao.ZhuyuanjiluDao;
import com.entity.ZhuyuanjiluEntity;
import com.service.ZhuyuanjiluService;
import com.entity.vo.ZhuyuanjiluVO;
import com.entity.view.ZhuyuanjiluView;

@Service("zhuyuanjiluService")
public class ZhuyuanjiluServiceImpl extends ServiceImpl<ZhuyuanjiluDao, ZhuyuanjiluEntity> implements ZhuyuanjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuyuanjiluEntity> page = this.selectPage(
                new Query<ZhuyuanjiluEntity>(params).getPage(),
                new EntityWrapper<ZhuyuanjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuyuanjiluEntity> wrapper) {
		  Page<ZhuyuanjiluView> page =new Query<ZhuyuanjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhuyuanjiluVO> selectListVO(Wrapper<ZhuyuanjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuyuanjiluVO selectVO(Wrapper<ZhuyuanjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuyuanjiluView> selectListView(Wrapper<ZhuyuanjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuyuanjiluView selectView(Wrapper<ZhuyuanjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
