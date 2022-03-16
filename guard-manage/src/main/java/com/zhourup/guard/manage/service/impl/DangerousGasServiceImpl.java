package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.DangerousGasDao;
import com.zhourup.guard.manage.entity.DangerousGasEntity;
import com.zhourup.guard.manage.service.DangerousGasService;


@Service("dangerousGasService")
public class DangerousGasServiceImpl extends ServiceImpl<DangerousGasDao, DangerousGasEntity> implements DangerousGasService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DangerousGasEntity> page = this.page(
                new Query<DangerousGasEntity>().getPage(params),
                new QueryWrapper<DangerousGasEntity>()
        );

        return new PageUtils(page);
    }

}