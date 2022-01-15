package haupx912.demoweb1.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import haupx912.demoweb1.model.Account;
import haupx912.demoweb1.repository.AccountRespository;
import haupx912.demoweb1.service.AccountService;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller
public class RegistrationController {
    private final BCryptPasswordEncoder passwordEncoder;
    private AccountRespository accountRespository;
    @Autowired

    private AccountService accountService;
    

    @GetMapping("/")
    public String homeView(){
 
        return "index";
    }
    @GetMapping("/new")
    public String showNewAccountPage(Model model){
        Account account = new Account();
        model.addAttribute("account",account);
        return "new";
    }


    // @PostMapping("/save")
	// public String saveAccount(@ModelAttribute("account") Account account) {
	// 	accountService.save(account);	
	// 	return "redirect:/";
	// }

    @GetMapping("/login")
	public String loginAcc(@ModelAttribute("account") Account account) {
		return "login";
	}



    @PostMapping("/new")
	public String process(@Validated @ModelAttribute("account") Account account,
			BindingResult result) {
		if(result.hasErrors()) {
			return "new";
		}
		
		account.setPassword(passwordEncoder.encode(account.getPassword()));
		
		accountRespository.save(account);
		
		return "redirect:/login";
	}

  
}
