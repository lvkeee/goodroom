package com.frame.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author weining
 * @date 2019/12/26 15:06
 */
@MapperScan("com.delicious.**.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix //启用熔断器 防止服务意外终止
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}

