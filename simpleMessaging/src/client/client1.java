package client;
import java.net.*;
import java.io.*;
public class client1 {
	public static void main(String[] args) throws IOException{
		Socket s = new Socket("192.168.0.107",777);
		System.out.println("Server connected");
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		InputStream obj = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(obj));
		BufferedReader bk = new BufferedReader(new InputStreamReader(System.in));
		String str,response;
		while(!(str = bk.readLine()).equals("exit")){
			out.println(str);
			response = br.readLine();
			System.out.println("server : "+ response);
		}
		out.close();
		bk.close();
		br.close();
		s.close();
		}
}
