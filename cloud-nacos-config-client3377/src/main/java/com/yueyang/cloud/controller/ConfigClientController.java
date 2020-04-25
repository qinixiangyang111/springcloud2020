package com.yueyang.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-consumerconsul-order80
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-25 12:23
 **/
@RestController
@RefreshScope  //支持nacos动态刷新
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;


    @GetMapping(value = "/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

}