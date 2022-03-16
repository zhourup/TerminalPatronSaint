package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.WindDirectionDao;
import com.zhourup.guard.manage.entity.WindDirectionEntity;
import com.zhourup.guard.manage.service.WindDirectionService;


@Service("windDirectionService")
public class WindDirectionServiceImpl extends ServiceImpl<WindDirectionDao, WindDirectionEntity> implements WindDirectionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WindDirectionEntity> page = this.page(
                new Query<WindDirectionEntity>().getPage(params),
                new QueryWrapper<WindDirectionEntity>()
        );

        return new PageUtils(page);
    }

}