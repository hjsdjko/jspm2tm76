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


import com.dao.DiscussyouxizhongxinDao;
import com.entity.DiscussyouxizhongxinEntity;
import com.service.DiscussyouxizhongxinService;
import com.entity.vo.DiscussyouxizhongxinVO;
import com.entity.view.DiscussyouxizhongxinView;

@Service("discussyouxizhongxinService")
public class DiscussyouxizhongxinServiceImpl extends ServiceImpl<DiscussyouxizhongxinDao, DiscussyouxizhongxinEntity> implements DiscussyouxizhongxinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxizhongxinEntity> page = this.selectPage(
                new Query<DiscussyouxizhongxinEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxizhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxizhongxinEntity> wrapper) {
		  Page<DiscussyouxizhongxinView> page =new Query<DiscussyouxizhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxizhongxinVO> selectListVO(Wrapper<DiscussyouxizhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxizhongxinVO selectVO(Wrapper<DiscussyouxizhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxizhongxinView> selectListView(Wrapper<DiscussyouxizhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxizhongxinView selectView(Wrapper<DiscussyouxizhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
