package com.frame.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author weining
 * @date 2019/12/27 21:05
 *  启用zuul网关 通过路由分配到指定的微服务
 *  实现服务的负载均衡
 */
@SpringBootApplication
@EnableZuulProxy
@EnableHystrixDashboard
@EnableDiscoveryClient
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
