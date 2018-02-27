package com.ry.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/** 
* @author ry 
* @create2018年2月27日 上午10:25:56 
* @ describe
*/
@Controller
public class AdminController {
	
//	 @RequestMapping(value= {"/","/welcome**"},method=RequestMethod.GET)  
//     public ModelAndView welcome() {  
//         ModelAndView welcome = new ModelAndView();  
//         welcome.addObject("title","welcome");  
//         welcome.addObject("message","this is a security page");  
//         welcome.setViewName("hello");  
//         return welcome;  
//     }
       
     @RequestMapping(value="/admin**",method=RequestMethod.GET)  
     public ModelAndView admin() {  
         ModelAndView welcome = new ModelAndView();  
         welcome.addObject("title","admin");  
         welcome.addObject("message","this is a admin page");  
         welcome.setViewName("admin");  
         return welcome;  
     }
     
     @RequestMapping(value="/j_spring_security_check",method=RequestMethod.POST)
     public ModelAndView j_spring_security_check (HttpSecurity http,HttpServletRequest request) throws Exception{
    	 
    	 http.authorizeRequests().antMatchers("/", "/springbootbase").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll();
    	 
    	 HttpSession session = request.getSession();
    	 session.setAttribute("SPRING_SECURITY_LAST_USERNAME", "admin");
    	 
    	 ModelAndView welcome = new ModelAndView();  
         welcome.addObject("title","admin");  
         welcome.addObject("message","this is a admin page");  
         welcome.setViewName("admin");  
         return welcome;  
     }
}
 