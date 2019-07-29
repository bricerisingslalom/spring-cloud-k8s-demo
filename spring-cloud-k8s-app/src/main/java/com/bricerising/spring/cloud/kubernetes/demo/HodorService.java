package com.bricerising.spring.cloud.kubernetes.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HodorService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "getFallbackName")
    public String getHodor() {
        return restTemplate.getForObject("http://hodor-service-service:8081/", String.class);
    }

    public String getFallbackName() {
        return "Fallback Hodor.";
    }
    
}