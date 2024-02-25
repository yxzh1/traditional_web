package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.common.utils.DateUtils;
import com.wms.mapper.HysUserMapper;
import com.wms.service.IHysUserService;
import com.wms.pojo.HysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 传统文化用户Service业务层处理
 * 
 * @author yzx
 * @date 2024-02-07
 */
@Service
public class HysUserServiceImpl extends ServiceImpl<HysUserMapper,HysUser> implements IHysUserService
{
    @Autowired
    private HysUserMapper hysUserMapper;

    /**
     * 查询传统文化用户
     * 
     * @param userId 传统文化用户主键
     * @return 传统文化用户
     */
    @Override
    public HysUser selectHysUserByUserId(Long userId)
    {
        return hysUserMapper.selectHysUserByUserId(userId);
    }

    /**
     * 查询传统文化用户列表
     * 
     * @param hysUser 传统文化用户
     * @return 传统文化用户
     */
    @Override
    public List<HysUser> selectHysUserList(HysUser hysUser)
    {
        return hysUserMapper.selectHysUserList(hysUser);
    }

    /**
     * 新增传统文化用户
     * 
     * @param hysUser 传统文化用户
     * @return 结果
     */
    @Override
    public int insertHysUser(HysUser hysUser)
    {
        hysUser.setCreateTime(DateUtils.getNowDate());
        return hysUserMapper.insertHysUser(hysUser);
    }

    /**
     * 修改传统文化用户
     * 
     * @param hysUser 传统文化用户
     * @return 结果
     */
    @Override
    public int updateHysUser(HysUser hysUser)
    {
        hysUser.setUpdateTime(DateUtils.getNowDate());
        return hysUserMapper.updateHysUser(hysUser);
    }

    /**
     * 批量删除传统文化用户
     * 
     * @param userIds 需要删除的传统文化用户主键
     * @return 结果
     */
    @Override
    public int deleteHysUserByUserIds(Long[] userIds)
    {
        return hysUserMapper.deleteHysUserByUserIds(userIds);
    }

    /**
     * 删除传统文化用户信息
     * 
     * @param userId 传统文化用户主键
     * @return 结果
     */
    @Override
    public int deleteHysUserByUserId(Long userId)
    {
        return hysUserMapper.deleteHysUserByUserId(userId);
    }

    @Override
    public HysUser selectByNamePass(String username, String password) {
        return hysUserMapper.selectByNamePass(username,password);
    }
}
