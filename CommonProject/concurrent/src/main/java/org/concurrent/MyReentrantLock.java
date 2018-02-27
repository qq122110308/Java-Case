package org.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/** 
* @author ry 
* @create2018年2月5日 上午11:56:49 
* @describe https://www.cnblogs.com/csniper/p/5781386.html
*/
public class MyReentrantLock extends Thread{
	TestReentrantLock lock;
	private int id;
	
	public MyReentrantLock(int i, TestReentrantLock test)
	{
		this.id=i;
	    this.lock=test;
	}
	
	public void run(){
	    lock.print(id);
	}
	
	public static void main(String args[]){
	    ExecutorService service=Executors.newCachedThreadPool();
	    TestReentrantLock lock=new TestReentrantLock();
	    for(int i=0;i<10;i++){
	     service.submit(new MyReentrantLock(i,lock));
	    }
	    service.shutdown();
	}
}


class TestReentrantLock{
private ReentrantLock lock=new ReentrantLock();
public void print(int str){
    try{
     lock.lock();
     System.out.println(str+"获得");
     Thread.sleep((int)(Math.random()*1000));
    }
    catch(Exception e){
     e.printStackTrace();
    }
    finally{
     System.out.println(str+"释放");
     lock.unlock();
    }
}
}
 