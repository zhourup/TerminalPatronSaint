package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.WaterDirectionDao;
import com.zhourup.guard.manage.entity.WaterDirectionEntity;
import com.zhourup.guard.manage.service.WaterDirectionService;


@Service("waterDirectionService")
public class WaterDirectionServiceImpl extends ServiceImpl<WaterDirectionDao, WaterDirectionEntity> implements WaterDirectionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WaterDirectionEntity> page = this.page(
                new Query<WaterDirectionEntity>().getPage(params),
                new QueryWrapper<WaterDirectionEntity>()
        );

        return new PageUtils(page);
    }

}