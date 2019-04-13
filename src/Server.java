
/*  服务器*/

import java.net.*;
import java.io.*;
public class Server {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		try {
			//定义要监听的窗口
			ServerSocket ss = new ServerSocket(8000);
			System.out.println("发送前侦听------");
	       Socket s =  ss.accept();  //套接字对象
		
	 	       System.out.println("侦听后----");
	 	      
	 	      //定位 建立  操作 
	 	       InputStream is = s.getInputStream();
	 	      
	 	       InputStreamReader iss = new InputStreamReader(is);
	 	       BufferedReader br  = new BufferedReader(iss);
	 	       	 	       String name = br.readLine();
               System.out.println(name);
               
               //进行应答
                   //定位 建立 操作
		       OutputStream os = s.getOutputStream();
		       
		       OutputStreamWriter oss = new OutputStreamWriter(os);
		       PrintWriter pw = new PrintWriter(oss,true);
		       
		       pw.println("你好，"+name);
		}
		catch(Exception e) {}
	}

}
