package com.wms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.common.Result;
import com.wms.pojo.HysAuthorNote;

import java.util.List;

/**
 * 作者说说/日记信息Service接口
 * 
 * @author yzx
 * @date 2024-02-05
 */
public interface IHysAuthorNoteService extends IService<HysAuthorNote>
{
    /**
     * 查询作者说说/日记信息
     * 
     * @param authorNoteId 作者说说/日记信息主键
     * @return 作者说说/日记信息
     */
    public HysAuthorNote selectHysAuthorNoteByAuthorNoteId(Long authorNoteId);

    /**
     * 查询作者说说/日记信息列表
     * 
     * @param hysAuthorNote 作者说说/日记信息
     * @return 作者说说/日记信息集合
     */
    public List<HysAuthorNote> selectHysAuthorNoteList(HysAuthorNote hysAuthorNote);

    /**
     * 新增作者说说/日记信息
     * 
     * @param hysAuthorNote 作者说说/日记信息
     * @return 结果
     */
    public int insertHysAuthorNote(HysAuthorNote hysAuthorNote);

    /**
     * 修改作者说说/日记信息
     * 
     * @param hysAuthorNote 作者说说/日记信息
     * @return 结果
     */
    public int updateHysAuthorNote(HysAuthorNote hysAuthorNote);

    /**
     * 批量删除作者说说/日记信息
     * 
     * @param authorNoteIds 需要删除的作者说说/日记信息主键集合
     * @return 结果
     */
    public int deleteHysAuthorNoteByAuthorNoteIds(Long[] authorNoteIds);

    /**
     * 删除作者说说/日记信息信息
     * 
     * @param authorNoteId 作者说说/日记信息主键
     * @return 结果
     */
    public int deleteHysAuthorNoteByAuthorNoteId(Long authorNoteId);

    Result getNoteByTime(String limit);

    Result getByAuthorNoteId(Long authorNoteId);
}
