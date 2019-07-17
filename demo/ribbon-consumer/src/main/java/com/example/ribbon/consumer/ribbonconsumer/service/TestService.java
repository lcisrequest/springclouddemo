package com.example.ribbon.consumer.ribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: lc
 * @Date: 2019/7/17 15:09
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello() {

        return restTemplate.getForObject("http://ribbon-provider/hello?name=lc", String.class);
    }
}