package com.codegym.controller;

import com.codegym.entity.FuramaKhachHang;
import com.codegym.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class KhachHangController {
    @Autowired
    KhachHangRepository khachHangRepository;
    @GetMapping("/dangkykhachhang")
    public ModelAndView getTrangDangKy(){
        ModelAndView modelAndView=new ModelAndView("khachhang/trangdangky");
        modelAndView.addObject("khachhang",new FuramaKhachHang());
        return modelAndView;
    }
    @PostMapping("/dangky")
    public String saveKhachHang(@Valid @ModelAttribute(name = "khachhang") FuramaKhachHang furamaKhachHang, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "khachhang/trangdangky";
        }
        else {
            return "khachhang/dangkythanhcong";
        }
    }
}
