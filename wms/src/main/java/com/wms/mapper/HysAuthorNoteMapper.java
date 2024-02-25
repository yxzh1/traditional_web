package com.wms.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.pojo.HysAuthorNote;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 作者说说/日记信息Mapper接口
 * 
 * @author yzx
 * @date 2024-02-05
 */
@Repository
public interface HysAuthorNoteMapper extends BaseMapper<HysAuthorNote>
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
     * 删除作者说说/日记信息
     * 
     * @param authorNoteId 作者说说/日记信息主键
     * @return 结果
     */
    public int deleteHysAuthorNoteByAuthorNoteId(Long authorNoteId);

    /**
     * 批量删除作者说说/日记信息
     * 
     * @param authorNoteIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHysAuthorNoteByAuthorNoteIds(Long[] authorNoteIds);

    Map<String, Object> getByAuthorNoteId(Long authorNoteId);
}
