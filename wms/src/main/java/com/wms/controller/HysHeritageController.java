package com.wms.controller;


import com.wms.common.Result;
import com.wms.pojo.HysDress;
import com.wms.pojo.HysHeritage;
import com.wms.service.IHysDressService;
import com.wms.service.IHysHeritageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 非遗表 前端控制器
 * </p>
 *
 * @author yzx
 * @since 2024-02-19
 */
@RestController
@RequestMapping("/hys/heritage")
public class HysHeritageController {
    @Autowired
    private IHysHeritageService hysHeritageService;

    @GetMapping("/list")
    public Result list(HysHeritage hysHeritage)
    {
        return hysHeritageService.selectHeritageList(hysHeritage);
    }

    @GetMapping(value = "/{heritageId}")
    public Result getInfo(@PathVariable("heritageId") Long heritageId)
    {
        return Result.suc(hysHeritageService.selectHeritageByHeritageId(heritageId));
    }

    @GetMapping("/getByHeritageId")
    public Result getByHeritageId(@RequestParam("heritageId") Long heritageId){
        return hysHeritageService.getByHeritageId(heritageId);
    }

}
