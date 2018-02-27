package org.NIO;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author rickiyang
 * @create 2018年1月30日 上午11:29:15 
 * 类说明 使用FileChannel读取数据到Buffer中的示例
 */
public class FileChannelCase {
	public static void main(String[] args) throws Exception {

		RandomAccessFile aFile = new RandomAccessFile("D://nio-data.txt", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(48);

		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {

			System.out.println("Read " + bytesRead);
			buf.flip();

			while (buf.hasRemaining()) {
				System.out.println((char) buf.get());
			}

			buf.clear();
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}
	// 注意 buf.flip() 的调用，首先读取数据到Buffer，然后反转Buffer,接着再从Buffer中读取数据。
}
