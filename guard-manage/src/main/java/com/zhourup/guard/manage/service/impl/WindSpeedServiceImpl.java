package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.WindSpeedDao;
import com.zhourup.guard.manage.entity.WindSpeedEntity;
import com.zhourup.guard.manage.service.WindSpeedService;


@Service("windSpeedService")
public class WindSpeedServiceImpl extends ServiceImpl<WindSpeedDao, WindSpeedEntity> implements WindSpeedService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WindSpeedEntity> page = this.page(
                new Query<WindSpeedEntity>().getPage(params),
                new QueryWrapper<WindSpeedEntity>()
        );

        return new PageUtils(page);
    }

}