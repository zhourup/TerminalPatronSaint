package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.RainfallDao;
import com.zhourup.guard.manage.entity.RainfallEntity;
import com.zhourup.guard.manage.service.RainfallService;


@Service("rainfallService")
public class RainfallServiceImpl extends ServiceImpl<RainfallDao, RainfallEntity> implements RainfallService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RainfallEntity> page = this.page(
                new Query<RainfallEntity>().getPage(params),
                new QueryWrapper<RainfallEntity>()
        );

        return new PageUtils(page);
    }

}