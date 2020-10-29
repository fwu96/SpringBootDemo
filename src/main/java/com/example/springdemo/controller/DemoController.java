package com.example.springdemo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);
    @GetMapping("/demo")
    public String showDemo() {
        LOG.info("demo success");
        return "success";
    }
}
