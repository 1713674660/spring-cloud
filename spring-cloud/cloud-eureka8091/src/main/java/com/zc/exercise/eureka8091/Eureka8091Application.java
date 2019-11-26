package com.zc.exercise.eureka8091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangchi
 * @date 2019/11/26
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka8091Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka8091Application.class, args);
    }
}
