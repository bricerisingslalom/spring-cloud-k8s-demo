package com.bricerising.spring.cloud.kubernetes.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

        @RequestMapping("/")
        public String kuberenetes() {
                return "Hello Kubernetes!";
        }

}