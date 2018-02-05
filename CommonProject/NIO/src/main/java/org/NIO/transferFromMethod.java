package org.NIO;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/** 
* @author ry 
* @create 2018年1月30日 下午3:46:12 
* 类说明   在Java NIO中，如果两个通道中有一个是FileChannel，那你可以直接将数据从一个channel
* FileChannel的transferFrom()方法可以将数据从源通道传输到FileChannel中
*/
public class transferFromMethod{
	public static void main(String[] args) throws Exception{
		RandomAccessFile fromFile = new RandomAccessFile("D://fromFile.txt", "rw");
		FileChannel fromChannel = fromFile.getChannel();
		
		RandomAccessFile toFile = new RandomAccessFile("D://toFile.txt", "rw");
		FileChannel toChannel = toFile.getChannel();
		
		long position = 0;
		long count = fromChannel.size();
		
		toChannel.transferFrom(fromChannel, position, count);
		
	}
}
 