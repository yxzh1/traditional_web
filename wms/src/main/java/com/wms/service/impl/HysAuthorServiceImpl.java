package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.common.Result;
import com.wms.mapper.HysAuthorMapper;
import com.wms.service.IHysAuthorService;
import com.wms.common.utils.DateUtils;
import com.wms.pojo.HysAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 作者信息Service业务层处理
 * 
 * @author yzx
 * @date 2024-02-05
 */
@Service
public class HysAuthorServiceImpl extends ServiceImpl<HysAuthorMapper,HysAuthor> implements IHysAuthorService
{
    @Autowired
    private HysAuthorMapper hysAuthorMapper;

    /**
     * 查询作者信息
     * 
     * @param authorId 作者信息主键
     * @return 作者信息
     */
    @Override
    public HysAuthor selectHysAuthorByAuthorId(Long authorId)
    {
        return hysAuthorMapper.selectHysAuthorByAuthorId(authorId);
    }

    /**
     * 查询作者信息列表
     * 
     * @param hysAuthor 作者信息
     * @return 作者信息
     */
    @Override
    public List<HysAuthor> selectHysAuthorList(HysAuthor hysAuthor)
    {
        return hysAuthorMapper.selectHysAuthorList(hysAuthor);
    }

    /**
     * 新增作者信息
     * 
     * @param hysAuthor 作者信息
     * @return 结果
     */
    @Override
    public int insertHysAuthor(HysAuthor hysAuthor)
    {
        hysAuthor.setCreateTime(DateUtils.getNowDate());
        return hysAuthorMapper.insertHysAuthor(hysAuthor);
    }

    /**
     * 修改作者信息
     * 
     * @param hysAuthor 作者信息
     * @return 结果
     */
    @Override
    public int updateHysAuthor(HysAuthor hysAuthor)
    {
        hysAuthor.setUpdateTime(DateUtils.getNowDate());
        return hysAuthorMapper.updateHysAuthor(hysAuthor);
    }

    /**
     * 批量删除作者信息
     * 
     * @param authorIds 需要删除的作者信息主键
     * @return 结果
     */
    @Override
    public int deleteHysAuthorByAuthorIds(Long[] authorIds)
    {
        return hysAuthorMapper.deleteHysAuthorByAuthorIds(authorIds);
    }

    /**
     * 删除作者信息信息
     * 
     * @param authorId 作者信息主键
     * @return 结果
     */
    @Override
    public int deleteHysAuthorByAuthorId(Long authorId)
    {
        return hysAuthorMapper.deleteHysAuthorByAuthorId(authorId);
    }

    @Override
    public Result getRecommendAuthor(String limit) {
        QueryWrapper<HysAuthor> wrapper = new QueryWrapper<>();
        //wrapper.last("limit "+limit);
        wrapper.last("order by RAND() limit "+limit);

        List<HysAuthor> hysAuthors = hysAuthorMapper.selectList(wrapper);
        if(ObjectUtils.isEmpty(hysAuthors)){
            return Result.fail();
        }else{
            return Result.suc(hysAuthors);
        }

    }

    @Override
    public Result getAuthor(Long id) {
        HysAuthor hysAuthor = hysAuthorMapper.selectById(id);
        if(ObjectUtils.isEmpty(hysAuthor)){
            return Result.fail();
        }else{
            return Result.suc(hysAuthor);
        }
    }
}
