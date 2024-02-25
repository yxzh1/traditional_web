package com.wms.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.pojo.HysMzwhDetail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 相关文章详细信息Mapper接口
 * 
 * @author yzx
 * @date 2024-02-05
 */
@Repository
public interface HysMzwhDetailMapper extends BaseMapper<HysMzwhDetail>
{
    /**
     * 查询相关文章详细信息
     * 
     * @param mzwhDetailId 相关文章详细信息主键
     * @return 相关文章详细信息
     */
    public HysMzwhDetail selectHysMzwhDetailByMzwhDetailId(Long mzwhDetailId);

    /**
     * 查询相关文章详细信息列表
     * 
     * @param hysMzwhDetail 相关文章详细信息
     * @return 相关文章详细信息集合
     */
    public List<HysMzwhDetail> selectHysMzwhDetailList(HysMzwhDetail hysMzwhDetail);

    /**
     * 新增相关文章详细信息
     * 
     * @param hysMzwhDetail 相关文章详细信息
     * @return 结果
     */
    public int insertHysMzwhDetail(HysMzwhDetail hysMzwhDetail);

    /**
     * 修改相关文章详细信息
     * 
     * @param hysMzwhDetail 相关文章详细信息
     * @return 结果
     */
    public int updateHysMzwhDetail(HysMzwhDetail hysMzwhDetail);

    /**
     * 删除相关文章详细信息
     * 
     * @param mzwhDetailId 相关文章详细信息主键
     * @return 结果
     */
    public int deleteHysMzwhDetailByMzwhDetailId(Long mzwhDetailId);

    /**
     * 批量删除相关文章详细信息
     * 
     * @param mzwhDetailIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHysMzwhDetailByMzwhDetailIds(Long[] mzwhDetailIds);

    Map<String, Object> getByTnId(Long tnId);
}
