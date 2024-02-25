package com.wms.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.file.FileWriter;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.common.Result;
import com.wms.common.config.TradConfig;
import com.wms.common.utils.*;
import com.wms.mapper.HysMzwhDetailMapper;
import com.wms.service.IHysMzwhDetailService;
import com.wms.pojo.HysMzwhDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hutool.core.io.file.FileReader;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

/**
 * 相关文章详细信息Service业务层处理
 * 
 * @author yzx
 * @date 2024-02-05
 */
@Service
public class HysMzwhDetailServiceImpl extends ServiceImpl<HysMzwhDetailMapper,HysMzwhDetail> implements IHysMzwhDetailService
{
    @Autowired
    private HysMzwhDetailMapper hysMzwhDetailMapper;

    /**
     * 查询相关文章详细信息
     * 
     * @param mzwhDetailId 相关文章详细信息主键
     * @return 相关文章详细信息
     */
    @Override
    public HysMzwhDetail selectHysMzwhDetailByMzwhDetailId(Long mzwhDetailId)
    {
        return hysMzwhDetailMapper.selectHysMzwhDetailByMzwhDetailId(mzwhDetailId);
    }

    /**
     * 查询相关文章详细信息列表
     * 
     * @param hysMzwhDetail 相关文章详细信息
     * @return 相关文章详细信息
     */
    @Override
    public List<HysMzwhDetail> selectHysMzwhDetailList(HysMzwhDetail hysMzwhDetail)
    {
        return hysMzwhDetailMapper.selectHysMzwhDetailList(hysMzwhDetail);
    }

    /**
     * 新增相关文章详细信息
     * 
     * @param hysMzwhDetail 相关文章详细信息
     * @return 结果
     */
    @Override
    public int insertHysMzwhDetail(HysMzwhDetail hysMzwhDetail)
    {
        String mzwhDetailContent = hysMzwhDetail.getMzwhDetailContent();
        // 根据日期动态的生成目录
        String uploadPath = null;
        String relativePath = "";

        uploadPath = TradConfig.getHtmlfile();
        System.out.println("uploadPath --->" + uploadPath);
        File dateDirPath = new File(uploadPath);
        if (!dateDirPath.exists()) {
            dateDirPath.mkdirs();
        }
        relativePath = "/files/" + DateUtil.today() + "/" +  FilenameUtils.getBaseName(Seq.getId(Seq.uploadSeqType)) +".html";
        log.warn("上传文件路径："+relativePath);
        FileWriter writer = new FileWriter(uploadPath + relativePath);
        writer.write(mzwhDetailContent);

        hysMzwhDetail.setMzwhDetailContent(relativePath);
        hysMzwhDetail.setCreateTime(DateUtils.getNowDate());
        return hysMzwhDetailMapper.insertHysMzwhDetail(hysMzwhDetail);
    }

    /**
     * 修改相关文章详细信息
     * 
     * @param hysMzwhDetail 相关文章详细信息
     * @return 结果
     */
    @Override
    public int updateHysMzwhDetail(HysMzwhDetail hysMzwhDetail)
    {
        hysMzwhDetail.setUpdateTime(DateUtils.getNowDate());
        return hysMzwhDetailMapper.updateHysMzwhDetail(hysMzwhDetail);
    }

    /**
     * 批量删除相关文章详细信息
     * 
     * @param mzwhDetailIds 需要删除的相关文章详细信息主键
     * @return 结果
     */
    @Override
    public int deleteHysMzwhDetailByMzwhDetailIds(Long[] mzwhDetailIds)
    {
        return hysMzwhDetailMapper.deleteHysMzwhDetailByMzwhDetailIds(mzwhDetailIds);
    }

    /**
     * 删除相关文章详细信息信息
     * 
     * @param mzwhDetailId 相关文章详细信息主键
     * @return 结果
     */
    @Override
    public int deleteHysMzwhDetailByMzwhDetailId(Long mzwhDetailId)
    {
        return hysMzwhDetailMapper.deleteHysMzwhDetailByMzwhDetailId(mzwhDetailId);
    }

    @Override
    public Result getByTnId(Long tnId) {
        Map<String, Object> byTnId = hysMzwhDetailMapper.getByTnId(tnId);
        String content_url = (String) byTnId.get("mzwh_detail_content");
        FileReader fileReader = new FileReader(Constants.ProjectPath + content_url);
        String s = fileReader.readString();
        try {
            byTnId.put("mzwh_detail_content",s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.suc(byTnId);

    }
}
