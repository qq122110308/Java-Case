package org.NIO;

import java.nio.CharBuffer;

/** 
* @author ry 
* @create 2018年2月23日 下午2:53:08 
* @describe  填充和释放缓冲区
*/
public class BufferFillDrain {
	public static void main(String[] args) throws Exception{
		CharBuffer buffer = CharBuffer.allocate(100);
		while(fileBuffer(buffer)){
			buffer.flip();
			drainBuffer(buffer);
			buffer.clear();
		}
	}
	
	private static void drainBuffer(CharBuffer buffer){
		while(buffer.hasRemaining()){
			System.out.println(buffer.get());
		}
		System.out.println("");
	}
	
	private static boolean fileBuffer(CharBuffer buffer){
		if(index >= strings.length){
			return false;
		}
		String string = strings[index++];
		for(int i =0 ;i<string.length() ;i++){
			buffer.put(string.charAt(i));
		}
		return true;
	}
	
	private static int index = 0;
	private static String[] strings = { "A random string value"
			,"The product of an infinite number of monkeys"
			,"Hey hey we're the Monkees"
			,"Opening act for the Monkees: Jimi Hendrix"
			,"'Scuse me while I kiss this fly"
			,"Help Me! Help Me!"};
	
}
 