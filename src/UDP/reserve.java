package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class reserve extends Thread {
 private int port;
reserve(int port){
	 this.port = port;
	 
 }

@Override
public void run() {
	// TODO 自动生成的方法存根
	try {
		DatagramSocket ds = new DatagramSocket(port);
   
	
	byte[] buf = new byte[1024];
	int length = buf.length;
	
	DatagramPacket da = new DatagramPacket(buf, length);
	
	ds.receive(da);
	String str = null;
	str = new String(da.getData(),0,length);
	
	
	System.out.println("这里是接收");

	System.out.println(str);

	   }catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
}
}


