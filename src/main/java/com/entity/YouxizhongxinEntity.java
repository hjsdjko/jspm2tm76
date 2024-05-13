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
 * 游戏中心
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
@TableName("youxizhongxin")
public class YouxizhongxinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YouxizhongxinEntity() {
		
	}
	
	public YouxizhongxinEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 游戏名称
	 */
					
	private String youximingcheng;
	
	/**
	 * 游戏类型
	 */
					
	private String youxileixing;
	
	/**
	 * 游戏公司
	 */
					
	private String youxigongsi;
	
	/**
	 * 游戏海报
	 */
					
	private String youxihaibao;
	
	/**
	 * 游戏下载
	 */
					
	private String youxixiazai;
	
	/**
	 * 游戏简介
	 */
					
	private String youxijianjie;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：游戏名称
	 */
	public void setYouximingcheng(String youximingcheng) {
		this.youximingcheng = youximingcheng;
	}
	/**
	 * 获取：游戏名称
	 */
	public String getYouximingcheng() {
		return youximingcheng;
	}
	/**
	 * 设置：游戏类型
	 */
	public void setYouxileixing(String youxileixing) {
		this.youxileixing = youxileixing;
	}
	/**
	 * 获取：游戏类型
	 */
	public String getYouxileixing() {
		return youxileixing;
	}
	/**
	 * 设置：游戏公司
	 */
	public void setYouxigongsi(String youxigongsi) {
		this.youxigongsi = youxigongsi;
	}
	/**
	 * 获取：游戏公司
	 */
	public String getYouxigongsi() {
		return youxigongsi;
	}
	/**
	 * 设置：游戏海报
	 */
	public void setYouxihaibao(String youxihaibao) {
		this.youxihaibao = youxihaibao;
	}
	/**
	 * 获取：游戏海报
	 */
	public String getYouxihaibao() {
		return youxihaibao;
	}
	/**
	 * 设置：游戏下载
	 */
	public void setYouxixiazai(String youxixiazai) {
		this.youxixiazai = youxixiazai;
	}
	/**
	 * 获取：游戏下载
	 */
	public String getYouxixiazai() {
		return youxixiazai;
	}
	/**
	 * 设置：游戏简介
	 */
	public void setYouxijianjie(String youxijianjie) {
		this.youxijianjie = youxijianjie;
	}
	/**
	 * 获取：游戏简介
	 */
	public String getYouxijianjie() {
		return youxijianjie;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
