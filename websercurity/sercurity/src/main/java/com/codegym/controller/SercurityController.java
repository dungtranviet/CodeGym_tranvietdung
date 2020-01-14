package com.codegym.controller;

import com.codegym.utils.EncrypPasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SercurityController {


    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/403")
    public String get403Page(){
        return "403";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("login?error")
    public String loginFails(){
        return "faillogin";
    }
}
