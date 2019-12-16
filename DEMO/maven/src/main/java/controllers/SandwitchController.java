package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SandwitchController {
    @GetMapping("/")
    public String display(){
        System.out.println("abcd");
    return "index";
    }
}
