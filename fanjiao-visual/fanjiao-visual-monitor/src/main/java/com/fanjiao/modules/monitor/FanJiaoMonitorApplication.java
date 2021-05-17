package com.fanjiao.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 * 
 * @author bubble
 */
@EnableAdminServer
@SpringCloudApplication
public class FanJiaoMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanJiaoMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
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
