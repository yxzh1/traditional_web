package com.wms.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 民族服饰表
 * </p>
 *
 * @author yzx
 * @since 2024-02-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="HysDress对象", description="民族服饰表")
public class HysDress extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "dress_id", type = IdType.AUTO)
    private Integer dressId;

    @ApiModelProperty(value = "标题")
    private String dressTitle;

    @ApiModelProperty(value = "图片地址")
    private String dressThumbnail;

    @ApiModelProperty(value = "描述")
    private String dressDescription;

    @ApiModelProperty(value = "阅读数")
    private Integer dressView;

    @ApiModelProperty(value = "作者id")
    private Integer dressWriterId;

    @ApiModelProperty(value = "文章详情")
    private String dressContent;

    @ApiModelProperty(value = "发表时间")
    private LocalDateTime dressPublishTime;
}
