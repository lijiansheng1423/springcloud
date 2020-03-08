package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class UserNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserNacosApplication.class,args);
    }
}
