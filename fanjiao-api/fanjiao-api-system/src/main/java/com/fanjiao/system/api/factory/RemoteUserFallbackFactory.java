package com.fanjiao.system.api.factory;

import com.fanjiao.system.api.RemoteUserService;
import com.fanjiao.system.api.model.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.fanjiao.common.core.domain.Result;
import feign.hystrix.FallbackFactory;

/**
 * 用户服务降级处理
 * 
 * @author bubble
 */
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    @Override
    public RemoteUserService create(Throwable throwable)
    {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteUserService()
        {
            @Override
            public Result<LoginUser> getUserInfo(String username)
            {
                return Result.fail("获取用户失败:" + throwable.getMessage());
            }
        };
    }
}
