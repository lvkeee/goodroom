package com.frame.eurekaServer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weining
 * @date 2019/12/23 15:45
 */
@SpringBootApplication
@EnableEurekaServer //这里是一个注册中心
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }

}
