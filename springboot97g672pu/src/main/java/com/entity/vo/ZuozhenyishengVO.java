package com.entity.vo;

import com.entity.ZuozhenyishengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 坐诊医生
 * @author 
 * @email 
 * @date 2024-03-07 14:38:28
 */
public class ZuozhenyishengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 医龄
	 */
	
	private String yiling;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 擅长
	 */
	
	private String shanzhang;
		
	/**
	 * 挂号费用
	 */
	
	private Integer guahaofeiyong;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 坐诊时间
	 */
	
	private String zuozhenshijian;
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
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
	 * 设置：医龄
	 */
	 
	public void setYiling(String yiling) {
		this.yiling = yiling;
	}
	
	/**
	 * 获取：医龄
	 */
	public String getYiling() {
		return yiling;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：擅长
	 */
	 
	public void setShanzhang(String shanzhang) {
		this.shanzhang = shanzhang;
	}
	
	/**
	 * 获取：擅长
	 */
	public String getShanzhang() {
		return shanzhang;
	}
				
	
	/**
	 * 设置：挂号费用
	 */
	 
	public void setGuahaofeiyong(Integer guahaofeiyong) {
		this.guahaofeiyong = guahaofeiyong;
	}
	
	/**
	 * 获取：挂号费用
	 */
	public Integer getGuahaofeiyong() {
		return guahaofeiyong;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：坐诊时间
	 */
	 
	public void setZuozhenshijian(String zuozhenshijian) {
		this.zuozhenshijian = zuozhenshijian;
	}
	
	/**
	 * 获取：坐诊时间
	 */
	public String getZuozhenshijian() {
		return zuozhenshijian;
	}
			
}
