package test.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int x = A-B;
		int count = 1;
		
		int  y = 0;
		
		if((V-A) % x == 0) {
			count += (V-A) / x; 
		} else {
			count += (V-A) / x + 1;
		}
		
		
//		if(x * (y-1) + x >= V) {
//			System.out.println(y);
//		} else {
//			 
//		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
	}

}
