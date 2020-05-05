package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("hello")
    public String hello() {
        System.out.println("print Hello!");
        System.out.println("print Hello!");
        return "你好 Idea！";
    }


}
