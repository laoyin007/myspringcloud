package com.laoyin.service.api;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName FeignConfig
 * Description
 * Create by gongyinquan
 * Date 2021/3/15 2:58 下午
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
