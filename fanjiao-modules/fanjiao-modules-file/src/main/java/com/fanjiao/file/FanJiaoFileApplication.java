package com.fanjiao.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.fanjiao.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 文件服务
 * 
 * @author bubble
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FanJiaoFileApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanJiaoFileApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  文件服务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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
