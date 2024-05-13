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


import com.dao.YouxizhongxinDao;
import com.entity.YouxizhongxinEntity;
import com.service.YouxizhongxinService;
import com.entity.vo.YouxizhongxinVO;
import com.entity.view.YouxizhongxinView;

@Service("youxizhongxinService")
public class YouxizhongxinServiceImpl extends ServiceImpl<YouxizhongxinDao, YouxizhongxinEntity> implements YouxizhongxinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxizhongxinEntity> page = this.selectPage(
                new Query<YouxizhongxinEntity>(params).getPage(),
                new EntityWrapper<YouxizhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxizhongxinEntity> wrapper) {
		  Page<YouxizhongxinView> page =new Query<YouxizhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxizhongxinVO> selectListVO(Wrapper<YouxizhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxizhongxinVO selectVO(Wrapper<YouxizhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxizhongxinView> selectListView(Wrapper<YouxizhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxizhongxinView selectView(Wrapper<YouxizhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
