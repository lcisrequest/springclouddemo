package com.example.feign.feign.service;

import com.example.feign.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: lc
 * @Date: 2019/7/17 15:09
 */
@Service
public class TestService {
    @Autowired
    private GetHello getHello; //注入rpc

    public String sayHello(){
        return getHello.sayHello("feign");
    }
}