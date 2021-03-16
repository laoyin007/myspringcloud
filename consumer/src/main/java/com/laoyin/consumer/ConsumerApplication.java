//package com.laoyin.consumer;
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
//
///**
// * ClassName ConsumerApplication
// * Description
// * Create by gongyinquan
// * Date 2021/3/3 2:06 下午
// */
//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//@EnableFeignClients(basePackages = "com.laoyin.service.api")
//public class ConsumerApplication {
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
//
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(ConsumerApplication.class).run(args);
//    }
//}
