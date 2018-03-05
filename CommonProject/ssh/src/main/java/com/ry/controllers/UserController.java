package com.ry.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ry.pojo.User;
import com.ry.service.UserService;

/** 
* @author ry 
* @create2018年3月2日 下午5:42:37 
* @describe
*/
@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/addUser")
	public void addUser(){
		User user = new User();
		user.setUserCreate("2017-05-02");
		user.setUserEmail("772917188@qq.com");
		user.setUserLastTime("2018-03-02");
		user.setUserName("ry");
		user.setUserPass("123456");
		user.setUserRealName("阮洋");
		user.setUserSex(1);
		
		userService.addUser(user);
	}
	
}
 