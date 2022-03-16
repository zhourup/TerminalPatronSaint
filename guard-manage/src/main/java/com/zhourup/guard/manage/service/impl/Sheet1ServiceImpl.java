package com.zhourup.guard.manage.service.impl;

import com.zhourup.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhourup.common.utils.PageUtils;

import com.zhourup.guard.manage.dao.Sheet1Dao;
import com.zhourup.guard.manage.entity.Sheet1Entity;
import com.zhourup.guard.manage.service.Sheet1Service;


@Service("sheet1Service")
public class Sheet1ServiceImpl extends ServiceImpl<Sheet1Dao, Sheet1Entity> implements Sheet1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Sheet1Entity> page = this.page(
                new Query<Sheet1Entity>().getPage(params),
                new QueryWrapper<Sheet1Entity>()
        );

        return new PageUtils(page);
    }

}