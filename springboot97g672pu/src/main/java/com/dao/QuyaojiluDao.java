package com.dao;

import com.entity.QuyaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuyaojiluVO;
import com.entity.view.QuyaojiluView;


/**
 * 取药记录
 * 
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface QuyaojiluDao extends BaseMapper<QuyaojiluEntity> {
	
	List<QuyaojiluVO> selectListVO(@Param("ew") Wrapper<QuyaojiluEntity> wrapper);
	
	QuyaojiluVO selectVO(@Param("ew") Wrapper<QuyaojiluEntity> wrapper);
	
	List<QuyaojiluView> selectListView(@Param("ew") Wrapper<QuyaojiluEntity> wrapper);

	List<QuyaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<QuyaojiluEntity> wrapper);

	
	QuyaojiluView selectView(@Param("ew") Wrapper<QuyaojiluEntity> wrapper);
	

}
