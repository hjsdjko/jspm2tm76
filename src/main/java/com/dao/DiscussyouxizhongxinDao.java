package com.dao;

import com.entity.DiscussyouxizhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxizhongxinVO;
import com.entity.view.DiscussyouxizhongxinView;


/**
 * 游戏中心评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public interface DiscussyouxizhongxinDao extends BaseMapper<DiscussyouxizhongxinEntity> {
	
	List<DiscussyouxizhongxinVO> selectListVO(@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);
	
	DiscussyouxizhongxinVO selectVO(@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);
	
	List<DiscussyouxizhongxinView> selectListView(@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);

	List<DiscussyouxizhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);
	
	DiscussyouxizhongxinView selectView(@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);
	
}
