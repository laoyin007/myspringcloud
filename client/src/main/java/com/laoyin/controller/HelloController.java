package com.laoyin.controller;

import com.laoyin.service.api.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName HelloController
 * Description
 * Create by gongyinquan
 * Date 2021/3/15 1:45 下午
 */
@RestController
public class HelloController {


    @GetMapping("hello1")
    String hello1(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello2")
    User hello2(@RequestHeader("name") String name, @RequestHeader("age") int age) {
        return new User(name, age);
    }


    @PostMapping("hello3")
    User hello3(@RequestBody User user) {
        return user;
    }
}
