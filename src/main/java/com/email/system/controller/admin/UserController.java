package com.email.system.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@RequestMapping("/list")
	public String list(String abc) {
		return "admin/user.list";
	}

}
