package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.WaterDeepDao;
import com.zhourup.guard.manage.entity.WaterDeepEntity;
import com.zhourup.guard.manage.service.WaterDeepService;


@Service("waterDeepService")
public class WaterDeepServiceImpl extends ServiceImpl<WaterDeepDao, WaterDeepEntity> implements WaterDeepService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WaterDeepEntity> page = this.page(
                new Query<WaterDeepEntity>().getPage(params),
                new QueryWrapper<WaterDeepEntity>()
        );

        return new PageUtils(page);
    }

}