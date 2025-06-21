package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChufangjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChufangjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChufangjiluView;


/**
 * 处方记录
 *
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface ChufangjiluService extends IService<ChufangjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChufangjiluVO> selectListVO(Wrapper<ChufangjiluEntity> wrapper);
   	
   	ChufangjiluVO selectVO(@Param("ew") Wrapper<ChufangjiluEntity> wrapper);
   	
   	List<ChufangjiluView> selectListView(Wrapper<ChufangjiluEntity> wrapper);
   	
   	ChufangjiluView selectView(@Param("ew") Wrapper<ChufangjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChufangjiluEntity> wrapper);

   	

}

