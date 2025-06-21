package com.entity.vo;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * @author 
 * @email 
 * @date 2024-03-07 14:38:29
 */
public class YaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 药品单价
	 */
	
	private Double yaopindanjia;
		
	/**
	 * 药品数量
	 */
	
	private Integer yaopinshuliang;
		
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 药品类型
	 */
	
	private String yaopinleixing;
		
	/**
	 * 功效描述
	 */
	
	private String gongxiaomiaoshu;
		
	/**
	 * 服用方法
	 */
	
	private String fuyongfangfa;
		
	/**
	 * 服用禁忌
	 */
	
	private String fuyongjinji;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：药品单价
	 */
	 
	public void setYaopindanjia(Double yaopindanjia) {
		this.yaopindanjia = yaopindanjia;
	}
	
	/**
	 * 获取：药品单价
	 */
	public Double getYaopindanjia() {
		return yaopindanjia;
	}
				
	
	/**
	 * 设置：药品数量
	 */
	 
	public void setYaopinshuliang(Integer yaopinshuliang) {
		this.yaopinshuliang = yaopinshuliang;
	}
	
	/**
	 * 获取：药品数量
	 */
	public Integer getYaopinshuliang() {
		return yaopinshuliang;
	}
				
	
	/**
	 * 设置：药品图片
	 */
	 
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
				
	
	/**
	 * 设置：药品类型
	 */
	 
	public void setYaopinleixing(String yaopinleixing) {
		this.yaopinleixing = yaopinleixing;
	}
	
	/**
	 * 获取：药品类型
	 */
	public String getYaopinleixing() {
		return yaopinleixing;
	}
				
	
	/**
	 * 设置：功效描述
	 */
	 
	public void setGongxiaomiaoshu(String gongxiaomiaoshu) {
		this.gongxiaomiaoshu = gongxiaomiaoshu;
	}
	
	/**
	 * 获取：功效描述
	 */
	public String getGongxiaomiaoshu() {
		return gongxiaomiaoshu;
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
			
}
