package com.entity.view;

import com.entity.GongsijianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公司简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
@TableName("gongsijianjie")
public class GongsijianjieView  extends GongsijianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongsijianjieView(){
	}
 
 	public GongsijianjieView(GongsijianjieEntity gongsijianjieEntity){
 	try {
			BeanUtils.copyProperties(this, gongsijianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
