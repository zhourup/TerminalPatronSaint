package com.zhourup.guard.manage.controller;

import com.zhourup.common.utils.PageUtils;
import com.zhourup.common.utils.R;
import com.zhourup.guard.manage.entity.WindSpeedEntity;
import com.zhourup.guard.manage.service.WindSpeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;



/**
 * 
 *
 * @author zhourup
 * @email zhourup@163.com
 * @date 2021-04-11 13:07:36
 */
@RestController
@RequestMapping("manage/windspeed")
public class WindSpeedController {
    @Autowired
    private WindSpeedService windSpeedService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = windSpeedService.queryPage(params);
        page.setList(page.getList().subList(page.getList().size()-25,page.getList().size()-1));
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		WindSpeedEntity windSpeed = windSpeedService.getById(id);

        return R.ok().put("windSpeed", windSpeed);
    }

//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody WindSpeedEntity windSpeed){
//		windSpeedService.save(windSpeed);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody WindSpeedEntity windSpeed){
//		windSpeedService.updateById(windSpeed);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Long[] ids){
//		windSpeedService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
