
/*  ������*/

import java.net.*;
import java.io.*;
public class Server {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		try {
			//����Ҫ�����Ĵ���
			ServerSocket ss = new ServerSocket(8000);
			System.out.println("����ǰ����------");
	       Socket s =  ss.accept();  //�׽��ֶ���
		
	 	       System.out.println("������----");
	 	      
	 	      //��λ ����  ���� 
	 	       InputStream is = s.getInputStream();
	 	      
	 	       InputStreamReader iss = new InputStreamReader(is);
	 	       BufferedReader br  = new BufferedReader(iss);
	 	       	 	       String name = br.readLine();
               System.out.println(name);
               
               //����Ӧ��
                   //��λ ���� ����
		       OutputStream os = s.getOutputStream();
		       
		       OutputStreamWriter oss = new OutputStreamWriter(os);
		       PrintWriter pw = new PrintWriter(oss,true);
		       
		       pw.println("��ã�"+name);
		}
		catch(Exception e) {}
	}

}
