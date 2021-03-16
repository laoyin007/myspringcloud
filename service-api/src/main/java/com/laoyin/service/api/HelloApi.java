package com.laoyin.service.api;

import com.laoyin.service.api.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName HelloApi
 * Description
 * Create by gongyinquan
 * Date 2021/3/15 1:50 下午
 */
@FeignClient(value = "hello-service", fallback = HelloFallbackService.class, configuration = FeignConfig.class)
public interface HelloApi {

    @GetMapping("hello1")
    String hello1(@RequestParam("name") String name);

    @GetMapping("hello2")
    User hello2(@RequestHeader("name") String name, @RequestHeader("age") int age);


    @PostMapping("hello3")
    User hello3(@RequestBody User user);
}
