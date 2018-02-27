package org.NIO;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;

/** 
* @author ry 
* @create 2018年2月23日 下午4:35:51 
* @describe 创建一个 ByteBuffer 的字符视图
*/
public class BufferCharView {
	public static void main(String[] args) throws Exception{
		ByteBuffer byteBuffer = ByteBuffer.allocate(7).order(ByteOrder.BIG_ENDIAN);
		CharBuffer charBuffer = byteBuffer.asCharBuffer();
		// Load the ByteBuffer with some bytes
		byteBuffer.put (0, (byte)0);
		byteBuffer.put (1, (byte)'H');
		byteBuffer.put (2, (byte)0);
		byteBuffer.put (3, (byte)'i');
		byteBuffer.put (4, (byte)0);
		byteBuffer.put (5, (byte)'!');
		byteBuffer.put (6, (byte)0);
		
		println (byteBuffer);
		println (charBuffer);
	}
	
	
	private static void println(Buffer buffer){
		System.out.println("pos="+buffer.position()
		+", limit="+buffer.limit()+", capacity="+buffer.capacity()
		+": '"+buffer.toString()+"'");
	}
}
 