package com.dao;

import com.entity.GuahaoquxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuahaoquxiaoVO;
import com.entity.view.GuahaoquxiaoView;


/**
 * 挂号取消
 * 
 * @author 
 * @email 
 * @date 2024-03-07 14:38:28
 */
public interface GuahaoquxiaoDao extends BaseMapper<GuahaoquxiaoEntity> {
	
	List<GuahaoquxiaoVO> selectListVO(@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);
	
	GuahaoquxiaoVO selectVO(@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);
	
	List<GuahaoquxiaoView> selectListView(@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);

	List<GuahaoquxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);

	
	GuahaoquxiaoView selectView(@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);
	

}
