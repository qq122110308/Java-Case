package org.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* @author ry 
* @create2018年2月5日 下午1:12:36 
* @describe  https://www.cnblogs.com/csniper/p/5781386.html
*/
public class MyCompletionService extends Thread implements Callable<String> {
	
	private int id;
	
	public MyCompletionService(int i){
		this.id = i;
	}
	
	
	public static void main(String[] args) throws Exception {
	   ExecutorService service=Executors.newCachedThreadPool();
	   CompletionService<String> completion=new ExecutorCompletionService<String>(service);
	   for(int i=0;i<10;i++){
	    completion.submit(new MyCompletionService(i));
	   }
	   for(int i=0;i<10;i++){
	    System.out.println(completion.take().get());
	   }
	   service.shutdown();
	}
	
	public String call() throws Exception {
	   Integer time=(int)(Math.random()*1000);
	   try{
	    System.out.println(this.id+" start");
	    Thread.sleep(time);
	    System.out.println(this.id+" end");
	   }
	   catch(Exception e){
	    e.printStackTrace();
	   }
	   return this.id+":"+time;
	}
}
 