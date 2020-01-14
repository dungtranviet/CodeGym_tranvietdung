package com.codegym.controller;

import com.codegym.entity.QuocGia;
import com.codegym.entity.ThanhPho;
import com.codegym.service.QuocGiaService;
import com.codegym.service.ThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ThanhPhoController {
    @Autowired
    ThanhPhoService thanhPhoService;
    @Autowired
    QuocGiaService quocGiaService;
    @ModelAttribute("cacquocgia")
    public Iterable<QuocGia> provinces() {
        return quocGiaService.findAll();
    }
    @GetMapping("/")
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("citys",thanhPhoService.findAll());
        return modelAndView;
    }
    @GetMapping("/add-new-city")
    public ModelAndView addNewCity(){
        ModelAndView modelAndView=new ModelAndView("add_new_city");
        modelAndView.addObject("city",new ThanhPho());
        return modelAndView;
    }
    @PostMapping("/save-city")
    public ModelAndView saveNewCity(@Valid @ModelAttribute ThanhPho thanhPho, BindingResult bindingResult){
        ModelAndView modelAndView=new ModelAndView("add_new_city");
        if (bindingResult.hasErrors()) {
            return modelAndView;
        }
        modelAndView.addObject("city",thanhPho);
        thanhPhoService.save(thanhPho);
        modelAndView.addObject("successMessage","đã thêm mới thành công");
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id")Long id){
        ModelAndView modelAndView;
        ThanhPho thanhPho=thanhPhoService.findById(id);
        if (thanhPho!=null) {
            modelAndView=new ModelAndView("edit");
            modelAndView.addObject("city",thanhPho);
            return modelAndView;
        }
        else {
            modelAndView =new ModelAndView("error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit")
    public ModelAndView updateCustomer(@ModelAttribute(value = "customer")ThanhPho thanhPho){
        thanhPhoService.save(thanhPho);
        ModelAndView modelAndView=new ModelAndView("edit");
        modelAndView.addObject("city",thanhPho);
        modelAndView.addObject("successMessage","đã update thành công");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable(name = "id")Long id){

        ThanhPho thanhPho=thanhPhoService.findById(id);

        ModelAndView modelAndView=new ModelAndView("delete");
        if (thanhPho==null) {
            modelAndView=new ModelAndView("error.404");
            return modelAndView;
        }
        modelAndView.addObject("city",thanhPho);
        modelAndView.addObject("confirmMessage","bạn có chắc muốn xóa khách hàng này");
        return modelAndView;
    }
    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute(value = "customer")ThanhPho thanhPho){
        thanhPhoService.remove(thanhPho.getId());
        return "redirect:/";
    }

    @GetMapping("/chitiet/{id}")
    public ModelAndView showInfor(@PathVariable(name = "id")Long id){

        ThanhPho thanhPho=thanhPhoService.findById(id);

        ModelAndView modelAndView=new ModelAndView("chitiet");
        if (thanhPho==null) {
            modelAndView=new ModelAndView("error.404");
            return modelAndView;
        }
        modelAndView.addObject("city",thanhPho);
        return modelAndView;
    }
}
