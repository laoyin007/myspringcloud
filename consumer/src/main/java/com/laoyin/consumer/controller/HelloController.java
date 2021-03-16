package com.laoyin.consumer.controller;

import com.laoyin.service.api.HelloApi;
import com.laoyin.service.api.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName HelloController
 * Description
 * Create by gongyinquan
 * Date 2021/3/15 1:56 下午
 */
@RestController
public class HelloController {

    @Autowired
    private HelloApi helloApi;

    @Value("${from}")
    private String from;

    @GetMapping("hello1")
    String hello1(@RequestParam("name") String name) {
        return helloApi.hello1(name);
    }

    @GetMapping("hello2")
    User hello2(@RequestHeader("name") String name, @RequestHeader("age") int age) {
        return helloApi.hello2(name, age);
    }


    @PostMapping("hello3")
    User hello3(@RequestBody User user) {
        return helloApi.hello3(user);
    }

    @GetMapping("hello4")
    String hello4() {
        return "hello: " + from;
    }

}
