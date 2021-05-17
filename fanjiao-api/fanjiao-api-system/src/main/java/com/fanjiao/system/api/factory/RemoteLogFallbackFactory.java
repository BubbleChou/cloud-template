package com.fanjiao.system.api.factory;

import com.fanjiao.system.api.RemoteLogService;
import com.fanjiao.system.api.domain.SysOperLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.fanjiao.common.core.domain.Result;
import feign.hystrix.FallbackFactory;

/**
 * 日志服务降级处理
 * 
 * @author bubble
 */
@Component
public class RemoteLogFallbackFactory implements FallbackFactory<RemoteLogService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteLogFallbackFactory.class);

    @Override
    public RemoteLogService create(Throwable throwable)
    {
        log.error("日志服务调用失败:{}", throwable.getMessage());
        return new RemoteLogService()
        {
            @Override
            public Result<Boolean> saveLog(SysOperLog sysOperLog)
            {
                return null;
            }

            @Override
            public Result<Boolean> saveLogininfor(String username, String status, String message)
            {
                return null;
            }
        };

    }
}
