package com.codegym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecutityController {

    @GetMapping("/admin")
    public String getAdminPage(){
        return "Security/admin";
    }

    @GetMapping("/403")
    public String get403Page(){
        return "Security/403";
    }

    @GetMapping("/review")
    public String getReviewPage(){
        return "dichvu/review";
    }
    @GetMapping("/loginsuccess")
    public String loginSuccess(){
        return "Security/dangnhapthanhcong";
    }
}
