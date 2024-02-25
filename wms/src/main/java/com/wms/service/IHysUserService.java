package com.wms.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.pojo.HysUser;

import java.util.List;

/**
 * 传统文化用户Service接口
 * 
 * @author yzx
 * @date 2024-02-07
 */
public interface IHysUserService extends IService<HysUser>
{
    /**
     * 查询传统文化用户
     * 
     * @param userId 传统文化用户主键
     * @return 传统文化用户
     */
    public HysUser selectHysUserByUserId(Long userId);

    /**
     * 查询传统文化用户列表
     * 
     * @param hysUser 传统文化用户
     * @return 传统文化用户集合
     */
    public List<HysUser> selectHysUserList(HysUser hysUser);

    /**
     * 新增传统文化用户
     * 
     * @param hysUser 传统文化用户
     * @return 结果
     */
    public int insertHysUser(HysUser hysUser);

    /**
     * 修改传统文化用户
     * 
     * @param hysUser 传统文化用户
     * @return 结果
     */
    public int updateHysUser(HysUser hysUser);

    /**
     * 批量删除传统文化用户
     * 
     * @param userIds 需要删除的传统文化用户主键集合
     * @return 结果
     */
    public int deleteHysUserByUserIds(Long[] userIds);

    /**
     * 删除传统文化用户信息
     * 
     * @param userId 传统文化用户主键
     * @return 结果
     */
    public int deleteHysUserByUserId(Long userId);

    HysUser selectByNamePass(String username, String password);
}
