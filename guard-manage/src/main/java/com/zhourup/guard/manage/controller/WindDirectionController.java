package com.zhourup.guard.manage.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zhourup.guard.manage.entity.WindDirectionEntity;
import com.zhourup.guard.manage.service.WindDirectionService;
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
@RequestMapping("manage/winddirection")
public class WindDirectionController {
    @Autowired
    private WindDirectionService windDirectionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = windDirectionService.queryPage(params);
        page.setList(page.getList().subList(page.getList().size()-25,page.getList().size()-1));
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		WindDirectionEntity windDirection = windDirectionService.getById(id);

        return R.ok().put("windDirection", windDirection);
    }

//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    public R save(@RequestBody WindDirectionEntity windDirection){
//		windDirectionService.save(windDirection);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    public R update(@RequestBody WindDirectionEntity windDirection){
//		windDirectionService.updateById(windDirection);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    public R delete(@RequestBody Long[] ids){
//		windDirectionService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
