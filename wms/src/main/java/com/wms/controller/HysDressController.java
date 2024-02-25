package com.wms.controller;


import com.wms.common.Result;
import com.wms.pojo.HysAuthorNote;
import com.wms.pojo.HysDress;
import com.wms.service.IHysDressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 民族服饰表 前端控制器
 * </p>
 *
 * @author yzx
 * @since 2024-02-18
 */
@RestController
@RequestMapping("/hys/dress")
public class HysDressController {
    @Autowired
    private IHysDressService hysDressService;

    @GetMapping("/list")
    public Result list(HysDress hysDress)
    {
        return hysDressService.selectHysDressList(hysDress);
    }

    @GetMapping(value = "/{dressId}")
    public Result getInfo(@PathVariable("dressId") Long dressId)
    {
        return Result.suc(hysDressService.selectHysDressByDressId(dressId));
    }

    @GetMapping("/getByDressId")
    public Result getByDressId(@RequestParam("dressId") Long dressId){
        return hysDressService.getByDressId(dressId);
    }

}
