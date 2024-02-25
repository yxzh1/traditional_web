package com.wms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.common.Result;
import com.wms.pojo.HysMzwhDetail;

import java.util.List;

/**
 * 相关文章详细信息Service接口
 * 
 * @author yzx
 * @date 2024-02-05
 */
public interface IHysMzwhDetailService extends IService<HysMzwhDetail>
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
     * 批量删除相关文章详细信息
     * 
     * @param mzwhDetailIds 需要删除的相关文章详细信息主键集合
     * @return 结果
     */
    public int deleteHysMzwhDetailByMzwhDetailIds(Long[] mzwhDetailIds);

    /**
     * 删除相关文章详细信息信息
     * 
     * @param mzwhDetailId 相关文章详细信息主键
     * @return 结果
     */
    public int deleteHysMzwhDetailByMzwhDetailId(Long mzwhDetailId);

    Result getByTnId(Long tnId);
}
