package server;
import java.io.*;
import java.net.*;
public class server1 {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(777);
		System.out.println("Server started");
		Socket s = ss.accept();
		System.out.println("Connection established");
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	PrintWriter out = new PrintWriter(s.getOutputStream(),true);
	BufferedReader bk = new BufferedReader(new InputStreamReader(System.in));
			String str,str1;
			while((str = br.readLine()) != null){
				System.out.println("client : "+str);
				str1 = bk.readLine();
				out.println(str1);
			}
		ss.close();
		s.close();
		br.close();
		bk.close();
		bk.close();
		System.exit(0);
     	
		}
}
