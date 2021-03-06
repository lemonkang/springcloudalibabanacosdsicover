package com.kh.alibaba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class AlibabaCloudProviderApplication {
    @Value("${server.port}")
    private String port;
    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudProviderApplication.class,args);
    }
    @RestController
    class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return string+port;
        }
    }
}
