package com.spring_config_bus1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SpringBus1Controller {

    @Value("${test}")
    private String name;


    @GetMapping("get")
    public String get() {
        return name;
    }


}
