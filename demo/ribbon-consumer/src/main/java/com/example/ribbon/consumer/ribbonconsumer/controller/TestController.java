package com.example.ribbon.consumer.ribbonconsumer.controller;

import com.example.ribbon.consumer.ribbonconsumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lc
 * @Date: 2019/7/17 15:09
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return testService.sayHello() + " " + name;
    }
}