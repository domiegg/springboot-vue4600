package com.dao;

import com.entity.ChufangjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChufangjiluVO;
import com.entity.view.ChufangjiluView;


/**
 * 处方记录
 * 
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface ChufangjiluDao extends BaseMapper<ChufangjiluEntity> {
	
	List<ChufangjiluVO> selectListVO(@Param("ew") Wrapper<ChufangjiluEntity> wrapper);
	
	ChufangjiluVO selectVO(@Param("ew") Wrapper<ChufangjiluEntity> wrapper);
	
	List<ChufangjiluView> selectListView(@Param("ew") Wrapper<ChufangjiluEntity> wrapper);

	List<ChufangjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ChufangjiluEntity> wrapper);

	
	ChufangjiluView selectView(@Param("ew") Wrapper<ChufangjiluEntity> wrapper);
	

}
