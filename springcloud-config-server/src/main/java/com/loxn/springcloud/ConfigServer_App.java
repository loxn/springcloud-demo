/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.loxn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_App.class, args);
    }
}
