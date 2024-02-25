package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wms.pojo.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 相关文章信息对象 hys_mzwh
 * 
 * @author hzx
 * @date 2024-02-05
 */
public class HysMzwh extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long mzwhId;

    /** 标题 */
    private String mzwhTitle;

    /** 图片地址 */
    private String mzwhCoverImage;

    /** 描述 */
    private String mzwhDescription;

    /** 阅读数 */
    private String mzwhViewCount;

    /** 地址 */
    private String mzwhLocation;

    /** 点赞数 */
    private Long mzwhUp;

    /** 类型 1：热门  2：最新发布 */
    private Long mzwhType;

    public void setMzwhId(Long mzwhId) 
    {
        this.mzwhId = mzwhId;
    }

    public Long getMzwhId() 
    {
        return mzwhId;
    }
    public void setMzwhTitle(String mzwhTitle) 
    {
        this.mzwhTitle = mzwhTitle;
    }

    public String getMzwhTitle() 
    {
        return mzwhTitle;
    }
    public void setMzwhCoverImage(String mzwhCoverImage) 
    {
        this.mzwhCoverImage = mzwhCoverImage;
    }

    public String getMzwhCoverImage() 
    {
        return mzwhCoverImage;
    }
    public void setMzwhDescription(String mzwhDescription) 
    {
        this.mzwhDescription = mzwhDescription;
    }

    public String getMzwhDescription() 
    {
        return mzwhDescription;
    }
    public void setMzwhViewCount(String mzwhViewCount) 
    {
        this.mzwhViewCount = mzwhViewCount;
    }

    public String getMzwhViewCount() 
    {
        return mzwhViewCount;
    }
    public void setMzwhLocation(String mzwhLocation) 
    {
        this.mzwhLocation = mzwhLocation;
    }

    public String getMzwhLocation() 
    {
        return mzwhLocation;
    }
    public void setMzwhUp(Long mzwhUp) 
    {
        this.mzwhUp = mzwhUp;
    }

    public Long getMzwhUp() 
    {
        return mzwhUp;
    }
    public void setMzwhType(Long mzwhType) 
    {
        this.mzwhType = mzwhType;
    }

    public Long getMzwhType() 
    {
        return mzwhType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mzwhId", getMzwhId())
            .append("mzwhTitle", getMzwhTitle())
            .append("mzwhCoverImage", getMzwhCoverImage())
            .append("mzwhDescription", getMzwhDescription())
            .append("mzwhViewCount", getMzwhViewCount())
            .append("mzwhLocation", getMzwhLocation())
            .append("mzwhUp", getMzwhUp())
            .append("mzwhType", getMzwhType())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
