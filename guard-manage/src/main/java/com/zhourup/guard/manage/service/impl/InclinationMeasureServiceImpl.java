package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.InclinationMeasureDao;
import com.zhourup.guard.manage.entity.InclinationMeasureEntity;
import com.zhourup.guard.manage.service.InclinationMeasureService;


@Service("inclinationMeasureService")
public class InclinationMeasureServiceImpl extends ServiceImpl<InclinationMeasureDao, InclinationMeasureEntity> implements InclinationMeasureService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<InclinationMeasureEntity> page = this.page(
                new Query<InclinationMeasureEntity>().getPage(params),
                new QueryWrapper<InclinationMeasureEntity>()
        );

        return new PageUtils(page);
    }

}