package com.zhourup.guard.manage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhourup.common.utils.PageUtils;
import com.zhourup.guard.manage.entity.DangerousGasEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhourup
 * @email zhourup@163.com
 * @date 2021-04-11 13:02:06
 */
public interface DangerousGasService extends IService<DangerousGasEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

