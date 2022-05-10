package com.qdc.demoeurekaconsumer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaConsumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaConsumer1Application.class, args);
    }

}
