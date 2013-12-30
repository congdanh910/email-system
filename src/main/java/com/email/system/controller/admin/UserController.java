package com.email.system.controller.admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.email.system.utils.mapper.GridDemo;
import com.email.system.utils.mapper.UserMapper;

@Controller
@RequestMapping("/admin/user")
public class UserController {

	@RequestMapping("/list")
	public String list(String abc) {
		return "admin/user.list";
	}

	@RequestMapping(value = "/datagrid", produces = "application/json")
	public @ResponseBody GridDemo<UserMapper> datagird(HttpServletRequest request) {
		Map<Object, Object> map = request.getParameterMap();
		for (Object key : map.keySet()) {
			System.out.println(key);
			String[] values = (String[]) map.get(key);
			System.out.println(Arrays.toString(values));
		}
		
		System.out.println("vo day");
		GridDemo<UserMapper> demos = new GridDemo<>();
		List<UserMapper> mappers = new ArrayList<UserMapper>();
		for (int i = 0; i < 10; i++) {
			mappers.add(new UserMapper("danh " + i, "Danh " + i, "094 " + i, " Sutrix " + i, "Tien Giang " + i, true));
		}
		demos.setRows(mappers);
		return demos;
	}

}
