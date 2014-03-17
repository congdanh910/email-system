package com.email.system.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.email.system.model.User;
import com.email.system.service.UserService;

public class Mapping {
	
	public static void main(String[] args) {
		ApplicationContext appContext =  new ClassPathXmlApplicationContext("email-system-servlet.xml");
		
		UserService userService = (UserService) appContext.getBean("userService");
		userService.makePersistent(new User("congdanh", "123456", "Hồ Công Danh", "Sutrix Media", "Tiền Giang", "Việt Nam", "0947579583",
				"congdanh910@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
		userService.makePersistent(new User("maikhanh", "123456", "Đặng Thị Mai Khanh", "An Quốc Việt", "Tiền Giang", "Việt Nam", "0984442166",
				"maikhanh@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
		userService.makePersistent(new User("tuankiet", "123456", "Trần Tuấn Kiệt", "Bảo hiểm", "Bình Dương", "Việt Nam", "0907915813",
				"tuankiet@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
		userService.makePersistent(new User("luongky", "123456", "Nguyễn Lương Kỳ", "IT", "Đà Lạt", "Việt Nam", "0975072768",
				"luongky@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
		userService.makePersistent(new User("phamtrang", "123456", "Pham Trang", "Mắt Bảo", "Thành Phố Hồ Chí Minh", "Việt Nam", "090999999",
				"phantrang@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
		userService.makePersistent(new User("thihong", "123456", "Lê Thị Hồng", "GAPIT", "Đắc Lắc", "Việt Nam", "01679999999",
				"thihong@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
		userService.makePersistent(new User("hoanganh", "123456", "Trịnh Thị Hoàng Anh", "Việt Hưng Thái", "Thành Phố Hồ Chí Minh", "Việt Nam", "0979999999",
				"hoanganh@gmail.com", 500, true, true, true, true, null, null, null, new Date(), new Date()));
	}
}
