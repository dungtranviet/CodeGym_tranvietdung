package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SercurityController {
    @GetMapping("/")
    public String home(){
        System.out.println("sdfdsf");
        return "home";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/login?error")
    public String error(){
        return "admin";
    }
}
