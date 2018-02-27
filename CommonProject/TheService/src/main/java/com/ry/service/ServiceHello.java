package com.ry.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/** 
* https://www.cnblogs.com/yisheng163/p/4524808.html?utm_source=tuicool 
* @author yi-sheng
* @describe
*/

@WebService
public class ServiceHello {
	
	/**
	 * 供客户端调用的方法
	 * @author ry
	 * @param name
	 * @return String
	 */
	public String getValue(String name){
		return "我叫: "+name;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/ServiceHello", new ServiceHello());
		System.out.println("service success!");
		
	}
}
 