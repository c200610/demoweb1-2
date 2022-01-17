package haupx912.demoweb1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;






@Controller

public class MainController {

    @GetMapping("/login")
    public String loginView() {
        return "login";
    }
    

    @PostMapping("/home")
    public String login() {

        return "index";
    }
    @GetMapping("/index")
    public String homeView() {

        return "index";
    }
}
