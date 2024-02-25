package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.wms.pojo.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 作者说说/日记信息对象 hys_author_note
 * 
 * @author yzx
 * @date 2024-02-05
 */
public class HysAuthorNote extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long authorNoteId;

    /** 标题 */
    private String authorNoteTitle;

    /** 图片地址 */
    private String authorNoteThumbnail;

    /** 描述 */
    private String authorNoteDescription;

    /** 阅读数 */
    private Long authorNoteView;

    /** 作者id */
    private Long authorNoteWriterId;

    /** 文章详情 */
    private String authorNoteDetailContent;

    /** 发表时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date authorNotePublishTime;

    public void setAuthorNoteId(Long authorNoteId) 
    {
        this.authorNoteId = authorNoteId;
    }

    public Long getAuthorNoteId() 
    {
        return authorNoteId;
    }
    public void setAuthorNoteTitle(String authorNoteTitle) 
    {
        this.authorNoteTitle = authorNoteTitle;
    }

    public String getAuthorNoteTitle() 
    {
        return authorNoteTitle;
    }
    public void setAuthorNoteThumbnail(String authorNoteThumbnail) 
    {
        this.authorNoteThumbnail = authorNoteThumbnail;
    }

    public String getAuthorNoteThumbnail() 
    {
        return authorNoteThumbnail;
    }
    public void setAuthorNoteDescription(String authorNoteDescription) 
    {
        this.authorNoteDescription = authorNoteDescription;
    }

    public String getAuthorNoteDescription() 
    {
        return authorNoteDescription;
    }
    public void setAuthorNoteView(Long authorNoteView) 
    {
        this.authorNoteView = authorNoteView;
    }

    public Long getAuthorNoteView() 
    {
        return authorNoteView;
    }
    public void setAuthorNoteWriterId(Long authorNoteWriterId) 
    {
        this.authorNoteWriterId = authorNoteWriterId;
    }

    public Long getAuthorNoteWriterId() 
    {
        return authorNoteWriterId;
    }
    public void setAuthorNoteDetailContent(String authorNoteDetailContent) 
    {
        this.authorNoteDetailContent = authorNoteDetailContent;
    }

    public String getAuthorNoteDetailContent() 
    {
        return authorNoteDetailContent;
    }
    public void setAuthorNotePublishTime(Date authorNotePublishTime) 
    {
        this.authorNotePublishTime = authorNotePublishTime;
    }

    public Date getAuthorNotePublishTime() 
    {
        return authorNotePublishTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("authorNoteId", getAuthorNoteId())
            .append("authorNoteTitle", getAuthorNoteTitle())
            .append("authorNoteThumbnail", getAuthorNoteThumbnail())
            .append("authorNoteDescription", getAuthorNoteDescription())
            .append("authorNoteView", getAuthorNoteView())
            .append("authorNoteWriterId", getAuthorNoteWriterId())
            .append("authorNoteDetailContent", getAuthorNoteDetailContent())
            .append("authorNotePublishTime", getAuthorNotePublishTime())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
