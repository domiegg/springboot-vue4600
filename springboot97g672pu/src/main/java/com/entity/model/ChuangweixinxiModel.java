package com.entity.model;

import com.entity.ChuangweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 床位信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public class ChuangweixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 床位名称
	 */
	
	private String chuangweimingcheng;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 床位状态
	 */
	
	private String chuangweizhuangtai;
		
	/**
	 * 床位费用
	 */
	
	private Integer chuangweifeiyong;
				
	
	/**
	 * 设置：床位名称
	 */
	 
	public void setChuangweimingcheng(String chuangweimingcheng) {
		this.chuangweimingcheng = chuangweimingcheng;
	}
	
	/**
	 * 获取：床位名称
	 */
	public String getChuangweimingcheng() {
		return chuangweimingcheng;
	}
				
	
	/**
	 * 设置：科室
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：床位状态
	 */
	 
	public void setChuangweizhuangtai(String chuangweizhuangtai) {
		this.chuangweizhuangtai = chuangweizhuangtai;
	}
	
	/**
	 * 获取：床位状态
	 */
	public String getChuangweizhuangtai() {
		return chuangweizhuangtai;
	}
				
	
	/**
	 * 设置：床位费用
	 */
	 
	public void setChuangweifeiyong(Integer chuangweifeiyong) {
		this.chuangweifeiyong = chuangweifeiyong;
	}
	
	/**
	 * 获取：床位费用
	 */
	public Integer getChuangweifeiyong() {
		return chuangweifeiyong;
	}
			
}
