package at.horn1347.springbootlab.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import at.horn1347.springbootlab.repository.UserRepository;

@Controller
public class UserController {
    String appName = "Springboot Lab";

    @Autowired
    UserRepository repository;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("userName", repository.findByUserName("pimmelfuerst").get().getUserName());
        model.addAttribute("appName", appName);
        return "user";
    }

    
}
