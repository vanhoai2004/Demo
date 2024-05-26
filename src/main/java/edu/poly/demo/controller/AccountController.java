package edu.poly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.poly.demo.model.Account;

@Controller
@RequestMapping("account")
public class AccountController {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("message","Login page");
		return "login";
	}
	
	@PostMapping("login")
	public String loginPost(Model model, Account account) {
		
		String st = String.format("%s - %s",account.getUsername(), account.getPassword());
		model.addAttribute("message","Login processing: " +st);
		
		return "login";
	}
	
}
