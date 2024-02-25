package com.wms.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.pojo.HysMzwh;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 相关文章信息Mapper接口
 * 
 * @author hzx
 * @date 2024-02-05
 */
@Repository
public interface HysMzwhMapper extends BaseMapper<HysMzwh>
{
    /**
     * 查询相关文章信息
     * 
     * @param mzwhId 相关文章信息主键
     * @return 相关文章信息
     */
    public HysMzwh selectHysMzwhByMzwhId(Long mzwhId);

    /**
     * 查询相关文章信息列表
     * 
     * @param hysMzwh 相关文章信息
     * @return 相关文章信息集合
     */
    public List<HysMzwh> selectHysMzwhList(HysMzwh hysMzwh);

    /**
     * 新增相关文章信息
     * 
     * @param hysMzwh 相关文章信息
     * @return 结果
     */
    public int insertHysMzwh(HysMzwh hysMzwh);

    /**
     * 修改相关文章信息
     * 
     * @param hysMzwh 相关文章信息
     * @return 结果
     */
    public int updateHysMzwh(HysMzwh hysMzwh);

    /**
     * 删除相关文章信息
     * 
     * @param mzwhId 相关文章信息主键
     * @return 结果
     */
    public int deleteHysMzwhByMzwhId(Long mzwhId);

    /**
     * 批量删除相关文章信息
     * 
     * @param mzwhIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHysMzwhByMzwhIds(Long[] mzwhIds);
}
