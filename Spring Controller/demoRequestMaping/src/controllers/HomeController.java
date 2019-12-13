package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = {"/method0"})
    public String method0(){
        return "method0";
    }
    @RequestMapping(value = {"/method1","method1/one","method1/two"})
    public String method1(){
        return "method1";
    }
    @RequestMapping(value = {"/method2"},method = RequestMethod.POST)
    public String method2(){
        return "method2";
    }
    @RequestMapping(value = {"/method3"},method = {RequestMethod.POST,RequestMethod.GET})
    public String method3(){
        return "method3";
    }
    @RequestMapping(value = {"/method4"},headers = "name=codegymdannang",method =RequestMethod.POST )
    public String method4(){
        return "method4";
    }
    @RequestMapping(value = {"/method5"},headers = {"name=codegymdannang","Id=100"},method =RequestMethod.POST )
    public String method5(){
        return "method5";
    }
    @RequestMapping(value = {"/method6"},consumes = {"application/json"},method =RequestMethod.POST )
    public String method6(){
        return "method6";
    }
}
