package com.email.system.controller.admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public @ResponseBody GridResponse<UserMapper> datagird(HttpServletRequest request) {
		Map<Object, Object> map = request.getParameterMap();
		for (Object key : map.keySet()) {
			System.out.println(key);
			String[] values = (String[]) map.get(key);
			System.out.println(Arrays.toString(values));
		}
		
		GridResponse<UserMapper> response = new GridResponse<>();
		List<UserMapper> mappers = new ArrayList<UserMapper>();
		List<User> users = userService.findAll();
		for (User user : users) {
			mappers.add(new UserMapper(user.getUsername(), user.getFullName(), user.getEmail(), user.getPhone(), user.getCompany(), user.getAddress(), user.isEnabled()?"Active":"Deactive"));
		}
		response.setRows(mappers);
		response.setTotal(users.size());
		return response;
	}

}
