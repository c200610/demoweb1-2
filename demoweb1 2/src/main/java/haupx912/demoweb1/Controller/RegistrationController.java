package haupx912.demoweb1.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import haupx912.demoweb1.UserRegistration.UserRegistration;
import haupx912.demoweb1.service.UserService;

@Controller

public class RegistrationController {

    private UserService userService;

    public RegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/new")
    public String registrationView(Model model){
        model.addAttribute("user", new UserRegistration());
        return "new";
        }

    @PostMapping("/new")
    public String registrationView(@ModelAttribute("user") UserRegistration userRegistration){
        userService.save(userRegistration);
        return "login";
    }

}
