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
	// TODO �Զ����ɵķ������
	try {
		DatagramSocket ds = new DatagramSocket(port);
   
	
	byte[] buf = new byte[1024];
	int length = buf.length;
	
	DatagramPacket da = new DatagramPacket(buf, length);
	
	ds.receive(da);
	String str = null;
	str = new String(da.getData(),0,length);
	
	
	System.out.println("�����ǽ���");

	System.out.println(str);

	   }catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
}
}


