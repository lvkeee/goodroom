package com.delicious.consumer.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weining
 * @date 2019/12/25 19:39
 */
@Configuration
public class FeignConfig {
    public int connectTime = 10000;
    public int readTime = 10000;

    @Bean
    public Request.Options createOP(){
        return new Request.Options(connectTime,readTime);
    }

    //Feign 的重试次数 默认是5次
    @Bean
    public Retryer createR(){
        return new Retryer.Default(50,100,3);
    }

}
