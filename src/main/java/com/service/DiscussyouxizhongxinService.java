package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxizhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxizhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxizhongxinView;


/**
 * 游戏中心评论表
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public interface DiscussyouxizhongxinService extends IService<DiscussyouxizhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxizhongxinVO> selectListVO(Wrapper<DiscussyouxizhongxinEntity> wrapper);
   	
   	DiscussyouxizhongxinVO selectVO(@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);
   	
   	List<DiscussyouxizhongxinView> selectListView(Wrapper<DiscussyouxizhongxinEntity> wrapper);
   	
   	DiscussyouxizhongxinView selectView(@Param("ew") Wrapper<DiscussyouxizhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxizhongxinEntity> wrapper);
   	
}

