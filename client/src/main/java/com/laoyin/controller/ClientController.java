package com.laoyin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * ClassName ClientController
 * Description
 * Create by gongyinquan
 * Date 2021/3/2 3:32 下午
 */
@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("info")
    public String info() throws InterruptedException {
        List<ServiceInstance> list = discoveryClient.getInstances("hello-service");
        StringBuffer sb = new StringBuffer();
        list.forEach(s -> sb.append(s.getHost()).append(":").append(s.getPort()).append("\r"));
//        TimeUnit.SECONDS.sleep(5L);
//        TimeUnit.SECONDS.sleep(new Random().nextInt(4));
        int a = 1/0;
        return sb.toString();
    }


}
