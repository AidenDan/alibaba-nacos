package com.alibabanacosconfig3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosConfig3377Application {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosConfig3377Application.class, args);
    }

}
