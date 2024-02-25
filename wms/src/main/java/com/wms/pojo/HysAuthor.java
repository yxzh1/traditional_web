package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wms.pojo.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 作者信息对象 hys_author
 * 
 * @author yzx
 * @date 2024-02-05
 */
public class HysAuthor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long authorId;

    /** 作者名字 */
    private String authorName;

    /** 描述 */
    private String authorDescription;

    /** 头像 */
    private String authorAvatar;

    public void setAuthorId(Long authorId) 
    {
        this.authorId = authorId;
    }

    public Long getAuthorId() 
    {
        return authorId;
    }
    public void setAuthorName(String authorName) 
    {
        this.authorName = authorName;
    }

    public String getAuthorName() 
    {
        return authorName;
    }
    public void setAuthorDescription(String authorDescription) 
    {
        this.authorDescription = authorDescription;
    }

    public String getAuthorDescription() 
    {
        return authorDescription;
    }
    public void setAuthorAvatar(String authorAvatar) 
    {
        this.authorAvatar = authorAvatar;
    }

    public String getAuthorAvatar() 
    {
        return authorAvatar;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("authorId", getAuthorId())
            .append("authorName", getAuthorName())
            .append("authorDescription", getAuthorDescription())
            .append("authorAvatar", getAuthorAvatar())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
