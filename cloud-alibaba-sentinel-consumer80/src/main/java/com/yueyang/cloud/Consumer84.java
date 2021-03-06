package com.yueyang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud-consumerconsul-order80
 * @description:
 * @author: qinxiangyang
 * @create: 2020-05-02 11:21
 **/

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Consumer84 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer84.class, args);
    }
}