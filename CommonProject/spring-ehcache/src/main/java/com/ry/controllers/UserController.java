package com.ry.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ry.Entity.Users;
import com.ry.service.UserService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/** 
* @author ry 
* @create2018年2月1日 上午11:08:02 
* @describe
*/
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getUser")
	@ResponseBody
	public String selectAllUser(){
		Users user = userService.selectByPrimaryKey(1);
		
		return user.toString();
	}
	
}
 