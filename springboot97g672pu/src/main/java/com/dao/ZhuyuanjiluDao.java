package com.dao;

import com.entity.ZhuyuanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuyuanjiluVO;
import com.entity.view.ZhuyuanjiluView;


/**
 * 住院记录
 * 
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface ZhuyuanjiluDao extends BaseMapper<ZhuyuanjiluEntity> {
	
	List<ZhuyuanjiluVO> selectListVO(@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);
	
	ZhuyuanjiluVO selectVO(@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);
	
	List<ZhuyuanjiluView> selectListView(@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);

	List<ZhuyuanjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);

	
	ZhuyuanjiluView selectView(@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);
	

}
