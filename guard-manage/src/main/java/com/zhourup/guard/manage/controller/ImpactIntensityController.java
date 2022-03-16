package com.zhourup.guard.manage.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhourup.guard.manage.entity.ImpactIntensityEntity;
import com.zhourup.guard.manage.service.ImpactIntensityService;
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
@RequestMapping("manage/impactintensity")
public class ImpactIntensityController {
    @Autowired
    private ImpactIntensityService impactIntensityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = impactIntensityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ImpactIntensityEntity impactIntensity = impactIntensityService.getById(id);

        return R.ok().put("impactIntensity", impactIntensity);
    }

//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody ImpactIntensityEntity impactIntensity){
//		impactIntensityService.save(impactIntensity);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody ImpactIntensityEntity impactIntensity){
//		impactIntensityService.updateById(impactIntensity);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Long[] ids){
//		impactIntensityService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
