package com.zhourup.guard.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhourup.common.utils.PageUtils;
import com.zhourup.guard.manage.entity.WaterSpeedEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhourup
 * @email zhourup@163.com
 * @date 2021-04-11 13:02:06
 */
public interface WaterSpeedService extends IService<WaterSpeedEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

