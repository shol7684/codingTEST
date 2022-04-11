package 소켓1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class 소켓클라이언트 {
	public static void main(String[] args) {
		
		InputStream is =null;
		BufferedReader br = null;
		String msg = null;
		
		try {
			Socket s1 = new Socket("211.247.99.55" , 5432);
			is = s1.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			msg = br.readLine();
			System.out.println(msg);
			s1.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
