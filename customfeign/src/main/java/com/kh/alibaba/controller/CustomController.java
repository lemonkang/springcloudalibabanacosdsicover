package com.kh.alibaba.controller;

import com.kh.alibaba.feign.ProviderController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class CustomController {

    @Autowired
    private ProviderController providerController;

    /**
     * <p>向往暴露一个接口，调用接口，接口调用customer中的reduce接口</p>
     */
    @GetMapping("/add")
    public String add(@RequestParam(value = "num") String num){
        String reduce = providerController.reduce(num);
        return reduce;
    }
}
