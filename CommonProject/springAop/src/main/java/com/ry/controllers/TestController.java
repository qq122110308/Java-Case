package com.ry.controllers; 
/** 
* @author ry 
* @create 2018年3月1日 上午9:01:15 
* @describe
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
	
	private final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value="t1")
	public String test(){
		logger.info("测试aop功能");
		return "index";
		
	}
	
}
 