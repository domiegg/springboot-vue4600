package com.entity.view;

import com.entity.ZuozhenyishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 坐诊医生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 14:38:28
 */
@TableName("zuozhenyisheng")
public class ZuozhenyishengView  extends ZuozhenyishengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuozhenyishengView(){
	}
 
 	public ZuozhenyishengView(ZuozhenyishengEntity zuozhenyishengEntity){
 	try {
			BeanUtils.copyProperties(this, zuozhenyishengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
