package haupx912.demoweb1.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import haupx912.demoweb1.model.User;
import haupx912.demoweb1.service.UserService;


@Controller

public class MainController {
    private UserService userService;


    @GetMapping("/login")
    public String loginView() {
        return "login";
    }

    @GetMapping("/")
    public String homeView() {

        return "index";
    }
    @GetMapping("/info/{username}")
    public ModelAndView getInfomation(@PathVariable(name = "username")String username){
        ModelAndView mav = new ModelAndView("info");
        User user = userService.getInfo(username);
        mav.addObject("user", user);
        return mav;
    }
}
