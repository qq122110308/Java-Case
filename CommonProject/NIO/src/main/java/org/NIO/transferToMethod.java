package org.NIO;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/** 
* @author ry 
* @create 2018年1月30日 下午4:21:18 
* 类说明   transferTo()方法将数据从FileChannel传输到其他的channel中
*/
public class transferToMethod {
	public static void main(String[] args) throws Exception {
		RandomAccessFile fromFile = new RandomAccessFile("fromFile.txt", "rw");
		FileChannel fromChannel = fromFile.getChannel();

		RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
		FileChannel toChannel = fromFile.getChannel();
		
		long position = 0;
		long count = fromChannel.size();
		fromChannel.transferTo(position, count, toChannel);

	}
}
 