package com.codegym.controller;

import com.codegym.entity.FuramaDichVu;
import com.codegym.entity.FuramaFavorite;
import com.codegym.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(names = "favorite")
public class HomeController {
    @Autowired
    DichVuService dichVuService;
    @GetMapping("/")
    public ModelAndView getHomePage(@RequestParam(value = "fromPrice",required = false)Integer fromPrice,
                                    @RequestParam(value ="toPrice",required = false)Integer toPrice){
        ModelAndView modelAndView=new ModelAndView("home/index");
        if (fromPrice==null||toPrice==null) {
            modelAndView.addObject("listdichvu",dichVuService.findAll());
        }
        else {
            modelAndView.addObject("listdichvu",dichVuService.findAllByChiPhiThueBetween(fromPrice,toPrice));
        }
        return modelAndView;
    }
    @GetMapping("/dichvu/{id}")
    public ModelAndView getDichVuDetail(@PathVariable Long id){
        ModelAndView modelAndView=new ModelAndView("dichvu/dichvuchitiet");
        modelAndView.addObject("dichvuchitiet",dichVuService.getDichVu(id));
        return modelAndView;
    }
    @ModelAttribute(name = "favorite")
    public FuramaFavorite setUpFavoriteSession(){
        return new FuramaFavorite();
    }
    @GetMapping("/favorite/{id}")
    public String saveFavoriteSession(@ModelAttribute(name ="favorite") FuramaFavorite sessionFavorite,@PathVariable(name = "id")Long id){
            sessionFavorite.put(id,dichVuService.getDichVu(id));
        return "redirect:/";
    }
    @GetMapping("/favoritePage")
    public String getFavoritePage(){
        return "dichvu/favorite";
    }
}
