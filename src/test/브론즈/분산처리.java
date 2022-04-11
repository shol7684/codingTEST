package test.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 분산처리 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int j=0;j<n;j++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int r = 1;
			for(int i=0;i<b;i++) {
				r = a  * (r% 10);
			}

			
			r = r % 10;
			
			if(r == 0) {
				r = 10;
			}
			
			sb.append(r).append("\n");
		}
		
		System.out.println(sb);
	}

}
