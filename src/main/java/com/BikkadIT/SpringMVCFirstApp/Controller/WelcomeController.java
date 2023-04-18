package com.BikkadIT.SpringMVCFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/WelcomeMessage")
	public String welcome(Model model) {
		
		String welmsg="Welcome to BikkadIT";
		
		model.addAttribute("MSG", welmsg);
		
		return "wel";
		
	}

}
