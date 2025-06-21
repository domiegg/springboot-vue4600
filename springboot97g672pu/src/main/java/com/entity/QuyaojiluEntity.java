package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 取药记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@TableName("quyaojilu")
public class QuyaojiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QuyaojiluEntity() {
		
	}
	
	public QuyaojiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 预约编号
	 */
					
	private String yuyuebianhao;
	
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
	 * 图片
	 */
					
	private String tupian;
	
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
					
	private String kaijushijian;
	
	/**
	 * 取药时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date quyaoshijian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	public void setKaijushijian(String kaijushijian) {
		this.kaijushijian = kaijushijian;
	}
	/**
	 * 获取：开具时间
	 */
	public String getKaijushijian() {
		return kaijushijian;
	}
	/**
	 * 设置：取药时间
	 */
	public void setQuyaoshijian(Date quyaoshijian) {
		this.quyaoshijian = quyaoshijian;
	}
	/**
	 * 获取：取药时间
	 */
	public Date getQuyaoshijian() {
		return quyaoshijian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
