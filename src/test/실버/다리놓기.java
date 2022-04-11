package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리놓기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int q=0;q<n;q++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			int count = 0;
			
			for(int i=0;i<a;i++) {
				for(int j=i;j<b;j++) {
					count++;
					
					System.out.println("i : " + i + "j : " + j);
				}
			}
			
			
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);

	}

}
