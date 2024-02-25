package com.wms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.common.Result;
import com.wms.pojo.HysAuthor;

import java.util.List;

/**
 * 作者信息Service接口
 * 
 * @author yzx
 * @date 2024-02-05
 */
public interface IHysAuthorService extends IService<HysAuthor>
{
    /**
     * 查询作者信息
     * 
     * @param authorId 作者信息主键
     * @return 作者信息
     */
    public HysAuthor selectHysAuthorByAuthorId(Long authorId);

    /**
     * 查询作者信息列表
     * 
     * @param hysAuthor 作者信息
     * @return 作者信息集合
     */
    public List<HysAuthor> selectHysAuthorList(HysAuthor hysAuthor);

    /**
     * 新增作者信息
     * 
     * @param hysAuthor 作者信息
     * @return 结果
     */
    public int insertHysAuthor(HysAuthor hysAuthor);

    /**
     * 修改作者信息
     * 
     * @param hysAuthor 作者信息
     * @return 结果
     */
    public int updateHysAuthor(HysAuthor hysAuthor);

    /**
     * 批量删除作者信息
     * 
     * @param authorIds 需要删除的作者信息主键集合
     * @return 结果
     */
    public int deleteHysAuthorByAuthorIds(Long[] authorIds);

    /**
     * 删除作者信息信息
     * 
     * @param authorId 作者信息主键
     * @return 结果
     */
    public int deleteHysAuthorByAuthorId(Long authorId);

    Result getRecommendAuthor(String limit);

    Result getAuthor(Long id);
}
