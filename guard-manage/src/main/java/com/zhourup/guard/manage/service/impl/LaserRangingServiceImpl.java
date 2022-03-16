package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.LaserRangingDao;
import com.zhourup.guard.manage.entity.LaserRangingEntity;
import com.zhourup.guard.manage.service.LaserRangingService;


@Service("laserRangingService")
public class LaserRangingServiceImpl extends ServiceImpl<LaserRangingDao, LaserRangingEntity> implements LaserRangingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LaserRangingEntity> page = this.page(
                new Query<LaserRangingEntity>().getPage(params),
                new QueryWrapper<LaserRangingEntity>()
        );

        return new PageUtils(page);
    }

}