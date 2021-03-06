package com.yueyang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud-consumerconsul-order80
 * @description:
 * @author: qinxiangyang
 * @create: 2020-04-25 11:05
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosMain9001.class, args);
    }
}