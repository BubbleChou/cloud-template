package com.fanjiao.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.fanjiao.common.security.annotation.EnableCustomConfig;
import com.fanjiao.common.security.annotation.EnableRyFeignClients;
import com.fanjiao.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author bubble
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class FanJiaoSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanJiaoSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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
