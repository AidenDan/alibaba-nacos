package com.alibabanacosconfig3377.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2020-4-19 22:17:39
 */
@RestController
@RefreshScope //支持nacos动态刷新功能
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public Object config(){
        return configInfo;
    }
}
