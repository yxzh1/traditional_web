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
 * 非遗表
 * </p>
 *
 * @author yzx
 * @since 2024-02-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="HysHeritage对象", description="非遗表")
public class HysHeritage extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "heritage_id", type = IdType.AUTO)
    private Integer heritageId;

    @ApiModelProperty(value = "标题")
    private String heritageTitle;

    @ApiModelProperty(value = "图片地址")
    private String heritageThumbnail;

    @ApiModelProperty(value = "描述")
    private String heritageDescription;

    @ApiModelProperty(value = "阅读数")
    private Integer heritageView;

    @ApiModelProperty(value = "作者id")
    private Integer heritageWriterId;

    @ApiModelProperty(value = "文章详情")
    private String heritageContent;

    @ApiModelProperty(value = "发表时间")
    private LocalDateTime heritagesPublishTime;

}
