package com.offcn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 新增注释！！！！！
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }

    @RequestMapping("/hello2")
    public void hello2(Integer age){
        helloService.addMethod1(age);
    }

    @RequestMapping("/hello3")
    public void hello3(String address){
        //小李、小张协商后循环调用方法，执行500次
        for (int i = 0; i <500 ; i++) {
            helloService.addMethod2(address);
        }


}
