package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class send extends Thread {
	 private int port;
	 String name;
	 public send(int port,String name){
		 this.port = port;
		 this.name = name;
		
	 }
	
	@Override	
	public void run() {
		try {
			DatagramSocket ds = new DatagramSocket();
	       Scanner a = new Scanner(System.in);
			
	        while(true) {
	        	
	        	String str = name+":";
	        	str = str + a.nextLine();
	       
	       
			byte[] buf = str.getBytes();
			int length = buf.length;
			InetAddress address = InetAddress.getByName("127.0.0.1");
			DatagramPacket da = new DatagramPacket(buf, length, address, port);
			
			ds.send(da);
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
	}

}
