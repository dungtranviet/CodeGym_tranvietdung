package com.codegym.controller;

import com.codegym.entity.Customer;
import com.codegym.entity.Province;
import com.codegym.service.CustomerService;
import com.codegym.service.ProviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ProviceService proviceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces() {
        return proviceService.findAll();
    }

    @GetMapping("/")
    public ModelAndView getListCustomer(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/listCustomer");
        modelAndView.addObject("customers", customerService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView createCusstomer() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/save-customer")
    public ModelAndView saveCustomer(@Valid @ModelAttribute Customer customer, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        if (bindingResult.hasErrors()) {
            return modelAndView;
        }
        customerService.save(customer);
        modelAndView.addObject("successMessage", "thêm mới khách hàng thành công");
        return modelAndView;
    }
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "id")Long id){
        ModelAndView modelAndView;
        Customer customer=customerService.findById(id);
        if (customer!=null) {
            modelAndView=new ModelAndView("customer/edit");
            modelAndView.addObject("customer",customer);
            return modelAndView;
        }
        else {
            modelAndView =new ModelAndView("error.404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute(value = "customer")Customer customer){
       customerService.save(customer);
       ModelAndView modelAndView=new ModelAndView("customer/edit");
       modelAndView.addObject("customer",customer);
       modelAndView.addObject("successMessage","đã update thành công");
       return modelAndView;
    }
    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDelete(@PathVariable(name = "id")Long id){
        Customer customer=customerService.findById(id);
        ModelAndView modelAndView=new ModelAndView("customer/delete");
        if (customer==null) {
            modelAndView=new ModelAndView("error.404");
            return modelAndView;
        }
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("confirmMessage","bạn có chắc muốn xóa khách hàng này");
        return modelAndView;
    }
    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute(value = "customer")Customer customer){
        System.out.println(customer.getId());
        customerService.remove(customer.getId());
        System.out.println("dfsdfsd");
        return "redirect:/";
    }
    @GetMapping("/get-customer-by-province")
    public ModelAndView getProvince(){
        ModelAndView modelAndView=new ModelAndView("customer/findCutomerByProvince");
        return modelAndView;
    }
    @PostMapping("/get-customer-by-province")
    public ModelAndView viewProvince(@RequestParam(name = "idProvince")Long id){
        ModelAndView modelAndView=new ModelAndView("customer/findCutomerByProvince");
        Province province=proviceService.findById(id);
        if (province==null) {
            modelAndView.addObject("Message","khong tim thay khach hang");
            return modelAndView;
        }
        modelAndView.addObject("Message","danh sach khach hang của "+province.getName());
        modelAndView.addObject("customers",customerService.findAllByProvince(province));
        return modelAndView;
    }

    @GetMapping("/find-by-firstname")
    ModelAndView findByFirstName(@RequestParam("firstName")String firstName,Pageable pageable){
        System.out.println(firstName);
        ModelAndView modelAndView = new ModelAndView("customer/listCustomer");
        modelAndView.addObject("firstName",firstName);
        modelAndView.addObject("customers", customerService.findAllByFirstName(firstName,pageable));
        return modelAndView;
    }
    @GetMapping("/test1")
    public String test1(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("test","hello ");
        return "redirect:/test2";
    }@GetMapping("/test2")
    public String test2(){
        return "test";
    }
}
