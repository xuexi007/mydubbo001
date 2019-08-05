package com.offcn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好,"+name+" 欢迎来学习!";
    }
}
