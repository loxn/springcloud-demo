/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * Created by v_luoxin on 2018-08-03 14:04
 */
@Configuration
public class BalanceRuleConf {

    @Bean
    public IRule rule() {
        // return new RoundRobinRule();默认的轮询规则
        // return new RandomRule();随机访问
        return new MyRule();
    }
}
