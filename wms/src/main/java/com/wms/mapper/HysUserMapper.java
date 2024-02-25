package com.wms.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.pojo.HysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 传统文化用户Mapper接口
 * 
 * @author yzx
 * @date 2024-02-07
 */
@Repository
public interface HysUserMapper extends BaseMapper<HysUser>
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
     * 删除传统文化用户
     * 
     * @param userId 传统文化用户主键
     * @return 结果
     */
    public int deleteHysUserByUserId(Long userId);

    /**
     * 批量删除传统文化用户
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHysUserByUserIds(Long[] userIds);

    HysUser selectByNamePass(String username, String password);
}
