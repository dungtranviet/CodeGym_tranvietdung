package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductService productService;
    @ModelAttribute("cart")
    public Cart setUpCart() {
        return new Cart();
    }
    @GetMapping({"/products","/"})
    public ModelAndView listProducts(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/show-product/{id}")
    public ModelAndView showProduct(@PathVariable(name = "id") Long id){
        Product product=productService.findById(id);
        ModelAndView modelAndView = new ModelAndView("show_product");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @PostMapping("/add-to-cart/{id}")
    public ModelAndView addToCart(@PathVariable(name = "id") Long id,@ModelAttribute("cart") Cart cart){
        cart.addToCart(id);
        System.out.println(cart.getProducts());
        ModelAndView modelAndView = new ModelAndView("show_product");
        modelAndView.addObject("product", productService.findById(id));
        modelAndView.addObject("message","add "+productService.findById(id).getName()+" success !! quantity : "+cart.getQuantity(id));
        return modelAndView;
    }
    @GetMapping("/show-cart")
    public ModelAndView showCart(@ModelAttribute("cart") Cart cart){
        List<Product> products=new ArrayList<>();
        for (long id:cart.getProducts().keySet()) {
            products.add(productService.findById(id));
        }
        ModelAndView modelAndView = new ModelAndView("cart");
        modelAndView.addObject("products",products);
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public String delete(@ModelAttribute("cart") Cart cart,@PathVariable(name = "id") Long id){
        System.out.println("okokokkdfdsfsfsd");
        cart.remove(id);
        return "redirect:/show-cart";
    }
}
