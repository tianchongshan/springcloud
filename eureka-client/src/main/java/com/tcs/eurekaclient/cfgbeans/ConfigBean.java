package com.tcs.eurekaclient.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //springcloud Ribbon是基于Netflix Ribbon实现的客户端负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
