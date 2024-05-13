package com.dao;

import com.entity.YouxizhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxizhongxinVO;
import com.entity.view.YouxizhongxinView;


/**
 * 游戏中心
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public interface YouxizhongxinDao extends BaseMapper<YouxizhongxinEntity> {
	
	List<YouxizhongxinVO> selectListVO(@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);
	
	YouxizhongxinVO selectVO(@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);
	
	List<YouxizhongxinView> selectListView(@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);

	List<YouxizhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);
	
	YouxizhongxinView selectView(@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);
	
}
