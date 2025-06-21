package com.entity.model;

import com.entity.ChufangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 处方记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public class ChufangjiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生账号
	 */
	
	private String yishengzhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 患者账号
	 */
	
	private String huanzhezhanghao;
		
	/**
	 * 患者姓名
	 */
	
	private String huanzhexingming;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
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
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 处方费用
	 */
	
	private Integer chufangfeiyong;
		
	/**
	 * 开具时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaijushijian;
		
	/**
	 * 取药状态
	 */
	
	private String quyaozhuangtai;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：处方费用
	 */
	 
	public void setChufangfeiyong(Integer chufangfeiyong) {
		this.chufangfeiyong = chufangfeiyong;
	}
	
	/**
	 * 获取：处方费用
	 */
	public Integer getChufangfeiyong() {
		return chufangfeiyong;
	}
				
	
	/**
	 * 设置：开具时间
	 */
	 
	public void setKaijushijian(Date kaijushijian) {
		this.kaijushijian = kaijushijian;
	}
	
	/**
	 * 获取：开具时间
	 */
	public Date getKaijushijian() {
		return kaijushijian;
	}
				
	
	/**
	 * 设置：取药状态
	 */
	 
	public void setQuyaozhuangtai(String quyaozhuangtai) {
		this.quyaozhuangtai = quyaozhuangtai;
	}
	
	/**
	 * 获取：取药状态
	 */
	public String getQuyaozhuangtai() {
		return quyaozhuangtai;
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
