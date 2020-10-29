package com.example.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
    @RequestMapping("/check")
    @ResponseBody
    public String checkMessage() {
        return "Hello SpringBoot";
    }
}
