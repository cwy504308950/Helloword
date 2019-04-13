
/*客户端
 * 
 * */


import java.io.*;

import java.net.*;
public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       try {
     Socket s = new Socket("127.0.0.1",8000);    
     
     //发送数据
     //定位 建立 操作
     OutputStream os = s.getOutputStream();
     
    OutputStreamWriter osw = new OutputStreamWriter(os);
    PrintWriter pw = new PrintWriter(osw,true); //true自动刷新
    
    pw.println("二傻");
     
     //接受数据
             //定位 建立 操作
      InputStream is = s.getInputStream();
       
      InputStreamReader iss = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(iss);
      
      String mess = br.readLine();
      System.out.println(mess);
       
       
       
       }
		catch(Exception e) {}
		
}
	}


