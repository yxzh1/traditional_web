package com.wms.controller;

import com.wms.common.Result;
import com.wms.pojo.HysMzwhDetail;
import com.wms.service.IHysMzwhDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 相关文章详细信息Controller
 * 
 * @author yzx
 * @date 2024-02-05
 */
@RestController
@RequestMapping("/hys/detail")
public class HysMzwhDetailController
{
    @Autowired
    private IHysMzwhDetailService hysMzwhDetailService;

    @GetMapping("/getByTnId")
    public Result getByTnId(@RequestParam("tnId") Long tnId){
        return hysMzwhDetailService.getByTnId(tnId);
    }

    /**
     * 查询相关文章详细信息列表
     */
    @GetMapping("/list")
    public Result list(HysMzwhDetail hysMzwhDetail)
    {
        return Result.suc(hysMzwhDetailService.selectHysMzwhDetailList(hysMzwhDetail));
    }


    /**
     * 获取相关文章详细信息详细信息
     */
    @GetMapping(value = "/{mzwhDetailId}")
    public Result getInfo(@PathVariable("mzwhDetailId") Long mzwhDetailId)
    {
        return Result.suc(hysMzwhDetailService.selectHysMzwhDetailByMzwhDetailId(mzwhDetailId));
    }

    /**
     * 新增相关文章详细信息
     */
    @PostMapping
    public Result add(@RequestBody HysMzwhDetail hysMzwhDetail)
    {
        return hysMzwhDetailService.insertHysMzwhDetail(hysMzwhDetail) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 修改相关文章详细信息
     */
    @PutMapping
    public Result edit(@RequestBody HysMzwhDetail hysMzwhDetail)
    {
        return hysMzwhDetailService.updateHysMzwhDetail(hysMzwhDetail) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 删除相关文章详细信息
     */
	@DeleteMapping("/{mzwhDetailIds}")
    public Result remove(@PathVariable Long[] mzwhDetailIds)
    {
        return hysMzwhDetailService.deleteHysMzwhDetailByMzwhDetailIds(mzwhDetailIds) > 0 ? Result.suc() : Result.fail();
    }
}
