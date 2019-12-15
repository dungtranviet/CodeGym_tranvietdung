package controllers;

import model.Caculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class caculalorController {
    @GetMapping("/test")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        String[] arr = new String[3];
        modelAndView.addObject("arr", arr);
        return modelAndView;
    }

    @PostMapping("caculator")
    public ModelAndView cacultor(@RequestParam(required = false, name = "operator") String operator,
                           @RequestParam(required = false, name = "num1") String num1Str,
                           @RequestParam(required = false, name = "num2") String num2Str) {
       float num1=Float.parseFloat(num1Str);
       float num2=Float.parseFloat(num2Str);
       String result= Caculator.caculator(num1,num2,operator);
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("num1",num1);
        modelAndView.addObject("num2",num2);
        modelAndView.addObject("result",result);
        return modelAndView;
    }
}
