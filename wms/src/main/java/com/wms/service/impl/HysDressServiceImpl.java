package com.wms.service.impl;

import cn.hutool.core.io.file.FileReader;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.Result;
import com.wms.common.utils.Constants;
import com.wms.pojo.HysDress;
import com.wms.mapper.HysDressMapper;
import com.wms.pojo.HysMzwh;
import com.wms.service.IHysDressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 民族服饰表 服务实现类
 * </p>
 *
 * @author yzx
 * @since 2024-02-18
 */
@Service
public class HysDressServiceImpl extends ServiceImpl<HysDressMapper, HysDress> implements IHysDressService {
    @Autowired
    private HysDressMapper hysDressMapper;

    @Override
    public Result selectHysDressList(HysDress hysDress) {
        Page<HysDress> notePage = new Page<>(1,6);

        hysDressMapper.selectPage(notePage, null);
        if(ObjectUtils.isEmpty(notePage)){
            return Result.fail();
        }else{
            return Result.suc(notePage.getRecords(),notePage.getTotal());
        }
    }

    @Override
    public HysDress selectHysDressByDressId(Long dressId) {

        return hysDressMapper.selectById(dressId);
    }

    @Override
    public Result getByDressId(Long dressId) {
        Map<String, Object> byDressId = hysDressMapper.getByDressId(dressId);
        System.out.println("hysDress--->" + byDressId);
        String content_url = (String) byDressId.get("dress_content");
        FileReader fileReader = new FileReader(Constants.ProjectPath + content_url);
        String s = fileReader.readString();
        try {
            byDressId.put("dress_content",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.suc(byDressId);

    }
}
