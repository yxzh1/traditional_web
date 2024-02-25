package com.wms.controller;


import com.wms.common.Result;
import com.wms.pojo.HysAuthor;
import com.wms.service.IHysAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/hys/author")
public class HysAuthorController {
    @Autowired
    private IHysAuthorService hysAuthorService;

    @GetMapping("/recommend")
    public Result getrecommend(@RequestParam(value = "limit",defaultValue = "5",required = false) String limit){
        return hysAuthorService.getRecommendAuthor(limit);
    }
    @GetMapping("/getAuthor")
    public Result getAuthor(Long id){
        return hysAuthorService.getAuthor(id);
    }
    /**
     * 查询作者信息列表
     */
    @GetMapping("/list")
    public Result list(HysAuthor hysAuthor)
    {
        return Result.suc(hysAuthorService.selectHysAuthorList(hysAuthor));
    }


    /**
     * 获取作者信息详细信息
     */
    @GetMapping(value = "/{authorId}")
    public Result getInfo(@PathVariable("authorId") Long authorId)
    {
        return Result.suc(hysAuthorService.selectHysAuthorByAuthorId(authorId));
    }

    /**
     * 新增作者信息
     */
    @PostMapping
    public Result add(@RequestBody HysAuthor hysAuthor)
    {
        return hysAuthorService.insertHysAuthor(hysAuthor) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 修改作者信息
     */
    @PutMapping
    public Result edit(@RequestBody HysAuthor hysAuthor)
    {
        return hysAuthorService.updateHysAuthor(hysAuthor) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 删除作者信息
     */
    @DeleteMapping("/{authorIds}")
    public Result remove(@PathVariable Long[] authorIds)
    {
        return hysAuthorService.deleteHysAuthorByAuthorIds(authorIds) > 0 ? Result.suc() : Result.fail();
    }
}
