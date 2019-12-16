package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private Pattern pattern;
    private Matcher matcher;
    private final String EMAIL_REGEX="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public HomeController(){
        pattern=Pattern.compile(EMAIL_REGEX);
    }
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/validate",method = RequestMethod.POST)
    public String checkValidate(@RequestParam("email") String email, Model model){
        boolean isvalid=validate(email);
        if (isvalid) {
            model.addAttribute("email","Hi "+email);
            return "success";
        }
        else {
            model.addAttribute("message",email+" is invalid");
            return "index";
        }
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        System.out.println("matcher"+matcher);
        return matcher.matches();
    }
}
