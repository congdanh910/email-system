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

import com.email.system.dao.OptionListDAO;
import com.email.system.dao.impl.OptionListDAOImpl;
import com.email.system.model.OptionList;
import com.email.system.service.OptionListService;
import com.email.system.utils.mapper.GridResponse;
import com.email.system.utils.mapper.OptionListMapper;

@Controller
@RequestMapping("/admin/option")
public class OptionListController {
	@Autowired
	private OptionListService optionListService;
	
	@RequestMapping("/list")
	public String showview(){
		return "optionlist";
	}
	
	@RequestMapping("/datagrid")
	public @ResponseBody GridResponse<OptionListMapper> showListOption(
			@RequestParam(value = "page", required = true, defaultValue = "1") int[] page,
			@RequestParam(value = "rows", required = true, defaultValue = "5") int[] rows){
		
		Pageable pageable = new PageRequest(page[0] -1 , rows[0]);
		GridResponse<OptionListMapper> response = new GridResponse<OptionListMapper>();
		List<OptionListMapper> mappers = new ArrayList<OptionListMapper>();
		List<OptionList> users = optionListService.findBy(pageable);
		System.out.println("list user: " + users.size() );
		for (OptionList user : users) {
			mappers.add(new OptionListMapper(user.getOptionName(), user.getOptionValue()));
		}
		response.setRows(mappers);
		response.setTotal(optionListService.countFindBy());
		return response;
		
	}
	
	
}
