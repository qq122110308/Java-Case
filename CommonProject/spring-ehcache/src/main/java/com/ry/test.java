package com.ry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ry.service.UserService;

/** 
* @author ry 
* @create2018年2月2日 下午5:07:45 
* @describe
*/

//指定bean注入的配置文件 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-dao.xml","classpath:spring-service.xml","classpath:spring-ehcache.xml"})
public class test  extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test1() throws InterruptedException{
		System.out.println("第一次调用:"+userService.testEhcache("param"));
		Thread.sleep(2000);
		System.out.println("2秒后调用:"+userService.testEhcache("param"));
		Thread.sleep(11000);
		System.out.println("11秒后调用:"+userService.testEhcache("param"));
		
	}
}
 