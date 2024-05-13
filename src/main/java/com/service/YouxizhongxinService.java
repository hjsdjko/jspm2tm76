package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxizhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxizhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxizhongxinView;


/**
 * 游戏中心
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public interface YouxizhongxinService extends IService<YouxizhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxizhongxinVO> selectListVO(Wrapper<YouxizhongxinEntity> wrapper);
   	
   	YouxizhongxinVO selectVO(@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);
   	
   	List<YouxizhongxinView> selectListView(Wrapper<YouxizhongxinEntity> wrapper);
   	
   	YouxizhongxinView selectView(@Param("ew") Wrapper<YouxizhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxizhongxinEntity> wrapper);
   	
}

