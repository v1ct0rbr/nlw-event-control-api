package com.victorqueiroga.nlw_event_control_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ErrorController {
    
    @GetMapping("/error")
    public String getMethodName() {
        return "Error";
    }

}
