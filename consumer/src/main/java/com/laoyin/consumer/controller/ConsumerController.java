package com.laoyin.consumer.controller;

import com.laoyin.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName ConsumerController
 * Description
 * Create by gongyinquan
 * Date 2021/3/3 2:08 下午
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {

    @Autowired
    HelloService helloService;


    @GetMapping
    public String consume() {
        return helloService.hello();
    }

    @GetMapping("self")
    public String consume1() {
        return helloService.helloSelf();
    }
}
