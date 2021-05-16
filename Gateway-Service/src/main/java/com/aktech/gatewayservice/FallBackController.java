package com.aktech.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback() {

        return "user service broblems ";

    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback() {

        return "department service broblems ";
    }
}
