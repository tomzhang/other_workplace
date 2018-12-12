package com.spring_server.ribbon.active;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaAppServer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaAppServer.class, args);
    }
}
