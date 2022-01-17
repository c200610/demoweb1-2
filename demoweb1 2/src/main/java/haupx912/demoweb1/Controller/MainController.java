package haupx912.demoweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class MainController {

    

    @GetMapping("/login")
    public String loginView(){

        return "login";
    }
    @GetMapping("/")
    public String homeView(){
        return "index";
    }
}
