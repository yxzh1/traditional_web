package com.wms.service;

import com.wms.common.Result;
import com.wms.pojo.HysDress;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 民族服饰表 服务类
 * </p>
 *
 * @author yzx
 * @since 2024-02-18
 */
public interface IHysDressService extends IService<HysDress> {

    public Result selectHysDressList(HysDress hysDress);

    public HysDress selectHysDressByDressId(Long dressId);

    Result getByDressId(Long dressId);
}
