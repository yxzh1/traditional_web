package com.wms.service.impl;

import cn.hutool.core.io.file.FileReader;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.Result;
import com.wms.common.utils.Constants;
import com.wms.pojo.HysDress;
import com.wms.pojo.HysHeritage;
import com.wms.mapper.HysHeritageMapper;
import com.wms.service.IHysHeritageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 非遗表 服务实现类
 * </p>
 *
 * @author yzx
 * @since 2024-02-19
 */
@Service
public class HysHeritageServiceImpl extends ServiceImpl<HysHeritageMapper, HysHeritage> implements IHysHeritageService {

    @Autowired
    private HysHeritageMapper hysHeritageMapper;
    @Override
    public Result selectHeritageList(HysHeritage hysHeritage) {
        Page<HysHeritage> notePage = new Page<>(1,6);

        hysHeritageMapper.selectPage(notePage, null);
        if(ObjectUtils.isEmpty(notePage)){
            return Result.fail();
        }else{
            return Result.suc(notePage.getRecords(),notePage.getTotal());
        }

    }

    @Override
    public HysHeritage selectHeritageByHeritageId(Long heritageId) {
        return hysHeritageMapper.selectById(heritageId);
    }

    @Override
    public Result getByHeritageId(Long heritageId) {
        Map<String, Object> byDressId = hysHeritageMapper.getByHeritageId(heritageId);
        String content_url = (String) byDressId.get("heritage_content");
        FileReader fileReader = new FileReader(Constants.ProjectPath + content_url);
        String s = fileReader.readString();
        try {
            byDressId.put("heritage_content",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.suc(byDressId);
    }
}
