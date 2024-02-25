package com.wms.controller;

import com.wms.common.Result;
import com.wms.pojo.HysAuthorNote;
import com.wms.service.IHysAuthorNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 作者说说/日记信息Controller
 * 
 * @author yzx
 * @date 2024-02-05
 */
@RestController
@RequestMapping("/hys/note")
public class HysAuthorNoteController
{
    @Autowired
    private IHysAuthorNoteService hysAuthorNoteService;

    @GetMapping("/getByTime")
    public Result getNoteByTime(@RequestParam(value = "limit",defaultValue = "6") String limit){
        return hysAuthorNoteService.getNoteByTime(limit);
    }
    @GetMapping("/getByAuthorNoteId")
    public Result getByAuthorNoteId(Long authorNoteId){
        return hysAuthorNoteService.getByAuthorNoteId(authorNoteId);
    }

    /**
     * 查询作者说说/日记信息列表
     */
    @GetMapping("/list")
    public Result list(HysAuthorNote hysAuthorNote)
    {
        return Result.suc(hysAuthorNoteService.selectHysAuthorNoteList(hysAuthorNote));
    }


    /**
     * 获取作者说说/日记信息详细信息
     */
    @GetMapping(value = "/{authorNoteId}")
    public Result getInfo(@PathVariable("authorNoteId") Long authorNoteId)
    {
        return Result.suc(hysAuthorNoteService.selectHysAuthorNoteByAuthorNoteId(authorNoteId));
    }

    /**
     * 新增作者说说/日记信息
     */
    @PostMapping
    public Result add(@RequestBody HysAuthorNote hysAuthorNote)
    {
        return hysAuthorNoteService.insertHysAuthorNote(hysAuthorNote) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 修改作者说说/日记信息
     */
    @PutMapping
    public Result edit(@RequestBody HysAuthorNote hysAuthorNote)
    {
        return hysAuthorNoteService.updateHysAuthorNote(hysAuthorNote) > 0 ?Result.suc() : Result.fail();
    }

    /**
     * 删除作者说说/日记信息
     */
	@DeleteMapping("/{authorNoteIds}")
    public Result remove(@PathVariable Long[] authorNoteIds)
    {
        return hysAuthorNoteService.deleteHysAuthorNoteByAuthorNoteIds(authorNoteIds) > 0 ?Result.suc() : Result.fail();
    }
}
