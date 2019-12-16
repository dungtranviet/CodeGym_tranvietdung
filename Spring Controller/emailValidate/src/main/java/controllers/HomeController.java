package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private Matcher matcher;
    private Pattern pattern;
    private static final String EMAIL_REGEX= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public HomeController(){
        pattern=Pattern.compile(EMAIL_REGEX);
    }
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/validate",method = RequestMethod.POST)
    public String user(@RequestParam("email") String email, Model model){
        boolean isValid=validate(email);
        if(isValid){
            model.addAttribute("email",email);
            return "success";
        }
        else {
            model.addAttribute("message","email is invalid");
            return "index";
        }
    }
    private boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

}
