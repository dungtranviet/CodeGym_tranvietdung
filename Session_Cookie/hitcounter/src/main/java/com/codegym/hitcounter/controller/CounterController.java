package com.codegym.hitcounter.controller;

import com.codegym.hitcounter.model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {
    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public MyCounter setUpCounter() {
        System.out.println("lan dau tien");
        return new MyCounter();
    }
    @GetMapping("/")
    public String get(@ModelAttribute("mycounter")MyCounter myCounter){
        myCounter.increment();
        return "index";
    }
}
