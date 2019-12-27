package com.codegym.controller;

import com.codegym.entity.FuramaDichVu;
import com.codegym.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    DichVuService dichVuService;
    @GetMapping("/")
    public ModelAndView getHomePage(){
        return new ModelAndView("home/index","listdichvu",dichVuService.findAll());
    }
    @GetMapping("/dichvu/{id}")
    public ModelAndView getDichVuDetail(@PathVariable Long id){
        ModelAndView modelAndView=new ModelAndView("dichvu/dichvuchitiet");
        modelAndView.addObject("dichvuchitiet",dichVuService.getDichVu(id).orElse(null));
        return modelAndView;
    }
}
