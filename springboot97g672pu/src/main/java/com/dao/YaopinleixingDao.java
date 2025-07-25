package com.dao;

import com.entity.YaopinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaopinleixingVO;
import com.entity.view.YaopinleixingView;


/**
 * 药品类型
 * 
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface YaopinleixingDao extends BaseMapper<YaopinleixingEntity> {
	
	List<YaopinleixingVO> selectListVO(@Param("ew") Wrapper<YaopinleixingEntity> wrapper);
	
	YaopinleixingVO selectVO(@Param("ew") Wrapper<YaopinleixingEntity> wrapper);
	
	List<YaopinleixingView> selectListView(@Param("ew") Wrapper<YaopinleixingEntity> wrapper);

	List<YaopinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YaopinleixingEntity> wrapper);

	
	YaopinleixingView selectView(@Param("ew") Wrapper<YaopinleixingEntity> wrapper);
	

}
