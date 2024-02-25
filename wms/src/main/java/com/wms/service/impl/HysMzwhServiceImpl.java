package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.common.Result;
import com.wms.mapper.HysMzwhMapper;
import com.wms.service.IHysMzwhService;
import com.wms.common.utils.DateUtils;
import com.wms.pojo.HysMzwh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 相关文章信息Service业务层处理
 * 
 * @author hzx
 * @date 2024-02-05
 */
@Service
public class HysMzwhServiceImpl extends ServiceImpl<HysMzwhMapper,HysMzwh> implements IHysMzwhService
{
    @Autowired
    private HysMzwhMapper hysMzwhMapper;

    /**
     * 查询相关文章信息
     * 
     * @param mzwhId 相关文章信息主键
     * @return 相关文章信息
     */
    @Override
    public HysMzwh selectHysMzwhByMzwhId(Long mzwhId)
    {
        return hysMzwhMapper.selectHysMzwhByMzwhId(mzwhId);
    }

    /**
     * 查询相关文章信息列表
     * 
     * @param hysMzwh 相关文章信息
     * @return 相关文章信息
     */
    @Override
    public List<HysMzwh> selectHysMzwhList(HysMzwh hysMzwh)
    {
        return hysMzwhMapper.selectHysMzwhList(hysMzwh);
    }

    /**
     * 新增相关文章信息
     * 
     * @param hysMzwh 相关文章信息
     * @return 结果
     */
    @Override
    public int insertHysMzwh(HysMzwh hysMzwh)
    {
        hysMzwh.setCreateTime(DateUtils.getNowDate());
        return hysMzwhMapper.insertHysMzwh(hysMzwh);
    }

    /**
     * 修改相关文章信息
     * 
     * @param hysMzwh 相关文章信息
     * @return 结果
     */
    @Override
    public int updateHysMzwh(HysMzwh hysMzwh)
    {
        hysMzwh.setUpdateTime(DateUtils.getNowDate());
        return hysMzwhMapper.updateHysMzwh(hysMzwh);
    }

    /**
     * 批量删除相关文章信息
     * 
     * @param mzwhIds 需要删除的相关文章信息主键
     * @return 结果
     */
    @Override
    public int deleteHysMzwhByMzwhIds(Long[] mzwhIds)
    {
        return hysMzwhMapper.deleteHysMzwhByMzwhIds(mzwhIds);
    }

    /**
     * 删除相关文章信息信息
     * 
     * @param mzwhId 相关文章信息主键
     * @return 结果
     */
    @Override
    public int deleteHysMzwhByMzwhId(Long mzwhId)
    {
        return hysMzwhMapper.deleteHysMzwhByMzwhId(mzwhId);
    }

    @Override
    public Result getByType(String type, String currentPage, String pageSize) {
        Page<HysMzwh> notePage = new Page<>(Integer.parseInt(currentPage),Integer.parseInt(pageSize));
        QueryWrapper<HysMzwh> wrapper = new QueryWrapper<>();

        if(StringUtils.hasText(type) && !ObjectUtils.isEmpty(type)){
            wrapper.eq("mzwh_type",type);
        }

        hysMzwhMapper.selectPage(notePage, wrapper);
        if(ObjectUtils.isEmpty(notePage)){
            return Result.fail();
        }else{
            return Result.suc(notePage.getRecords(),notePage.getTotal());
        }
    }

    @Override
    public Result getByUpDesc() {
        QueryWrapper<HysMzwh> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("mzwh_up");
        wrapper.last("limit 6");
        List<HysMzwh> hysMzwhs = hysMzwhMapper.selectList(wrapper);
        if(ObjectUtils.isEmpty(hysMzwhs)){
            return Result.fail();
        }else{
            return Result.suc(hysMzwhs);
        }
    }
}
