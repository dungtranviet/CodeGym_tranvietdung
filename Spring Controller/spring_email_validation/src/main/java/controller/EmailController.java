package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmailController {
     @GetMapping("/test")
    public String gretting(){
         System.out.println("okok");
         return "index";
     }
}
