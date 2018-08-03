/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.loxn.springcloud.conf.BalanceRuleConf;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.loxn.springcloud"})
@EnableCircuitBreaker
@RibbonClient(name = "springcloud-provider-dept", configuration = BalanceRuleConf.class)
public class DeptConsumer_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_App.class, args);
    }
}
