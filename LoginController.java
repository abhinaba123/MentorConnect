package com.practice.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.springboot.web.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		// model.put("name", name);
		return "login";

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		/*boolean credentials = service.isValid(name, password);
		if (!credentials) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		} else {*/
			model.put("name", name);
			return "welcome";
		//}
	}

	/*
	 * @RequestMapping("/welcome")
	 * 
	 * @ResponseBody public String welcomeMessage() { return "Welcome To India!!!";
	 * 
	 * }
	 */

}
