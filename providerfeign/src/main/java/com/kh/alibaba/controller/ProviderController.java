package com.kh.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/reduce")
    public String reduce(@RequestParam("num") String num){
        return serverPort+"接口商品减少"+num;
    }
}
