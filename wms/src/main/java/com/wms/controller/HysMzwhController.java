package com.wms.controller;

import com.wms.common.Result;
import com.wms.pojo.HysMzwh;
import com.wms.service.IHysMzwhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Stream;

/**
 * 相关文章信息Controller
 * 
 * @author hzx
 * @date 2024-02-05
 */
@RestController
@RequestMapping("/hys/mzwh")
public class HysMzwhController
{
    @Autowired
    private IHysMzwhService hysMzwhService;
    @GetMapping("/getByType")
    public Result getByType(@RequestParam(value = "type",required = false) String type,
                            @RequestParam(value = "currentPage",defaultValue = "1") String currentPage,
                            @RequestParam(value = "pageSize",defaultValue = "6") String pageSize){
        return hysMzwhService.getByType(type,currentPage,pageSize);
    }
    @GetMapping("/getByUpDesc")
    public Result getByUpDesc(){
        return hysMzwhService.getByUpDesc();
    }

    /**
     * 查询相关文章信息列表
     */
    @GetMapping("/list")
    public Result list(HysMzwh hysMzwh)
    {
        return Result.suc(hysMzwhService.selectHysMzwhList(hysMzwh));
    }


    /**
     * 获取相关文章信息详细信息
     */
    @GetMapping(value = "/{mzwhId}")
    public Result getInfo(@PathVariable("mzwhId") Long mzwhId)
    {
        return Result.suc(hysMzwhService.selectHysMzwhByMzwhId(mzwhId));
    }

    /**
     * 新增相关文章信息
     */
    @PostMapping
    public Result add(@RequestBody HysMzwh hysMzwh)
    {
        return hysMzwhService.insertHysMzwh(hysMzwh) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 修改相关文章信息
     */
    @PutMapping
    public Result edit(@RequestBody HysMzwh hysMzwh)
    {
        return hysMzwhService.updateHysMzwh(hysMzwh) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 删除相关文章信息
     */
	@DeleteMapping("/{mzwhIds}")
    public Result remove(@PathVariable Long[] mzwhIds)
    {
        return hysMzwhService.deleteHysMzwhByMzwhIds(mzwhIds) > 0 ? Result.suc() : Result.fail();
    }
}
