package com.codegym.controller;

import com.codegym.entity.Province;
import com.codegym.service.ProviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ProviceController {
    @Autowired
    ProviceService proviceService;

    @GetMapping("/listprovince")
    public ModelAndView listProvice() {
        ModelAndView modelAndView = new ModelAndView("province/listProvince");
        modelAndView.addObject("provinces", proviceService.findAll());
        return modelAndView;
    }

    @GetMapping("/create-province")
    public ModelAndView createProvince() {
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }

    @PostMapping("/save-province")
    public ModelAndView saveProvince(@Valid @ModelAttribute(name = "province") Province province, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("province/create");
        if (bindingResult.hasErrors()) {
            return modelAndView;
        }
        modelAndView.addObject("successMessage", "đã thêm thành công");
        proviceService.save(province);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id") Long id) {
        Province province = proviceService.findById(id);
        if (province == null) {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("province/edit");
        modelAndView.addObject("province", province);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDelete(@PathVariable(name = "id") Long id) {
        Province province = proviceService.findById(id);
        if (province == null) {
            ModelAndView modelAndView = new ModelAndView("error.404");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("province/delete");
        modelAndView.addObject("province", province);
        return modelAndView;
    }

    @PostMapping("/edit-province")
    public ModelAndView editProvince(@ModelAttribute(value = "province") Province province) {
        ModelAndView modelAndView = new ModelAndView("province/edit");
        proviceService.save(province);
        modelAndView.addObject("successMessage", "đã update thành công");
        return modelAndView;
    }

    @PostMapping("/delete-province")
    public ModelAndView deleteProvince(@ModelAttribute(value = "province") Province province) {
        ModelAndView modelAndView = new ModelAndView("province/delete");
        System.out.println("name "+province.getName());
        //proviceService.remove(province.getId());
        modelAndView.addObject("successMessage", "đã xóa thành công");
        return modelAndView;
    }
}
