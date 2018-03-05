package com.ry.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* @author ry 
* @create 2018年3月1日 上午8:52:50 
* @describe  通知
*/
public class Advice {
	
	private final Logger logger = LoggerFactory.getLogger(Advice.class);
	
	public void record() {
		System.out.println("前置通知，执行目标方法之前");
		logger.info("前置通知,执行目标方法之前");
		
		
	}
}
 