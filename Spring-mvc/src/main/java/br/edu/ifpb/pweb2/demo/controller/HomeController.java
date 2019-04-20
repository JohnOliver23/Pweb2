package br.edu.ifpb.pweb2.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class HomeController {
	
	@RequestMapping("/")
	public String showMainPage() {
		return "main";
	}
	
	@RequestMapping("/showLoginForm")
	public String showLoginForm() {
		return "form-login";
	}
	
	
	@RequestMapping("validateLogin")
	public String validateLoginForm(HttpServletRequest request, Model model) {
		String login = request.getParameter("login");
		String senha = request.getParameter("password");
		if (login.equals("john") && senha.equals("123")) {
			model.addAttribute("login", login);
			return "logged-in";
		}else {
			return "login-failled";
		}
	}
	
	@RequestMapping("validateLogin2")
	public String validateLoginForm2(
			@RequestParam("login") String login,
			@RequestParam("password") String senha,
			Model model) {
		if(login.equals("john") && senha.equals("123")) {
			model.addAttribute("login",login);
			return "logged-in";
		}else {
			return "login-failled";
		}
		
	}

}
