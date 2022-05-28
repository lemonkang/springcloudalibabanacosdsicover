package com.kh.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentinel")
public class SentinelController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @SentinelResource("resource")
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
