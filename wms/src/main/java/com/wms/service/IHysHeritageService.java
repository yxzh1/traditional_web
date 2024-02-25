package com.wms.service;

import com.wms.common.Result;
import com.wms.pojo.HysHeritage;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 非遗表 服务类
 * </p>
 *
 * @author yzx
 * @since 2024-02-19
 */
public interface IHysHeritageService extends IService<HysHeritage> {

    Result selectHeritageList(HysHeritage hysHeritage);

    HysHeritage selectHeritageByHeritageId(Long heritageId);

    Result getByHeritageId(Long heritageId);
}
