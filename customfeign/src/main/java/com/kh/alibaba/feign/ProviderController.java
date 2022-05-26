package com.kh.alibaba.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider",path = "/provider")
public interface ProviderController {
    @GetMapping("/reduce")
     String reduce(@RequestParam("num") String num);
}
