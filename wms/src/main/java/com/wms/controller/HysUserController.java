package com.wms.controller;

import com.google.code.kaptcha.Producer;
import com.wf.captcha.SpecCaptcha;
import com.wf.captcha.base.Captcha;
import com.wf.captcha.utils.CaptchaUtil;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.pojo.HysUser;
import com.wms.service.IHysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 传统文化用户Controller
 * 
 * @author yzx
 * @date 2024-02-07
 */
@RestController
@Slf4j
@RequestMapping("/hys/user")
public class HysUserController
{
    @Autowired
    private IHysUserService hysUserService;

    @Resource(name = "captchaProducer")
    private Producer captchaProducer;

    //登录
    @PostMapping("/login")
    public Result login(@RequestBody QueryPageParam queryPageParam, HttpSession session){
        String username = (String) queryPageParam.getParam().get("username");
        String password = (String) queryPageParam.getParam().get("password");
        String verify_code = (String) queryPageParam.getParam().get("verify_code");
        log.warn("verify_code===>" + verify_code);
        log.warn("username===>" + username);
        log.warn("password===>" + password);
        String session_verify = (String) session.getAttribute("verify_code");
        log.warn("session_verify===>" + session_verify);
        if(!verify_code.equals(session_verify)){
            System.out.println("验证码错误，请重输");
            return Result.fail();
        }

        List<HysUser> list = hysUserService.lambdaQuery()
                .eq(HysUser::getUserName,username)
                .eq(HysUser::getUserPassword,password).list();

        if(list.size()>0){
            HysUser user1 = hysUserService.selectByNamePass(username,password);
//            List<Menu> list1 = menuService.lambdaQuery().like(Menu::getMenuRight, user1.getRoleId()).list();
            HashMap<String,Object> hashMap = new HashMap<String,Object>();
            hashMap.put("user",user1);
            hashMap.put("menu",null);
            return Result.suc(hashMap);
        }
        return Result.fail();
    }
    @GetMapping("/captchaImage")
    public void getKaptchaImage(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        // 三个参数分别为宽、高、位数
        SpecCaptcha specCaptcha = new SpecCaptcha(130, 48, 4);
        // 设置字体
        specCaptcha.setFont(new Font("Verdana", Font.PLAIN, 32));  // 有默认字体，可以不用设置
        // 设置类型，纯数字、纯字母、字母数字混合
        specCaptcha.setCharType(Captcha.TYPE_ONLY_NUMBER);

        String text = specCaptcha.text();
        System.out.println("验证码=========>" + text);
        session.setAttribute("verify_code", text);

        // 输出图片流
        CaptchaUtil.out(specCaptcha, request, response);
    }

    /**
     * 查询传统文化用户列表
     */
    @GetMapping("/list")
    public Result list(HysUser hysUser)
    {
       return Result.suc(hysUserService.selectHysUserList(hysUser));
    }


    /**
     * 获取传统文化用户详细信息
     */
    @GetMapping(value = "/{userId}")
    public Result getInfo(@PathVariable("userId") Long userId)
    {
        return Result.suc(hysUserService.selectHysUserByUserId(userId));
    }

    /**
     * 新增传统文化用户
     */
    @PostMapping
    public Result add(@RequestBody HysUser hysUser)
    {
        return hysUserService.insertHysUser(hysUser) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 修改传统文化用户
     */
    @PutMapping
    public Result edit(@RequestBody HysUser hysUser)
    {
        return hysUserService.updateHysUser(hysUser) > 0 ? Result.suc() : Result.fail();
    }

    /**
     * 删除传统文化用户
     */
	@DeleteMapping("/{userIds}")
    public Result remove(@PathVariable Long[] userIds)
    {
        return hysUserService.deleteHysUserByUserIds(userIds) > 0 ? Result.suc() : Result.fail();
    }
}
