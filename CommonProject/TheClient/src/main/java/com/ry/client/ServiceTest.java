package com.ry.client; 
/** 
* @author ry 
* @create2018年2月11日 下午3:25:24 
* @describe
*/
public class ServiceTest {
	public static void main(String[] args) {
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
		String name = hello.getValue("ry");
		System.out.println(name);
	}
}
 