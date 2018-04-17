package com.ry.test;

public class test2 {
	public static void add(Byte b){
		b = b--;
		System.out.println("b:"+b);
	}
	
	//基本数据类型传递 其值不会发生变化。
	public static void main(String[] args) {
		Byte a = 127;
		Byte b = 127;
		
		add(++a);
		System.out.println(a + "");
		add(b);
		System.out.println(b + "");	
	}
	
}
