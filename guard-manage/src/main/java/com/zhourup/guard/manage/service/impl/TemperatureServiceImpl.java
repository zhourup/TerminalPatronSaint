package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.TemperatureDao;
import com.zhourup.guard.manage.entity.TemperatureEntity;
import com.zhourup.guard.manage.service.TemperatureService;


@Service("temperatureService")
public class TemperatureServiceImpl extends ServiceImpl<TemperatureDao, TemperatureEntity> implements TemperatureService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TemperatureEntity> page = this.page(
                new Query<TemperatureEntity>().getPage(params),
                new QueryWrapper<TemperatureEntity>()
        );

        return new PageUtils(page);
    }

}