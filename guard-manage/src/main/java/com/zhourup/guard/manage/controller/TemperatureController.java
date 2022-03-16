package com.zhourup.guard.manage.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhourup.guard.manage.entity.TemperatureEntity;
import com.zhourup.guard.manage.service.TemperatureService;
import com.zhourup.common.utils.PageUtils;
import com.zhourup.common.utils.R;



/**
 * 
 *
 * @author zhourup
 * @email zhourup@163.com
 * @date 2021-04-11 13:07:36
 */
@RestController
@RequestMapping("manage/temperature")
public class TemperatureController {
    @Autowired
    private TemperatureService temperatureService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = temperatureService.queryPage(params);
        page.setList(page.getList().subList(page.getList().size()-25,page.getList().size()-1));
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		TemperatureEntity temperature = temperatureService.getById(id);

        return R.ok().put("temperature", temperature);
    }

//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody TemperatureEntity temperature){
//		temperatureService.save(temperature);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody TemperatureEntity temperature){
//		temperatureService.updateById(temperature);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Long[] ids){
//		temperatureService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
