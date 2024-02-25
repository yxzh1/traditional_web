package com.wms.service.impl;

import cn.hutool.core.io.file.FileReader;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.common.Result;
import com.wms.common.utils.Constants;
import com.wms.mapper.HysAuthorNoteMapper;
import com.wms.service.IHysAuthorNoteService;
import com.wms.common.utils.DateUtils;
import com.wms.pojo.HysAuthorNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

/**
 * 作者说说/日记信息Service业务层处理
 * 
 * @author yzx
 * @date 2024-02-05
 */
@Service
public class HysAuthorNoteServiceImpl extends ServiceImpl<HysAuthorNoteMapper,HysAuthorNote> implements IHysAuthorNoteService
{
    @Autowired
    private HysAuthorNoteMapper hysAuthorNoteMapper;

    /**
     * 查询作者说说/日记信息
     * 
     * @param authorNoteId 作者说说/日记信息主键
     * @return 作者说说/日记信息
     */
    @Override
    public HysAuthorNote selectHysAuthorNoteByAuthorNoteId(Long authorNoteId)
    {
        return hysAuthorNoteMapper.selectHysAuthorNoteByAuthorNoteId(authorNoteId);
    }

    /**
     * 查询作者说说/日记信息列表
     * 
     * @param hysAuthorNote 作者说说/日记信息
     * @return 作者说说/日记信息
     */
    @Override
    public List<HysAuthorNote> selectHysAuthorNoteList(HysAuthorNote hysAuthorNote)
    {
        return hysAuthorNoteMapper.selectHysAuthorNoteList(hysAuthorNote);
    }

    /**
     * 新增作者说说/日记信息
     * 
     * @param hysAuthorNote 作者说说/日记信息
     * @return 结果
     */
    @Override
    public int insertHysAuthorNote(HysAuthorNote hysAuthorNote)
    {
        hysAuthorNote.setCreateTime(DateUtils.getNowDate());
        return hysAuthorNoteMapper.insertHysAuthorNote(hysAuthorNote);
    }

    /**
     * 修改作者说说/日记信息
     * 
     * @param hysAuthorNote 作者说说/日记信息
     * @return 结果
     */
    @Override
    public int updateHysAuthorNote(HysAuthorNote hysAuthorNote)
    {
        hysAuthorNote.setUpdateTime(DateUtils.getNowDate());
        return hysAuthorNoteMapper.updateHysAuthorNote(hysAuthorNote);
    }

    /**
     * 批量删除作者说说/日记信息
     * 
     * @param authorNoteIds 需要删除的作者说说/日记信息主键
     * @return 结果
     */
    @Override
    public int deleteHysAuthorNoteByAuthorNoteIds(Long[] authorNoteIds)
    {
        return hysAuthorNoteMapper.deleteHysAuthorNoteByAuthorNoteIds(authorNoteIds);
    }

    /**
     * 删除作者说说/日记信息信息
     * 
     * @param authorNoteId 作者说说/日记信息主键
     * @return 结果
     */
    @Override
    public int deleteHysAuthorNoteByAuthorNoteId(Long authorNoteId)
    {
        return hysAuthorNoteMapper.deleteHysAuthorNoteByAuthorNoteId(authorNoteId);
    }

    @Override
    public Result getNoteByTime(String limit) {
        QueryWrapper<HysAuthorNote> wrapper = new QueryWrapper<>();
//        wrapper.orderByDesc("author_note_publish_time","author_note_view");
        wrapper.last("limit "+limit);
        List<HysAuthorNote> noteList = hysAuthorNoteMapper.selectList(wrapper);
        if(ObjectUtils.isEmpty(noteList)){
            return Result.fail();
        }else{
            return Result.suc(noteList);
        }
    }

    @Override
    public Result getByAuthorNoteId(Long authorNoteId) {
        Map<String, Object> byDressId = hysAuthorNoteMapper.getByAuthorNoteId(authorNoteId);
        String content_url = (String) byDressId.get("author_note_detail_content");
        FileReader fileReader = new FileReader(Constants.ProjectPath + content_url);
        String s = fileReader.readString();
        try {
            byDressId.put("author_note_detail_content",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.suc(byDressId);
    }
}
