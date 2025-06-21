package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuyuanjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuyuanjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuyuanjiluView;


/**
 * 住院记录
 *
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public interface ZhuyuanjiluService extends IService<ZhuyuanjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuyuanjiluVO> selectListVO(Wrapper<ZhuyuanjiluEntity> wrapper);
   	
   	ZhuyuanjiluVO selectVO(@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);
   	
   	List<ZhuyuanjiluView> selectListView(Wrapper<ZhuyuanjiluEntity> wrapper);
   	
   	ZhuyuanjiluView selectView(@Param("ew") Wrapper<ZhuyuanjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuyuanjiluEntity> wrapper);

   	

}

