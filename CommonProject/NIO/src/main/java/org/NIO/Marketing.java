package org.NIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/** 
* @author ry 
* @create 2018年2月24日 上午10:31:39 
* @describe  以 gather 写操作来集合多个缓冲区的数据
*/
public class Marketing {
	private static final String DEMOGRAPHIC = "blahblah.txt";
	
	private static String[] col1 = {"Aggregate", "Enable", "Leverage",
			"Facilitate", "Synergize", "Repurpose",
			"Strategize", "Reinvent", "Harness"};
	
	private static String[] col2 = {"cross-platform", "best-of-breed", "frictionless",
			"ubiquitous", "extensible", "compelling",
			"mission-critical", "collaborative", "integrated"};
	
	private static String[] col3 = {"methodologies", "infomediaries", "platforms",
			"schemas", "mindshare", "paradigms",
			"functionalities", "web services", "infrastructures"};
	
	private static String newline = System.getProperty("line.separator");
	
	public static void main(String[] args) throws IOException{
		int reps = 10;
		if(args.length>0){
			reps =Integer.parseInt(args[0]);
		}
		
		FileOutputStream fos = new FileOutputStream(DEMOGRAPHIC);
		
	}
	
	private static ByteBuffer[] utterBS(int howMany) throws Exception{
		List list = new LinkedList( );
		for (int i = 0; i < howMany; i++) {
		list.add (pickRandom (col1, " "));
		list.add (pickRandom (col2, " "));
		list.add (pickRandom (col3, newline));
		}
		ByteBuffer [] bufs = new ByteBuffer [list.size( )];
		list.toArray (bufs);
		return (bufs);
	}
	
	
	private static Random rand = new Random( );
	
	private static ByteBuffer pickRandom(String[] strings, String suffix) throws Exception{
		String string = strings [rand.nextInt (strings.length)];
		int total = string.length() + suffix.length( );
		ByteBuffer buf = ByteBuffer.allocate (total);
		buf.put (string.getBytes ("US-ASCII"));
		buf.put (suffix.getBytes ("US-ASCII"));
		buf.flip( );
		return (buf);
	}
	
	
}
 