package com.offcn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好,"+name+" 欢迎来学习!";
    }

    @Override
    public void addMethod1(Integer age) {
        System.out.println("新增方法001");
    }

    @Override
    public void addMethod2(String address) {
        System.out.println("新增方法002");

    }
}
