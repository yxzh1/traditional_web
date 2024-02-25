package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wms.pojo.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 相关文章详细信息对象 hys_mzwh_detail
 * 
 * @author yzx
 * @date 2024-02-05
 */
public class HysMzwhDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long mzwhDetailId;

    /** 关联id */
    private Long mzwhDetailTnId;

    /** 发表人头像 */
    private String mzwhDetailPubliserAvatar;

    /** 发布人名字 */
    private String mzwhDetailPubliserName;

    /** 发布时间 */
    private String mzwhDetailPublishTime;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date mzwhDetailStartTime;

    /** 天 */
    private String mzwhDetailDay;

    /** 花费 */
    private String mzwhDetailCost;

    /** 关联页面html */
    private String mzwhDetailContent;

    public void setMzwhDetailId(Long mzwhDetailId) 
    {
        this.mzwhDetailId = mzwhDetailId;
    }

    public Long getMzwhDetailId() 
    {
        return mzwhDetailId;
    }
    public void setMzwhDetailTnId(Long mzwhDetailTnId) 
    {
        this.mzwhDetailTnId = mzwhDetailTnId;
    }

    public Long getMzwhDetailTnId() 
    {
        return mzwhDetailTnId;
    }
    public void setMzwhDetailPubliserAvatar(String mzwhDetailPubliserAvatar) 
    {
        this.mzwhDetailPubliserAvatar = mzwhDetailPubliserAvatar;
    }

    public String getMzwhDetailPubliserAvatar() 
    {
        return mzwhDetailPubliserAvatar;
    }
    public void setMzwhDetailPubliserName(String mzwhDetailPubliserName) 
    {
        this.mzwhDetailPubliserName = mzwhDetailPubliserName;
    }

    public String getMzwhDetailPubliserName() 
    {
        return mzwhDetailPubliserName;
    }
    public void setMzwhDetailPublishTime(String mzwhDetailPublishTime) 
    {
        this.mzwhDetailPublishTime = mzwhDetailPublishTime;
    }

    public String getMzwhDetailPublishTime() 
    {
        return mzwhDetailPublishTime;
    }
    public void setMzwhDetailStartTime(Date mzwhDetailStartTime) 
    {
        this.mzwhDetailStartTime = mzwhDetailStartTime;
    }

    public Date getMzwhDetailStartTime() 
    {
        return mzwhDetailStartTime;
    }
    public void setMzwhDetailDay(String mzwhDetailDay) 
    {
        this.mzwhDetailDay = mzwhDetailDay;
    }

    public String getMzwhDetailDay() 
    {
        return mzwhDetailDay;
    }
    public void setMzwhDetailCost(String mzwhDetailCost) 
    {
        this.mzwhDetailCost = mzwhDetailCost;
    }

    public String getMzwhDetailCost() 
    {
        return mzwhDetailCost;
    }
    public void setMzwhDetailContent(String mzwhDetailContent) 
    {
        this.mzwhDetailContent = mzwhDetailContent;
    }

    public String getMzwhDetailContent() 
    {
        return mzwhDetailContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mzwhDetailId", getMzwhDetailId())
            .append("mzwhDetailTnId", getMzwhDetailTnId())
            .append("mzwhDetailPubliserAvatar", getMzwhDetailPubliserAvatar())
            .append("mzwhDetailPubliserName", getMzwhDetailPubliserName())
            .append("mzwhDetailPublishTime", getMzwhDetailPublishTime())
            .append("mzwhDetailStartTime", getMzwhDetailStartTime())
            .append("mzwhDetailDay", getMzwhDetailDay())
            .append("mzwhDetailCost", getMzwhDetailCost())
            .append("mzwhDetailContent", getMzwhDetailContent())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
