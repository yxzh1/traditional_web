package com.wms.mapper;

import com.wms.pojo.HysHeritage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * <p>
 * 非遗表 Mapper 接口
 * </p>
 *
 * @author yzx
 * @since 2024-02-19
 */
@Mapper
public interface HysHeritageMapper extends BaseMapper<HysHeritage> {

    Map<String, Object> getByHeritageId(Long heritageId);
}
