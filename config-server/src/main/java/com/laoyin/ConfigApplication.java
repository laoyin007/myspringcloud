package com.laoyin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ClassName ConfigApplication
 * Description
 * Create by gongyinquan
 * Date 2021/3/16 9:49 上午
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigApplication.class).run(args);
    }
}
