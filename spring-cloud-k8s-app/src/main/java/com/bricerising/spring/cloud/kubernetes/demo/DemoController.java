package com.bricerising.spring.cloud.kubernetes.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${demo.configmap.value}")
    private String configValue;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private HodorService hodorService;


    @RequestMapping("/status")
    public String status() {
            return "Alive!";
    }
    @RequestMapping("/config")
    public String config() {
        return configValue;
    }
    @RequestMapping("/services")
    public List<String> services() {
        return discoveryClient.getServices();
    }
    @RequestMapping("/hodor")
    public String hodor() {
        return hodorService.getHodor();
    }

}