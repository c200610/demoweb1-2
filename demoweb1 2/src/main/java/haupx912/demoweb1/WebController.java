package haupx912.demoweb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    @Autowired

    private AccountService accountService;

    @GetMapping("/")
    public String homeView(Model model){
 
        return "index";
    }
    @GetMapping("/new")
    public String showNewAccountPage(Model model){
        Account account = new Account();
        model.addAttribute("account",account);
        return "new";
    }
    @PostMapping("/save")
	public String saveAccount(@ModelAttribute("account") Account account) {
		accountService.save(account);
		return "redirect:/";
	}


    @PostMapping("/login")
	public String loginAcc(@ModelAttribute("account") Account account) {
		
		return "login";
	}
}
