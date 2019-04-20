package br.edu.ifpb.pweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	@RequestMapping("/form")
	public String showLoginForm() {
		return "form-login";
	}
	
	@RequestMapping("/valide")
	public String valideLogin(String login, String senha, Model model) {
		if(login.equals("login") && senha.equals("secret")) {
			model.addAttribute("login", login);
			return "index";
		}else {
			model.addAttribute("erro", "Login inválido");
			return "form-login";
		}
		
	
	}

}
