package com.fanjiao.system.api;

import com.fanjiao.system.api.model.LoginUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fanjiao.common.core.constant.ServiceNameConstants;
import com.fanjiao.common.core.domain.Result;
import com.fanjiao.system.api.factory.RemoteUserFallbackFactory;

/**
 * 用户服务
 * 
 * @author bubble
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.SYSTEM_SERVICE, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService
{
    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @return 结果
     */
    @GetMapping(value = "/user/info/{username}")
    public Result<LoginUser> getUserInfo(@PathVariable("username") String username);
}
