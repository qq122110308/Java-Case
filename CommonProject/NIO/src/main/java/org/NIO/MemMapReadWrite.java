package org.NIO;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/** 
* @author ry 
* @create2018年1月30日 下午5:14:57 
* 类说明   复制文件的例子来看一下对于一个120M的文件通过这种方式到底能有多快速度的提升
* 地址  http://blog.csdn.net/a953713428/article/details/64907250
*/
public class MemMapReadWrite {
	private static int len;
	
	/**
	 * 读文件
	 * @param fileName
	 * @return
	 */
	public static ByteBuffer readFile(String fileName){
		
		try {
			RandomAccessFile file = new RandomAccessFile(fileName, "rw");
			len = (int) file.length();
			FileChannel channel = file.getChannel();
			MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, len);
			return buffer.get(new byte[(int) file.length()]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 写文件
	 * @param readFileName
	 * @param writeFileName
	 */
	public static void writeFile(String readFileName, String writeFileName){
		
		 try {
			RandomAccessFile file = new RandomAccessFile(writeFileName, "rw");
			FileChannel channel = file.getChannel();
			ByteBuffer buffer = readFile(readFileName);
			MappedByteBuffer bytebuffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, len);
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < len; i++) {
				bytebuffer.put(i, buffer.get(i));
			}
			bytebuffer.flip();
			long endTime = System.currentTimeMillis();
			System.out.println("写文件耗时： " + (endTime - startTime));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		String readFileName = "c://1.pdf";
		String writeFileName = "c://2.pdf";
		
		writeFile(readFileName, writeFileName);
	}
	
	
}
 