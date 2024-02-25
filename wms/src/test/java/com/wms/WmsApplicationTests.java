package com.wms;

import com.wms.common.utils.Constants;
import com.wms.common.utils.FilenameUtils;
import com.wms.common.utils.Seq;
import com.wms.service.IHysUserService;
import com.wms.pojo.HysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

@SpringBootTest
class WmsApplicationTests {
    @Autowired
    private IHysUserService hysUserService;

    @Test
    void contextLoads() throws FileNotFoundException {
        System.out.println("Constants.ProjectPath-->"+Constants.ProjectPath);
        String uploadPath = null;
        uploadPath = ResourceUtils.getURL("travelFiles").getPath();
        System.out.println("uploadPath:" + uploadPath);
    }

}
