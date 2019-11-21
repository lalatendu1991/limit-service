package com.liku.microservices.limitservice.bean;

import lombok.Data;

@Data
public class LimitConfiguration {
    private int max;
    private int min;

    public LimitConfiguration(int max, int min){
        this.max=max;
        this.min=min;
    }
}
