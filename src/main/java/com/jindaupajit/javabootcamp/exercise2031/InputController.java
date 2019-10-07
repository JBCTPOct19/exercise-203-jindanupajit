package com.jindaupajit.javabootcamp.exercise2031;

import com.jindaupajit.javabootcamp.exercise2031.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    @PostMapping ("/")
    public String confirmationPage(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "confirmation";
    }
}
