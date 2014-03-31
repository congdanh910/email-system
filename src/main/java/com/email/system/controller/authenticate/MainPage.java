package com.email.system.controller.authenticate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mainpage")
public class MainPage {
	@RequestMapping(method = RequestMethod.GET)
	public String showLogin(){
		return "mainpage";
	}
}
