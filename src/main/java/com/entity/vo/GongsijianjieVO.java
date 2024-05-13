package com.entity.vo;

import com.entity.GongsijianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 公司简介
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public class GongsijianjieVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 公司文化
	 */
	
	private String gongsiwenhua;
		
	/**
	 * 公司介绍
	 */
	
	private String gongsijieshao;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
				
	
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
	 * 设置：公司文化
	 */
	 
	public void setGongsiwenhua(String gongsiwenhua) {
		this.gongsiwenhua = gongsiwenhua;
	}
	
	/**
	 * 获取：公司文化
	 */
	public String getGongsiwenhua() {
		return gongsiwenhua;
	}
				
	
	/**
	 * 设置：公司介绍
	 */
	 
	public void setGongsijieshao(String gongsijieshao) {
		this.gongsijieshao = gongsijieshao;
	}
	
	/**
	 * 获取：公司介绍
	 */
	public String getGongsijieshao() {
		return gongsijieshao;
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
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
			
}
