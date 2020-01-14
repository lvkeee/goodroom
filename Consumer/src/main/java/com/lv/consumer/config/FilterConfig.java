package com.delicious.consumer.config;

import com.delicious.consumer.filter.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weining
 * @date 2019/12/26 13:16
 */
@Configuration
public class FilterConfig {
   /* @Bean
    public FilterRegistrationBean creatCF(){
        FilterRegistrationBean bean=new FilterRegistrationBean();
        bean.setFilter(new CorsFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }*/
}
