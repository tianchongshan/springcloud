package com.tcs.eurekaclient.controller;

import com.tcs.eurekaclient.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX="http:// DESKTOP-TROMR1G:service-feign";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX,"/dept/add",Boolean.class);
    }
}
