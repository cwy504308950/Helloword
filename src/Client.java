
/*�ͻ���
 * 
 * */


import java.io.*;

import java.net.*;
public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       try {
     Socket s = new Socket("127.0.0.1",8000);    
     
     //��������
     //��λ ���� ����
     OutputStream os = s.getOutputStream();
     
    OutputStreamWriter osw = new OutputStreamWriter(os);
    PrintWriter pw = new PrintWriter(osw,true); //true�Զ�ˢ��
    
    pw.println("��ɵ");
     
     //��������
             //��λ ���� ����
      InputStream is = s.getInputStream();
       
      InputStreamReader iss = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(iss);
      
      String mess = br.readLine();
      System.out.println(mess);
       
       
       
       }
		catch(Exception e) {}
		
}
	}


