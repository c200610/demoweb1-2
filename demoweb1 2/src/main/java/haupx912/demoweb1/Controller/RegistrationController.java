package haupx912.demoweb1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import haupx912.demoweb1.service.UserService;
import haupx912.demoweb1.UserRegistration.UserRegistration;

@Controller

public class RegistrationController {
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public RegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/new")
    public String registrationView(Model model) {
        model.addAttribute("user", new UserRegistration());
        return "new";
    }

    @PostMapping("/new")
    public String registrationView(@Validated @ModelAttribute("user") UserRegistration userRegistration) {
        userRegistration.setPassword(passwordEncoder.encode(userRegistration.getPassword()));
        userService.save(userRegistration);
        return "redirect:/login";
    }

}
