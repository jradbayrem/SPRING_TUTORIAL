package fr.adaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController    {
	
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	//commentaire 
	@RequestMapping("/logout")
	public String logout() {
		return "login";
	}
}