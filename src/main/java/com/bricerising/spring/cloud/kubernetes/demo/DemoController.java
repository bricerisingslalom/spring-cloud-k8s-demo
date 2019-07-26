package com.bricerising.spring.cloud.kubernetes.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${demo.configmap.value}")
    private String configValue;

        @RequestMapping("/status")
        public String status() {
                return "Alive!";
        }
        @RequestMapping("/config")
        public String config() {
            return configValue;
        }

}