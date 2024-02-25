package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.wms.pojo.BaseEntity;
/**
 * 传统文化用户对象 hys_user
 * 
 * @author yzx
 * @date 2024-02-07
 */
@Data
public class HysUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    @TableId(type = IdType.AUTO)
    private Long userId;

    /** 用户账号 */
    private String userName;

    /** 用户昵称 */
    private String nickName;

    /** 密码 */
    private String userPassword;

    /** 年龄 */
    private Long userAge;

    /** 用户性别（0男 1女 2未知） */
    private Long userSex;

    /** 电话 */
    private String userPhone;

    /** 用户邮箱 */
    private String userEmail;

    /** 头像地址 */
    private String userAvatar;

    /** 角色 0超级管理员 1管理员 2普通账号 */
    private Long roleId;

    /** 是否有效 0有效，其他无效 */
    @TableField("isValid")
    private Long isValid;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("nickName", getNickName())
            .append("userPassword", getUserPassword())
            .append("userAge", getUserAge())
            .append("userSex", getUserSex())
            .append("userPhone", getUserPhone())
            .append("userEmail", getUserEmail())
            .append("userAvatar", getUserAvatar())
            .append("roleId", getRoleId())
            .append("isValid", getIsValid())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
