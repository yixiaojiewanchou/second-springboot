package com.cl.secondspringboot.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello(){
        return "Hello!";
    }

}
