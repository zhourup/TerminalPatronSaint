package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.StaticLevelDao;
import com.zhourup.guard.manage.entity.StaticLevelEntity;
import com.zhourup.guard.manage.service.StaticLevelService;


@Service("staticLevelService")
public class StaticLevelServiceImpl extends ServiceImpl<StaticLevelDao, StaticLevelEntity> implements StaticLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StaticLevelEntity> page = this.page(
                new Query<StaticLevelEntity>().getPage(params),
                new QueryWrapper<StaticLevelEntity>()
        );

        return new PageUtils(page);
    }

}