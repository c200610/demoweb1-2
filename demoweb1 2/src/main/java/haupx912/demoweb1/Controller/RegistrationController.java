package haupx912.demoweb1.Controller;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class RegistrationController {
   
    

    @GetMapping("/")
    public String homeView(){
 
        return "index";
    }
}
