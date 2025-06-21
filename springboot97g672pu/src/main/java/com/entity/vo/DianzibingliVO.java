package com.entity.vo;

import com.entity.DianzibingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 电子病历
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public class DianzibingliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 患者病史
	 */
	
	private String huanzhebingshi;
		
	/**
	 * 病症症状
	 */
	
	private String bingzhengzhengzhuang;
		
	/**
	 * 病症诊断
	 */
	
	private String bingzhengzhenduan;
		
	/**
	 * 开具处方
	 */
	
	private String kaijuchufang;
		
	/**
	 * 服用方法
	 */
	
	private String fuyongfangfa;
		
	/**
	 * 服用禁忌
	 */
	
	private String fuyongjinji;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 患者账号
	 */
	
	private String huanzhezhanghao;
		
	/**
	 * 患者姓名
	 */
	
	private String huanzhexingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
				
	
	/**
	 * 设置：患者病史
	 */
	 
	public void setHuanzhebingshi(String huanzhebingshi) {
		this.huanzhebingshi = huanzhebingshi;
	}
	
	/**
	 * 获取：患者病史
	 */
	public String getHuanzhebingshi() {
		return huanzhebingshi;
	}
				
	
	/**
	 * 设置：病症症状
	 */
	 
	public void setBingzhengzhengzhuang(String bingzhengzhengzhuang) {
		this.bingzhengzhengzhuang = bingzhengzhengzhuang;
	}
	
	/**
	 * 获取：病症症状
	 */
	public String getBingzhengzhengzhuang() {
		return bingzhengzhengzhuang;
	}
				
	
	/**
	 * 设置：病症诊断
	 */
	 
	public void setBingzhengzhenduan(String bingzhengzhenduan) {
		this.bingzhengzhenduan = bingzhengzhenduan;
	}
	
	/**
	 * 获取：病症诊断
	 */
	public String getBingzhengzhenduan() {
		return bingzhengzhenduan;
	}
				
	
	/**
	 * 设置：开具处方
	 */
	 
	public void setKaijuchufang(String kaijuchufang) {
		this.kaijuchufang = kaijuchufang;
	}
	
	/**
	 * 获取：开具处方
	 */
	public String getKaijuchufang() {
		return kaijuchufang;
	}
				
	
	/**
	 * 设置：服用方法
	 */
	 
	public void setFuyongfangfa(String fuyongfangfa) {
		this.fuyongfangfa = fuyongfangfa;
	}
	
	/**
	 * 获取：服用方法
	 */
	public String getFuyongfangfa() {
		return fuyongfangfa;
	}
				
	
	/**
	 * 设置：服用禁忌
	 */
	 
	public void setFuyongjinji(String fuyongjinji) {
		this.fuyongjinji = fuyongjinji;
	}
	
	/**
	 * 获取：服用禁忌
	 */
	public String getFuyongjinji() {
		return fuyongjinji;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：患者账号
	 */
	 
	public void setHuanzhezhanghao(String huanzhezhanghao) {
		this.huanzhezhanghao = huanzhezhanghao;
	}
	
	/**
	 * 获取：患者账号
	 */
	public String getHuanzhezhanghao() {
		return huanzhezhanghao;
	}
				
	
	/**
	 * 设置：患者姓名
	 */
	 
	public void setHuanzhexingming(String huanzhexingming) {
		this.huanzhexingming = huanzhexingming;
	}
	
	/**
	 * 获取：患者姓名
	 */
	public String getHuanzhexingming() {
		return huanzhexingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：医生账号
	 */
	 
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
				
	
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
			
}
