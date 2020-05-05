package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("test")
    public String index() {
        System.out.println("测试");
        return "test";
    }
}
