package com.codegym.demo.controller;

import com.codegym.demo.model.Customer;
import com.codegym.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/")
    public ModelAndView test(){
        return  new ModelAndView("list","customers",customerService.findAll());
    }
    @GetMapping("create-customer")
    public ModelAndView showFormCreate(){
        return new ModelAndView("create","customer",new Customer());
    }
    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("message","them khach hang thanh cong!!");
        return modelAndView;
    }
}
