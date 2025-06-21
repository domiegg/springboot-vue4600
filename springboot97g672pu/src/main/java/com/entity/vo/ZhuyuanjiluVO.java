package com.entity.vo;

import com.entity.ZhuyuanjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 住院记录
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public class ZhuyuanjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 床位名称
	 */
	
	private String chuangweimingcheng;
		
	/**
	 * 床位图片
	 */
	
	private String chuangweitupian;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 床位费用
	 */
	
	private String chuangweifeiyong;
		
	/**
	 * 预约编号
	 */
	
	private String yuyuebianhao;
		
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
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 入院时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruyuanshijian;
		
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：床位图片
	 */
	 
	public void setChuangweitupian(String chuangweitupian) {
		this.chuangweitupian = chuangweitupian;
	}
	
	/**
	 * 获取：床位图片
	 */
	public String getChuangweitupian() {
		return chuangweitupian;
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
	 * 设置：床位费用
	 */
	 
	public void setChuangweifeiyong(String chuangweifeiyong) {
		this.chuangweifeiyong = chuangweifeiyong;
	}
	
	/**
	 * 获取：床位费用
	 */
	public String getChuangweifeiyong() {
		return chuangweifeiyong;
	}
				
	
	/**
	 * 设置：预约编号
	 */
	 
	public void setYuyuebianhao(String yuyuebianhao) {
		this.yuyuebianhao = yuyuebianhao;
	}
	
	/**
	 * 获取：预约编号
	 */
	public String getYuyuebianhao() {
		return yuyuebianhao;
	}
				
	
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
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：入院时间
	 */
	 
	public void setRuyuanshijian(Date ruyuanshijian) {
		this.ruyuanshijian = ruyuanshijian;
	}
	
	/**
	 * 获取：入院时间
	 */
	public Date getRuyuanshijian() {
		return ruyuanshijian;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
