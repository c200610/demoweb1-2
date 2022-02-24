package haupx912.demoweb1.Controller;



import java.util.Arrays;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import haupx912.demoweb1.UserRegistration.UserRegistration;
import haupx912.demoweb1.model.Course;
import haupx912.demoweb1.model.User;
import haupx912.demoweb1.repository.CourseRepository;
import haupx912.demoweb1.repository.UserRepository;
import haupx912.demoweb1.service.UserService;
import lombok.extern.slf4j.Slf4j;
@Controller
@Slf4j
public class MainController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @GetMapping("/login")
    public String loginView() {
        return "login";
    }

    @GetMapping("/")
    public String homeView(Model model) {
        model.addAttribute("course",new Course());
        return "index";
    }
    @GetMapping("/info/{username}")
    public ModelAndView getInfomation(@PathVariable(name = "username")String username){
        ModelAndView mav = new ModelAndView("info");
        
        mav.addObject("user", userService.getInfo(username));
        return mav;
    }
    @PostMapping("/info")
    public String updateInfo(@ModelAttribute("user") UserRegistration userRequest){
        Optional<User> userDb = userRepository.findById(userRequest.getId());
        if (userDb.isEmpty()) {
            log.error("Can't find user by id {}", userRequest.getId());
            return "info";
        }
        User user = userRequest.updateUserInfo(userDb.get());
        userRepository.save(user);
        return "info";
    }
    @PostMapping("/change")
    public String updatePass(@ModelAttribute("user") UserRegistration userRequest){
        Optional<User> userDb = userRepository.findById(userRequest.getId());
        if (userDb.isEmpty()) {
            log.error("Can't find user by id {}", userRequest.getId());
            return "login";
        }
        
        userRequest.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        User user = userRequest.updatePass(userDb.get());
        userRepository.save(user);
        return "login";
    }
}
