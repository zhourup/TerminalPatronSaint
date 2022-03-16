package com.zhourup.guard.manage.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhourup.guard.manage.entity.WaterSpeedEntity;
import com.zhourup.guard.manage.service.WaterSpeedService;
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
@RequestMapping("manage/waterspeed")
public class WaterSpeedController {
    @Autowired
    private WaterSpeedService waterSpeedService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = waterSpeedService.queryPage(params);
        page.setList(page.getList().subList(page.getList().size()-25,page.getList().size()-1));
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		WaterSpeedEntity waterSpeed = waterSpeedService.getById(id);

        return R.ok().put("waterSpeed", waterSpeed);
    }

//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody WaterSpeedEntity waterSpeed){
//		waterSpeedService.save(waterSpeed);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody WaterSpeedEntity waterSpeed){
//		waterSpeedService.updateById(waterSpeed);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Long[] ids){
//		waterSpeedService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
