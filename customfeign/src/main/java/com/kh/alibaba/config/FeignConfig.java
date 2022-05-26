package com.kh.alibaba.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfig {
    /**
     * 日志级别
     */
     @Bean
    public Logger.Level feignLoggerLevel(){
         return Logger.Level.FULL;
     }
}
