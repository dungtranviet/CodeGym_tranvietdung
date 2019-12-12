package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String showForm(){
       return "index";
    }
    @PostMapping("/")
    public ModelAndView search(@RequestParam("txtSearch") String txtSearch){
        ModelAndView modelAndView=new ModelAndView("index");
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String result=dictionary.get(txtSearch);
        System.out.println(result);
        modelAndView.addObject("search",txtSearch);
       if(result!=null){
           modelAndView.addObject("result",result);
       }
       else {
           modelAndView.addObject("result","not found");
       }
        return modelAndView;
    }
}
