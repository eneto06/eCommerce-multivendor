package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    
    @GetMapping
    public String getMethodName( String param) {
        return new String();
    }
    
    public String HomeControllerHandler() {
        return "Welcome to ecommerce multivendor system";
    }
}
