package com.fanjiao.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.fanjiao.common.security.annotation.EnableCustomConfig;
import com.fanjiao.common.security.annotation.EnableRyFeignClients;
import com.fanjiao.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author bubble
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringCloudApplication
public class FanJiaoJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanJiaoJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  █████▒▄▄▄       ███▄    █  ▄▄▄██▀▀▀██▓ ▄▄▄       ▒█████  \n" +
                "▓██   ▒▒████▄     ██ ▀█   █    ▒██  ▓██▒▒████▄    ▒██▒  ██▒\n" +
                "▒████ ░▒██  ▀█▄  ▓██  ▀█ ██▒   ░██  ▒██▒▒██  ▀█▄  ▒██░  ██▒\n" +
                "░▓█▒  ░░██▄▄▄▄██ ▓██▒  ▐▌██▒▓██▄██▓ ░██░░██▄▄▄▄██ ▒██   ██░\n" +
                "░▒█░    ▓█   ▓██▒▒██░   ▓██░ ▓███▒  ░██░ ▓█   ▓██▒░ ████▓▒░\n" +
                " ▒ ░    ▒▒   ▓▒█░░ ▒░   ▒ ▒  ▒▓▒▒░  ░▓   ▒▒   ▓▒█░░ ▒░▒░▒░ \n" +
                " ░       ▒   ▒▒ ░░ ░░   ░ ▒░ ▒ ░▒░   ▒ ░  ▒   ▒▒ ░  ░ ▒ ▒░ \n" +
                " ░ ░     ░   ▒      ░   ░ ░  ░ ░ ░   ▒ ░  ░   ▒   ░ ░ ░ ▒  \n" +
                "             ░  ░         ░  ░   ░   ░        ░  ░    ░ ░  " );
    }
}
