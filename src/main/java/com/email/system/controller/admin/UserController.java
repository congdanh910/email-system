package com.email.system.controller.admin;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.email.system.model.User;
import com.email.system.service.UserService;
import com.email.system.utils.mapper.GridResponse;
import com.email.system.utils.mapper.UserMapper;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(String abc) {
		return "admin/user.list";
	}

	@RequestMapping(value = "/datagrid", produces = "application/json")
	public @ResponseBody GridResponse<UserMapper> datagird(
			@RequestParam(value = "page", required = true, defaultValue = "1") int[] page,
			@RequestParam(value = "rows", required = true, defaultValue = "5") int[] rows) {
		Pageable pageable = new PageRequest(page[0] -1, rows[0]);
		GridResponse<UserMapper> response = new GridResponse<>();
		List<UserMapper> mappers = new ArrayList<UserMapper>();
		List<User> users = userService.findBy(pageable);
		for (User user : users) {
			mappers.add(new UserMapper(user.getUsername(), user.getFullName(), user.getEmail(), user.getPhone(), user.getCompany(), user.getAddress(), user.isEnabled()?"Active":"Deactive"));
		}
		response.setRows(mappers);
		response.setTotal(userService.countFindBy());
		return response;
	}

}
