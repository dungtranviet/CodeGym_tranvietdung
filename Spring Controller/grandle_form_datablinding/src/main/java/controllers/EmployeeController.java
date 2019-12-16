package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    @RequestMapping(name = "/showForm", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @RequestMapping(name = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, Model model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("id", employee.getId());
        model.addAttribute("contact", employee.getContact());
        return "infor";
    }
}
