package com.zhourup.guard.manage.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhourup.guard.manage.entity.LaserRangingEntity;
import com.zhourup.guard.manage.service.LaserRangingService;
import com.zhourup.common.utils.PageUtils;
import com.zhourup.common.utils.R;



/**
 * 
 *
 * @author zhourup
 * @email zhourup@163.com
 * @date 2021-04-11 13:07:37
 */
@RestController
@RequestMapping("manage/laserranging")
public class LaserRangingController {
    @Autowired
    private LaserRangingService laserRangingService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = laserRangingService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		LaserRangingEntity laserRanging = laserRangingService.getById(id);

        return R.ok().put("laserRanging", laserRanging);
    }

//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody LaserRangingEntity laserRanging){
//		laserRangingService.save(laserRanging);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody LaserRangingEntity laserRanging){
//		laserRangingService.updateById(laserRanging);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Long[] ids){
//		laserRangingService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
