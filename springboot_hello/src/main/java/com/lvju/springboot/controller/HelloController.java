package com.lvju.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController
{
    @GetMapping("/hello")
    public String hello01()
    {
        log.info("测试日志功能");
        return "77777777777777pull-test,master22222222hello,springboot";
    }
}
