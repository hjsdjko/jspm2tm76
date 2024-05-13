package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongsijianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongsijianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongsijianjieView;


/**
 * 公司简介
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:33:04
 */
public interface GongsijianjieService extends IService<GongsijianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongsijianjieVO> selectListVO(Wrapper<GongsijianjieEntity> wrapper);
   	
   	GongsijianjieVO selectVO(@Param("ew") Wrapper<GongsijianjieEntity> wrapper);
   	
   	List<GongsijianjieView> selectListView(Wrapper<GongsijianjieEntity> wrapper);
   	
   	GongsijianjieView selectView(@Param("ew") Wrapper<GongsijianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongsijianjieEntity> wrapper);
   	
}

