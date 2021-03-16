package com.laoyin.consumer.service.impl;

import com.laoyin.consumer.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * ClassName HelloServiceImpl
 * Description
 * Create by gongyinquan
 * Date 2021/3/10 4:31 下午
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @HystrixCommand(fallbackMethod = "helloFallBack")
    @Override
    public String hello() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        String ret = restTemplate.getForEntity("http://hello-service/client/info", String.class).getBody();
        stopWatch.stop();
        System.out.println("execute for: " + stopWatch.getTotalTimeMillis());
        return ret;
    }

    @HystrixCommand(fallbackMethod = "helloFallBack")
    @Override
    public String helloSelf() {
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello fall back....");
        return "helloFallBack";
    }

    public String helloFallBack() {
        return "error";
    }
}
