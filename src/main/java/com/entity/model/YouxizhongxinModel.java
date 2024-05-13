package com.entity.model;

import com.entity.YouxizhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 游戏中心
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public class YouxizhongxinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
