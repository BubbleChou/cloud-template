package com.fanjiao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author bubble
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FanJiaoGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanJiaoGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  凡骄网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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
