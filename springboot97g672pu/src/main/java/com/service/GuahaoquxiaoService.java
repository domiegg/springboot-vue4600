package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaoquxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaoquxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaoquxiaoView;


/**
 * 挂号取消
 *
 * @author 
 * @email 
 * @date 2024-03-07 14:38:28
 */
public interface GuahaoquxiaoService extends IService<GuahaoquxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaoquxiaoVO> selectListVO(Wrapper<GuahaoquxiaoEntity> wrapper);
   	
   	GuahaoquxiaoVO selectVO(@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);
   	
   	List<GuahaoquxiaoView> selectListView(Wrapper<GuahaoquxiaoEntity> wrapper);
   	
   	GuahaoquxiaoView selectView(@Param("ew") Wrapper<GuahaoquxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaoquxiaoEntity> wrapper);

   	

}

