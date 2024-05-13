package com.dao;

import com.entity.GongsijianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongsijianjieVO;
import com.entity.view.GongsijianjieView;


/**
 * 公司简介
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public interface GongsijianjieDao extends BaseMapper<GongsijianjieEntity> {
	
	List<GongsijianjieVO> selectListVO(@Param("ew") Wrapper<GongsijianjieEntity> wrapper);
	
	GongsijianjieVO selectVO(@Param("ew") Wrapper<GongsijianjieEntity> wrapper);
	
	List<GongsijianjieView> selectListView(@Param("ew") Wrapper<GongsijianjieEntity> wrapper);

	List<GongsijianjieView> selectListView(Pagination page,@Param("ew") Wrapper<GongsijianjieEntity> wrapper);
	
	GongsijianjieView selectView(@Param("ew") Wrapper<GongsijianjieEntity> wrapper);
	
}
