package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuyaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuyaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuyaojiluView;


/**
 * 取药记录
 *
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface QuyaojiluService extends IService<QuyaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuyaojiluVO> selectListVO(Wrapper<QuyaojiluEntity> wrapper);
   	
   	QuyaojiluVO selectVO(@Param("ew") Wrapper<QuyaojiluEntity> wrapper);
   	
   	List<QuyaojiluView> selectListView(Wrapper<QuyaojiluEntity> wrapper);
   	
   	QuyaojiluView selectView(@Param("ew") Wrapper<QuyaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuyaojiluEntity> wrapper);

   	

}

