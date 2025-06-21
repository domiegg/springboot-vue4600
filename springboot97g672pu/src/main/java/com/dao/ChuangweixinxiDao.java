package com.dao;

import com.entity.ChuangweixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangweixinxiVO;
import com.entity.view.ChuangweixinxiView;


/**
 * 床位信息
 * 
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface ChuangweixinxiDao extends BaseMapper<ChuangweixinxiEntity> {
	
	List<ChuangweixinxiVO> selectListVO(@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);
	
	ChuangweixinxiVO selectVO(@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);
	
	List<ChuangweixinxiView> selectListView(@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);

	List<ChuangweixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);

	
	ChuangweixinxiView selectView(@Param("ew") Wrapper<ChuangweixinxiEntity> wrapper);
	

}
