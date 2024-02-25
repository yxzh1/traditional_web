package com.wms.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.pojo.HysAuthor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者信息Mapper接口
 * 
 * @author yzx
 * @date 2024-02-05
 */
@Repository
public interface HysAuthorMapper extends BaseMapper<HysAuthor>
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
     * 删除作者信息
     * 
     * @param authorId 作者信息主键
     * @return 结果
     */
    public int deleteHysAuthorByAuthorId(Long authorId);

    /**
     * 批量删除作者信息
     * 
     * @param authorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHysAuthorByAuthorIds(Long[] authorIds);
}
