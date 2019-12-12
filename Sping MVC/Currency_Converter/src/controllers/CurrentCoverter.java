package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrentCoverter {
    @GetMapping("/")
    public String showForm(){
        return "index";
    }
    @PostMapping("/")
    public String convert(@RequestParam("usd") String usdStr, @RequestParam("rate") String rateStr, Model model){
        try {
            int usd=Integer.parseInt(usdStr);
            int rate=Integer.parseInt(rateStr);
            int vnd=usd*rate;
            model.addAttribute("result","VND: "+vnd);
        }
        catch (NumberFormatException ex){
            model.addAttribute("result","error");
        }
        model.addAttribute("usd",usdStr);
        model.addAttribute("rate",rateStr);
       return "index";
    }
}
