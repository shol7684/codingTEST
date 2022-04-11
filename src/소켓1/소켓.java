package 소켓1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class 소켓 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = null;
		PrintWriter pw = null;
		OutputStream os = null;
		
		ServerSocket serverSocket = null;
		Socket s1 = null;
		InetAddress ipAddress = null;
		String conClient = null;
		String outMsg = null;
		
		try {
			serverSocket = new ServerSocket(5432);
			System.out.println("서버실행중");
			
			while(true) {
				
				s1 = serverSocket.accept();
				
				os = s1.getOutputStream();
				ipAddress = s1.getInetAddress();
				
				conClient = ipAddress.toString();
				
				System.out.println(conClient);
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw = new PrintWriter(bw, true);
				
				pw.println(conClient + "에서 서버에서 접속하였습니다");
				pw.close();
				s1.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}



