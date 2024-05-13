package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongsijianjieDao;
import com.entity.GongsijianjieEntity;
import com.service.GongsijianjieService;
import com.entity.vo.GongsijianjieVO;
import com.entity.view.GongsijianjieView;

@Service("gongsijianjieService")
public class GongsijianjieServiceImpl extends ServiceImpl<GongsijianjieDao, GongsijianjieEntity> implements GongsijianjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongsijianjieEntity> page = this.selectPage(
                new Query<GongsijianjieEntity>(params).getPage(),
                new EntityWrapper<GongsijianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongsijianjieEntity> wrapper) {
		  Page<GongsijianjieView> page =new Query<GongsijianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongsijianjieVO> selectListVO(Wrapper<GongsijianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongsijianjieVO selectVO(Wrapper<GongsijianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongsijianjieView> selectListView(Wrapper<GongsijianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongsijianjieView selectView(Wrapper<GongsijianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
