package com.delicious.consumer.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author weining
 * @date 2019/12/27 20:01
 */
@Configuration
public class RobbinConfig {
    @Bean
    @LoadBalanced
    public RestTemplate creatRC(){
        return new RestTemplate();
    }

    //创建默认的负载均衡算法：1.轮训算法2.随机算法3.权重算法4.区域感知5.并发量小
    @Bean
    public IRule creatIR(){
        new BestAvailableRule();//并发量小
        new WeightedResponseTimeRule();//权重
        new RoundRobinRule();//轮训
        new ZoneAvoidanceRule();//区域感知
        return new RandomRule(); //随机算法
    }

}
