package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.WaterSpeedDao;
import com.zhourup.guard.manage.entity.WaterSpeedEntity;
import com.zhourup.guard.manage.service.WaterSpeedService;


@Service("waterSpeedService")
public class WaterSpeedServiceImpl extends ServiceImpl<WaterSpeedDao, WaterSpeedEntity> implements WaterSpeedService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WaterSpeedEntity> page = this.page(
                new Query<WaterSpeedEntity>().getPage(params),
                new QueryWrapper<WaterSpeedEntity>()
        );

        return new PageUtils(page);
    }

}