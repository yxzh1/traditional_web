package com.wms.mapper;

import com.wms.pojo.HysDress;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 民族服饰表 Mapper 接口
 * </p>
 *
 * @author yzx
 * @since 2024-02-18
 */
@Mapper
public interface HysDressMapper extends BaseMapper<HysDress> {
    Map<String, Object> getByDressId(Long dressId);
}
