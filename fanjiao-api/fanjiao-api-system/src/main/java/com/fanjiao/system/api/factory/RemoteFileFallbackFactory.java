package com.fanjiao.system.api.factory;

import com.fanjiao.system.api.RemoteFileService;
import com.fanjiao.system.api.domain.SysFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import com.fanjiao.common.core.domain.Result;
import feign.hystrix.FallbackFactory;

/**
 * 文件服务降级处理
 * 
 * @author bubble
 */
@Component
public class RemoteFileFallbackFactory implements FallbackFactory<RemoteFileService>
{
    private static final Logger log = LoggerFactory.getLogger(RemoteFileFallbackFactory.class);

    @Override
    public RemoteFileService create(Throwable throwable)
    {
        log.error("文件服务调用失败:{}", throwable.getMessage());
        return new RemoteFileService()
        {
            @Override
            public Result<SysFile> upload(MultipartFile file)
            {
                return Result.fail("上传文件失败:" + throwable.getMessage());
            }
        };
    }
}
