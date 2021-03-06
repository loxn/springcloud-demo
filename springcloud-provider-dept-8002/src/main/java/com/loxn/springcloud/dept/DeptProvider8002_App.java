/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by v_luoxin on 2018-08-02 17:52
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
