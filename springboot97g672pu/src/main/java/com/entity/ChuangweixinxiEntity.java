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
 * 床位信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
@TableName("chuangweixinxi")
public class ChuangweixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChuangweixinxiEntity() {
		
	}
	
	public ChuangweixinxiEntity(T t) {
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
	 * 床位编号
	 */
					
	private String chuangweibianhao;
	
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
	 * 设置：床位编号
	 */
	public void setChuangweibianhao(String chuangweibianhao) {
		this.chuangweibianhao = chuangweibianhao;
	}
	/**
	 * 获取：床位编号
	 */
	public String getChuangweibianhao() {
		return chuangweibianhao;
	}
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
