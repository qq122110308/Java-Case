package com.ry.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ry.service.StudentService;

public class TransactionalTest {
	@org.junit.Test
	public void Test(){
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:spring-application.xml"); 
		
		StudentService stu =(StudentService) ac.getBean("studentService");  
		stu.selectStu();
		
		
	}
}
