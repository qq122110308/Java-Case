package org.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @author ry 
* @create 2018年2月5日 上午8:52:05 
* @describe  https://www.cnblogs.com/csniper/p/5781386.html
*/
public class MyExecutor extends Thread{
	private int index;
	
	public MyExecutor(int i){
		this.index = i;
	}
	
	public void run(){
		try{
			System.out.println("["+this.index+"] start....");
		    Thread.sleep((int)(Math.random()*10000));
		    System.out.println("["+this.index+"] end.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 10; i++) {
			service.execute(new MyExecutor(i));
		}
		System.out.println("submit finish");
		service.shutdown();
	}
}
 