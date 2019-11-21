package com.liku.microservices.limitservice.controller;

import com.liku.microservices.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

   /* @Autowired
    LimitConfigurationController( @Value("${limit-service.maximum}") int max){

    }*/
    @Value("${limit-service.maximum}")
    private int max;
    @Value("${limit-service.minimum}")
    private  int min;

    @GetMapping("/limits")
    public LimitConfiguration getLimitConfigurations(){
return new LimitConfiguration(max, min);
    }
}
