package com.fanjiao.auth.controller;

import javax.servlet.http.HttpServletRequest;

import com.fanjiao.auth.form.LoginBody;
import com.fanjiao.auth.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fanjiao.common.core.domain.Result;
import com.fanjiao.common.core.utils.StringUtils;
import com.fanjiao.common.security.service.TokenService;
import com.fanjiao.system.api.model.LoginUser;

/**
 * token 控制
 * 
 * @author bubble
 */
@RestController
public class TokenController
{
    @Autowired
    private TokenService tokenService;

    @Autowired
    private SysLoginService sysLoginService;

    @PostMapping("login")
    public Result<?> login(@RequestBody LoginBody form)
    {
        // 用户登录
        LoginUser userInfo = sysLoginService.login(form.getUsername(), form.getPassword());
        // 获取登录token
        return Result.success(tokenService.createToken(userInfo));
    }

    @DeleteMapping("logout")
    public Result<?> logout(HttpServletRequest request)
    {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser))
        {
            String username = loginUser.getUsername();
            // 删除用户缓存记录
            tokenService.delLoginUser(loginUser.getToken());
            // 记录用户退出日志
            sysLoginService.logout(username);
        }
        return Result.success();
    }

    @PostMapping("refresh")
    public Result<?> refresh(HttpServletRequest request)
    {
        LoginUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser))
        {
            // 刷新令牌有效期
            tokenService.refreshToken(loginUser);
            return Result.success();
        }
        return Result.success();
    }
}
