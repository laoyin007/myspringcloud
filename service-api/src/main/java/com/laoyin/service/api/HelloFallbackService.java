package com.laoyin.service.api;

import com.laoyin.service.api.HelloApi;
import com.laoyin.service.api.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * ClassName HelloFallbackService
 * Description
 * Create by gongyinquan
 * Date 2021/3/15 2:37 下午
 */
@Service
public class HelloFallbackService implements HelloApi {
    @Override
    public String hello1(String name) {
        return "error";
    }

    @Override
    public User hello2(String name, int age) {
        return new User("error", 0);
    }

    @Override
    public User hello3(User user) {
        return new User("error", 0);
    }
}
